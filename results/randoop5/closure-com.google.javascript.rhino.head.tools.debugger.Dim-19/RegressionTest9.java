import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        dim0.detach();
        dim0.setReturnValue((int) (byte) 10);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData17 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider18 = null;
        dim0.setSourceProvider(sourceProvider18);
        java.lang.Class<?> wildcardClass20 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(contextData17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData7 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("undefined");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData7);
        org.junit.Assert.assertNull(sourceInfo10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray13 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("hi!");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("hi!");
        dim0.setReturnValue(3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("undefined");
        java.lang.String str15 = dim0.eval("");
        org.junit.Assert.assertNull(functionSource13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        dim0.setReturnValue(1);
        dim0.setReturnValue((int) (short) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource20 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback21 = null;
        dim0.setGuiCallback(guiCallback21);
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(functionSource20);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        java.lang.String str13 = dim0.eval("hi!");
        java.lang.String[] strArray14 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        dim0.contextSwitch((int) (short) 10);
        dim0.detach();
        dim0.go();
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo12);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setBreakOnEnter(true);
        java.lang.String str10 = dim0.eval("hi!");
        dim0.setReturnValue(4);
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "undefined" + "'", str10, "undefined");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray13 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider19 = null;
        dim0.setSourceProvider(sourceProvider19);
        dim0.contextSwitch((int) (short) -1);
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        dim0.contextSwitch(100);
        dim0.contextSwitch(4);
        dim0.setBreakOnReturn(true);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        dim0.contextSwitch(10);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData17 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData17);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        java.lang.String str13 = dim0.eval("hi!");
        java.lang.String[] strArray14 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray18 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim0.setScopeProvider(scopeProvider19);
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(functionSource13);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo5 = dim0.sourceInfo("");
        dim0.setReturnValue(3);
        dim0.setReturnValue((int) (byte) 100);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        org.junit.Assert.assertNull(sourceInfo5);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        dim0.contextSwitch((int) (short) 1);
        dim0.setBreakOnEnter(false);
        dim0.setBreak();
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        dim0.setBreakOnExceptions(true);
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnEnter(true);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.contextSwitch((int) (short) -1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        org.junit.Assert.assertNull(functionSource8);
        org.junit.Assert.assertNull(contextData9);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider16 = null;
        dim0.setScopeProvider(scopeProvider16);
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        dim19.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback23 = null;
        dim19.setGuiCallback(guiCallback23);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData25 = dim19.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback26 = null;
        dim19.setGuiCallback(guiCallback26);
        dim19.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider30 = null;
        dim19.setScopeProvider(scopeProvider30);
        com.google.javascript.rhino.head.tools.debugger.Dim dim32 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim32.setBreak();
        java.lang.String str35 = dim32.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider36 = null;
        dim32.setScopeProvider(scopeProvider36);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource39 = dim32.functionSourceByName("undefined");
        dim32.clearAllBreakpoints();
        java.lang.String[] strArray41 = dim32.functionNames();
        dim32.setBreakOnEnter(false);
        dim32.clearAllBreakpoints();
        java.lang.String[] strArray45 = dim32.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo47 = dim32.sourceInfo("hi!");
        dim32.setBreakOnReturn(false);
        java.lang.String[] strArray50 = dim32.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = dim0.getObjectProperty((java.lang.Object) dim19, (java.lang.Object) strArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(contextData25);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "undefined" + "'", str35, "undefined");
        org.junit.Assert.assertNull(functionSource39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNull(sourceInfo47);
        org.junit.Assert.assertNotNull(strArray50);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("");
        dim0.detach();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(functionSource13);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim0.setScopeProvider(scopeProvider14);
        java.lang.String str17 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim0.setGuiCallback(guiCallback18);
        java.lang.String[] strArray20 = dim0.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        dim17.contextSwitch((int) ' ');
        dim17.setBreakOnEnter(true);
        java.lang.String str24 = dim17.eval("hi!");
        dim17.dispose();
        java.lang.String[] strArray26 = dim17.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource28 = dim17.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim dim29 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim29.setBreak();
        java.lang.String str32 = dim29.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider33 = null;
        dim29.setScopeProvider(scopeProvider33);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource36 = dim29.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo38 = dim29.sourceInfo("undefined");
        dim29.dispose();
        dim29.dispose();
        dim29.setBreak();
        dim29.setBreakOnExceptions(true);
        dim29.clearAllBreakpoints();
        dim29.setBreakOnEnter(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = dim0.getObjectProperty((java.lang.Object) functionSource28, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "undefined" + "'", str24, "undefined");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(functionSource28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "undefined" + "'", str32, "undefined");
        org.junit.Assert.assertNull(functionSource36);
        org.junit.Assert.assertNull(sourceInfo38);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setBreakOnEnter(true);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("undefined");
        dim0.setReturnValue((int) (byte) 0);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        dim0.contextSwitch((-1));
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource11);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) -1);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        java.lang.String str15 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim16 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim16.setBreak();
        dim16.contextSwitch((int) ' ');
        java.lang.String[] strArray20 = dim16.functionNames();
        dim16.setBreakOnExceptions(false);
        dim16.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider24 = null;
        dim16.setSourceProvider(sourceProvider24);
        java.lang.String str27 = dim16.eval("hi!");
        dim16.setBreakOnReturn(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dim0.objectToString((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "undefined" + "'", str27, "undefined");
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.contextSwitch(100);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        java.lang.String[] strArray14 = dim0.functionNames();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("hi!");
        dim0.setBreakOnReturn(true);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.dispose();
        dim0.setReturnValue((int) (byte) 1);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("");
        dim0.go();
        java.lang.String str21 = dim0.eval("");
        dim0.contextSwitch((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNull(functionSource18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        java.lang.String str14 = dim0.eval("");
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData16 = dim0.currentContextData();
        dim0.setReturnValue((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData19 = dim0.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = contextData19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(contextData16);
        org.junit.Assert.assertNull(contextData19);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        dim0.dispose();
        dim0.contextSwitch(10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.dispose();
        java.lang.String str12 = dim0.eval("hi!");
        java.lang.String[] strArray13 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider16 = null;
        dim0.setScopeProvider(scopeProvider16);
        dim0.setReturnValue((int) '#');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("");
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        java.lang.String str18 = dim0.eval("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        int int5 = contextData0.frameCount();
        int int6 = contextData0.frameCount();
        int int7 = contextData0.frameCount();
        int int8 = contextData0.frameCount();
        int int9 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame11 = contextData0.getFrame((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("");
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        java.lang.String str18 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData19 = dim0.currentContextData();
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertNull(contextData19);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnReturn(true);
        dim0.setReturnValue((int) (byte) 0);
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNull(functionSource9);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("");
        dim0.setReturnValue((int) ' ');
        dim0.contextSwitch((int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
        dim0.contextSwitch((int) 'a');
        java.lang.String str15 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim0.setScopeProvider(scopeProvider20);
        dim0.go();
        dim0.detach();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo5 = dim0.sourceInfo("");
        dim0.setReturnValue(3);
        dim0.setReturnValue((int) (byte) 100);
        dim0.dispose();
        org.junit.Assert.assertNull(sourceInfo5);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreak();
        dim0.setReturnValue((int) (byte) 10);
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnReturn(false);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertNull(functionSource16);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) (byte) 100);
        dim0.go();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        dim11.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim11.setGuiCallback(guiCallback15);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData17 = dim11.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim11.setGuiCallback(guiCallback18);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo21 = dim11.sourceInfo("undefined");
        dim11.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider24 = null;
        dim11.setScopeProvider(scopeProvider24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = dim0.objectToString((java.lang.Object) scopeProvider24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData17);
        org.junit.Assert.assertNull(sourceInfo21);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
        dim0.setBreak();
        dim0.setBreakOnReturn(false);
        dim0.detach();
        dim0.dispose();
        dim0.setReturnValue((int) (short) 10);
        org.junit.Assert.assertNull(sourceInfo8);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        dim0.detach();
        dim0.dispose();
        dim0.contextSwitch(3);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider16 = null;
        dim0.setSourceProvider(sourceProvider16);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo19 = dim0.sourceInfo("");
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo22 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(sourceInfo19);
        org.junit.Assert.assertNull(sourceInfo22);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        dim0.go();
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        dim0.contextSwitch(100);
        java.lang.String[] strArray18 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback21 = null;
        dim0.setGuiCallback(guiCallback21);
        dim0.dispose();
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) 1);
        java.lang.String[] strArray11 = dim0.functionNames();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("hi!");
        dim0.setBreakOnExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData9);
        org.junit.Assert.assertNull(sourceInfo14);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        dim0.detach();
        dim0.setReturnValue((int) (byte) 10);
        java.lang.String str18 = dim0.eval("undefined");
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.go();
        java.lang.String str9 = dim0.eval("");
        java.lang.String str11 = dim0.eval("");
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "undefined" + "'", str9, "undefined");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        java.lang.String str13 = dim0.eval("hi!");
        java.lang.String[] strArray14 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider15 = null;
        dim0.setSourceProvider(sourceProvider15);
        dim0.setReturnValue((int) (short) -1);
        dim0.setBreak();
        dim0.go();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.dispose();
        dim0.detach();
        dim0.go();
        com.google.javascript.rhino.head.ContextFactory contextFactory13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
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
        dim0.contextSwitch((int) (short) -1);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        java.lang.String str10 = dim0.eval("hi!");
        dim0.contextSwitch((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "undefined" + "'", str10, "undefined");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("undefined");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.contextSwitch(100);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        java.lang.String[] strArray14 = dim0.functionNames();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("hi!");
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnReturn(false);
        dim0.go();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.dispose();
        dim0.setReturnValue((int) (byte) 1);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.ContextFactory contextFactory14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setBreakOnEnter(true);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource11);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        dim0.dispose();
        dim0.detach();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("undefined");
        dim0.setBreak();
        dim0.setBreakOnEnter(false);
        java.lang.String[] strArray22 = dim0.functionNames();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNull(functionSource18);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.setReturnValue(100);
        dim0.setBreakOnReturn(true);
        dim0.setReturnValue((int) (byte) 0);
        java.lang.String str17 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim0.setScopeProvider(scopeProvider18);
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.setReturnValue((int) 'a');
        dim0.setBreak();
        java.lang.String str14 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        dim0.setBreakOnEnter(true);
        dim0.dispose();
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue((int) (byte) 1);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim0.setScopeProvider(scopeProvider22);
        java.lang.String[] strArray24 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider25 = null;
        dim0.setScopeProvider(scopeProvider25);
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource21);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        org.junit.Assert.assertNull(functionSource9);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.dispose();
        java.lang.String str12 = dim0.eval("hi!");
        java.lang.String[] strArray13 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        dim0.contextSwitch(10);
        dim0.setBreakOnExceptions(true);
        java.lang.String str21 = dim0.eval("undefined");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnExceptions(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim0.functionSourceByName("");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(functionSource22);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.setBreak();
        dim0.dispose();
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        dim0.setBreak();
        dim0.setBreakOnExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray13 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo19 = dim0.sourceInfo("hi!");
        dim0.setBreak();
        dim0.setBreakOnReturn(true);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(sourceInfo19);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setReturnValue((int) (short) -1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData17 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNull(contextData17);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        java.lang.String[] strArray14 = dim0.functionNames();
        dim0.contextSwitch(1);
        java.lang.String str18 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider19 = null;
        dim0.setSourceProvider(sourceProvider19);
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dim0.objectToString(obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnReturn(true);
        java.lang.String str19 = dim0.eval("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        java.lang.String str11 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        dim0.contextSwitch(10);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertNull(functionSource16);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.detach();
        dim0.clearAllBreakpoints();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        java.lang.Class<?> wildcardClass11 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim9 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim9.setBreak();
        dim9.contextSwitch((int) (byte) 0);
        dim9.clearAllBreakpoints();
        dim9.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim9.functionSourceByName("");
        dim9.setBreak();
        dim9.dispose();
        dim9.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData20 = dim9.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback21 = null;
        dim9.setGuiCallback(guiCallback21);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback23 = null;
        dim9.setGuiCallback(guiCallback23);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo26 = dim9.sourceInfo("undefined");
        java.lang.String str28 = dim9.eval("");
        dim9.setBreakOnEnter(false);
        dim9.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider32 = null;
        dim9.setScopeProvider(scopeProvider32);
        dim9.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim36 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim36.setBreak();
        java.lang.String str39 = dim36.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider40 = null;
        dim36.setScopeProvider(scopeProvider40);
        dim36.detach();
        dim36.setBreakOnReturn(false);
        java.lang.String[] strArray45 = dim36.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = dim0.getObjectProperty((java.lang.Object) true, (java.lang.Object) dim36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertNull(contextData20);
        org.junit.Assert.assertNull(sourceInfo26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "undefined" + "'", str28, "undefined");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "undefined" + "'", str39, "undefined");
        org.junit.Assert.assertNotNull(strArray45);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.contextSwitch(100);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        dim0.detach();
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue(100);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        java.lang.String[] strArray6 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider7 = null;
        dim0.setScopeProvider(scopeProvider7);
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        dim0.go();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData10);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.contextSwitch((int) (byte) 1);
        java.lang.String str17 = dim0.eval("hi!");
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.dispose();
        java.lang.String str12 = dim0.eval("hi!");
        java.lang.String[] strArray13 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        dim0.go();
        java.lang.String str18 = dim0.eval("");
        dim0.go();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback23 = null;
        dim21.setGuiCallback(guiCallback23);
        dim21.clearAllBreakpoints();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray26 = dim0.getObjectIds((java.lang.Object) dim21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        java.lang.String[] strArray6 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider7 = null;
        dim0.setScopeProvider(scopeProvider7);
        dim0.contextSwitch((int) (byte) -1);
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnEnter(true);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        int int5 = contextData0.frameCount();
        int int6 = contextData0.frameCount();
        int int7 = contextData0.frameCount();
        int int8 = contextData0.frameCount();
        int int9 = contextData0.frameCount();
        int int10 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame12 = contextData0.getFrame(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -101 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.detach();
        dim0.clearAllBreakpoints();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("undefined");
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertNull(sourceInfo14);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue((int) (byte) -1);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        dim0.setBreakOnExceptions(false);
        dim0.detach();
        dim0.go();
        dim0.setReturnValue((int) (short) 100);
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.setBreakOnEnter(true);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        java.lang.String str14 = dim11.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim11.setScopeProvider(scopeProvider15);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim11.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo20 = dim11.sourceInfo("undefined");
        dim11.dispose();
        dim11.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim dim23 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim23.setBreak();
        java.lang.String str26 = dim23.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider27 = null;
        dim23.setScopeProvider(scopeProvider27);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource30 = dim23.functionSourceByName("undefined");
        dim23.clearAllBreakpoints();
        java.lang.String[] strArray32 = dim23.functionNames();
        dim23.setBreakOnEnter(false);
        dim23.clearAllBreakpoints();
        java.lang.String[] strArray36 = dim23.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo38 = dim23.sourceInfo("hi!");
        dim23.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource41 = dim23.functionSourceByName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = dim0.getObjectProperty((java.lang.Object) dim11, (java.lang.Object) dim23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(functionSource18);
        org.junit.Assert.assertNull(sourceInfo20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "undefined" + "'", str26, "undefined");
        org.junit.Assert.assertNull(functionSource30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNull(sourceInfo38);
        org.junit.Assert.assertNull(functionSource41);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim0.setScopeProvider(scopeProvider13);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData16 = dim0.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = contextData16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(contextData16);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.setReturnValue(100);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        dim0.setBreakOnEnter(false);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setBreakOnEnter(true);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("");
        dim0.setReturnValue((int) ' ');
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo19 = dim0.sourceInfo("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(sourceInfo19);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        java.lang.String str14 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        dim0.setBreakOnReturn(false);
        dim0.setReturnValue((int) (short) 10);
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue((int) '#');
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider15 = null;
        dim0.setSourceProvider(sourceProvider15);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim0.setGuiCallback(guiCallback17);
        dim0.setBreakOnReturn(true);
        org.junit.Assert.assertNull(functionSource10);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.dispose();
        dim0.setReturnValue((int) (byte) 1);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("");
        dim0.setBreakOnExceptions(false);
        dim0.go();
        dim0.setReturnValue((int) (byte) 10);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider25 = null;
        dim0.setScopeProvider(scopeProvider25);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo28 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNull(functionSource18);
        org.junit.Assert.assertNull(sourceInfo28);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("undefined");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData15 = dim0.currentContextData();
        dim0.contextSwitch((int) ' ');
        java.lang.String str19 = dim0.eval("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNull(contextData15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue((int) '#');
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider15 = null;
        dim0.setSourceProvider(sourceProvider15);
        dim0.dispose();
        org.junit.Assert.assertNull(functionSource10);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String str8 = dim0.eval("hi!");
        dim0.detach();
        dim0.setBreakOnReturn(true);
        dim0.dispose();
        dim0.setReturnValue((int) (byte) 10);
        dim0.dispose();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource4 = dim0.functionSourceByName("");
        java.lang.String[] strArray5 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(functionSource4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo21 = dim0.sourceInfo("");
        dim0.detach();
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(sourceInfo21);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("");
        dim0.setReturnValue((int) ' ');
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        java.lang.String str15 = dim0.eval("hi!");
        dim0.clearAllBreakpoints();
        dim0.setReturnValue(4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource14 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData15 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider16 = null;
        dim0.setScopeProvider(scopeProvider16);
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback22 = null;
        dim18.setGuiCallback(guiCallback22);
        java.lang.String[] strArray24 = dim18.functionNames();
        dim18.setBreakOnReturn(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray27 = dim0.getObjectIds((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource14);
        org.junit.Assert.assertNull(contextData15);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        java.lang.String[] strArray6 = dim0.functionNames();
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray8 = dim0.functionNames();
        java.lang.String str10 = dim0.eval("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "undefined" + "'", str10, "undefined");
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.setReturnValue((int) (short) 1);
        dim0.setBreakOnReturn(false);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData15 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider16 = null;
        dim0.setScopeProvider(scopeProvider16);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.ContextFactory contextFactory20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData15);
        org.junit.Assert.assertNull(functionSource19);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.detach();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("hi!");
        java.lang.String str12 = dim0.eval("hi!");
        java.lang.String str14 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.dispose();
        dim0.setReturnValue((int) (byte) 1);
        java.lang.String str14 = dim0.eval("undefined");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData16 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo18 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo20 = dim0.sourceInfo("undefined");
        dim0.detach();
        dim0.contextSwitch((-1));
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(contextData16);
        org.junit.Assert.assertNull(sourceInfo18);
        org.junit.Assert.assertNull(sourceInfo20);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource14 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData15 = dim0.currentContextData();
        java.lang.String str17 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim0.setGuiCallback(guiCallback18);
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource14);
        org.junit.Assert.assertNull(contextData15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        java.lang.String str10 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        dim11.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim11.setGuiCallback(guiCallback15);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData17 = dim11.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim11.setGuiCallback(guiCallback18);
        java.lang.String[] strArray20 = dim11.functionNames();
        dim11.setReturnValue(100);
        dim11.setBreakOnReturn(true);
        dim11.setBreakOnEnter(false);
        java.lang.String str28 = dim11.eval("undefined");
        java.lang.String str30 = dim11.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider31 = null;
        dim11.setSourceProvider(sourceProvider31);
        com.google.javascript.rhino.head.tools.debugger.Dim dim33 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim33.setBreak();
        java.lang.String str36 = dim33.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider37 = null;
        dim33.setScopeProvider(scopeProvider37);
        dim33.setBreakOnReturn(false);
        dim33.setBreakOnExceptions(false);
        dim33.setReturnValue((int) (byte) -1);
        dim33.setReturnValue(0);
        dim33.contextSwitch((int) (short) 1);
        dim33.contextSwitch(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = dim0.getObjectProperty((java.lang.Object) sourceProvider31, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "undefined" + "'", str10, "undefined");
        org.junit.Assert.assertNull(contextData17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "undefined" + "'", str28, "undefined");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "undefined" + "'", str30, "undefined");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "undefined" + "'", str36, "undefined");
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData6);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        dim0.dispose();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) ' ');
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim18.setScopeProvider(scopeProvider22);
        dim18.dispose();
        dim18.setReturnValue(2);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo28 = dim18.sourceInfo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dim0.objectToString((java.lang.Object) sourceInfo28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo28);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        dim0.dispose();
        dim0.detach();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo18 = dim0.sourceInfo("undefined");
        java.lang.String[] strArray19 = dim0.functionNames();
        dim0.contextSwitch((int) ' ');
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim0.setScopeProvider(scopeProvider22);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNull(sourceInfo18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        java.lang.String str14 = dim0.eval("");
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData16 = dim0.currentContextData();
        dim0.setReturnValue(2);
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(contextData16);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.dispose();
        java.lang.String str12 = dim0.eval("hi!");
        java.lang.String[] strArray13 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        dim0.go();
        java.lang.String[] strArray17 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider18 = null;
        dim0.setSourceProvider(sourceProvider18);
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnExceptions(false);
        java.lang.String str15 = dim0.eval("");
        dim0.setReturnValue((int) (byte) 100);
        java.lang.String[] strArray18 = dim0.functionNames();
        java.lang.String[] strArray19 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        java.lang.String str13 = dim0.eval("hi!");
        dim0.go();
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource20 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnEnter(true);
        dim0.contextSwitch((int) (short) 100);
        java.lang.String str26 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider27 = null;
        dim0.setScopeProvider(scopeProvider27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(functionSource20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "undefined" + "'", str26, "undefined");
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("hi!");
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo21 = dim0.sourceInfo("");
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(sourceInfo21);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim0.setScopeProvider(scopeProvider19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.contextSwitch((int) (short) -1);
        java.lang.String[] strArray21 = dim0.functionNames();
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("undefined");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData16 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo18 = dim0.sourceInfo("hi!");
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNull(contextData16);
        org.junit.Assert.assertNull(sourceInfo18);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        dim0.contextSwitch(3);
        java.lang.String[] strArray15 = dim0.functionNames();
        dim0.setBreakOnExceptions(true);
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame5 = contextData0.getFrame((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -36 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(3);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        dim0.dispose();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback20 = null;
        dim0.setGuiCallback(guiCallback20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("");
        dim0.contextSwitch((int) (byte) 10);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("hi!");
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.dispose();
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnEnter(false);
        dim0.detach();
        dim0.dispose();
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("hi!");
        dim0.detach();
        dim0.go();
        dim0.go();
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setBreak();
        dim0.dispose();
        java.lang.String str13 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        dim0.dispose();
        java.lang.String[] strArray17 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(3);
        dim0.setReturnValue(0);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData18 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider19 = null;
        dim0.setSourceProvider(sourceProvider19);
        dim0.contextSwitch(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim0.setScopeProvider(scopeProvider23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(contextData18);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider16 = null;
        dim0.setScopeProvider(scopeProvider16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData18 = dim0.currentContextData();
        com.google.javascript.rhino.head.ContextFactory contextFactory19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertNull(contextData18);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        java.lang.String[] strArray12 = dim0.functionNames();
        dim0.contextSwitch((int) (short) 10);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider15 = null;
        dim0.setSourceProvider(sourceProvider15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.contextSwitch(10);
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnEnter(true);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        dim0.detach();
        dim0.setReturnValue((int) (byte) 10);
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData19 = dim0.currentContextData();
        dim0.setReturnValue((int) (byte) 10);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback23 = null;
        dim0.setGuiCallback(guiCallback23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(contextData19);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.setBreakOnExceptions(true);
        dim0.dispose();
        dim0.detach();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback20 = null;
        dim0.setGuiCallback(guiCallback20);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback22 = null;
        dim0.setGuiCallback(guiCallback22);
        dim0.go();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        java.lang.String str17 = dim0.eval("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.dispose();
        dim0.contextSwitch(10);
        dim0.setBreak();
        dim0.contextSwitch((int) '#');
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim0.setScopeProvider(scopeProvider18);
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.detach();
        dim0.setReturnValue(100);
        dim0.setReturnValue((-1));
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray17 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim22 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim22.setBreak();
        dim22.contextSwitch((int) ' ');
        dim22.setBreakOnEnter(true);
        dim22.setBreakOnExceptions(false);
        dim22.dispose();
        dim22.setBreak();
        dim22.go();
        dim22.contextSwitch((-1));
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo36 = dim22.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider37 = null;
        dim22.setSourceProvider(sourceProvider37);
        com.google.javascript.rhino.head.tools.debugger.Dim dim39 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim39.setBreak();
        java.lang.String str42 = dim39.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider43 = null;
        dim39.setScopeProvider(scopeProvider43);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource46 = dim39.functionSourceByName("undefined");
        dim39.clearAllBreakpoints();
        dim39.setBreakOnExceptions(false);
        dim39.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData51 = dim39.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider52 = null;
        dim39.setScopeProvider(scopeProvider52);
        dim39.setBreakOnExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = dim0.getObjectProperty((java.lang.Object) sourceProvider37, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNull(functionSource19);
        org.junit.Assert.assertNull(functionSource21);
        org.junit.Assert.assertNull(sourceInfo36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "undefined" + "'", str42, "undefined");
        org.junit.Assert.assertNull(functionSource46);
        org.junit.Assert.assertNull(contextData51);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray13 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("hi!");
        dim0.contextSwitch((int) (short) 100);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData18 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider19 = null;
        dim0.setSourceProvider(sourceProvider19);
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNull(contextData18);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.dispose();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider16 = null;
        dim0.setSourceProvider(sourceProvider16);
        dim0.go();
        dim0.contextSwitch((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        int int5 = contextData0.frameCount();
        int int6 = contextData0.frameCount();
        int int7 = contextData0.frameCount();
        int int8 = contextData0.frameCount();
        int int9 = contextData0.frameCount();
        int int10 = contextData0.frameCount();
        int int11 = contextData0.frameCount();
        int int12 = contextData0.frameCount();
        int int13 = contextData0.frameCount();
        int int14 = contextData0.frameCount();
        int int15 = contextData0.frameCount();
        int int16 = contextData0.frameCount();
        int int17 = contextData0.frameCount();
        int int18 = contextData0.frameCount();
        int int19 = contextData0.frameCount();
        int int20 = contextData0.frameCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.ContextFactory contextFactory19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.dispose();
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        dim11.contextSwitch((int) (byte) 0);
        dim11.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim11.sourceInfo("");
        java.lang.String[] strArray18 = dim11.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        java.lang.String str22 = dim19.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim19.setScopeProvider(scopeProvider23);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback25 = null;
        dim19.setGuiCallback(guiCallback25);
        dim19.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider28 = null;
        dim19.setSourceProvider(sourceProvider28);
        java.lang.String[] strArray30 = dim19.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback31 = null;
        dim19.setGuiCallback(guiCallback31);
        dim19.setBreakOnEnter(false);
        dim19.contextSwitch((int) ' ');
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData37 = dim19.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData38 = dim19.currentContextData();
        java.lang.String[] strArray39 = dim19.functionNames();
        java.lang.Class<?> wildcardClass40 = dim19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = dim0.getObjectProperty((java.lang.Object) strArray18, (java.lang.Object) wildcardClass40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNull(contextData37);
        org.junit.Assert.assertNull(contextData38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.setBreak();
        dim0.setReturnValue((int) (short) 1);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("");
        dim0.contextSwitch(2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource17);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider9 = null;
        dim0.setScopeProvider(scopeProvider9);
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        dim11.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim11.setGuiCallback(guiCallback15);
        java.lang.String[] strArray17 = dim11.functionNames();
        java.lang.String str19 = dim11.eval("undefined");
        java.lang.String[] strArray20 = dim11.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray21 = dim0.getObjectIds((java.lang.Object) strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.dispose();
        dim0.setReturnValue((int) (byte) 1);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("undefined");
        dim0.detach();
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim0.setScopeProvider(scopeProvider14);
        java.lang.String str17 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData18 = dim0.currentContextData();
        java.lang.String str20 = dim0.eval("undefined");
        dim0.contextSwitch((-1));
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData23 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(contextData18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
        org.junit.Assert.assertNull(contextData23);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.dispose();
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo21 = dim0.sourceInfo("");
        dim0.detach();
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider25 = null;
        dim0.setScopeProvider(scopeProvider25);
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(sourceInfo21);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setReturnValue(5);
        java.lang.String str12 = dim0.eval("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        dim0.dispose();
        dim0.dispose();
        dim0.go();
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("hi!");
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        dim0.detach();
        dim0.setReturnValue((int) (byte) 10);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim0.setGuiCallback(guiCallback18);
        dim0.contextSwitch((int) (short) -1);
        dim0.detach();
        dim0.setReturnValue((int) '4');
        dim0.dispose();
        dim0.dispose();
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        dim0.detach();
        dim0.dispose();
        dim0.contextSwitch(3);
        dim0.go();
        java.lang.String str18 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback19 = null;
        dim0.setGuiCallback(guiCallback19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        dim0.go();
        dim0.setBreakOnExceptions(true);
        dim0.contextSwitch((int) (short) -1);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray13 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider19 = null;
        dim0.setSourceProvider(sourceProvider19);
        dim0.contextSwitch((int) (short) -1);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim25 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim25.setBreak();
        dim25.contextSwitch((int) (byte) 0);
        dim25.clearAllBreakpoints();
        dim25.clearAllBreakpoints();
        dim25.contextSwitch((int) (byte) -1);
        dim25.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo36 = dim25.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData37 = dim25.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim38 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim38.setBreak();
        dim38.contextSwitch((int) (byte) 0);
        dim38.clearAllBreakpoints();
        dim38.dispose();
        dim38.setBreakOnReturn(false);
        dim38.clearAllBreakpoints();
        dim38.setReturnValue((int) (short) 10);
        java.lang.String str50 = dim38.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData51 = dim38.currentContextData();
        java.lang.Class<?> wildcardClass52 = dim38.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = dim0.getObjectProperty((java.lang.Object) dim25, (java.lang.Object) dim38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(sourceInfo36);
        org.junit.Assert.assertNull(contextData37);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "undefined" + "'", str50, "undefined");
        org.junit.Assert.assertNull(contextData51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.setBreak();
        dim0.detach();
        dim0.dispose();
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(3);
        dim0.setReturnValue(0);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("hi!");
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray19 = dim0.functionNames();
        dim0.go();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData22 = dim0.currentContextData();
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNull(contextData22);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        java.lang.String[] strArray8 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(sourceInfo10);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData15 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(contextData15);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        java.lang.String str21 = dim18.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim18.setScopeProvider(scopeProvider22);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback24 = null;
        dim18.setGuiCallback(guiCallback24);
        dim18.contextSwitch((int) '4');
        dim18.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider29 = null;
        dim18.setScopeProvider(scopeProvider29);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider31 = null;
        dim18.setSourceProvider(sourceProvider31);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo34 = dim18.sourceInfo("undefined");
        java.lang.String str36 = dim18.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim dim37 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim37.setBreak();
        java.lang.String str40 = dim37.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider41 = null;
        dim37.setScopeProvider(scopeProvider41);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource44 = dim37.functionSourceByName("undefined");
        dim37.clearAllBreakpoints();
        java.lang.String[] strArray46 = dim37.functionNames();
        dim37.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider49 = null;
        dim37.setScopeProvider(scopeProvider49);
        java.lang.String str52 = dim37.eval("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = dim0.getObjectProperty((java.lang.Object) "undefined", (java.lang.Object) str52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
        org.junit.Assert.assertNull(sourceInfo34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "undefined" + "'", str36, "undefined");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "undefined" + "'", str40, "undefined");
        org.junit.Assert.assertNull(functionSource44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "undefined" + "'", str52, "undefined");
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        dim0.detach();
        java.lang.String str16 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData19 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider20 = null;
        dim0.setSourceProvider(sourceProvider20);
        dim0.setReturnValue((int) (short) 100);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider24 = null;
        dim0.setSourceProvider(sourceProvider24);
        dim0.setBreakOnExceptions(true);
        dim0.contextSwitch((int) (byte) 10);
        java.lang.String str31 = dim0.eval("hi!");
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNull(contextData19);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "undefined" + "'", str31, "undefined");
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        java.lang.String str18 = dim15.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim15.setScopeProvider(scopeProvider19);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback21 = null;
        dim15.setGuiCallback(guiCallback21);
        dim15.contextSwitch((int) '4');
        dim15.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData26 = dim15.currentContextData();
        dim15.setBreakOnExceptions(false);
        dim15.go();
        java.lang.String str31 = dim15.eval("");
        java.lang.String str33 = dim15.eval("");
        dim15.contextSwitch(100);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider36 = null;
        dim15.setScopeProvider(scopeProvider36);
        dim15.setReturnValue((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim dim40 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim40.setBreak();
        dim40.contextSwitch((int) ' ');
        java.lang.String[] strArray44 = dim40.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData45 = dim40.currentContextData();
        dim40.clearAllBreakpoints();
        dim40.clearAllBreakpoints();
        dim40.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = dim0.getObjectProperty((java.lang.Object) (byte) 0, (java.lang.Object) dim40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertNull(contextData26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "undefined" + "'", str31, "undefined");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "undefined" + "'", str33, "undefined");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNull(contextData45);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        dim0.detach();
        dim0.setReturnValue((int) (byte) 10);
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback19 = null;
        dim0.setGuiCallback(guiCallback19);
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        java.lang.String str24 = dim21.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider25 = null;
        dim21.setScopeProvider(scopeProvider25);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback27 = null;
        dim21.setGuiCallback(guiCallback27);
        dim21.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo32 = dim21.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo34 = dim21.sourceInfo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray35 = dim0.getObjectIds((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "undefined" + "'", str24, "undefined");
        org.junit.Assert.assertNull(sourceInfo32);
        org.junit.Assert.assertNull(sourceInfo34);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(3);
        dim0.setReturnValue(0);
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo19 = dim0.sourceInfo("hi!");
        java.lang.String str21 = dim0.eval("undefined");
        dim0.contextSwitch(2);
        dim0.setBreakOnReturn(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.setBreakOnEnter(true);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (byte) -1);
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray20 = dim19.functionNames();
        dim19.detach();
        dim19.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim19.setScopeProvider(scopeProvider23);
        com.google.javascript.rhino.head.tools.debugger.Dim dim25 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim25.setBreak();
        dim25.contextSwitch((int) ' ');
        dim25.go();
        dim25.setBreakOnReturn(true);
        dim25.contextSwitch(4);
        dim25.go();
        dim25.setBreakOnReturn(true);
        dim25.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider39 = null;
        dim25.setSourceProvider(sourceProvider39);
        dim25.setBreakOnReturn(false);
        dim25.dispose();
        dim25.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = dim0.getObjectProperty((java.lang.Object) dim19, (java.lang.Object) dim25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        java.lang.String str13 = dim0.eval("hi!");
        dim0.go();
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnExceptions(true);
        java.lang.String str20 = dim0.eval("undefined");
        dim0.dispose();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        dim0.contextSwitch((int) ' ');
        dim0.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        dim0.contextSwitch((int) (short) 1);
        dim0.go();
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
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
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource23 = dim0.functionSourceByName("");
        dim0.clearAllBreakpoints();
        java.lang.String str26 = dim0.eval("hi!");
        org.junit.Assert.assertNull(functionSource23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "undefined" + "'", str26, "undefined");
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
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
        dim0.contextSwitch(0);
        dim0.detach();
        dim0.clearAllBreakpoints();
        dim0.setBreak();
        java.lang.String str24 = dim0.eval("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "undefined" + "'", str24, "undefined");
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.dispose();
        java.lang.String[] strArray9 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        dim12.contextSwitch((int) ' ');
        dim12.go();
        dim12.setBreakOnReturn(true);
        dim12.contextSwitch(4);
        dim12.go();
        java.lang.String[] strArray22 = dim12.functionNames();
        dim12.contextSwitch((int) (byte) 10);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource26 = dim12.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim27 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim27.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback29 = null;
        dim27.setGuiCallback(guiCallback29);
        dim27.setBreakOnReturn(false);
        dim27.setBreakOnExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = dim0.getObjectProperty((java.lang.Object) "", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNull(functionSource26);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        dim0.contextSwitch(100);
        dim0.clearAllBreakpoints();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim0.setScopeProvider(scopeProvider20);
        dim0.clearAllBreakpoints();
        dim0.dispose();
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        dim0.contextSwitch(10);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = sourceInfo14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo14);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback2 = null;
        dim0.setGuiCallback(guiCallback2);
        dim0.setBreak();
        java.lang.String str6 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData7 = dim0.currentContextData();
        dim0.dispose();
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.ContextFactory contextFactory11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
        org.junit.Assert.assertNull(contextData7);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider16 = null;
        dim0.setSourceProvider(sourceProvider16);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        java.lang.String str22 = dim19.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim19.setScopeProvider(scopeProvider23);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource26 = dim19.functionSourceByName("undefined");
        dim19.clearAllBreakpoints();
        dim19.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData30 = dim19.currentContextData();
        dim19.setReturnValue(5);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider33 = null;
        dim19.setSourceProvider(sourceProvider33);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback35 = null;
        dim19.setGuiCallback(guiCallback35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray37 = dim0.getObjectIds((java.lang.Object) guiCallback35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
        org.junit.Assert.assertNull(functionSource26);
        org.junit.Assert.assertNull(contextData30);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.detach();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(3);
        dim0.setBreakOnEnter(false);
        dim0.setBreak();
        java.lang.String str17 = dim0.eval("");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreak();
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertNull(sourceInfo10);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
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
        java.lang.String str20 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo22 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
        org.junit.Assert.assertNull(sourceInfo22);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        dim0.setBreakOnExceptions(true);
        dim0.go();
        dim0.setReturnValue((int) (short) 1);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        dim0.contextSwitch((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        int int5 = contextData0.frameCount();
        int int6 = contextData0.frameCount();
        int int7 = contextData0.frameCount();
        int int8 = contextData0.frameCount();
        int int9 = contextData0.frameCount();
        int int10 = contextData0.frameCount();
        int int11 = contextData0.frameCount();
        int int12 = contextData0.frameCount();
        int int13 = contextData0.frameCount();
        int int14 = contextData0.frameCount();
        int int15 = contextData0.frameCount();
        int int16 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame18 = contextData0.getFrame(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
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
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource23 = dim0.functionSourceByName("");
        java.lang.String[] strArray24 = dim0.functionNames();
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider30 = null;
        dim0.setScopeProvider(scopeProvider30);
        com.google.javascript.rhino.head.tools.debugger.Dim dim33 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim33.setBreak();
        dim33.contextSwitch((int) (byte) 0);
        dim33.clearAllBreakpoints();
        dim33.dispose();
        dim33.setBreakOnReturn(false);
        dim33.clearAllBreakpoints();
        dim33.setReturnValue((int) (short) 10);
        java.lang.String str45 = dim33.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData46 = dim33.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource48 = dim33.functionSourceByName("");
        java.lang.String str50 = dim33.eval("hi!");
        dim33.setBreakOnReturn(true);
        dim33.contextSwitch(2);
        java.lang.String str56 = dim33.eval("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = dim0.getObjectProperty((java.lang.Object) 10.0f, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "undefined" + "'", str45, "undefined");
        org.junit.Assert.assertNull(contextData46);
        org.junit.Assert.assertNull(functionSource48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "undefined" + "'", str50, "undefined");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "undefined" + "'", str56, "undefined");
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.setBreak();
        dim0.setReturnValue((int) (short) 1);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim0.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback22 = null;
        dim0.setGuiCallback(guiCallback22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource21);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        dim0.go();
        dim0.setReturnValue(2);
        java.lang.String[] strArray16 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("hi!");
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.setReturnValue(100);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        java.lang.String[] strArray14 = dim0.functionNames();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData18 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource20 = dim0.functionSourceByName("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(contextData18);
        org.junit.Assert.assertNull(functionSource20);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim0.setScopeProvider(scopeProvider13);
        dim0.detach();
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        dim0.dispose();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        java.lang.String str15 = dim0.eval("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim13.setGuiCallback(guiCallback17);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData19 = dim13.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback20 = null;
        dim13.setGuiCallback(guiCallback20);
        dim13.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider24 = null;
        dim13.setSourceProvider(sourceProvider24);
        dim13.contextSwitch(3);
        dim13.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim29 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim29.setBreak();
        dim29.contextSwitch((int) (byte) 0);
        dim29.clearAllBreakpoints();
        dim29.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource36 = dim29.functionSourceByName("");
        dim29.setBreak();
        java.lang.String str39 = dim29.eval("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback40 = null;
        dim29.setGuiCallback(guiCallback40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = dim0.getObjectProperty((java.lang.Object) dim13, (java.lang.Object) dim29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData19);
        org.junit.Assert.assertNull(functionSource36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "undefined" + "'", str39, "undefined");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String str11 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        java.lang.String str16 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim0.setGuiCallback(guiCallback17);
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.dispose();
        dim0.setReturnValue((int) (byte) 1);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("");
        dim0.go();
        java.lang.String str21 = dim0.eval("");
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider24 = null;
        dim0.setScopeProvider(scopeProvider24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNull(functionSource18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.setBreak();
        dim0.detach();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.dispose();
        dim0.setBreak();
        dim0.setReturnValue((int) (short) 100);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("hi!");
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.dispose();
        dim0.setReturnValue(2);
        dim0.setReturnValue((int) (byte) -1);
        dim0.setBreak();
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(false);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame3 = contextData0.getFrame(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -6 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("");
        dim0.setReturnValue(100);
        dim0.detach();
        org.junit.Assert.assertNull(functionSource8);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.dispose();
        java.lang.String str12 = dim0.eval("hi!");
        java.lang.String[] strArray13 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        dim0.contextSwitch(10);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider18 = null;
        dim0.setSourceProvider(sourceProvider18);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim0.setScopeProvider(scopeProvider22);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource21);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        dim0.setReturnValue((int) 'a');
        java.lang.String str20 = dim0.eval("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.setReturnValue(100);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider15 = null;
        dim0.setSourceProvider(sourceProvider15);
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(sourceInfo14);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        java.lang.String[] strArray18 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo20 = dim0.sourceInfo("");
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNull(sourceInfo20);
    }
}

