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
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "hi!");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj3 = dim0.getObjectProperty((java.lang.Object) (-1.0f), (java.lang.Object) 1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray5 = dim0.getObjectIds((java.lang.Object) ' ');
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData7 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj8 = dim0.getObjectProperty((java.lang.Object) (-1.0d), (java.lang.Object) contextData7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj9 = dim0.getObjectProperty((java.lang.Object) (short) 1, (java.lang.Object) "hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "undefined");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = dim0.objectToString((java.lang.Object) 10.0f);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim dim2 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim2.setBreak();
        dim2.contextSwitch((int) ' ');
        java.lang.String[] strArray6 = dim2.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim7 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim7.setBreak();
        dim7.contextSwitch((int) (byte) 0);
        dim7.clearAllBreakpoints();
        dim7.dispose();
        java.lang.Class<?> wildcardClass13 = dim7.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj14 = dim0.getObjectProperty((java.lang.Object) strArray6, (java.lang.Object) wildcardClass13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray7 = dim0.getObjectIds((java.lang.Object) (short) 100);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.setBreakOnReturn(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = dim0.objectToString((java.lang.Object) 0.0d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = dim0.objectToString((java.lang.Object) '#');
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim4 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim4.setBreak();
        dim4.contextSwitch((int) ' ');
        dim4.go();
        dim4.setBreakOnReturn(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj12 = dim0.getObjectProperty((java.lang.Object) true, (java.lang.Object) 10.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim dim9 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim9.setBreak();
        dim9.contextSwitch((int) (byte) 0);
        dim9.clearAllBreakpoints();
        dim9.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj16 = dim0.getObjectProperty((java.lang.Object) dim9, (java.lang.Object) (short) 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim6 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim6.setBreak();
        dim6.contextSwitch((int) (byte) 0);
        dim6.clearAllBreakpoints();
        dim6.dispose();
        dim6.setBreakOnReturn(false);
        dim6.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        dim15.contextSwitch((int) ' ');
        dim15.setBreakOnEnter(true);
        java.lang.Class<?> wildcardClass21 = dim15.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj22 = dim0.getObjectProperty((java.lang.Object) dim6, (java.lang.Object) wildcardClass21);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "undefined");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.Dim dim6 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim6.setBreak();
        dim6.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray10 = dim6.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = dim0.objectToString((java.lang.Object) strArray10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.contextSwitch(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "hi!");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        dim10.contextSwitch((int) (byte) 0);
        dim10.clearAllBreakpoints();
        dim10.clearAllBreakpoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray16 = dim0.getObjectIds((java.lang.Object) dim10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "undefined");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray7 = dim0.getObjectIds((java.lang.Object) 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        dim0.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "undefined");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim8 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim8.setBreak();
        dim8.contextSwitch((int) ' ');
        dim8.setBreakOnEnter(true);
        java.lang.String str15 = dim8.eval("hi!");
        java.lang.String[] strArray16 = dim8.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj18 = dim0.getObjectProperty((java.lang.Object) dim8, (java.lang.Object) (short) 1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.setReturnValue((int) 'a');
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        dim12.contextSwitch((int) ' ');
        dim12.go();
        dim12.detach();
        dim12.setReturnValue((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = dim0.objectToString((java.lang.Object) dim12);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "undefined");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.contextSwitch(2);
        com.google.javascript.rhino.head.tools.debugger.Dim dim7 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim7.setBreak();
        dim7.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = dim0.objectToString((java.lang.Object) dim7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim dim8 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim8.setBreak();
        dim8.contextSwitch((int) (byte) 0);
        dim8.clearAllBreakpoints();
        dim8.dispose();
        dim8.setBreakOnEnter(true);
        java.lang.Class<?> wildcardClass16 = dim8.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj17 = dim0.getObjectProperty((java.lang.Object) '#', (java.lang.Object) wildcardClass16);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray14 = dim0.getObjectIds((java.lang.Object) contextData13);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "hi!");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = dim0.objectToString((java.lang.Object) (short) 100);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim7 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim7.setBreak();
        dim7.contextSwitch((int) (byte) 0);
        dim7.clearAllBreakpoints();
        dim7.dispose();
        dim7.setBreakOnReturn(false);
        dim7.clearAllBreakpoints();
        dim7.setReturnValue((int) (short) 10);
        java.lang.String str19 = dim7.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData20 = dim7.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim7.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray23 = dim0.getObjectIds((java.lang.Object) dim7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String str8 = dim0.eval("hi!");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        dim10.contextSwitch((int) (byte) 0);
        dim10.contextSwitch((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray16 = dim0.getObjectIds((java.lang.Object) dim10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        dim0.contextSwitch((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "undefined");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreakOnEnter(false);
        dim0.contextSwitch(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData7 = dim0.currentContextData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        dim0.detach();
        dim0.setReturnValue(3);
        dim0.go();
        dim0.setBreakOnEnter(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        dim10.contextSwitch((int) ' ');
        dim10.go();
        dim10.setBreakOnReturn(true);
        dim10.contextSwitch(4);
        dim10.go();
        dim10.setBreakOnReturn(true);
        dim10.contextSwitch((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = dim0.objectToString((java.lang.Object) (short) 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo7 = dim0.sourceInfo("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = dim0.objectToString((java.lang.Object) 0L);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.go();
        dim0.setBreakOnExceptions(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "undefined");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray14 = dim0.getObjectIds((java.lang.Object) 4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "hi!");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.dispose();
        java.lang.String[] strArray9 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "undefined");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = dim0.objectToString((java.lang.Object) 10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        dim0.detach();
        dim0.setReturnValue(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "undefined");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        dim0.contextSwitch((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo7 = dim0.sourceInfo("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "undefined");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) ' ');
        java.lang.String[] strArray17 = dim13.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData18 = dim13.currentContextData();
        dim13.setBreak();
        dim13.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData21 = dim13.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim22 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim22.setBreak();
        dim22.contextSwitch((int) (byte) 0);
        dim22.clearAllBreakpoints();
        dim22.dispose();
        dim22.setBreakOnReturn(false);
        dim22.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData31 = dim22.currentContextData();
        dim22.clearAllBreakpoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj33 = dim0.getObjectProperty((java.lang.Object) dim13, (java.lang.Object) dim22);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.go();
        java.lang.String[] strArray12 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        dim0.dispose();
        java.lang.String str8 = dim0.eval("undefined");
        dim0.contextSwitch((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "undefined");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnEnter(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String str8 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("");
        java.lang.String[] strArray11 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim8 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim8.setBreak();
        dim8.contextSwitch((int) ' ');
        java.lang.String[] strArray12 = dim8.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim8.currentContextData();
        dim8.setBreak();
        java.lang.String str16 = dim8.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim8.functionSourceByName("");
        java.lang.String[] strArray19 = dim8.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim20 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim20.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj22 = dim0.getObjectProperty((java.lang.Object) strArray19, (java.lang.Object) dim20);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreakOnEnter(false);
        dim0.contextSwitch(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData7 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim8 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim8.setBreak();
        dim8.contextSwitch((int) (byte) 0);
        dim8.clearAllBreakpoints();
        java.lang.String[] strArray13 = dim8.functionNames();
        dim8.contextSwitch((int) (short) 0);
        dim8.go();
        dim8.contextSwitch(4);
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        dim19.contextSwitch((int) (byte) 0);
        dim19.clearAllBreakpoints();
        dim19.dispose();
        dim19.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData27 = dim19.currentContextData();
        dim19.detach();
        dim19.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj30 = dim0.getObjectProperty((java.lang.Object) dim8, (java.lang.Object) dim19);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo7 = dim0.sourceInfo("hi!");
        dim0.setBreak();
        dim0.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "undefined");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        dim0.detach();
        dim0.setReturnValue(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = dim0.objectToString((java.lang.Object) 10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.go();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) ' ');
        java.lang.String[] strArray17 = dim13.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData18 = dim13.currentContextData();
        dim13.setBreak();
        dim13.clearAllBreakpoints();
        dim13.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray22 = dim0.getObjectIds((java.lang.Object) dim13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        dim0.dispose();
        java.lang.String str8 = dim0.eval("undefined");
        dim0.contextSwitch((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.go();
        dim0.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        dim0.detach();
        dim0.setReturnValue(3);
        dim0.go();
        dim0.setBreakOnEnter(true);
        dim0.clearAllBreakpoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        dim11.contextSwitch((int) ' ');
        dim11.go();
        dim11.setBreakOnReturn(true);
        dim11.contextSwitch(4);
        dim11.go();
        dim11.setBreakOnExceptions(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = dim0.objectToString((java.lang.Object) false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "undefined");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "hi!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String[] strArray2 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource4 = dim0.functionSourceByName("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim dim5 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim5.setBreak();
        dim5.contextSwitch((int) ' ');
        dim5.go();
        dim5.setBreakOnReturn(true);
        dim5.contextSwitch(4);
        dim5.go();
        java.lang.String[] strArray15 = dim5.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = dim0.objectToString((java.lang.Object) dim5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String[] strArray2 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource4 = dim0.functionSourceByName("hi!");
        java.lang.String str6 = dim0.eval("undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        dim0.setBreakOnEnter(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "undefined");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo5 = dim0.sourceInfo("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        dim0.contextSwitch((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "undefined");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreakOnExceptions(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "undefined");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("hi!");
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.go();
        java.lang.String[] strArray12 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "hi!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim8 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim8.setBreak();
        dim8.contextSwitch((int) (byte) 0);
        dim8.clearAllBreakpoints();
        java.lang.String[] strArray13 = dim8.functionNames();
        dim8.contextSwitch((int) (short) 0);
        dim8.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray17 = dim0.getObjectIds((java.lang.Object) dim8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.setReturnValue(10);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        dim14.contextSwitch((int) ' ');
        dim14.go();
        dim14.setBreakOnReturn(true);
        dim14.contextSwitch(4);
        dim14.go();
        dim14.setBreakOnReturn(true);
        dim14.contextSwitch((int) (short) 1);
        dim14.detach();
        dim14.setReturnValue(3);
        dim14.go();
        dim14.setBreakOnEnter(true);
        dim14.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource36 = dim14.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = dim0.objectToString((java.lang.Object) dim14);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreakOnExceptions(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "hi!");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "hi!");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String str8 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "undefined");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo5 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) (byte) 100);
        dim0.setReturnValue((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        dim11.contextSwitch((int) (byte) 0);
        dim11.clearAllBreakpoints();
        dim11.dispose();
        dim11.setBreakOnReturn(false);
        dim11.clearAllBreakpoints();
        dim11.setReturnValue((int) (short) 10);
        java.lang.String str23 = dim11.eval("hi!");
        dim11.setBreak();
        java.lang.String str26 = dim11.eval("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj28 = dim0.getObjectProperty((java.lang.Object) "hi!", (java.lang.Object) '4');
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource3 = dim0.functionSourceByName("undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo7 = dim0.sourceInfo("hi!");
        dim0.setBreak();
        dim0.contextSwitch((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.dispose();
        java.lang.String[] strArray9 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.go();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource14 = dim0.functionSourceByName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "undefined");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray5 = dim0.functionNames();
        dim0.contextSwitch((int) (short) 0);
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "undefined");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.dispose();
        java.lang.String[] strArray9 = dim0.functionNames();
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.setReturnValue((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "undefined");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.go();
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("undefined");
        java.lang.String str13 = dim0.eval("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "undefined");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        dim0.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.contextSwitch(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.go();
        dim0.setBreakOnExceptions(false);
        java.lang.String[] strArray13 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.detach();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        java.lang.String str14 = dim11.eval("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray15 = dim0.getObjectIds((java.lang.Object) str14);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        java.lang.String str14 = dim0.eval("");
        dim0.setBreak();
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "undefined");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        java.lang.String str14 = dim0.eval("");
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "undefined");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.setBreakOnEnter(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "undefined");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.detach();
        dim0.setReturnValue(100);
        dim0.setReturnValue((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("");
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnEnter(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "undefined");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        dim0.setBreakOnEnter(false);
        dim0.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "undefined");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo7 = dim0.sourceInfo("hi!");
        dim0.setBreak();
        dim0.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String str8 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "hi!");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreakOnEnter(false);
        dim0.contextSwitch(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "undefined");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.detach();
        dim0.setReturnValue(100);
        dim0.setReturnValue((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnExceptions(true);
        java.lang.String[] strArray8 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "hi!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        dim11.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray15 = dim11.functionNames();
        java.lang.String str17 = dim11.eval("hi!");
        dim11.setBreakOnEnter(false);
        dim11.setReturnValue((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = dim0.objectToString((java.lang.Object) dim11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        dim0.detach();
        dim0.clearAllBreakpoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "hi!");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        dim0.dispose();
        java.lang.String str8 = dim0.eval("undefined");
        dim0.setBreakOnReturn(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "hi!");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String str8 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        dim0.contextSwitch(5);
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "hi!");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim9 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim9.setBreak();
        dim9.contextSwitch((int) ' ');
        java.lang.String[] strArray13 = dim9.functionNames();
        dim9.setBreakOnExceptions(false);
        dim9.go();
        java.lang.String str18 = dim9.eval("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = dim0.objectToString((java.lang.Object) "");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(true);
        dim0.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "undefined");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        dim0.detach();
        dim0.setReturnValue(3);
        dim0.go();
        dim0.setBreakOnEnter(true);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim0.functionSourceByName("");
        dim0.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean26 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.contextSwitch((int) (byte) 10);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource14 = dim0.functionSourceByName("undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "hi!");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) 1);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) ' ');
        dim13.go();
        dim13.setBreak();
        dim13.dispose();
        java.lang.String str21 = dim13.eval("undefined");
        dim13.contextSwitch((int) (short) 1);
        dim13.setBreakOnReturn(true);
        dim13.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = dim0.objectToString((java.lang.Object) dim13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        dim10.contextSwitch((int) ' ');
        java.lang.String[] strArray14 = dim10.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData15 = dim10.currentContextData();
        dim10.clearAllBreakpoints();
        dim10.clearAllBreakpoints();
        dim10.setBreak();
        dim10.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = dim0.objectToString((java.lang.Object) dim10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch(100);
        com.google.javascript.rhino.head.tools.debugger.Dim dim9 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim9.setBreak();
        dim9.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim9.sourceInfo("");
        dim9.setBreakOnReturn(false);
        dim9.clearAllBreakpoints();
        dim9.setReturnValue((int) (short) -1);
        dim9.setReturnValue((int) (short) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim dim22 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim22.setBreak();
        dim22.contextSwitch((int) (byte) 0);
        dim22.clearAllBreakpoints();
        dim22.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource29 = dim22.functionSourceByName("");
        dim22.setBreak();
        dim22.dispose();
        dim22.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource34 = dim22.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj35 = dim0.getObjectProperty((java.lang.Object) dim9, (java.lang.Object) dim22);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("hi!");
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "undefined");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        java.lang.String str14 = dim0.eval("");
        dim0.contextSwitch(4);
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim0.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "undefined");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        dim0.setReturnValue((int) (byte) 10);
        dim0.clearAllBreakpoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnExceptions(true);
        java.lang.String[] strArray11 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreakOnExceptions(false);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue((int) (byte) -1);
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray9 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.detach();
        dim0.dispose();
        dim0.setBreakOnEnter(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        dim0.setBreakOnEnter(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        java.lang.String str15 = dim0.eval("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "hi!");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.contextSwitch((int) (byte) 0);
        dim0.detach();
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "hi!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        dim0.setBreak();
        dim0.setBreak();
        dim0.setBreak();
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.dispose();
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.detach();
        dim0.setReturnValue(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "hi!");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        dim0.dispose();
        java.lang.String str8 = dim0.eval("undefined");
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.contextSwitch(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "undefined");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.detach();
        dim0.dispose();
        dim0.contextSwitch(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "hi!");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.dispose();
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "undefined");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "hi!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "hi!");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim7 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim7.setBreak();
        dim7.contextSwitch((int) (byte) 0);
        dim7.clearAllBreakpoints();
        dim7.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource14 = dim7.functionSourceByName("");
        dim7.setReturnValue(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj18 = dim0.getObjectProperty((java.lang.Object) dim7, (java.lang.Object) (-1.0d));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        dim0.contextSwitch(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.setReturnValue((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "undefined");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        dim0.dispose();
        java.lang.String str8 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim dim9 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim9.setBreak();
        dim9.contextSwitch((int) ' ');
        dim9.go();
        dim9.setBreakOnReturn(true);
        dim9.contextSwitch(4);
        dim9.go();
        java.lang.String[] strArray19 = dim9.functionNames();
        dim9.detach();
        dim9.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = dim0.objectToString((java.lang.Object) dim9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnExceptions(true);
        dim0.detach();
        java.lang.String str9 = dim0.eval("undefined");
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "undefined");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        dim0.setBreakOnEnter(false);
        dim0.setBreakOnEnter(true);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        dim21.contextSwitch((int) (byte) 0);
        dim21.clearAllBreakpoints();
        dim21.contextSwitch(2);
        java.lang.String[] strArray28 = dim21.functionNames();
        dim21.setReturnValue((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray31 = dim0.getObjectIds((java.lang.Object) dim21);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "undefined");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreak();
        dim0.setBreakOnReturn(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        dim0.dispose();
        java.lang.String str8 = dim0.eval("undefined");
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.contextSwitch((int) (byte) 10);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource14 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnEnter(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.contextSwitch((int) (short) 1);
        java.lang.String str11 = dim0.eval("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "hi!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        dim0.detach();
        dim0.setReturnValue(3);
        dim0.go();
        dim0.setBreakOnEnter(true);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim0.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo5 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.detach();
        dim0.dispose();
        dim0.contextSwitch(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "undefined");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "undefined");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        java.lang.String str14 = dim0.eval("");
        dim0.contextSwitch(4);
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) '4');
        dim0.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.detach();
        dim0.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(false);
        dim0.go();
        dim0.contextSwitch((int) (short) 100);
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        dim10.contextSwitch((int) ' ');
        dim10.go();
        dim10.setBreakOnReturn(true);
        dim10.contextSwitch(4);
        dim10.detach();
        java.lang.String[] strArray20 = dim10.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = dim0.objectToString((java.lang.Object) dim10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(false);
        dim0.go();
        dim0.contextSwitch((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        dim0.detach();
        dim0.setReturnValue(3);
        dim0.go();
        dim0.setBreakOnEnter(true);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim0.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean24 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnReturn(true);
        dim0.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource4 = dim0.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        java.lang.String str14 = dim0.eval("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "undefined");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnExceptions(true);
        dim0.detach();
        java.lang.String str9 = dim0.eval("undefined");
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "hi!");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnExceptions(true);
        dim0.detach();
        java.lang.String str9 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String[] strArray2 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource4 = dim0.functionSourceByName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "undefined");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.setBreak();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        dim14.contextSwitch((int) ' ');
        dim14.go();
        dim14.setBreak();
        dim14.setBreakOnEnter(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray22 = dim0.getObjectIds((java.lang.Object) false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        dim0.dispose();
        java.lang.String str8 = dim0.eval("undefined");
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnExceptions(true);
        dim0.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "undefined");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "undefined");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.go();
        java.lang.String str13 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "undefined");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.setBreak();
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "hi!");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        dim0.contextSwitch(5);
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = dim0.objectToString((java.lang.Object) (short) 1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.contextSwitch((int) (byte) 0);
        dim0.detach();
        dim0.setBreakOnEnter(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "undefined");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.contextSwitch(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.setBreak();
        dim0.detach();
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "hi!");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.setReturnValue((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        dim0.detach();
        dim0.setReturnValue(3);
        dim0.go();
        dim0.setBreakOnEnter(true);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim0.functionSourceByName("");
        dim0.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.go();
        java.lang.String str13 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnEnter(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "hi!");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnExceptions(true);
        dim0.detach();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim dim9 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim9.setBreak();
        dim9.contextSwitch((int) (byte) 0);
        dim9.clearAllBreakpoints();
        dim9.detach();
        dim9.setReturnValue(0);
        dim9.dispose();
        dim9.setBreakOnEnter(true);
        dim9.go();
        dim9.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray22 = dim0.getObjectIds((java.lang.Object) dim9);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.detach();
        dim0.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "hi!");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.go();
        dim0.setBreakOnExceptions(true);
        java.lang.String str11 = dim0.eval("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.detach();
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        dim12.contextSwitch((int) (byte) 0);
        dim12.clearAllBreakpoints();
        dim12.dispose();
        dim12.contextSwitch((int) (short) 0);
        java.lang.String str21 = dim12.eval("undefined");
        dim12.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray23 = dim0.getObjectIds((java.lang.Object) dim12);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String[] strArray2 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource4 = dim0.functionSourceByName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        dim0.detach();
        dim0.setReturnValue(3);
        dim0.go();
        dim0.setBreakOnEnter(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.contextSwitch((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.setBreak();
        dim0.go();
        dim0.contextSwitch((-1));
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) (byte) 0);
        dim13.clearAllBreakpoints();
        dim13.dispose();
        dim13.setBreakOnReturn(false);
        dim13.clearAllBreakpoints();
        dim13.setReturnValue((int) (short) 10);
        java.lang.String str25 = dim13.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData26 = dim13.currentContextData();
        dim13.dispose();
        dim13.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource31 = dim13.functionSourceByName("undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = dim0.objectToString((java.lang.Object) "undefined");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue((int) (byte) -1);
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray9 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "undefined");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.detach();
        dim0.go();
        dim0.setBreakOnEnter(false);
        dim0.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "hi!");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim dim6 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim6.setBreak();
        dim6.contextSwitch((int) ' ');
        dim6.setBreakOnEnter(true);
        java.lang.String str13 = dim6.eval("hi!");
        dim6.dispose();
        java.lang.String[] strArray15 = dim6.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim6.functionSourceByName("undefined");
        dim6.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray19 = dim0.getObjectIds((java.lang.Object) dim6);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.go();
        dim0.setBreakOnExceptions(false);
        java.lang.String str14 = dim0.eval("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.dispose();
        dim0.setBreak();
        java.lang.String str11 = dim0.eval("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) 'a');
        dim0.setReturnValue((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo6 = dim0.sourceInfo("");
        java.lang.String[] strArray7 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) (byte) 100);
        dim0.contextSwitch((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        java.lang.String str15 = dim0.eval("hi!");
        dim0.setBreak();
        dim0.setReturnValue(5);
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "undefined");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo5 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) -1);
        dim0.setReturnValue((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("hi!");
        java.lang.String[] strArray11 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.detach();
        dim0.setReturnValue(100);
        dim0.setReturnValue((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        dim10.contextSwitch((int) ' ');
        java.lang.String[] strArray14 = dim10.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData15 = dim10.currentContextData();
        dim10.setBreak();
        java.lang.String str18 = dim10.eval("hi!");
        dim10.detach();
        dim10.setBreakOnReturn(true);
        dim10.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray23 = dim0.getObjectIds((java.lang.Object) dim10);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "undefined");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        dim0.go();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) ' ');
        java.lang.String[] strArray17 = dim13.functionNames();
        dim13.setBreakOnExceptions(false);
        dim13.go();
        dim13.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = dim0.objectToString((java.lang.Object) true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.dispose();
        java.lang.String[] strArray9 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        dim14.contextSwitch((int) (byte) 0);
        dim14.clearAllBreakpoints();
        dim14.dispose();
        dim14.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData22 = dim14.currentContextData();
        dim14.go();
        dim14.go();
        dim14.dispose();
        java.lang.String str27 = dim14.eval("undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray28 = dim0.getObjectIds((java.lang.Object) dim14);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.contextSwitch((int) (short) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.setBreakOnEnter(false);
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "hi!");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.detach();
        dim0.setReturnValue(100);
        dim0.setReturnValue((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "hi!");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.clearAllBreakpoints();
        java.lang.String str12 = dim0.eval("");
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "hi!");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo5 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        dim10.contextSwitch((int) ' ');
        dim10.go();
        dim10.setBreakOnReturn(true);
        dim10.contextSwitch(4);
        dim10.go();
        dim10.setBreakOnReturn(true);
        dim10.contextSwitch((int) (short) 1);
        dim10.detach();
        dim10.setReturnValue(3);
        dim10.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray28 = dim0.getObjectIds((java.lang.Object) dim10);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        dim0.setBreak();
        dim0.dispose();
        java.lang.String str13 = dim0.eval("undefined");
        dim0.setReturnValue(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo5 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        dim0.setReturnValue((int) (byte) 10);
        dim0.contextSwitch((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.dispose();
        dim0.setBreak();
        dim0.detach();
        java.lang.String[] strArray11 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "hi!");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue(3);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnReturn(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "hi!");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setBreakOnExceptions(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.setBreakOnEnter(false);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo5 = dim0.sourceInfo("");
        dim0.contextSwitch((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim16 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim16.setBreak();
        dim16.contextSwitch((int) (byte) 0);
        dim16.clearAllBreakpoints();
        dim16.setBreakOnReturn(true);
        dim16.setBreakOnExceptions(true);
        dim16.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData26 = dim16.currentContextData();
        dim16.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource29 = dim16.functionSourceByName("undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray30 = dim0.getObjectIds((java.lang.Object) "undefined");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo6 = dim0.sourceInfo("");
        java.lang.String[] strArray7 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "hi!");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String str9 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "hi!");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        java.lang.String str10 = dim0.eval("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "hi!");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) ' ');
        dim18.setBreakOnEnter(true);
        java.lang.Class<?> wildcardClass24 = dim18.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = dim0.objectToString((java.lang.Object) wildcardClass24);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnEnter(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.detach();
        dim0.setReturnValue(100);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "hi!");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.contextSwitch((int) (short) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.setBreakOnEnter(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        dim0.clearAllBreakpoints();
        dim0.setReturnValue(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "hi!");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.go();
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "undefined");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo7 = dim0.sourceInfo("hi!");
        dim0.setBreak();
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.detach();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "undefined");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        java.lang.String str14 = dim0.eval("");
        dim0.dispose();
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        dim0.detach();
        dim0.setReturnValue(3);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.dispose();
        dim0.setBreak();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        dim11.contextSwitch((int) (byte) 0);
        dim11.setReturnValue(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = dim0.objectToString((java.lang.Object) dim11);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        dim0.dispose();
        java.lang.String str8 = dim0.eval("undefined");
        dim0.contextSwitch((int) (short) 1);
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) ' ');
        dim13.go();
        dim13.setBreakOnReturn(true);
        dim13.contextSwitch(4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource23 = dim13.functionSourceByName("");
        dim13.setBreakOnExceptions(true);
        dim13.setReturnValue((int) '#');
        com.google.javascript.rhino.head.tools.debugger.Dim dim28 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim28.setBreak();
        dim28.contextSwitch((int) ' ');
        dim28.go();
        dim28.setBreakOnExceptions(true);
        dim28.detach();
        dim28.setReturnValue((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj38 = dim0.getObjectProperty((java.lang.Object) '#', (java.lang.Object) 'a');
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        dim0.detach();
        dim0.setReturnValue(3);
        dim0.go();
        dim0.dispose();
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnExceptions(true);
        dim0.setBreak();
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        dim11.contextSwitch((int) (byte) 0);
        dim11.contextSwitch((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray17 = dim0.getObjectIds((java.lang.Object) (short) 1);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        dim0.setReturnValue((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray8 = dim0.functionNames();
        java.lang.String[] strArray9 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("undefined");
        dim0.clearAllBreakpoints();
        dim0.setReturnValue(3);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        dim15.contextSwitch((int) (byte) 0);
        dim15.clearAllBreakpoints();
        dim15.dispose();
        dim15.setBreakOnReturn(false);
        dim15.clearAllBreakpoints();
        dim15.setReturnValue((int) (short) 10);
        java.lang.String str27 = dim15.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData28 = dim15.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource30 = dim15.functionSourceByName("");
        java.lang.String str32 = dim15.eval("hi!");
        dim15.contextSwitch(0);
        dim15.detach();
        dim15.clearAllBreakpoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray37 = dim0.getObjectIds((java.lang.Object) dim15);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        dim0.detach();
        java.lang.String[] strArray3 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int6 = contextData5.frameCount();
        int int7 = contextData5.frameCount();
        int int8 = contextData5.frameCount();
        int int9 = contextData5.frameCount();
        java.lang.Class<?> wildcardClass10 = contextData5.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray11 = dim0.getObjectIds((java.lang.Object) contextData5);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.dispose();
        java.lang.String[] strArray9 = dim0.functionNames();
        java.lang.String[] strArray10 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        dim0.setBreakOnEnter(false);
        dim0.setBreakOnExceptions(true);
        dim0.dispose();
        dim0.setBreakOnReturn(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        java.lang.String str17 = dim0.eval("hi!");
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "hi!");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        dim0.setReturnValue(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "hi!");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.setBreakOnExceptions(true);
        dim0.contextSwitch((int) (short) 10);
        dim0.contextSwitch(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.detach();
        dim0.setReturnValue(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        dim0.setReturnValue(0);
        dim0.contextSwitch((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "hi!");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.go();
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnExceptions(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreakOnEnter(false);
        java.lang.String[] strArray5 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "hi!");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        dim0.detach();
        dim0.setReturnValue(3);
        dim0.go();
        java.lang.String str19 = dim0.eval("");
        dim0.setBreakOnExceptions(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "undefined");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.go();
        dim0.dispose();
        java.lang.String[] strArray12 = dim0.functionNames();
        java.lang.String[] strArray13 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue((int) (byte) -1);
        dim0.clearAllBreakpoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.dispose();
        java.lang.String str16 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo18 = dim0.sourceInfo("undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.setReturnValue(10);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.dispose();
        dim0.setBreakOnExceptions(true);
        dim0.clearAllBreakpoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "hi!");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        dim12.contextSwitch((int) ' ');
        dim12.go();
        dim12.setBreakOnReturn(true);
        dim12.contextSwitch(4);
        dim12.go();
        dim12.setBreakOnReturn(true);
        dim12.contextSwitch((int) (short) 1);
        dim12.detach();
        dim12.setReturnValue(3);
        dim12.go();
        dim12.setBreakOnEnter(true);
        dim12.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource35 = dim12.functionSourceByName("");
        dim12.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource38 = dim12.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = dim0.objectToString((java.lang.Object) "");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.contextSwitch(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "hi!");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.contextSwitch((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.setReturnValue((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("hi!", "hi!");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.setBreak();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        dim12.contextSwitch((int) ' ');
        dim12.go();
        dim12.setBreakOnReturn(true);
        dim12.contextSwitch(4);
        dim12.go();
        dim12.setBreakOnReturn(true);
        dim12.contextSwitch((int) (short) 1);
        dim12.detach();
        dim12.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo30 = dim12.sourceInfo("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray31 = dim0.getObjectIds((java.lang.Object) dim12);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) 'a');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.contextSwitch((int) (short) 1);
        java.lang.String str11 = dim0.eval("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("undefined", "");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String[] strArray7 = dim0.functionNames();
        java.lang.String[] strArray8 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("hi!", "");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) 1);
        dim0.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "undefined");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(false);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim8 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim8.setBreak();
        dim8.contextSwitch((int) (byte) 0);
        dim8.clearAllBreakpoints();
        dim8.clearAllBreakpoints();
        dim8.contextSwitch((int) (byte) -1);
        dim8.setBreakOnEnter(false);
        dim8.setBreak();
        java.lang.Class<?> wildcardClass19 = dim8.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = dim0.objectToString((java.lang.Object) dim8);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo7 = dim0.sourceInfo("hi!");
        dim0.setBreak();
        dim0.contextSwitch((int) (short) -1);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) ' ');
        dim13.setBreakOnEnter(true);
        java.lang.String str20 = dim13.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim13.functionSourceByName("undefined");
        dim13.setBreakOnReturn(true);
        dim13.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = dim0.objectToString((java.lang.Object) dim13);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        dim0.dispose();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("hi!");
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        dim19.contextSwitch((int) (byte) 0);
        dim19.clearAllBreakpoints();
        java.lang.String[] strArray24 = dim19.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray25 = dim0.getObjectIds((java.lang.Object) dim19);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim dim7 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim7.setBreak();
        dim7.contextSwitch((int) (byte) 0);
        dim7.clearAllBreakpoints();
        java.lang.String[] strArray12 = dim7.functionNames();
        dim7.contextSwitch((int) (short) 0);
        dim7.go();
        dim7.contextSwitch(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray18 = dim0.getObjectIds((java.lang.Object) dim7);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        dim0.go();
        dim0.contextSwitch((int) '#');
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        dim14.contextSwitch((int) ' ');
        java.lang.String[] strArray18 = dim14.functionNames();
        dim14.setBreakOnExceptions(false);
        dim14.dispose();
        dim14.detach();
        dim14.setReturnValue((int) 'a');
        dim14.setBreakOnReturn(true);
        dim14.setReturnValue((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray29 = dim0.getObjectIds((java.lang.Object) dim14);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        dim0.contextSwitch((int) '#');
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData4 = dim0.currentContextData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "undefined");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        dim0.detach();
        dim0.clearAllBreakpoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String str8 = dim0.eval("hi!");
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        dim10.contextSwitch((int) ' ');
        dim10.go();
        dim10.detach();
        dim10.setReturnValue((int) (byte) 100);
        java.lang.String[] strArray18 = dim10.functionNames();
        dim10.clearAllBreakpoints();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray20 = dim0.getObjectIds((java.lang.Object) dim10);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.detach();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        dim15.contextSwitch((int) (byte) 0);
        dim15.clearAllBreakpoints();
        java.lang.String[] strArray20 = dim15.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray21 = dim0.getObjectIds((java.lang.Object) strArray20);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        dim0.detach();
        dim0.setReturnValue(3);
        dim0.go();
        dim0.setBreakOnEnter(true);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim0.functionSourceByName("");
        dim0.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "undefined");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        dim0.setReturnValue((int) (byte) -1);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData16 = dim0.currentContextData();
        dim0.setBreakOnExceptions(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "undefined");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.dispose();
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        dim11.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray15 = dim11.functionNames();
        java.lang.String str17 = dim11.eval("hi!");
        dim11.setBreakOnEnter(false);
        dim11.setReturnValue((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = dim0.objectToString((java.lang.Object) '4');
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.dispose();
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        dim11.contextSwitch((int) (byte) 0);
        dim11.clearAllBreakpoints();
        dim11.dispose();
        dim11.setBreakOnReturn(false);
        dim11.clearAllBreakpoints();
        dim11.setReturnValue((int) (short) 10);
        java.lang.String str23 = dim11.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData24 = dim11.currentContextData();
        dim11.dispose();
        dim11.setBreakOnExceptions(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray28 = dim0.getObjectIds((java.lang.Object) true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("");
        dim0.contextSwitch(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "undefined");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        dim0.setBreakOnEnter(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = dim0.stringIsCompilableUnit("");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        dim10.contextSwitch((int) ' ');
        dim10.setBreakOnEnter(true);
        java.lang.String str17 = dim10.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim10.functionSourceByName("undefined");
        dim10.contextSwitch(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object[] objArray22 = dim0.getObjectIds((java.lang.Object) 4);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnExceptions(false);
        java.lang.String[] strArray14 = dim0.functionNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("", "");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        dim0.setBreakOnEnter(false);
        dim0.setBreakOnExceptions(true);
        dim0.dispose();
        dim0.setBreakOnReturn(true);
        java.lang.String str24 = dim0.eval("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean26 = dim0.stringIsCompilableUnit("undefined");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.go();
        dim0.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = dim0.stringIsCompilableUnit("hi!");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        java.lang.String str14 = dim0.eval("");
        dim0.contextSwitch(4);
        dim0.go();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.compileScript("undefined", "");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        java.lang.String str14 = dim0.eval("");
        dim0.setReturnValue((int) (byte) 1);
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        dim17.contextSwitch((int) (byte) 0);
        dim17.clearAllBreakpoints();
        dim17.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource24 = dim17.functionSourceByName("");
        dim17.setBreak();
        dim17.dispose();
        dim17.setReturnValue((int) 'a');
        dim17.setBreak();
        java.lang.String str31 = dim17.eval("hi!");
        dim17.setBreakOnReturn(true);
        dim17.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo37 = dim17.sourceInfo("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = dim0.objectToString((java.lang.Object) "");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("hi!");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "undefined");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dim0.evalScript("", "hi!");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        dim0.detach();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo18 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        dim19.contextSwitch((int) (byte) 0);
        dim19.clearAllBreakpoints();
        dim19.detach();
        dim19.setReturnValue(0);
        dim19.setBreakOnEnter(true);
        dim19.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource31 = dim19.functionSourceByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = dim0.objectToString((java.lang.Object) dim19);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim9 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim9.setBreak();
        dim9.contextSwitch((int) (byte) 0);
        dim9.clearAllBreakpoints();
        dim9.dispose();
        dim9.setBreakOnEnter(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = dim0.objectToString((java.lang.Object) dim9);
    }
}

