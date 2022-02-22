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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.SourceFile> sourceFileList0 = com.google.javascript.jscomp.CommandLineRunner.getDefaultExterns();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable1 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        com.google.javascript.jscomp.JSModule jSModule8 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        jSModule8.sortInputsByDeps(compiler9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = jsAst6.getAstRoot((com.google.javascript.jscomp.AbstractCompiler) compiler9);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("STRING PARAM_LIST 49");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region3 = sourceFile1.getRegion((int) (short) 1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        java.lang.String str6 = sourceFile2.getName();
        java.lang.String str7 = sourceFile2.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput(sourceFile2, true);
        com.google.javascript.jscomp.SourceAst sourceAst10 = compilerInput9.getAst();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection11 = compilerInput9.getRequires();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        jSModule1.sortInputsByDeps(compiler2);
        com.google.javascript.rhino.Node node4 = compiler2.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler2.getCodingConvention();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = compiler0.hasErrors();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        jSModule1.sortInputsByDeps(compiler2);
        com.google.javascript.rhino.Node node4 = compiler2.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.normalize();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getMessages();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = compiler0.getTypeRegistry();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        jSModule1.sortInputsByDeps(compiler2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler2.getTypeRegistry();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection10 = compilerInput9.getRequires();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput7.removeRequire("Unversioned directory");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        int int6 = sourceFile2.getLineOfOffset(100);
        java.lang.String str7 = sourceFile2.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = new com.google.javascript.jscomp.CompilerInput(sourceFile2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection9 = compilerInput8.getRequires();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region4 = compiler0.getSourceRegion("Unversioned directory", (int) (byte) 100);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int8 = sourceFile6.getLineOfOffset((int) (short) 1);
        java.lang.String str9 = sourceFile6.getName();
        com.google.javascript.jscomp.JsAst jsAst10 = new com.google.javascript.jscomp.JsAst(sourceFile6);
        jsAst10.clearAst();
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int16 = sourceFile14.getLineOfOffset((int) (short) 1);
        java.lang.String str17 = sourceFile14.getName();
        java.lang.String str18 = sourceFile14.getName();
        jsAst10.setSourceFile(sourceFile14);
        com.google.javascript.jscomp.SourceFile sourceFile20 = jsAst10.getSourceFile();
        jsAst10.clearAst();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.replaceScript(jsAst10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        jSModule1.sortInputsByDeps(compiler2);
        java.lang.String str4 = jSModule1.getName();
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int9 = sourceFile7.getLineOfOffset((int) (short) 1);
        java.lang.String str10 = sourceFile7.getName();
        java.lang.String str11 = sourceFile7.getName();
        java.lang.String str12 = sourceFile7.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput14 = new com.google.javascript.jscomp.CompilerInput(sourceFile7, true);
        com.google.javascript.jscomp.CompilerInput compilerInput15 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput14);
        com.google.javascript.jscomp.JSModule jSModule16 = compilerInput14.getModule();
        jSModule1.add(compilerInput14);
        com.google.javascript.jscomp.SourceFile sourceFile19 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput21 = new com.google.javascript.jscomp.CompilerInput(sourceFile19, true);
        com.google.javascript.rhino.InputId inputId23 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput25 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput21, inputId23, true);
        com.google.javascript.jscomp.CompilerInput compilerInput27 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput25, false);
        com.google.javascript.jscomp.JSModule jSModule29 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        jSModule29.sortInputsByDeps(compiler30);
        java.lang.String str32 = jSModule29.getName();
        compilerInput25.setModule(jSModule29);
        java.lang.String str34 = compilerInput25.getCode();
        com.google.javascript.jscomp.SourceFile sourceFile35 = compilerInput25.getSourceFile();
        jSModule1.remove(compilerInput25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region38 = compilerInput25.getRegion((-1));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = compilerInput7.getNumLines();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, false);
        com.google.javascript.jscomp.JSModule jSModule11 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        jSModule11.sortInputsByDeps(compiler12);
        java.lang.String str14 = jSModule11.getName();
        compilerInput7.setModule(jSModule11);
        java.lang.String str16 = compilerInput7.getCode();
        com.google.javascript.jscomp.SourceFile sourceFile17 = compilerInput7.getSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region19 = compilerInput7.getRegion(2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        int int6 = sourceFile2.getLineOfOffset(100);
        java.lang.String str7 = sourceFile2.getName();
        java.io.Reader reader8 = sourceFile2.getCodeReader();
        int int10 = sourceFile2.getLineOfOffset(51);
        com.google.javascript.jscomp.CompilerInput compilerInput11 = new com.google.javascript.jscomp.CompilerInput(sourceFile2);
        int int12 = compilerInput11.getNumLines();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = compilerInput11.getProvides();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, false);
        com.google.javascript.rhino.InputId inputId10 = compilerInput9.getInputId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = compilerInput9.getLine(2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray4 = compiler0.toSourceArray();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region3 = sourceFile1.getRegion((int) (byte) -1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("DiagnosticGroup<checkProvides>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = sourceFile1.getLine((int) (short) 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.getCodingConvention();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.hasErrors();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter5 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = compiler0.getWarningCount();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("java.io.IOException: ", 43, (int) '#');
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("PARAM_LIST", 49, 0);
        boolean boolean8 = node7.isTry();
        java.lang.String str9 = node7.toString();
        boolean boolean10 = node3.hasChild(node7);
        boolean boolean11 = node3.isFromExterns();
        com.google.javascript.jscomp.SourceFile sourceFile13 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput15 = new com.google.javascript.jscomp.CompilerInput(sourceFile13, true);
        node3.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile) sourceFile13);
        java.lang.String str17 = sourceFile13.getCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region19 = sourceFile13.getRegion((int) '4');
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.hasErrors();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        java.lang.String str6 = sourceFile2.getName();
        java.lang.String str7 = sourceFile2.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput(sourceFile2, true);
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput9);
        com.google.javascript.jscomp.CompilerInput compilerInput12 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput9, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = compilerInput9.getRequires();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, false);
        com.google.javascript.jscomp.JSModule jSModule11 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        jSModule11.sortInputsByDeps(compiler12);
        java.lang.String str14 = jSModule11.getName();
        compilerInput7.setModule(jSModule11);
        java.lang.String str16 = compilerInput7.getCode();
        com.google.javascript.jscomp.CompilerInput compilerInput19 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, "*global*", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = compilerInput7.getNumLines();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("java.io.IOException: ", 43, (int) '#');
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("PARAM_LIST", 49, 0);
        boolean boolean8 = node7.isTry();
        java.lang.String str9 = node7.toString();
        boolean boolean10 = node3.hasChild(node7);
        boolean boolean11 = node3.isFromExterns();
        com.google.javascript.jscomp.SourceFile sourceFile13 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput15 = new com.google.javascript.jscomp.CompilerInput(sourceFile13, true);
        node3.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile) sourceFile13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = sourceFile13.getLineOfOffset(4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.io.File file2 = new java.io.File(":", "hi!");
        boolean boolean5 = file2.setExecutable(true, false);
        long long6 = file2.lastModified();
        boolean boolean7 = file2.mkdir();
        java.lang.String str8 = file2.getCanonicalPath();
        java.io.PrintStream printStream9 = new java.io.PrintStream(file2);
        printStream9.write(49);
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler(printStream9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray13 = compiler12.getWarnings();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        java.lang.String str6 = sourceFile2.getName();
        java.lang.String str7 = sourceFile2.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput(sourceFile2, true);
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput9);
        int int11 = compilerInput9.getNumLines();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput9.removeRequire("*global*");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, "/experiment/:/hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection7 = compilerInput6.getProvides();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
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
        com.google.javascript.rhino.InputId inputId44 = compilerInput40.getInputId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = compilerInput40.getLine(300);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        java.lang.String str8 = compilerInput7.toString();
        com.google.javascript.jscomp.SourceFile sourceFile9 = compilerInput7.getSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = sourceFile9.getLineOffset((int) '4');
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        jsAst6.clearAst();
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) jsAst6, "*global*", false);
        com.google.javascript.rhino.InputId inputId11 = compilerInput10.getInputId();
        com.google.javascript.jscomp.SourceAst sourceAst12 = compilerInput10.getAst();
        com.google.javascript.jscomp.SourceFile sourceFile13 = compilerInput10.getSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection14 = compilerInput10.getRequires();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput7.removeRequire("*global*.  at *global* line (unknown line) : (unknown column)");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region3 = compiler0.getSourceRegion("goog.exportSymbol", 8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        com.google.javascript.rhino.InputId inputId44 = compilerInput40.getInputId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = compilerInput40.getLine(37);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        jSModule1.sortInputsByDeps(compiler2);
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int8 = sourceFile6.getLineOfOffset((int) (short) 1);
        java.lang.String str9 = sourceFile6.getName();
        java.lang.String str10 = sourceFile6.getName();
        java.lang.String str11 = sourceFile6.getName();
        com.google.javascript.jscomp.JsAst jsAst12 = new com.google.javascript.jscomp.JsAst(sourceFile6);
        com.google.javascript.jscomp.SourceFile sourceFile13 = jsAst12.getSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler2.replaceScript(jsAst12);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler0.getSourceMap();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = compiler0.getErrorCount();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        jSModule1.sortInputsByDeps(compiler2);
        java.lang.String str4 = jSModule1.getName();
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int9 = sourceFile7.getLineOfOffset((int) (short) 1);
        java.lang.String str10 = sourceFile7.getName();
        java.lang.String str11 = sourceFile7.getName();
        java.lang.String str12 = sourceFile7.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput14 = new com.google.javascript.jscomp.CompilerInput(sourceFile7, true);
        com.google.javascript.jscomp.CompilerInput compilerInput15 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput14);
        com.google.javascript.jscomp.JSModule jSModule16 = compilerInput14.getModule();
        jSModule1.add(compilerInput14);
        com.google.javascript.jscomp.SourceFile sourceFile19 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput21 = new com.google.javascript.jscomp.CompilerInput(sourceFile19, true);
        com.google.javascript.rhino.InputId inputId23 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput25 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput21, inputId23, true);
        com.google.javascript.jscomp.CompilerInput compilerInput27 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput25, false);
        com.google.javascript.jscomp.JSModule jSModule29 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        jSModule29.sortInputsByDeps(compiler30);
        java.lang.String str32 = jSModule29.getName();
        compilerInput25.setModule(jSModule29);
        java.lang.String str34 = compilerInput25.getCode();
        com.google.javascript.jscomp.SourceFile sourceFile35 = compilerInput25.getSourceFile();
        jSModule1.remove(compilerInput25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection37 = compilerInput25.getProvides();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode3 = compiler0.languageMode();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("java.io.IOException: ");
        com.google.javascript.jscomp.JSModule jSModule3 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        jSModule3.sortInputsByDeps(compiler4);
        com.google.javascript.jscomp.SourceFile.Builder builder6 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int12 = sourceFile10.getLineOfOffset((int) (short) 1);
        java.io.Reader reader13 = sourceFile10.getCodeReader();
        int int14 = reader13.read();
        com.google.javascript.jscomp.SourceFile sourceFile15 = builder6.buildFromReader("*global*", reader13);
        jSModule3.add(sourceFile15);
        com.google.javascript.jscomp.JSModule jSModule18 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        jSModule18.sortInputsByDeps(compiler19);
        com.google.javascript.jscomp.SourceFile.Builder builder21 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile sourceFile25 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int27 = sourceFile25.getLineOfOffset((int) (short) 1);
        java.io.Reader reader28 = sourceFile25.getCodeReader();
        int int29 = reader28.read();
        com.google.javascript.jscomp.SourceFile sourceFile30 = builder21.buildFromReader("*global*", reader28);
        jSModule18.add(sourceFile30);
        boolean boolean33 = jSModule18.removeByName("PARAM_LIST");
        jSModule3.addDependency(jSModule18);
        com.google.javascript.jscomp.SourceFile sourceFile36 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput38 = new com.google.javascript.jscomp.CompilerInput(sourceFile36, true);
        com.google.javascript.rhino.InputId inputId40 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput42 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput38, inputId40, true);
        com.google.javascript.jscomp.CompilerInput compilerInput44 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput42, false);
        jSModule3.addFirst(compilerInput42);
        com.google.javascript.jscomp.CompilerInput compilerInput47 = jSModule3.getByName("");
        com.google.javascript.jscomp.SourceFile sourceFile49 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput51 = new com.google.javascript.jscomp.CompilerInput(sourceFile49, true);
        com.google.javascript.rhino.InputId inputId53 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput55 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput51, inputId53, true);
        com.google.javascript.jscomp.CompilerInput compilerInput57 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput55, false);
        com.google.javascript.jscomp.JSModule jSModule59 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler60 = new com.google.javascript.jscomp.Compiler();
        jSModule59.sortInputsByDeps(compiler60);
        java.lang.String str62 = jSModule59.getName();
        compilerInput55.setModule(jSModule59);
        jSModule59.setDepth((int) (byte) 0);
        jSModule3.addDependency(jSModule59);
        com.google.javascript.jscomp.SourceFile sourceFile69 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int71 = sourceFile69.getLineOfOffset((int) (short) 1);
        java.lang.String str72 = sourceFile69.getName();
        java.lang.String str73 = sourceFile69.getName();
        java.lang.String str74 = sourceFile69.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput76 = new com.google.javascript.jscomp.CompilerInput(sourceFile69, true);
        com.google.javascript.jscomp.CompilerInput compilerInput77 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput76);
        com.google.javascript.jscomp.CompilerInput compilerInput79 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput76, false);
        jSModule59.remove(compilerInput76);
        jSModule1.add(compilerInput76);
        com.google.javascript.jscomp.SourceFile sourceFile83 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput85 = new com.google.javascript.jscomp.CompilerInput(sourceFile83, true);
        com.google.javascript.rhino.InputId inputId87 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput89 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput85, inputId87, true);
        jSModule1.remove(compilerInput89);
        com.google.javascript.jscomp.SourceFile sourceFile91 = compilerInput89.getSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput89.removeRequire(":");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        jSModule1.removeAll();
        com.google.javascript.jscomp.SourceFile sourceFile4 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput(sourceFile4, true);
        com.google.javascript.rhino.InputId inputId8 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput6, inputId8, true);
        java.lang.String str11 = compilerInput10.toString();
        com.google.javascript.jscomp.SourceFile sourceFile12 = compilerInput10.getSourceFile();
        jSModule1.remove(compilerInput10);
        com.google.javascript.jscomp.CompilerInput compilerInput15 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput10, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection16 = compilerInput10.getProvides();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) ' ', "OFF");
        boolean boolean3 = node2.hasOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node2.getChildAtIndex(41);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        java.lang.String str6 = sourceFile2.getName();
        java.lang.String str7 = sourceFile2.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput(sourceFile2, true);
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput9);
        boolean boolean11 = compilerInput9.isExtern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput9.removeRequire("JSC_OPTIMIZE_LOOP_ERROR: Exceeded max number of code motion iterations: {0}");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int5 = sourceFile3.getLineOfOffset((int) (short) 1);
        int int7 = sourceFile3.getLineOfOffset(100);
        java.lang.String str8 = sourceFile3.getName();
        java.io.Reader reader9 = sourceFile3.getCodeReader();
        reader9.reset();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("PARAM_LIST", reader9);
        java.lang.String str12 = sourceFile11.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput13 = new com.google.javascript.jscomp.CompilerInput(sourceFile11);
        com.google.javascript.jscomp.CompilerInput compilerInput15 = new com.google.javascript.jscomp.CompilerInput(sourceFile11, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection16 = compilerInput15.getRequires();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        double double6 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap7 = compiler0.getInputsById();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
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
        java.lang.String str27 = sourceFile23.getName();
        java.lang.String str28 = sourceFile23.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput30 = new com.google.javascript.jscomp.CompilerInput(sourceFile23, true);
        com.google.javascript.jscomp.CompilerInput compilerInput31 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput30);
        jSModule1.add(compilerInput30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput30.removeRequire("DiagnosticGroup<java.io.IOException: OFF>");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region7 = compiler0.getSourceRegion("", 50);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        jSModule1.removeAll();
        com.google.javascript.jscomp.SourceFile sourceFile4 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput(sourceFile4, true);
        com.google.javascript.rhino.InputId inputId8 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput6, inputId8, true);
        java.lang.String str11 = compilerInput10.toString();
        com.google.javascript.jscomp.SourceFile sourceFile12 = compilerInput10.getSourceFile();
        jSModule1.remove(compilerInput10);
        com.google.javascript.jscomp.CompilerInput compilerInput15 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput10, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput10.removeRequire(":");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, "/experiment/:/hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = compilerInput3.getLineOffset((int) 'a');
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        java.lang.String str8 = compilerInput7.toString();
        java.lang.String str9 = compilerInput7.getName();
        com.google.javascript.jscomp.JSModule jSModule11 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.CompilerInput compilerInput13 = jSModule11.getByName("FINEST");
        boolean boolean15 = jSModule11.removeByName("*global*");
        java.util.List<com.google.javascript.jscomp.JSModule> jSModuleList16 = jSModule11.getDependencies();
        compilerInput7.setModule(jSModule11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = compilerInput7.getNumLines();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getMessages();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, "/experiment/:/hi!", false);
        com.google.javascript.jscomp.SourceFile sourceFile8 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput(sourceFile8, true);
        com.google.javascript.rhino.InputId inputId12 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput14 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput10, inputId12, true);
        java.lang.String str15 = compilerInput14.toString();
        com.google.javascript.jscomp.SourceFile sourceFile16 = compilerInput14.getSourceFile();
        compilerInput3.setSourceFile(sourceFile16);
        com.google.javascript.jscomp.SourceFile sourceFile18 = compilerInput3.getSourceFile();
        com.google.javascript.jscomp.SourceFile sourceFile19 = compilerInput3.getSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = compilerInput3.getNumLines();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        jSModule1.sortInputsByDeps(compiler2);
        com.google.javascript.rhino.Node node4 = compiler2.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler2.getErrors();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        jSModule1.sortInputsByDeps(compiler2);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("InputId: *global*");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler2.getInput(inputId5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, false);
        com.google.javascript.jscomp.JSModule jSModule11 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        jSModule11.sortInputsByDeps(compiler12);
        java.lang.String str14 = jSModule11.getName();
        compilerInput7.setModule(jSModule11);
        java.lang.String str16 = compilerInput7.getCode();
        com.google.javascript.jscomp.CompilerInput compilerInput19 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, "*global*", true);
        com.google.javascript.jscomp.CompilerInput compilerInput20 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = compilerInput20.getLineOffset(51);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, "/experiment/:/hi!", false);
        com.google.javascript.jscomp.SourceFile sourceFile8 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput(sourceFile8, true);
        com.google.javascript.rhino.InputId inputId12 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput14 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput10, inputId12, true);
        java.lang.String str15 = compilerInput14.toString();
        com.google.javascript.jscomp.SourceFile sourceFile16 = compilerInput14.getSourceFile();
        compilerInput6.setSourceFile(sourceFile16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = sourceFile16.getLine(7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = compiler0.getErrorCount();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, false);
        com.google.javascript.jscomp.JSModule jSModule11 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        jSModule11.sortInputsByDeps(compiler12);
        java.lang.String str14 = jSModule11.getName();
        compilerInput7.setModule(jSModule11);
        java.lang.String str16 = compilerInput7.getCode();
        com.google.javascript.jscomp.CompilerInput compilerInput19 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, "*global*", true);
        com.google.javascript.jscomp.CompilerInput compilerInput20 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput19);
        com.google.javascript.rhino.InputId inputId21 = compilerInput19.getInputId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection22 = compilerInput19.getProvides();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        java.lang.String str4 = sourceFile1.getCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = sourceFile1.getLineOffset((-4));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        jSModule1.removeAll();
        com.google.javascript.jscomp.SourceFile sourceFile4 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput(sourceFile4, true);
        com.google.javascript.rhino.InputId inputId8 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput6, inputId8, true);
        java.lang.String str11 = compilerInput10.toString();
        com.google.javascript.jscomp.SourceFile sourceFile12 = compilerInput10.getSourceFile();
        jSModule1.remove(compilerInput10);
        java.lang.String str14 = compilerInput10.getName();
        java.lang.String str15 = compilerInput10.getCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = compilerInput10.getLineOffset(30);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.getCodingConvention();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        double double6 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = compiler0.getSourceLine("STRING PARAM_LIST", 3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int5 = sourceFile3.getLineOfOffset((int) (short) 1);
        int int7 = sourceFile3.getLineOfOffset(100);
        java.lang.String str8 = sourceFile3.getName();
        java.io.Reader reader9 = sourceFile3.getCodeReader();
        reader9.reset();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("PARAM_LIST", reader9);
        java.lang.String str12 = sourceFile11.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput13 = new com.google.javascript.jscomp.CompilerInput(sourceFile11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection14 = compilerInput13.getProvides();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = compiler0.getTypeRegistry();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        java.lang.String str6 = sourceFile2.getName();
        java.lang.String str7 = sourceFile2.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput(sourceFile2, true);
        boolean boolean10 = compilerInput9.isExtern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection11 = compilerInput9.getRequires();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int5 = sourceFile3.getLineOfOffset((int) (short) 1);
        int int7 = sourceFile3.getLineOfOffset(100);
        java.lang.String str8 = sourceFile3.getName();
        java.io.Reader reader9 = sourceFile3.getCodeReader();
        reader9.reset();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("PARAM_LIST", reader9);
        int int13 = sourceFile11.getLineOfOffset(10);
        com.google.javascript.jscomp.JsAst jsAst14 = new com.google.javascript.jscomp.JsAst(sourceFile11);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        compiler15.disableThreads();
        compiler15.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node18 = jsAst14.getAstRoot((com.google.javascript.jscomp.AbstractCompiler) compiler15);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, false);
        com.google.javascript.jscomp.CompilerInput compilerInput11 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput9, false);
        com.google.javascript.jscomp.SourceAst sourceAst12 = compilerInput11.getSourceAst();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = compilerInput11.getRequires();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("DiagnosticGroup<checkProvides>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.Reader reader2 = sourceFile1.getCodeReader();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getWarnings();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        jsAst6.clearAst();
        com.google.javascript.jscomp.SourceFile sourceFile8 = jsAst6.getSourceFile();
        com.google.javascript.jscomp.SourceFile sourceFile9 = jsAst6.getSourceFile();
        com.google.javascript.jscomp.SourceFile sourceFile10 = jsAst6.getSourceFile();
        com.google.javascript.jscomp.CompilerInput compilerInput11 = new com.google.javascript.jscomp.CompilerInput(sourceFile10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection12 = compilerInput11.getRequires();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region5 = compilerInput3.getRegion(25);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        jsAst6.clearAst();
        com.google.javascript.jscomp.SourceFile sourceFile8 = jsAst6.getSourceFile();
        com.google.javascript.jscomp.SourceFile sourceFile9 = jsAst6.getSourceFile();
        jsAst6.clearAst();
        com.google.javascript.rhino.InputId inputId11 = jsAst6.getInputId();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        compiler12.disableThreads();
        compiler12.reportCodeChange();
        compiler12.reportCodeChange();
        compiler12.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = jsAst6.getAstRoot((com.google.javascript.jscomp.AbstractCompiler) compiler12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        java.lang.String str6 = sourceFile2.getName();
        java.lang.String str7 = sourceFile2.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput(sourceFile2, true);
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput9);
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int15 = sourceFile13.getLineOfOffset((int) (short) 1);
        int int17 = sourceFile13.getColumnOfOffset(8);
        compilerInput10.setSourceFile(sourceFile13);
        com.google.javascript.jscomp.JSModule jSModule19 = compilerInput10.getModule();
        boolean boolean20 = compilerInput10.isExtern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection21 = compilerInput10.getProvides();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, false);
        com.google.javascript.jscomp.JSModule jSModule11 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        jSModule11.sortInputsByDeps(compiler12);
        java.lang.String str14 = jSModule11.getName();
        compilerInput7.setModule(jSModule11);
        java.lang.String str16 = compilerInput7.getCode();
        compilerInput7.clearAst();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection18 = compilerInput7.getProvides();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        com.google.javascript.jscomp.CompilerInput compilerInput34 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput31);
        com.google.javascript.jscomp.Region region36 = compilerInput34.getRegion(4095);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection37 = compilerInput34.getProvides();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode5 = compiler0.languageMode();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, false);
        com.google.javascript.jscomp.JSModule jSModule11 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        jSModule11.sortInputsByDeps(compiler12);
        java.lang.String str14 = jSModule11.getName();
        compilerInput7.setModule(jSModule11);
        java.lang.String str16 = compilerInput7.getCode();
        com.google.javascript.jscomp.CompilerInput compilerInput19 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, "*global*", true);
        com.google.javascript.jscomp.CompilerInput compilerInput20 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput19);
        com.google.javascript.rhino.InputId inputId21 = compilerInput19.getInputId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection22 = compilerInput19.getRequires();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = compiler0.toSource();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, "/experiment/:/hi!", false);
        com.google.javascript.jscomp.SourceFile sourceFile8 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput(sourceFile8, true);
        com.google.javascript.rhino.InputId inputId12 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput14 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput10, inputId12, true);
        java.lang.String str15 = compilerInput14.toString();
        com.google.javascript.jscomp.SourceFile sourceFile16 = compilerInput14.getSourceFile();
        compilerInput3.setSourceFile(sourceFile16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.Reader reader18 = sourceFile16.getCodeReader();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("Node tree inequality:\nTree1:\nNUMBER 2.80487936E11 30\n\n\nTree2:\nPARAM_LIST\n\n\nSubtree1: NUMBER 2.80487936E11 30\n\n\nSubtree2: PARAM_LIST\n", 97);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
        com.google.javascript.jscomp.SourceAst sourceAst44 = compilerInput40.getSourceAst();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection45 = compilerInput40.getRequires();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("// Input %num%", 47);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        java.lang.String str6 = sourceFile2.getName();
        java.lang.String str7 = sourceFile2.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput(sourceFile2, true);
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput9);
        com.google.javascript.jscomp.JSModule jSModule11 = compilerInput9.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = new com.google.javascript.jscomp.JSModule("/");
        jSModule13.setDepth(53);
        java.lang.String str16 = jSModule13.getName();
        compilerInput9.setModule(jSModule13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection18 = compilerInput9.getRequires();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, false);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        compiler10.disableThreads();
        compiler10.reportCodeChange();
        compilerInput7.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter14 = compiler10.getReverseAbstractInterpreter();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setReplaceStringsPlaceholderToken("hi!");
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel3 = com.google.javascript.jscomp.SourceMap.DetailLevel.SYMBOLS;
        compilerOptions0.setSourceMapDetailLevel(detailLevel3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("OFF", 2147483647, 4);
        boolean boolean9 = node8.isDec();
        int int10 = node8.getSideEffectFlags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = detailLevel3.apply(node8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap6 = compiler0.getInputsById();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId4 = compilerInput3.getInputId();
        com.google.javascript.rhino.InputId inputId6 = new com.google.javascript.rhino.InputId("*global*");
        java.lang.String str7 = inputId6.toString();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId6, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = compilerInput3.getLine(1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        com.google.javascript.jscomp.CompilerInput compilerInput34 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput31);
        com.google.javascript.jscomp.SourceFile sourceFile38 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", ":", "goog.abstractMethod");
        java.lang.String str39 = sourceFile38.getName();
        compilerInput34.setSourceFile(sourceFile38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection41 = compilerInput34.getRequires();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        java.lang.String str8 = compilerInput7.toString();
        java.lang.String str9 = compilerInput7.getName();
        com.google.javascript.jscomp.JSModule jSModule11 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.CompilerInput compilerInput13 = jSModule11.getByName("FINEST");
        boolean boolean15 = jSModule11.removeByName("*global*");
        java.util.List<com.google.javascript.jscomp.JSModule> jSModuleList16 = jSModule11.getDependencies();
        compilerInput7.setModule(jSModule11);
        com.google.javascript.jscomp.SourceAst sourceAst18 = compilerInput7.getSourceAst();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region20 = compilerInput7.getRegion((-10));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, false);
        com.google.javascript.jscomp.JSModule jSModule11 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        jSModule11.sortInputsByDeps(compiler12);
        java.lang.String str14 = jSModule11.getName();
        compilerInput7.setModule(jSModule11);
        java.lang.String str16 = compilerInput7.getCode();
        com.google.javascript.jscomp.CompilerInput compilerInput19 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, "*global*", true);
        com.google.javascript.jscomp.CompilerInput compilerInput20 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput19);
        com.google.javascript.rhino.InputId inputId21 = compilerInput19.getInputId();
        com.google.javascript.rhino.InputId inputId22 = compilerInput19.getInputId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput19.removeRequire("PARAM_LIST\n");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, false);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        compiler10.disableThreads();
        compiler10.reportCodeChange();
        compilerInput7.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler10.getCodingConvention();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        jsAst6.clearAst();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int12 = sourceFile10.getLineOfOffset((int) (short) 1);
        java.lang.String str13 = sourceFile10.getName();
        java.lang.String str14 = sourceFile10.getName();
        jsAst6.setSourceFile(sourceFile10);
        com.google.javascript.jscomp.SourceFile sourceFile16 = jsAst6.getSourceFile();
        java.lang.String str17 = sourceFile16.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput18 = new com.google.javascript.jscomp.CompilerInput(sourceFile16);
        compilerInput18.clearAst();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection20 = compilerInput18.getProvides();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, "/experiment/:/hi!", false);
        com.google.javascript.jscomp.SourceFile sourceFile8 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput(sourceFile8, true);
        com.google.javascript.rhino.InputId inputId12 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput14 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput10, inputId12, true);
        java.lang.String str15 = compilerInput14.toString();
        com.google.javascript.jscomp.SourceFile sourceFile16 = compilerInput14.getSourceFile();
        compilerInput3.setSourceFile(sourceFile16);
        com.google.javascript.jscomp.SourceFile sourceFile18 = compilerInput3.getSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region20 = compilerInput3.getRegion(700);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId4 = compilerInput3.getInputId();
        com.google.javascript.rhino.InputId inputId6 = new com.google.javascript.rhino.InputId("*global*");
        java.lang.String str7 = inputId6.toString();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId6, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput9.removeRequire("InputId: *global*");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        java.lang.String str6 = sourceFile2.getName();
        java.lang.String str7 = sourceFile2.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput(sourceFile2, true);
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput9);
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int15 = sourceFile13.getLineOfOffset((int) (short) 1);
        int int17 = sourceFile13.getColumnOfOffset(8);
        compilerInput10.setSourceFile(sourceFile13);
        com.google.javascript.jscomp.CompilerInput compilerInput20 = new com.google.javascript.jscomp.CompilerInput(sourceFile13, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput20.removeRequire(":");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        jsAst6.clearAst();
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) jsAst6, "*global*", false);
        com.google.javascript.rhino.InputId inputId11 = compilerInput10.getInputId();
        com.google.javascript.jscomp.SourceAst sourceAst12 = compilerInput10.getAst();
        com.google.javascript.jscomp.SourceFile sourceFile13 = compilerInput10.getSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput10.removeRequire("STRING PARAM_LIST 49: hi!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.io.PrintStream printStream1 = new java.io.PrintStream("goog.abstractMethod");
        printStream1.print(39L);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler4.getTypeRegistry();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        java.lang.String str8 = compilerInput7.toString();
        java.lang.String str9 = compilerInput7.getName();
        com.google.javascript.jscomp.JSModule jSModule11 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.CompilerInput compilerInput13 = jSModule11.getByName("FINEST");
        boolean boolean15 = jSModule11.removeByName("*global*");
        java.util.List<com.google.javascript.jscomp.JSModule> jSModuleList16 = jSModule11.getDependencies();
        compilerInput7.setModule(jSModule11);
        com.google.javascript.jscomp.SourceAst sourceAst18 = compilerInput7.getSourceAst();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = compilerInput7.getLineOffset((int) '#');
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        jsAst6.clearAst();
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) jsAst6, "*global*", false);
        com.google.javascript.rhino.InputId inputId11 = compilerInput10.getInputId();
        com.google.javascript.jscomp.SourceAst sourceAst12 = compilerInput10.getAst();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = compilerInput10.getRequires();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, false);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        compiler10.disableThreads();
        compiler10.reportCodeChange();
        compilerInput7.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable14 = compiler10.buildKnownSymbolTable();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        jsAst6.clearAst();
        com.google.javascript.jscomp.SourceFile sourceFile8 = jsAst6.getSourceFile();
        com.google.javascript.jscomp.SourceFile sourceFile9 = jsAst6.getSourceFile();
        com.google.javascript.jscomp.CompilerInput compilerInput11 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) jsAst6, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection12 = compilerInput11.getProvides();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int9 = sourceFile7.getLineOfOffset((int) (short) 1);
        int int11 = sourceFile7.getLineOfOffset(100);
        java.lang.String str12 = sourceFile7.getName();
        java.io.Reader reader13 = sourceFile7.getCodeReader();
        reader13.reset();
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("PARAM_LIST", reader13);
        int int17 = sourceFile15.getLineOfOffset(10);
        com.google.javascript.jscomp.JsAst jsAst18 = new com.google.javascript.jscomp.JsAst(sourceFile15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.replaceScript(jsAst18);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, "/experiment/:/hi!", false);
        com.google.javascript.jscomp.SourceFile sourceFile8 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput(sourceFile8, true);
        com.google.javascript.rhino.InputId inputId12 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput14 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput10, inputId12, true);
        java.lang.String str15 = compilerInput14.toString();
        com.google.javascript.jscomp.SourceFile sourceFile16 = compilerInput14.getSourceFile();
        compilerInput3.setSourceFile(sourceFile16);
        com.google.javascript.jscomp.SourceFile sourceFile18 = compilerInput3.getSourceFile();
        com.google.javascript.jscomp.SourceFile sourceFile19 = compilerInput3.getSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection20 = compilerInput3.getProvides();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        java.lang.String str8 = compilerInput7.toString();
        java.lang.String str9 = compilerInput7.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput7.removeRequire("JSC_OPTIMIZE_LOOP_ERROR");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region9 = compilerInput7.getRegion(0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        java.lang.String str6 = sourceFile2.getName();
        java.lang.String str7 = sourceFile2.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput(sourceFile2, true);
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput9);
        com.google.javascript.jscomp.JSModule jSModule11 = compilerInput9.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        jSModule13.sortInputsByDeps(compiler14);
        java.lang.String str16 = jSModule13.getName();
        compilerInput9.setModule(jSModule13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput9.removeRequire("/tmp/PARAM_LIST6145687020670090410Unversioned directory");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int10 = sourceFile8.getLineOfOffset((int) (short) 1);
        java.lang.String str11 = sourceFile8.getName();
        com.google.javascript.jscomp.JsAst jsAst12 = new com.google.javascript.jscomp.JsAst(sourceFile8);
        jsAst12.clearAst();
        com.google.javascript.jscomp.SourceFile sourceFile14 = jsAst12.getSourceFile();
        com.google.javascript.jscomp.SourceFile sourceFile15 = jsAst12.getSourceFile();
        com.google.javascript.jscomp.SourceFile sourceFile16 = jsAst12.getSourceFile();
        com.google.javascript.jscomp.CompilerInput compilerInput17 = new com.google.javascript.jscomp.CompilerInput(sourceFile16);
        com.google.javascript.rhino.InputId inputId18 = compilerInput17.getInputId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput19 = compiler0.getInput(inputId18);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int5 = sourceFile3.getLineOfOffset((int) (short) 1);
        int int7 = sourceFile3.getLineOfOffset(100);
        java.lang.String str8 = sourceFile3.getName();
        java.io.Reader reader9 = sourceFile3.getCodeReader();
        reader9.reset();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("PARAM_LIST", reader9);
        java.lang.String str12 = sourceFile11.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput13 = new com.google.javascript.jscomp.CompilerInput(sourceFile11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput13.removeRequire("PARAM_LIST 47\n    PARAM_LIST\n");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, false);
        com.google.javascript.jscomp.CompilerInput compilerInput12 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput9, ":/hi!", true);
        com.google.javascript.jscomp.JSModule jSModule13 = compilerInput12.getModule();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = compilerInput12.getLineOffset(42);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler0.getTypeRegistry();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        jSModule1.sortInputsByDeps(compiler2);
        java.lang.String str4 = jSModule1.getName();
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int9 = sourceFile7.getLineOfOffset((int) (short) 1);
        java.lang.String str10 = sourceFile7.getName();
        java.lang.String str11 = sourceFile7.getName();
        java.lang.String str12 = sourceFile7.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput14 = new com.google.javascript.jscomp.CompilerInput(sourceFile7, true);
        com.google.javascript.jscomp.CompilerInput compilerInput15 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput14);
        com.google.javascript.jscomp.JSModule jSModule16 = compilerInput14.getModule();
        jSModule1.add(compilerInput14);
        com.google.javascript.jscomp.SourceFile sourceFile19 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput21 = new com.google.javascript.jscomp.CompilerInput(sourceFile19, true);
        com.google.javascript.rhino.InputId inputId23 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput25 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput21, inputId23, true);
        com.google.javascript.jscomp.CompilerInput compilerInput27 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput25, false);
        com.google.javascript.jscomp.JSModule jSModule29 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        jSModule29.sortInputsByDeps(compiler30);
        java.lang.String str32 = jSModule29.getName();
        compilerInput25.setModule(jSModule29);
        java.lang.String str34 = compilerInput25.getCode();
        com.google.javascript.jscomp.SourceFile sourceFile35 = compilerInput25.getSourceFile();
        jSModule1.remove(compilerInput25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection37 = compilerInput25.getRequires();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        jsAst6.clearAst();
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) jsAst6, "*global*", false);
        com.google.javascript.rhino.InputId inputId11 = compilerInput10.getInputId();
        com.google.javascript.jscomp.SourceFile sourceFile12 = compilerInput10.getSourceFile();
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int17 = sourceFile15.getLineOfOffset((int) (short) 1);
        int int19 = sourceFile15.getLineOfOffset(100);
        java.lang.String str20 = sourceFile15.getName();
        java.io.Reader reader21 = sourceFile15.getCodeReader();
        com.google.javascript.jscomp.CompilerInput compilerInput22 = new com.google.javascript.jscomp.CompilerInput(sourceFile15);
        compilerInput10.setSourceFile(sourceFile15);
        java.lang.String str24 = compilerInput10.getCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection25 = compilerInput10.getProvides();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
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
        com.google.javascript.jscomp.SourceAst sourceAst44 = compilerInput40.getSourceAst();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput40.removeRequire("goog.global");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        jsAst6.clearAst();
        com.google.javascript.jscomp.SourceFile sourceFile8 = jsAst6.getSourceFile();
        com.google.javascript.jscomp.SourceFile sourceFile9 = jsAst6.getSourceFile();
        com.google.javascript.jscomp.SourceFile sourceFile10 = jsAst6.getSourceFile();
        com.google.javascript.jscomp.CompilerInput compilerInput11 = new com.google.javascript.jscomp.CompilerInput(sourceFile10);
        java.lang.String str13 = compilerInput11.getLine(43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection14 = compilerInput11.getRequires();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getWarnings();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable5 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("java.io.IOException: ");
        com.google.javascript.jscomp.JSModule jSModule3 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        jSModule3.sortInputsByDeps(compiler4);
        com.google.javascript.jscomp.SourceFile.Builder builder6 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int12 = sourceFile10.getLineOfOffset((int) (short) 1);
        java.io.Reader reader13 = sourceFile10.getCodeReader();
        int int14 = reader13.read();
        com.google.javascript.jscomp.SourceFile sourceFile15 = builder6.buildFromReader("*global*", reader13);
        jSModule3.add(sourceFile15);
        com.google.javascript.jscomp.JSModule jSModule18 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        jSModule18.sortInputsByDeps(compiler19);
        com.google.javascript.jscomp.SourceFile.Builder builder21 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile sourceFile25 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int27 = sourceFile25.getLineOfOffset((int) (short) 1);
        java.io.Reader reader28 = sourceFile25.getCodeReader();
        int int29 = reader28.read();
        com.google.javascript.jscomp.SourceFile sourceFile30 = builder21.buildFromReader("*global*", reader28);
        jSModule18.add(sourceFile30);
        boolean boolean33 = jSModule18.removeByName("PARAM_LIST");
        jSModule3.addDependency(jSModule18);
        com.google.javascript.jscomp.SourceFile sourceFile36 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput38 = new com.google.javascript.jscomp.CompilerInput(sourceFile36, true);
        com.google.javascript.rhino.InputId inputId40 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput42 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput38, inputId40, true);
        com.google.javascript.jscomp.CompilerInput compilerInput44 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput42, false);
        jSModule3.addFirst(compilerInput42);
        com.google.javascript.jscomp.CompilerInput compilerInput47 = jSModule3.getByName("");
        com.google.javascript.jscomp.SourceFile sourceFile49 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput51 = new com.google.javascript.jscomp.CompilerInput(sourceFile49, true);
        com.google.javascript.rhino.InputId inputId53 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput55 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput51, inputId53, true);
        com.google.javascript.jscomp.CompilerInput compilerInput57 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput55, false);
        com.google.javascript.jscomp.JSModule jSModule59 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler60 = new com.google.javascript.jscomp.Compiler();
        jSModule59.sortInputsByDeps(compiler60);
        java.lang.String str62 = jSModule59.getName();
        compilerInput55.setModule(jSModule59);
        jSModule59.setDepth((int) (byte) 0);
        jSModule3.addDependency(jSModule59);
        com.google.javascript.jscomp.SourceFile sourceFile69 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int71 = sourceFile69.getLineOfOffset((int) (short) 1);
        java.lang.String str72 = sourceFile69.getName();
        java.lang.String str73 = sourceFile69.getName();
        java.lang.String str74 = sourceFile69.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput76 = new com.google.javascript.jscomp.CompilerInput(sourceFile69, true);
        com.google.javascript.jscomp.CompilerInput compilerInput77 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput76);
        com.google.javascript.jscomp.CompilerInput compilerInput79 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput76, false);
        jSModule59.remove(compilerInput76);
        jSModule1.add(compilerInput76);
        java.lang.String str82 = compilerInput76.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput76.removeRequire("/tmp/PARAM_LIST6145687020670090410Unversioned directory");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        java.io.PrintStream printStream1 = new java.io.PrintStream("goog.abstractMethod");
        printStream1.print(39L);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream1);
        double double5 = compiler4.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler4.getErrorManager();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        jsAst6.clearAst();
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) jsAst6, "*global*", false);
        com.google.javascript.rhino.InputId inputId11 = compilerInput10.getInputId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection12 = compilerInput10.getRequires();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        java.lang.String str8 = compilerInput7.toString();
        java.lang.String str9 = compilerInput7.getName();
        com.google.javascript.jscomp.JSModule jSModule11 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.CompilerInput compilerInput13 = jSModule11.getByName("FINEST");
        boolean boolean15 = jSModule11.removeByName("*global*");
        java.util.List<com.google.javascript.jscomp.JSModule> jSModuleList16 = jSModule11.getDependencies();
        compilerInput7.setModule(jSModule11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput7.removeRequire("Node tree inequality:\nTree1:\nSTRING PARAM_LIST 49\n\n\nTree2:\nNUMBER 0.0\n\n\nSubtree1: STRING PARAM_LIST 49\n\n\nSubtree2: NUMBER 0.0\n");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        jSModule1.removeAll();
        com.google.javascript.jscomp.SourceFile sourceFile4 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput(sourceFile4, true);
        com.google.javascript.rhino.InputId inputId8 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput6, inputId8, true);
        java.lang.String str11 = compilerInput10.toString();
        com.google.javascript.jscomp.SourceFile sourceFile12 = compilerInput10.getSourceFile();
        jSModule1.remove(compilerInput10);
        java.lang.String str14 = compilerInput10.getName();
        java.lang.String str15 = compilerInput10.getCode();
        com.google.javascript.jscomp.SourceAst sourceAst16 = compilerInput10.getAst();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput10.removeRequire("Node tree inequality:\nTree1:\nPARAM_LIST\n\n\nTree2:\nNUMBER 0.0\n\n\nSubtree1: PARAM_LIST\n\n\nSubtree2: NUMBER 0.0\n");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4096L, 15, (int) (short) 0);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("WARNING: hi!");
        com.google.javascript.rhino.Node node6 = node3.clonePropsFrom(node5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node3.getChildAtIndex(43);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("java.io.IOException: ");
        com.google.javascript.jscomp.JSModule jSModule3 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        jSModule3.sortInputsByDeps(compiler4);
        com.google.javascript.jscomp.SourceFile.Builder builder6 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int12 = sourceFile10.getLineOfOffset((int) (short) 1);
        java.io.Reader reader13 = sourceFile10.getCodeReader();
        int int14 = reader13.read();
        com.google.javascript.jscomp.SourceFile sourceFile15 = builder6.buildFromReader("*global*", reader13);
        jSModule3.add(sourceFile15);
        com.google.javascript.jscomp.JSModule jSModule18 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        jSModule18.sortInputsByDeps(compiler19);
        com.google.javascript.jscomp.SourceFile.Builder builder21 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile sourceFile25 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int27 = sourceFile25.getLineOfOffset((int) (short) 1);
        java.io.Reader reader28 = sourceFile25.getCodeReader();
        int int29 = reader28.read();
        com.google.javascript.jscomp.SourceFile sourceFile30 = builder21.buildFromReader("*global*", reader28);
        jSModule18.add(sourceFile30);
        boolean boolean33 = jSModule18.removeByName("PARAM_LIST");
        jSModule3.addDependency(jSModule18);
        com.google.javascript.jscomp.SourceFile sourceFile36 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput38 = new com.google.javascript.jscomp.CompilerInput(sourceFile36, true);
        com.google.javascript.rhino.InputId inputId40 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput42 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput38, inputId40, true);
        com.google.javascript.jscomp.CompilerInput compilerInput44 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput42, false);
        jSModule3.addFirst(compilerInput42);
        com.google.javascript.jscomp.CompilerInput compilerInput47 = jSModule3.getByName("");
        com.google.javascript.jscomp.SourceFile sourceFile49 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput51 = new com.google.javascript.jscomp.CompilerInput(sourceFile49, true);
        com.google.javascript.rhino.InputId inputId53 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput55 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput51, inputId53, true);
        com.google.javascript.jscomp.CompilerInput compilerInput57 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput55, false);
        com.google.javascript.jscomp.JSModule jSModule59 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler60 = new com.google.javascript.jscomp.Compiler();
        jSModule59.sortInputsByDeps(compiler60);
        java.lang.String str62 = jSModule59.getName();
        compilerInput55.setModule(jSModule59);
        jSModule59.setDepth((int) (byte) 0);
        jSModule3.addDependency(jSModule59);
        com.google.javascript.jscomp.SourceFile sourceFile69 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int71 = sourceFile69.getLineOfOffset((int) (short) 1);
        java.lang.String str72 = sourceFile69.getName();
        java.lang.String str73 = sourceFile69.getName();
        java.lang.String str74 = sourceFile69.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput76 = new com.google.javascript.jscomp.CompilerInput(sourceFile69, true);
        com.google.javascript.jscomp.CompilerInput compilerInput77 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput76);
        com.google.javascript.jscomp.CompilerInput compilerInput79 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput76, false);
        jSModule59.remove(compilerInput76);
        jSModule1.add(compilerInput76);
        java.lang.String str82 = compilerInput76.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput76.removeRequire("*global*.  at *global* line (unknown line) : (unknown column)");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        java.lang.String str4 = sourceFile1.getCode();
        sourceFile1.clearCachedSource();
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput(sourceFile1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = compilerInput6.getLine(53);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("/", "java.io.IOException: java.io.IOException: ", "STRING PARAM_LIST");
        com.google.javascript.jscomp.CompilerInput compilerInput5 = new com.google.javascript.jscomp.CompilerInput(sourceFile3, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput5.removeRequire("Node tree inequality:\nTree1:\nBITXOR 300\n    PARAM_LIST [var_args_name: 1] [opt_arg: 1]\n\n\nTree2:\nPARAM_LIST\n\n\nSubtree1: BITXOR 300\n    PARAM_LIST [var_args_name: 1] [opt_arg: 1]\n\n\nSubtree2: PARAM_LIST\n");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        java.lang.String str6 = sourceFile2.getName();
        java.lang.String str7 = sourceFile2.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput(sourceFile2, true);
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput9);
        com.google.javascript.jscomp.JSModule jSModule11 = compilerInput9.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = new com.google.javascript.jscomp.JSModule("/");
        jSModule13.setDepth(53);
        java.lang.String str16 = jSModule13.getName();
        compilerInput9.setModule(jSModule13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection18 = compilerInput9.getProvides();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        java.lang.String str4 = sourceFile1.getCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = sourceFile1.getLineOfOffset((int) ' ');
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        jSModule1.clearAsts();
        com.google.javascript.jscomp.SourceFile sourceFile26 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int28 = sourceFile26.getLineOfOffset((int) (short) 1);
        int int30 = sourceFile26.getLineOfOffset(100);
        java.lang.String str31 = sourceFile26.getName();
        jSModule1.add(sourceFile26);
        com.google.javascript.jscomp.SourceFile sourceFile35 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int37 = sourceFile35.getLineOfOffset((int) (short) 1);
        java.lang.String str38 = sourceFile35.getName();
        java.lang.String str39 = sourceFile35.getName();
        java.lang.String str40 = sourceFile35.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput42 = new com.google.javascript.jscomp.CompilerInput(sourceFile35, true);
        com.google.javascript.jscomp.CompilerInput compilerInput43 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput42);
        com.google.javascript.jscomp.SourceFile sourceFile46 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int48 = sourceFile46.getLineOfOffset((int) (short) 1);
        int int50 = sourceFile46.getColumnOfOffset(8);
        compilerInput43.setSourceFile(sourceFile46);
        com.google.javascript.jscomp.SourceAst sourceAst52 = compilerInput43.getSourceAst();
        java.lang.String str54 = compilerInput43.getLine(2147483647);
        jSModule1.remove(compilerInput43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection56 = compilerInput43.getRequires();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        java.lang.String str6 = sourceFile2.getName();
        java.lang.String str7 = sourceFile2.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput(sourceFile2, true);
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput9);
        com.google.javascript.jscomp.CompilerInput compilerInput12 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput9, false);
        java.lang.String str14 = compilerInput12.getLine(31);
        compilerInput12.clearAst();
        java.lang.String str16 = compilerInput12.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection17 = compilerInput12.getProvides();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceFile sourceFile8 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput(sourceFile8, true);
        com.google.javascript.rhino.InputId inputId12 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput14 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput10, inputId12, true);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput14, false);
        com.google.javascript.rhino.InputId inputId17 = compilerInput16.getInputId();
        com.google.javascript.jscomp.SourceFile sourceFile18 = compilerInput16.getSourceFile();
        com.google.javascript.jscomp.SourceFile.Builder builder20 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile sourceFile24 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int26 = sourceFile24.getLineOfOffset((int) (short) 1);
        java.io.Reader reader27 = sourceFile24.getCodeReader();
        int int28 = reader27.read();
        com.google.javascript.jscomp.SourceFile sourceFile29 = builder20.buildFromReader("*global*", reader27);
        reader27.reset();
        boolean boolean31 = reader27.markSupported();
        long long33 = reader27.skip(1645456104000L);
        com.google.javascript.jscomp.SourceFile sourceFile34 = com.google.javascript.jscomp.SourceFile.fromReader("java.io.IOException: OFF", reader27);
        sourceFile34.setOriginalPath("Node tree inequality:\nTree1:\nNUMBER 1.645456103E12 47\n\n\nTree2:\nASSIGN_MOD\n\n\nSubtree1: NUMBER 1.645456103E12 47\n\n\nSubtree2: ASSIGN_MOD\n");
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions37.setInlineLocalFunctions(false);
        compilerOptions37.moveFunctionDeclarations = true;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode42 = compilerOptions37.getLanguageIn();
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions43.setInlineLocalFunctions(false);
        compilerOptions43.moveFunctionDeclarations = true;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode48 = compilerOptions43.getLanguageIn();
        compilerOptions37.setLanguageIn(languageMode48);
        compilerOptions37.coalesceVariableNames = false;
        compilerOptions37.setDebugFunctionSideEffectsPath("OFF");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result54 = compiler0.compile(sourceFile18, sourceFile34, compilerOptions37);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        double double6 = compiler0.getProgress();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        jSModule1.removeAll();
        com.google.javascript.jscomp.SourceFile sourceFile4 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput(sourceFile4, true);
        com.google.javascript.rhino.InputId inputId8 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput6, inputId8, true);
        java.lang.String str11 = compilerInput10.toString();
        com.google.javascript.jscomp.SourceFile sourceFile12 = compilerInput10.getSourceFile();
        jSModule1.remove(compilerInput10);
        com.google.javascript.jscomp.SourceFile sourceFile16 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int18 = sourceFile16.getLineOfOffset((int) (short) 1);
        java.lang.String str19 = sourceFile16.getName();
        com.google.javascript.jscomp.JsAst jsAst20 = new com.google.javascript.jscomp.JsAst(sourceFile16);
        jsAst20.clearAst();
        com.google.javascript.jscomp.SourceFile sourceFile22 = jsAst20.getSourceFile();
        com.google.javascript.jscomp.SourceFile sourceFile23 = jsAst20.getSourceFile();
        com.google.javascript.jscomp.SourceFile sourceFile24 = jsAst20.getSourceFile();
        com.google.javascript.jscomp.CompilerInput compilerInput25 = new com.google.javascript.jscomp.CompilerInput(sourceFile24);
        jSModule1.add(compilerInput25);
        int int27 = compilerInput25.getNumLines();
        boolean boolean28 = compilerInput25.isExtern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection29 = compilerInput25.getProvides();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        jsAst6.clearAst();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int12 = sourceFile10.getLineOfOffset((int) (short) 1);
        java.lang.String str13 = sourceFile10.getName();
        java.lang.String str14 = sourceFile10.getName();
        jsAst6.setSourceFile(sourceFile10);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = new com.google.javascript.jscomp.CompilerInput(sourceFile10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection17 = compilerInput16.getRequires();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        jSModule1.removeAll();
        java.util.List<com.google.javascript.jscomp.JSModule> jSModuleList3 = jSModule1.getDependencies();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        java.io.Reader reader7 = sourceFile6.getCodeReader();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput(sourceFile6, false);
        jSModule1.addFirst(compilerInput9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection11 = compilerInput9.getRequires();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        java.lang.String str6 = sourceFile2.getName();
        java.lang.String str7 = sourceFile2.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput(sourceFile2, true);
        com.google.javascript.jscomp.SourceAst sourceAst10 = compilerInput9.getAst();
        compilerInput9.clearAst();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection12 = compilerInput9.getRequires();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("STRING PARAM_LIST 49");
        boolean boolean2 = sourceFile1.isExtern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = sourceFile1.getColumnOfOffset(29);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, "/experiment/:/hi!", false);
        com.google.javascript.jscomp.SourceFile sourceFile8 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput(sourceFile8, true);
        com.google.javascript.rhino.InputId inputId12 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput14 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput10, inputId12, true);
        java.lang.String str15 = compilerInput14.toString();
        com.google.javascript.jscomp.SourceFile sourceFile16 = compilerInput14.getSourceFile();
        compilerInput6.setSourceFile(sourceFile16);
        compilerInput6.clearAst();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = compilerInput6.getLine(41);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        java.lang.String str6 = sourceFile2.getName();
        java.lang.String str7 = sourceFile2.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput(sourceFile2, true);
        com.google.javascript.jscomp.SourceAst sourceAst10 = compilerInput9.getAst();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection11 = compilerInput9.getProvides();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        java.io.PrintStream printStream1 = new java.io.PrintStream("*global*.  at *global* line (unknown line) : (unknown column)");
        printStream1.println(false);
        printStream1.println(280490700800L);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(printStream1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler6.getWarnings();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        java.io.PrintStream printStream1 = new java.io.PrintStream("goog.abstractMethod");
        printStream1.print(39L);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(printStream1);
        double double5 = compiler4.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter6 = compiler4.getReverseAbstractInterpreter();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        jsAst6.clearAst();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int12 = sourceFile10.getLineOfOffset((int) (short) 1);
        java.lang.String str13 = sourceFile10.getName();
        java.lang.String str14 = sourceFile10.getName();
        jsAst6.setSourceFile(sourceFile10);
        com.google.javascript.jscomp.SourceFile sourceFile16 = jsAst6.getSourceFile();
        jsAst6.clearAst();
        com.google.javascript.jscomp.CompilerInput compilerInput18 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) jsAst6);
        com.google.javascript.jscomp.CompilerInput compilerInput19 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection20 = compilerInput18.getProvides();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        java.lang.String str6 = sourceFile2.getName();
        java.lang.String str7 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst8 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        com.google.javascript.rhino.InputId inputId9 = jsAst8.getInputId();
        jsAst8.clearAst();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = jsAst8.getAstRoot((com.google.javascript.jscomp.AbstractCompiler) compiler11);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        jsAst6.clearAst();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int12 = sourceFile10.getLineOfOffset((int) (short) 1);
        java.lang.String str13 = sourceFile10.getName();
        java.lang.String str14 = sourceFile10.getName();
        jsAst6.setSourceFile(sourceFile10);
        com.google.javascript.jscomp.SourceFile sourceFile16 = jsAst6.getSourceFile();
        java.lang.String str17 = sourceFile16.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput18 = new com.google.javascript.jscomp.CompilerInput(sourceFile16);
        java.lang.String str19 = compilerInput18.getCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection20 = compilerInput18.getProvides();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        java.lang.String str8 = compilerInput3.getName();
        java.lang.String str9 = compilerInput3.getName();
        java.lang.String str10 = compilerInput3.getCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = compilerInput3.getNumLines();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        java.lang.String str3 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable4 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.crossModuleMethodMotion = true;
        compilerOptions0.syntheticBlockEndMarker = "hi!";
        compilerOptions0.removeUnusedClassProperties = false;
        compilerOptions0.setLineLengthThreshold(4095);
        com.google.javascript.jscomp.ErrorFormat errorFormat9 = compilerOptions0.errorFormat;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        compiler10.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler10.getSourceMap();
        compiler10.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap14 = compiler10.getSourceMap();
        com.google.javascript.jscomp.MessageFormatter messageFormatter16 = errorFormat9.toFormatter((com.google.javascript.jscomp.SourceExcerptProvider) compiler10, true);
        compiler10.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = compiler10.getTypeRegistry();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        jsAst6.clearAst();
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) jsAst6, "*global*", false);
        com.google.javascript.rhino.InputId inputId11 = compilerInput10.getInputId();
        com.google.javascript.jscomp.CompilerInput compilerInput13 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput10, false);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput13, "PARAM_LIST\n    PARAM_LIST\n", true);
        java.lang.String str17 = compilerInput16.toString();
        boolean boolean18 = compilerInput16.isExtern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection19 = compilerInput16.getProvides();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        jsAst6.clearAst();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int12 = sourceFile10.getLineOfOffset((int) (short) 1);
        java.lang.String str13 = sourceFile10.getName();
        java.lang.String str14 = sourceFile10.getName();
        jsAst6.setSourceFile(sourceFile10);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = new com.google.javascript.jscomp.CompilerInput(sourceFile10);
        com.google.javascript.rhino.InputId inputId17 = compilerInput16.getInputId();
        com.google.javascript.jscomp.CompilerInput compilerInput19 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput16, false);
        com.google.javascript.jscomp.CompilerInput compilerInput21 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput16, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection22 = compilerInput16.getProvides();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, "/experiment/:/hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection7 = compilerInput6.getRequires();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, inputId5, true);
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput7, false);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        compiler10.disableThreads();
        compiler10.reportCodeChange();
        compilerInput7.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region16 = compiler10.getSourceRegion("STRING java.io.IOException:  [length: 8]", 25);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        com.google.javascript.jscomp.JsAst jsAst6 = new com.google.javascript.jscomp.JsAst(sourceFile2);
        jsAst6.clearAst();
        com.google.javascript.jscomp.SourceFile sourceFile8 = jsAst6.getSourceFile();
        com.google.javascript.jscomp.SourceFile sourceFile9 = jsAst6.getSourceFile();
        com.google.javascript.jscomp.CompilerInput compilerInput11 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) jsAst6, true);
        jsAst6.clearAst();
        com.google.javascript.jscomp.CompilerInput compilerInput14 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) jsAst6, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection15 = compilerInput14.getProvides();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, true);
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput3, "/experiment/:/hi!", false);
        com.google.javascript.jscomp.SourceFile sourceFile8 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput(sourceFile8, true);
        com.google.javascript.rhino.InputId inputId12 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput14 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput10, inputId12, true);
        java.lang.String str15 = compilerInput14.toString();
        com.google.javascript.jscomp.SourceFile sourceFile16 = compilerInput14.getSourceFile();
        compilerInput3.setSourceFile(sourceFile16);
        com.google.javascript.jscomp.SourceFile sourceFile18 = compilerInput3.getSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput3.removeRequire("InputId: PARAM_LIST [var_args_name: 1] [opt_arg: 1]");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int5 = sourceFile3.getLineOfOffset((int) (short) 1);
        int int7 = sourceFile3.getLineOfOffset(100);
        java.lang.String str8 = sourceFile3.getName();
        java.io.Reader reader9 = sourceFile3.getCodeReader();
        reader9.reset();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("PARAM_LIST", reader9);
        java.lang.String str12 = sourceFile11.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput13 = new com.google.javascript.jscomp.CompilerInput(sourceFile11);
        int int14 = compilerInput13.getNumLines();
        com.google.javascript.jscomp.CompilerInput compilerInput17 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput13, "PARAM_LIST [directives: []]\n", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput17.removeRequire("JSC_OPTIMIZE_LOOP_ERROR: Exceeded max number of optimization iterations: {0}");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("*global*.  at *global* line (unknown line) : (unknown column)");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = sourceFile1.getLineOffset(97);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("PARAM_LIST");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceFile1, false);
        boolean boolean4 = compilerInput3.isExtern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection5 = compilerInput3.getProvides();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        java.lang.String str6 = sourceFile2.getName();
        java.lang.String str7 = sourceFile2.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput(sourceFile2, true);
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput9);
        com.google.javascript.jscomp.JSModule jSModule11 = compilerInput9.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = new com.google.javascript.jscomp.JSModule("/");
        jSModule13.setDepth(53);
        java.lang.String str16 = jSModule13.getName();
        compilerInput9.setModule(jSModule13);
        java.lang.String str18 = compilerInput9.getCode();
        com.google.javascript.jscomp.SourceFile sourceFile19 = compilerInput9.getSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput9.removeRequire("DiagnosticGroup<checkProvides>");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        jSModule1.removeAll();
        java.util.List<com.google.javascript.jscomp.JSModule> jSModuleList3 = jSModule1.getDependencies();
        com.google.javascript.jscomp.JSModule jSModule5 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = jSModule5.getByName("FINEST");
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int12 = sourceFile10.getLineOfOffset((int) (short) 1);
        java.lang.String str13 = sourceFile10.getName();
        java.lang.String str14 = sourceFile10.getName();
        java.lang.String str15 = sourceFile10.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput17 = new com.google.javascript.jscomp.CompilerInput(sourceFile10, true);
        com.google.javascript.jscomp.CompilerInput compilerInput18 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput17);
        com.google.javascript.jscomp.JSModule jSModule19 = compilerInput17.getModule();
        com.google.javascript.jscomp.JSModule jSModule21 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        jSModule21.sortInputsByDeps(compiler22);
        java.lang.String str24 = jSModule21.getName();
        compilerInput17.setModule(jSModule21);
        jSModule5.addDependency(jSModule21);
        com.google.javascript.jscomp.SourceFile sourceFile29 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int31 = sourceFile29.getLineOfOffset((int) (short) 1);
        int int33 = sourceFile29.getLineOfOffset(100);
        java.lang.String str34 = sourceFile29.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput35 = new com.google.javascript.jscomp.CompilerInput(sourceFile29);
        com.google.javascript.rhino.InputId inputId36 = compilerInput35.getInputId();
        jSModule5.addFirst(compilerInput35);
        com.google.javascript.jscomp.CompilerInput compilerInput38 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput35);
        com.google.javascript.jscomp.SourceFile sourceFile42 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", ":", "goog.abstractMethod");
        java.lang.String str43 = sourceFile42.getName();
        compilerInput38.setSourceFile(sourceFile42);
        com.google.javascript.jscomp.CompilerInput compilerInput47 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput38, "WARNING: hi!", false);
        jSModule1.addFirst(compilerInput38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection49 = compilerInput38.getProvides();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler0.getTypeRegistry();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        int int6 = sourceFile2.getLineOfOffset(100);
        java.lang.String str7 = sourceFile2.getName();
        java.io.Reader reader8 = sourceFile2.getCodeReader();
        int int10 = sourceFile2.getLineOfOffset(51);
        com.google.javascript.jscomp.CompilerInput compilerInput11 = new com.google.javascript.jscomp.CompilerInput(sourceFile2);
        com.google.javascript.jscomp.JSModule jSModule12 = compilerInput11.getModule();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection13 = compilerInput11.getRequires();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        compiler0.reportCodeChange();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Scope scope5 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = compiler0.getSourceLine("PARAM_LIST: PARAM_LIST\n", 49);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.google.javascript.jscomp.JSModule jSModule1 = new com.google.javascript.jscomp.JSModule("STRING PARAM_LIST 49");
        jSModule1.removeAll();
        com.google.javascript.jscomp.SourceFile sourceFile4 = new com.google.javascript.jscomp.SourceFile("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput6 = new com.google.javascript.jscomp.CompilerInput(sourceFile4, true);
        com.google.javascript.rhino.InputId inputId8 = new com.google.javascript.rhino.InputId("*global*");
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput6, inputId8, true);
        java.lang.String str11 = compilerInput10.toString();
        com.google.javascript.jscomp.SourceFile sourceFile12 = compilerInput10.getSourceFile();
        jSModule1.remove(compilerInput10);
        com.google.javascript.jscomp.CompilerInput compilerInput15 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput10, true);
        com.google.javascript.jscomp.SourceAst sourceAst16 = compilerInput10.getAst();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = compilerInput10.getLineOffset((int) (byte) -1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler0.getSourceMap();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getErrors();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.disableThreads();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-11), (int) (short) 100, 9);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node3.getChildBefore(node5);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.disableThreads();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        int int4 = sourceFile2.getLineOfOffset((int) (short) 1);
        java.lang.String str5 = sourceFile2.getName();
        java.lang.String str6 = sourceFile2.getName();
        java.lang.String str7 = sourceFile2.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = new com.google.javascript.jscomp.CompilerInput(sourceFile2, true);
        com.google.javascript.jscomp.CompilerInput compilerInput10 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst) compilerInput9);
        int int11 = compilerInput9.getNumLines();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput9.removeRequire("");
    }
}

