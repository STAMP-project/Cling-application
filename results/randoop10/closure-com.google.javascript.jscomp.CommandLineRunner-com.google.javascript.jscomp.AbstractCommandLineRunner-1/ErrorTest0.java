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
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = sourceFile1.getLineOffset((int) '4');
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = compiler0.getWarningCount();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = compiler0.toSource();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.rhino.Node node4 = compiler0.parse(sourceFile2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler0.newExternInput("Unversioned directory");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getErrors();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = compiler0.getWarningCount();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray1 = compiler0.toSourceArray();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable1 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region4 = compiler0.getSourceRegion("hi!", (int) (short) 1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray2 = compiler0.toSourceArray();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = sourceFile1.getLineOffset(1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = compiler0.getWarningCount();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getMessages();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = compiler0.getErrorCount();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        java.lang.String str5 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getMessages();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        java.lang.String str5 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = compiler0.getErrorCount();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = compiler0.isIdeMode();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        java.lang.String str5 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter2 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        java.lang.String str5 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str8 = sourceFile7.getOriginalPath();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = compiler0.parse(sourceFile7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput3 = compiler0.newExternInput("java.io.IOException: ");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getWarnings();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getMessages();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = sourceFile1.getLineOfOffset((int) (byte) 100);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler0.languageMode();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = compiler0.getWarningCount();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter4 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.hasErrors();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int3 = codeBuilder2.getLength();
        int int4 = codeBuilder2.getLength();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str9 = sourceFile8.getOriginalPath();
        com.google.javascript.rhino.Node node10 = compiler6.parse(sourceFile8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.toSource(codeBuilder2, (int) (short) 10, node10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler0.getTypeRegistry();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.hasErrors();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap4 = compiler0.getInputsById();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = compiler0.toSourceArray();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        java.lang.String str5 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        java.lang.String str5 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.isIdeMode();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray4 = compiler0.toSourceArray();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getMessages();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.hasErrors();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray2 = compiler0.toSourceArray();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = compiler0.toSource();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler0.languageMode();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getErrors();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result2 = compiler0.getResult();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap11 = compiler0.getInputsById();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.rhino.Node node4 = compiler0.parse(sourceFile2);
        double double5 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler0.newExternInput("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = compiler0.getSourceLine("java.io.IOException: ", (int) (byte) 100);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter3 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = compiler0.getErrorCount();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = compiler0.toSourceArray();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getMessages();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region4 = compiler0.getSourceRegion("java.io.IOException", (int) (short) 100);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = compiler0.getWarningCount();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        double double3 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.SourceFile> sourceFileList0 = com.google.javascript.jscomp.CommandLineRunner.getDefaultExterns();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getErrors();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.hasErrors();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result4 = compiler0.getResult();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.isIdeMode();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap4 = compiler3.getInputsById();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("java.io.IOException: ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region3 = sourceFile1.getRegion((int) '4');
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler0.languageMode();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("Unversioned directory");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = sourceFile1.getLineOfOffset((int) '4');
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        java.lang.String str5 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile4 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str5 = sourceFile4.getOriginalPath();
        com.google.javascript.rhino.Node node6 = compiler2.parse(sourceFile4);
        double double7 = compiler2.getProgress();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        double double9 = compiler8.getProgress();
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.Scope scope11 = compiler8.getTopScope();
        compiler8.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler8.getState();
        compiler2.setState(intermediateState13);
        compiler0.setState(intermediateState13);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray17 = compiler0.getWarnings();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = sourceFile1.getLine((int) '4');
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap5 = compiler0.getInputsById();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter4 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.isIdeMode();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("Unversioned directory");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.Reader reader2 = sourceFile1.getCodeReader();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.Reader reader2 = sourceFile1.getCodeReader();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        double double3 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable5 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = compiler0.getTypeRegistry();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region11 = compiler0.getSourceRegion("Unversioned directory", (int) ' ');
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap5 = compiler0.getInputsById();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager3 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler0.newExternInput("java.io.IOException: Unversioned directory");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region8 = compiler0.getSourceRegion("hi!", 100);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.hasErrors();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker2 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = compiler0.getTypeRegistry();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = sourceFile1.getColumnOfOffset((int) (short) 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getErrors();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = compiler21.acceptConstKeyword();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        double double7 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = compiler0.isIdeMode();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = compiler0.toSourceArray();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = compiler0.getErrorCount();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = compiler0.getSourceLine("", 1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.hasErrors();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str8 = sourceFile7.getOriginalPath();
        java.lang.String str10 = sourceFile7.getLine(0);
        sourceFile7.setOriginalPath("");
        java.lang.String str14 = sourceFile7.getLine((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = compiler0.parse(sourceFile7);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = compiler0.toSource();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        java.lang.String str4 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setRewriteNewDateGoogNow(true);
        compilerOptions6.optimizeParameters = true;
        compilerOptions6.setLocale("Unversioned directory");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initOptions(compilerOptions6);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.isIdeMode();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
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
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray18 = compiler17.getErrors();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = compiler0.hasErrors();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("Unversioned directory");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = sourceFile1.getColumnOfOffset(10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        java.lang.String str5 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = compiler0.getErrorCount();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode2 = compiler0.languageMode();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        double double3 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.isIdeMode();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        double double7 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap8 = compiler0.getInputsById();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
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
        printStream16.println();
        printStream16.print((-1L));
        printStream16.println(' ');
        printStream16.close();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(printStream16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region30 = compiler27.getSourceRegion("java.io.IOException: ", (int) 'a');
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap3 = compiler0.getInputsById();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = compiler0.getWarningCount();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = compiler0.toSource();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable6 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result5 = compiler0.getResult();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = compiler0.toSourceArray();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = compiler20.acceptConstKeyword();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getWarnings();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        java.lang.String str6 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result7 = compiler0.getResult();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("Unversioned directory");
        sourceFile1.setOriginalPath("java.io.IOException");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = sourceFile1.getLineOfOffset((int) (byte) 10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        compiler0.disableThreads();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        printStream16.println();
        printStream16.flush();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean24 = compiler23.isIdeMode();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("-1", (int) (byte) 1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        sourceFile1.clearCachedSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = sourceFile1.getLineOffset(32);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream9 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler10.parse();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("2019/07/12 07:12");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.Reader reader2 = sourceFile1.getCodeReader();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable4 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.hasErrors();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = compiler0.getSourceLine("java.io.IOException: -1", (int) '#');
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.hasErrors();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
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
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler20.normalize();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = compiler0.toSourceArray();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = compiler0.toSource();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        double double6 = compiler0.getProgress();
        com.google.javascript.jscomp.Region region9 = compiler0.getSourceRegion("", 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = compiler0.getWarningCount();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
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
        printStream16.println();
        printStream16.print((-1L));
        printStream16.println(' ');
        printStream16.close();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(printStream16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler27.getErrorManager();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.isIdeMode();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result4 = compiler0.getResult();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
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
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode12 = compiler0.languageMode();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        java.lang.String str6 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions7.setRewriteNewDateGoogNow(true);
        boolean boolean10 = compilerOptions7.extractPrototypeMemberDeclarations;
        compilerOptions7.convertToDottedProperties = true;
        boolean boolean13 = compilerOptions7.inlineConstantVars;
        boolean boolean14 = compilerOptions7.extractPrototypeMemberDeclarations;
        compilerOptions7.optimizeCalls = true;
        compilerOptions7.removeUnusedPrototypeProperties = false;
        compilerOptions7.setExternExports(true);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode21 = compilerOptions7.getTracerMode();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions22.setRewriteNewDateGoogNow(true);
        boolean boolean25 = compilerOptions22.extractPrototypeMemberDeclarations;
        boolean boolean26 = compilerOptions22.jqueryPass;
        compilerOptions22.setReplaceIdGenerators(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions29.setRewriteNewDateGoogNow(true);
        boolean boolean32 = compilerOptions29.extractPrototypeMemberDeclarations;
        compilerOptions29.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel35 = compilerOptions29.checkGlobalThisLevel;
        compilerOptions22.checkProvides = checkLevel35;
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions37.setRewriteNewDateGoogNow(true);
        boolean boolean40 = compilerOptions37.extractPrototypeMemberDeclarations;
        compilerOptions37.convertToDottedProperties = true;
        boolean boolean43 = compilerOptions37.inlineConstantVars;
        boolean boolean44 = compilerOptions37.extractPrototypeMemberDeclarations;
        compilerOptions37.optimizeCalls = true;
        compilerOptions37.setCoalesceVariableNames(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions49.setRewriteNewDateGoogNow(true);
        boolean boolean52 = compilerOptions49.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach53 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions49.setInlineVariables(reach53);
        compilerOptions49.setPrintInputDelimiter(true);
        boolean boolean57 = compilerOptions49.closurePass;
        compilerOptions49.setOutputCharset("java.io.IOException");
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
        compilerOptions60.setSourceMapFormat(format72);
        compilerOptions49.setSourceMapFormat(format72);
        compilerOptions37.sourceMapFormat = format72;
        compilerOptions22.sourceMapFormat = format72;
        compilerOptions7.sourceMapFormat = format72;
        boolean boolean78 = compilerOptions7.removeUnusedLocalVars;
        compilerOptions7.setSummaryDetailLevel(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initOptions(compilerOptions7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
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
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter21 = compiler20.getReverseAbstractInterpreter();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getErrors();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream9 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        printStream1.write((int) '#');
        printStream1.print((float) (short) 0);
        printStream1.print(10L);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention17 = compiler16.getCodingConvention();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        java.lang.String str4 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.isIdeMode();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
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
        printStream16.println();
        printStream16.flush();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = compiler23.getErrorCount();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        compiler0.disableThreads();
        compiler0.disableThreads();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = compiler0.getWarningCount();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        com.google.javascript.rhino.Node node5 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.hasErrors();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        sourceFile1.setOriginalPath("-1");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region5 = sourceFile1.getRegion((int) ' ');
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
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
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = compiler17.acceptConstKeyword();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
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
        com.google.javascript.jscomp.Scope scope12 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = compiler0.toSource();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = compiler0.getWarningCount();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream9 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = compiler10.acceptEcmaScript5();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        java.lang.String str6 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = compiler0.isIdeMode();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream9 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = compiler10.acceptConstKeyword();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable6 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter9 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.CompilerOptions compilerOptions2 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions2.setRewriteNewDateGoogNow(true);
        boolean boolean5 = compilerOptions2.extractPrototypeMemberDeclarations;
        compilerOptions2.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel8 = compilerOptions2.checkGlobalThisLevel;
        compilerOptions2.setIgnoreCajaProperties(false);
        compilerOptions2.removeUnusedClassProperties = true;
        compilerOptions2.setRuntimeTypeCheckLogFunction("2019/07/12 07:12");
        compilerOptions2.inlineVariables = true;
        compilerOptions2.setLooseTypes(true);
        boolean boolean19 = compilerOptions2.removeUnusedPrototypeProperties;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initOptions(compilerOptions2);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
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
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState18 = compiler17.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter19 = compiler17.getReverseAbstractInterpreter();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = compiler0.toSource();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        java.lang.String str6 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray4 = compiler0.toSourceArray();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker2 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        java.lang.String str6 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getWarnings();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        java.lang.String str6 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = compiler0.getErrorCount();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = compiler0.toSource();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream9 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = compiler10.getWarningCount();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        java.lang.String str5 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = compiler0.getWarningCount();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        java.lang.String str7 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream9 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler10.getMessages();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.disableThreads();
        java.lang.String str7 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler0.getErrorManager();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler0.newExternInput("java.io.IOException: Unversioned directory");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.isIdeMode();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        java.lang.String str4 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
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
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState18 = compiler17.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention19 = compiler17.getCodingConvention();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable6 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        double double3 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
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
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState18 = compiler17.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet20 = compilerOptions19.stripNamePrefixes;
        byte[] byteArray21 = compilerOptions19.inputVariableMapSerialized;
        boolean boolean22 = compilerOptions19.disambiguateProperties;
        compilerOptions19.setExternExportsPath("Unversioned directory");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler17.initOptions(compilerOptions19);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter4 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.getCodingConvention();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = compiler0.getSourceLine("java.io.IOException: java.io.IOException: java.io.IOException: 2019/07/12 07:12", 52);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        java.lang.String str7 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        java.lang.String str5 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap6 = compiler0.getInputsById();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler0.languageMode();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        double double4 = compiler0.getProgress();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet6 = compilerOptions5.stripNamePrefixes;
        byte[] byteArray7 = compilerOptions5.inputVariableMapSerialized;
        boolean boolean8 = compilerOptions5.exportTestFunctions;
        compilerOptions5.lineBreak = false;
        compilerOptions5.collapseAnonymousFunctions = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initOptions(compilerOptions5);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
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
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable21 = compiler20.buildKnownSymbolTable();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
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
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState18 = compiler17.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker19 = compiler17.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput21 = compiler17.newExternInput("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray3 = compiler0.toSourceArray();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region10 = compiler0.getSourceRegion("4432#0.010\001\001\000\001\000\ufffd", 100);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler0.languageMode();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        double double7 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = compiler0.getSourceLine("4432#0.010\001\001\000\001\000\ufffd", (int) ' ');
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = compiler0.toSourceArray();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        java.lang.String str6 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getErrors();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream9 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        printStream1.write((int) '#');
        printStream1.print((float) (short) 0);
        printStream1.print(10L);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler16.rebuildInputsFromModules();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        double double6 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = compiler0.toSource();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.disableThreads();
        java.lang.String str7 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getMessages();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        printStream1.println(false);
        printStream1.println('#');
        printStream1.print('4');
        printStream1.print((-1));
        printStream1.println(false);
        java.io.PrintStream printStream19 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        java.io.PrintStream printStream21 = printStream19.append('4');
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray23 = compiler22.toSourceArray();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result7 = compiler0.getResult();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result6 = compiler0.getResult();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
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
        com.google.javascript.rhino.Node node12 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.rhino.Node node2 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        double double7 = compiler0.getProgress();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler0.newExternInput("\ufffd\nddd");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        compiler0.disableThreads();
        compiler0.disableThreads();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler0.languageMode();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.disableThreads();
        java.lang.String str7 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = compiler0.toSourceArray();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        java.lang.String str7 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler0.newExternInput("-1");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.rhino.Node node2 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("java.io.IOException: java.io.IOException: ", (int) (short) 1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        double double7 = compiler0.getProgress();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = compiler0.hasErrors();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = compiler0.toSourceArray();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
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
        com.google.javascript.jscomp.Scope scope12 = compiler0.getTopScope();
        java.lang.String str13 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = compiler0.toSource();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = compiler0.toSource();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("Unversioned directory");
        java.lang.String str2 = sourceFile1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = sourceFile1.getLineOfOffset((int) (byte) 100);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        printStream1.println(false);
        printStream1.println('#');
        printStream1.print('4');
        printStream1.print((-1));
        printStream1.println(false);
        java.io.PrintStream printStream19 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        java.io.PrintStream printStream21 = printStream19.append('4');
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler(printStream19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray23 = compiler22.getMessages();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        double double6 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getWarnings();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        com.google.javascript.rhino.Node node5 = compiler0.getRoot();
        double double6 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.isIdeMode();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        double double6 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap6 = compiler0.getInputsById();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        com.google.javascript.rhino.Node node5 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = compiler0.getErrorCount();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
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
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = compiler20.isTypeCheckingEnabled();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        double double2 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        java.lang.String str6 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode8 = compiler0.languageMode();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        boolean boolean2 = sourceFile1.isExtern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region4 = sourceFile1.getRegion(4);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        double double6 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("java.io.IOException: ");
        java.lang.String str2 = sourceFile1.getOriginalPath();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = sourceFile1.getLine((int) (byte) 10);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
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
        com.google.javascript.rhino.Node node12 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler0.getErrors();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        java.lang.String str7 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("4432#Unversionedhi!rector true\n0\n");
        sourceFile1.clearCachedSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = sourceFile1.getColumnOfOffset(97);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        double double3 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap4 = compiler0.getInputsById();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler0.languageMode();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker2 = compiler0.tracker;
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = compiler0.toSource();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        com.google.javascript.rhino.Node node5 = compiler0.getRoot();
        double double6 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        com.google.javascript.rhino.Node node5 = compiler0.getRoot();
        double double6 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler0.languageMode();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler0.languageMode();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = compiler0.toSource();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker2 = compiler0.tracker;
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable4 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
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
        printStream16.println();
        printStream16.flush();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.Scope scope24 = compiler23.getTopScope();
        double double25 = compiler23.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention26 = compiler23.getCodingConvention();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        java.lang.String str6 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = compiler0.getErrorCount();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        double double7 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable8 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
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
        printStream16.println();
        printStream16.print((-1L));
        printStream16.println(' ');
        printStream16.close();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(printStream16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray28 = compiler27.getErrors();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter4 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode1 = compiler0.languageMode();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result9 = compiler0.getResult();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray4 = compiler0.toSourceArray();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream9 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        printStream1.write((int) '#');
        printStream1.print((float) (short) 0);
        printStream1.print(10L);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(printStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput18 = compiler16.newExternInput("-1");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
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
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = compiler17.isIdeMode();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        java.io.PrintStream printStream3 = new java.io.PrintStream("Unversioned directory");
        char[] charArray6 = new char[] { '4', '4' };
        printStream3.print(charArray6);
        printStream1.print(charArray6);
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream1);
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler9.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result11 = compiler9.getResult();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        java.lang.String str7 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        com.google.javascript.rhino.Node node5 = compiler0.getRoot();
        double double6 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = compiler0.toSource();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        java.lang.String str6 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
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
        com.google.javascript.rhino.Node node12 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray14 = compiler0.getWarnings();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region9 = compiler0.getSourceRegion("4432#Unversionedhi!rector true\n0\n", 35);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        double double6 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler0.getErrorManager();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        java.io.PrintStream printStream7 = new java.io.PrintStream("Unversioned directory");
        char[] charArray10 = new char[] { '4', '4' };
        printStream7.print(charArray10);
        printStream7.print((int) ' ');
        java.io.PrintStream printStream14 = new java.io.PrintStream((java.io.OutputStream) printStream7);
        com.google.javascript.jscomp.SourceFile.Builder builder16 = new com.google.javascript.jscomp.SourceFile.Builder();
        java.io.IOException iOException18 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) iOException18);
        java.lang.Object[] objArray21 = new java.lang.Object[] { builder16, iOException19, (byte) 10 };
        java.io.PrintStream printStream22 = printStream14.printf("", objArray21);
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream22);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState24 = compiler23.getState();
        compiler0.setState(intermediateState24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = compiler0.getWarningCount();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        compiler0.disableThreads();
        double double6 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode5 = compiler0.languageMode();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        sourceFile1.clearCachedSource();
        java.lang.String str3 = sourceFile1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = sourceFile1.getLineOffset(0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        double double3 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = compiler0.getSourceLine("// Input %num%", (int) '4');
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        double double6 = compiler0.getProgress();
        com.google.javascript.jscomp.Region region9 = compiler0.getSourceRegion("", 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
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
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler(printStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler20.rebuildInputsFromModules();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap8 = compiler0.getInputsById();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = compiler0.getWarningCount();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        double double3 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode5 = compiler0.languageMode();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        double double4 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = compiler0.getErrorCount();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.hasErrors();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.isIdeMode();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        compiler0.disableThreads();
        java.lang.String str7 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("java.io.IOException");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = sourceFile1.getColumnOfOffset((-1));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        java.lang.String str8 = compiler0.getSourceLine("java.io.IOException: java.io.IOException: 2019/07/12 07:12", (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromCode("Unversioned directory", "2019/07/12 07:12", "hi!");
        java.lang.String str11 = sourceFile9.getLine((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = compiler0.parse(sourceFile9);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        java.lang.String str6 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        double double6 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getMessages();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        double double6 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        com.google.javascript.jscomp.Region region9 = compiler0.getSourceRegion("-1", (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = compiler0.getErrorCount();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("java.io.IOException: // Input %num%", (int) (byte) 1);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.isIdeMode();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable2 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        java.lang.String str7 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        java.lang.String str6 = compiler0.getAstDotGraph();
        double double7 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler0.getCodingConvention();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention2 = compiler0.getCodingConvention();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        java.lang.String str6 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromCode("java.io.IOException: ", "2019/07/12 07:12", "java.io.IOException");
        sourceFile10.setOriginalPath("java.io.IOException: -1");
        java.lang.String str14 = sourceFile10.getLine(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = compiler0.parse(sourceFile10);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
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
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.rhino.Node node18 = compiler17.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region21 = compiler17.getSourceRegion("// Input %num%", 32);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput13 = compiler0.newExternInput("java.io.IOException: // Input %num%");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
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
        com.google.javascript.rhino.Node node12 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        java.lang.String str6 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result7 = compiler0.getResult();
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        compiler0.disableThreads();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream9 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        printStream9.close();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(printStream9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = compiler11.hasErrors();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = compiler0.getWarningCount();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput2 = compiler0.newExternInput("java.io.IOException: // Input %num%");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
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
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState18 = compiler17.getState();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        double double20 = compiler19.getProgress();
        compiler19.reportCodeChange();
        java.lang.String str22 = compiler19.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler19.getState();
        compiler19.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState25 = compiler19.getState();
        compiler17.setState(intermediateState25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = compiler17.toSource();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        double double7 = compiler0.getProgress();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
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
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState18 = compiler17.getState();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        double double20 = compiler19.getProgress();
        compiler19.reportCodeChange();
        java.lang.String str22 = compiler19.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler19.getState();
        compiler19.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState25 = compiler19.getState();
        compiler17.setState(intermediateState25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean27 = compiler17.hasErrors();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        double double6 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        double double6 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = compiler0.getSourceLine("2019/07/12 07:12", 4);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
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
        printStream16.println();
        printStream16.print((-1L));
        printStream16.println(' ');
        printStream16.close();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(printStream16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput29 = compiler27.newExternInput("java.io.IOException: -1");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler0.getTypeRegistry();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
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
        printStream16.println();
        printStream16.flush();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler(printStream16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = compiler23.getWarningCount();
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        com.google.javascript.rhino.Node node5 = compiler0.getRoot();
        double double6 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getWarnings();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = compiler0.toSourceArray();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        java.lang.String str5 = compiler0.getAstDotGraph();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler0.getCodingConvention();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable9 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        java.lang.String str7 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node8 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        java.lang.String str7 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler0.newExternInput("-1");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        double double6 = compiler0.getProgress();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = compiler0.parse(sourceFile10);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getErrors();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        java.io.PrintStream printStream3 = new java.io.PrintStream("Unversioned directory");
        char[] charArray6 = new char[] { '4', '4' };
        printStream3.print(charArray6);
        printStream1.print(charArray6);
        java.io.PrintStream printStream10 = new java.io.PrintStream("Unversioned directory");
        char[] charArray13 = new char[] { '4', '4' };
        printStream10.print(charArray13);
        printStream10.print((int) ' ');
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream10.write(byteArray23, (int) (byte) 0, (int) (byte) 1);
        printStream1.write(byteArray23);
        java.io.PrintStream printStream29 = new java.io.PrintStream("Unversioned directory");
        char[] charArray32 = new char[] { '4', '4' };
        printStream29.print(charArray32);
        printStream29.print((int) ' ');
        java.io.PrintStream printStream36 = new java.io.PrintStream((java.io.OutputStream) printStream29);
        com.google.javascript.jscomp.SourceFile.Builder builder38 = new com.google.javascript.jscomp.SourceFile.Builder();
        java.io.IOException iOException40 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException41 = new java.io.IOException((java.lang.Throwable) iOException40);
        java.lang.Object[] objArray43 = new java.lang.Object[] { builder38, iOException41, (byte) 10 };
        java.io.PrintStream printStream44 = printStream36.printf("", objArray43);
        printStream44.println((float) (-1L));
        java.io.PrintStream printStream48 = printStream44.append('#');
        java.io.PrintStream printStream50 = new java.io.PrintStream((java.io.OutputStream) printStream44, true);
        printStream44.print(false);
        printStream44.print(' ');
        java.io.PrintStream printStream56 = new java.io.PrintStream("Unversioned directory");
        char[] charArray59 = new char[] { '4', '4' };
        printStream56.print(charArray59);
        printStream56.print((int) ' ');
        java.io.PrintStream printStream63 = new java.io.PrintStream((java.io.OutputStream) printStream56);
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray64 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList65 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList65, locationMappingArray64);
        com.google.javascript.jscomp.SourceFile sourceFile69 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "java.io.IOException: ");
        boolean boolean70 = locationMappingList65.remove((java.lang.Object) "hi!");
        boolean boolean71 = locationMappingList65.isEmpty();
        printStream63.println((java.lang.Object) boolean71);
        printStream63.print((float) 1L);
        java.io.PrintStream printStream76 = new java.io.PrintStream("Unversioned directory");
        char[] charArray79 = new char[] { '4', '4' };
        printStream76.print(charArray79);
        printStream76.print((int) ' ');
        java.io.PrintStream printStream83 = new java.io.PrintStream((java.io.OutputStream) printStream76);
        java.io.PrintStream printStream85 = new java.io.PrintStream("Unversioned directory");
        char[] charArray88 = new char[] { '4', '4' };
        printStream85.print(charArray88);
        printStream76.println(charArray88);
        printStream63.print(charArray88);
        printStream44.println(charArray88);
        printStream1.println(charArray88);
        com.google.javascript.jscomp.Compiler compiler94 = new com.google.javascript.jscomp.Compiler(printStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean95 = compiler94.isTypeCheckingEnabled();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        compiler0.disableThreads();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.isIdeMode();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream9 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler(printStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = compiler10.getErrorCount();
    }
}

