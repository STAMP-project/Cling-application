import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
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
        java.lang.String[] strArray15 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("");
        dim0.contextSwitch((int) (byte) 10);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        java.lang.String[] strArray13 = dim0.functionNames();
        java.lang.String str15 = dim0.eval("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(true);
        dim0.detach();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource11);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider20 = null;
        dim0.setSourceProvider(sourceProvider20);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData22 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertNull(contextData22);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim0.setScopeProvider(scopeProvider18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        dim0.go();
        java.lang.String str16 = dim0.eval("");
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData18 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNull(contextData18);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo23 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback24 = null;
        dim0.setGuiCallback(guiCallback24);
        java.lang.Class<?> wildcardClass26 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(functionSource19);
        org.junit.Assert.assertNull(sourceInfo23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo6 = dim0.sourceInfo("");
        java.lang.String[] strArray7 = dim0.functionNames();
        dim0.go();
        dim0.setBreak();
        dim0.detach();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(sourceInfo6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        dim0.contextSwitch(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim0.setScopeProvider(scopeProvider13);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData16 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(contextData16);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        dim0.setBreakOnExceptions(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        dim12.contextSwitch((int) ' ');
        dim12.go();
        dim12.setBreakOnReturn(true);
        dim12.contextSwitch(4);
        dim12.go();
        dim12.setBreakOnReturn(true);
        dim12.contextSwitch((int) (short) 1);
        java.lang.Class<?> wildcardClass26 = dim12.getClass();
        com.google.javascript.rhino.head.tools.debugger.Dim dim27 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim27.setBreak();
        dim27.contextSwitch((int) (byte) 0);
        dim27.clearAllBreakpoints();
        dim27.dispose();
        dim27.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData35 = dim27.currentContextData();
        dim27.go();
        dim27.setBreakOnEnter(false);
        dim27.go();
        java.lang.String str41 = dim27.eval("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = dim0.getObjectProperty((java.lang.Object) wildcardClass26, (java.lang.Object) dim27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(contextData35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "undefined" + "'", str41, "undefined");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.detach();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) '4');
        dim0.setReturnValue(5);
        dim0.setBreak();
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertNull(sourceInfo9);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setBreakOnEnter(true);
        java.lang.String str10 = dim0.eval("hi!");
        dim0.setReturnValue(4);
        java.lang.String str14 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider15 = null;
        dim0.setSourceProvider(sourceProvider15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "undefined" + "'", str10, "undefined");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.dispose();
        dim0.dispose();
        dim0.setBreakOnReturn(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        com.google.javascript.rhino.head.ContextFactory contextFactory17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo14);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.go();
        java.lang.String[] strArray11 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        dim12.contextSwitch((int) ' ');
        java.lang.String[] strArray16 = dim12.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim12.setScopeProvider(scopeProvider17);
        dim12.setReturnValue(5);
        dim12.setBreakOnReturn(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray23 = dim0.getObjectIds((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
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
        dim0.setReturnValue((int) (short) 0);
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) 'a');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        java.lang.String[] strArray14 = dim0.functionNames();
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        dim0.setReturnValue((int) ' ');
        dim0.contextSwitch(3);
        java.lang.String[] strArray16 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        dim0.setBreak();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo18 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo18);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        dim0.clearAllBreakpoints();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
        java.lang.String str16 = dim0.eval("");
        dim0.dispose();
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
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
        dim0.go();
        dim0.setBreakOnExceptions(false);
        java.lang.String str17 = dim0.eval("hi!");
        dim0.setReturnValue((int) (byte) 10);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim0.setScopeProvider(scopeProvider20);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        int int5 = contextData0.frameCount();
        int int6 = contextData0.frameCount();
        int int7 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame9 = contextData0.getFrame(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -4 ?? [0, 0)");
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
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo20 = dim0.sourceInfo("");
        java.lang.String str22 = dim0.eval("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNull(sourceInfo20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.contextSwitch((int) (short) 0);
        java.lang.String str9 = dim0.eval("undefined");
        dim0.setBreakOnReturn(true);
        java.lang.Class<?> wildcardClass12 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "undefined" + "'", str9, "undefined");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        java.lang.String[] strArray14 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("");
        java.lang.Class<?> wildcardClass17 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(sourceInfo19);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim16 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim16.setBreak();
        dim16.contextSwitch((int) (byte) 0);
        dim16.clearAllBreakpoints();
        dim16.detach();
        dim16.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider24 = null;
        dim16.setScopeProvider(scopeProvider24);
        dim16.dispose();
        dim16.contextSwitch(10);
        dim16.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray30 = dim0.getObjectIds((java.lang.Object) dim16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        java.lang.Class<?> wildcardClass12 = dim0.getClass();
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData20 = dim0.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertNull(contextData20);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo23 = dim0.sourceInfo("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(sourceInfo23);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("undefined");
        dim0.setBreak();
        dim0.setReturnValue((int) (short) 0);
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("hi!");
        dim0.setReturnValue(2);
        java.lang.String str23 = dim0.eval("undefined");
        java.lang.String[] strArray24 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback25 = null;
        dim0.setGuiCallback(guiCallback25);
        com.google.javascript.rhino.head.ContextFactory contextFactory27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNull(functionSource19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "undefined" + "'", str23, "undefined");
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
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
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("hi!");
        java.lang.String str14 = dim0.eval("");
        dim0.dispose();
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
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        dim0.setReturnValue(5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
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
        dim0.dispose();
        java.lang.String[] strArray16 = dim0.functionNames();
        java.lang.String str18 = dim0.eval("");
        java.lang.Class<?> wildcardClass19 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        java.lang.String str14 = dim0.eval("");
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.setReturnValue((int) 'a');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(functionSource16);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue(3);
        java.lang.String[] strArray8 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(contextData9);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim0.functionSourceByName("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNull(functionSource18);
        org.junit.Assert.assertNull(functionSource25);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
        dim0.setReturnValue((int) ' ');
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        dim0.go();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        dim0.setBreak();
        dim0.setBreakOnEnter(false);
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim0.functionSourceByName("");
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo19);
        org.junit.Assert.assertNull(functionSource21);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        dim0.setReturnValue(10);
        java.lang.String str16 = dim0.eval("hi!");
        dim0.dispose();
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.detach();
        dim0.setBreak();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("");
        dim0.setReturnValue((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(functionSource16);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData17 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData18 = dim0.currentContextData();
        java.lang.String str20 = dim0.eval("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertNull(contextData17);
        org.junit.Assert.assertNull(contextData18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnExceptions(true);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String[] strArray7 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim8 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim8.setBreak();
        java.lang.String str11 = dim8.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim8.setScopeProvider(scopeProvider12);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim8.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim8.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData18 = dim8.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo20 = dim8.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo22 = dim8.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource24 = dim8.functionSourceByName("hi!");
        dim8.setBreakOnExceptions(true);
        dim8.contextSwitch((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dim0.objectToString((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(contextData18);
        org.junit.Assert.assertNull(sourceInfo20);
        org.junit.Assert.assertNull(sourceInfo22);
        org.junit.Assert.assertNull(functionSource24);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) (byte) 0);
        dim13.clearAllBreakpoints();
        dim13.detach();
        dim13.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo22 = dim13.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback23 = null;
        dim13.setGuiCallback(guiCallback23);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData25 = dim13.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback26 = null;
        dim13.setGuiCallback(guiCallback26);
        dim13.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dim0.objectToString((java.lang.Object) dim13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(sourceInfo22);
        org.junit.Assert.assertNull(contextData25);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.setBreak();
        dim0.setBreakOnExceptions(true);
        java.lang.String[] strArray11 = dim0.functionNames();
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        java.lang.Object obj13 = null;
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        java.lang.String str17 = dim14.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim14.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback20 = null;
        dim14.setGuiCallback(guiCallback20);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback22 = null;
        dim14.setGuiCallback(guiCallback22);
        dim14.setBreak();
        dim14.setBreakOnExceptions(false);
        dim14.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource30 = dim14.functionSourceByName("undefined");
        dim14.detach();
        java.lang.String str33 = dim14.eval("hi!");
        dim14.setReturnValue((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = dim0.getObjectProperty(obj13, (java.lang.Object) dim14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(functionSource30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "undefined" + "'", str33, "undefined");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo14);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        dim0.detach();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        java.lang.Class<?> wildcardClass10 = dim0.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.setBreakOnEnter(false);
        java.lang.Class<?> wildcardClass10 = dim0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("");
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo12);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo20 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider21 = null;
        dim0.setSourceProvider(sourceProvider21);
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(sourceInfo20);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback9 = null;
        dim0.setGuiCallback(guiCallback9);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String str8 = dim0.eval("hi!");
        dim0.detach();
        dim0.setBreakOnReturn(true);
        dim0.go();
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnExceptions(true);
        java.lang.String[] strArray8 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("");
        dim0.go();
        dim0.go();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(sourceInfo10);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        dim17.contextSwitch((int) ' ');
        java.lang.String[] strArray21 = dim17.functionNames();
        dim17.setBreakOnExceptions(false);
        dim17.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource26 = dim17.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo28 = dim17.sourceInfo("hi!");
        dim17.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo32 = dim17.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim dim33 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim33.setBreak();
        java.lang.String str36 = dim33.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider37 = null;
        dim33.setScopeProvider(scopeProvider37);
        dim33.setBreakOnReturn(false);
        dim33.setBreakOnExceptions(false);
        dim33.setReturnValue((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = dim0.getObjectProperty((java.lang.Object) "hi!", (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNull(functionSource26);
        org.junit.Assert.assertNull(sourceInfo28);
        org.junit.Assert.assertNull(sourceInfo32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "undefined" + "'", str36, "undefined");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("");
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(functionSource13);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo14);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim0.setScopeProvider(scopeProvider20);
        java.lang.String str23 = dim0.eval("");
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(contextData16);
        org.junit.Assert.assertNull(contextData19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "undefined" + "'", str23, "undefined");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.contextSwitch((int) (byte) 0);
        dim0.detach();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.detach();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) '4');
        dim0.setReturnValue(5);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider15 = null;
        dim0.setSourceProvider(sourceProvider15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider15 = null;
        dim0.setSourceProvider(sourceProvider15);
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        java.lang.String str20 = dim17.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim17.setScopeProvider(scopeProvider21);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback23 = null;
        dim17.setGuiCallback(guiCallback23);
        dim17.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider26 = null;
        dim17.setSourceProvider(sourceProvider26);
        java.lang.String[] strArray28 = dim17.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback29 = null;
        dim17.setGuiCallback(guiCallback29);
        dim17.clearAllBreakpoints();
        dim17.setBreakOnExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray34 = dim0.getObjectIds((java.lang.Object) dim17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        java.lang.String[] strArray14 = dim0.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        java.lang.String str13 = dim0.eval("");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
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
        java.lang.String[] strArray14 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider15 = null;
        dim0.setSourceProvider(sourceProvider15);
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String[] strArray2 = dim0.functionNames();
        dim0.contextSwitch(100);
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo5 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) -1);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("undefined");
        org.junit.Assert.assertNull(sourceInfo5);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        java.lang.String[] strArray19 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo21 = dim0.sourceInfo("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertNull(sourceInfo21);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider22 = null;
        dim0.setSourceProvider(sourceProvider22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData18 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource20 = dim0.functionSourceByName("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData18);
        org.junit.Assert.assertNull(functionSource20);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        dim10.contextSwitch((int) ' ');
        java.lang.String[] strArray14 = dim10.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim10.setScopeProvider(scopeProvider15);
        dim10.setBreakOnEnter(true);
        dim10.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim10.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo23 = dim10.sourceInfo("");
        dim10.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim dim25 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim25.setBreak();
        java.lang.String str28 = dim25.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider29 = null;
        dim25.setScopeProvider(scopeProvider29);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback31 = null;
        dim25.setGuiCallback(guiCallback31);
        dim25.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider34 = null;
        dim25.setSourceProvider(sourceProvider34);
        java.lang.String[] strArray36 = dim25.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback37 = null;
        dim25.setGuiCallback(guiCallback37);
        dim25.setBreakOnEnter(false);
        dim25.contextSwitch((int) ' ');
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData43 = dim25.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData44 = dim25.currentContextData();
        java.lang.String[] strArray45 = dim25.functionNames();
        java.lang.Class<?> wildcardClass46 = dim25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = dim0.getObjectProperty((java.lang.Object) dim10, (java.lang.Object) wildcardClass46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(functionSource21);
        org.junit.Assert.assertNull(sourceInfo23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "undefined" + "'", str28, "undefined");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNull(contextData43);
        org.junit.Assert.assertNull(contextData44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("hi!");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider17 = null;
        dim0.setSourceProvider(sourceProvider17);
        java.lang.Class<?> wildcardClass19 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame13 = contextData0.getFrame((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -36 ?? [0, 0)");
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
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNull(contextData10);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim23 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim23.setBreak();
        java.lang.String str26 = dim23.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider27 = null;
        dim23.setScopeProvider(scopeProvider27);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource30 = dim23.functionSourceByName("undefined");
        dim23.clearAllBreakpoints();
        dim23.go();
        java.lang.String str34 = dim23.eval("hi!");
        dim23.detach();
        dim23.dispose();
        dim23.contextSwitch(3);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider39 = null;
        dim23.setSourceProvider(sourceProvider39);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo42 = dim23.sourceInfo("");
        dim23.clearAllBreakpoints();
        java.lang.Object obj44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = dim0.getObjectProperty((java.lang.Object) dim23, obj44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "undefined" + "'", str26, "undefined");
        org.junit.Assert.assertNull(functionSource30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "undefined" + "'", str34, "undefined");
        org.junit.Assert.assertNull(sourceInfo42);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        dim0.dispose();
        org.junit.Assert.assertNull(functionSource8);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim0.setScopeProvider(scopeProvider13);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("");
        dim0.contextSwitch(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim0.setScopeProvider(scopeProvider19);
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setBreakOnEnter(true);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        dim10.contextSwitch((int) (byte) 0);
        dim10.clearAllBreakpoints();
        dim10.dispose();
        dim10.setBreakOnReturn(false);
        dim10.clearAllBreakpoints();
        dim10.setBreakOnExceptions(false);
        dim10.setReturnValue((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = dim0.objectToString((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue((int) (byte) -1);
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray9 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(contextData10);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dim0.objectToString(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(sourceInfo21);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnReturn(false);
        dim0.go();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim22 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim22.setBreak();
        dim22.contextSwitch((int) ' ');
        dim22.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider27 = null;
        dim22.setSourceProvider(sourceProvider27);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo30 = dim22.sourceInfo("");
        dim22.setBreakOnReturn(false);
        dim22.setBreak();
        dim22.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource36 = dim22.functionSourceByName("");
        dim22.contextSwitch((int) (short) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim dim39 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim39.setBreak();
        java.lang.String str42 = dim39.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider43 = null;
        dim39.setScopeProvider(scopeProvider43);
        dim39.setBreakOnReturn(false);
        dim39.setBreakOnExceptions(false);
        dim39.setReturnValue((int) (byte) -1);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback51 = null;
        dim39.setGuiCallback(guiCallback51);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider53 = null;
        dim39.setSourceProvider(sourceProvider53);
        dim39.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = dim0.getObjectProperty((java.lang.Object) dim22, (java.lang.Object) dim39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNull(sourceInfo30);
        org.junit.Assert.assertNull(functionSource36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "undefined" + "'", str42, "undefined");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
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
        dim0.go();
        java.lang.String str16 = dim0.eval("");
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
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
        java.lang.String str18 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo20 = dim0.sourceInfo("");
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertNull(sourceInfo20);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("hi!", "");
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
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
        dim0.contextSwitch((int) '#');
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback22 = null;
        dim0.setGuiCallback(guiCallback22);
        com.google.javascript.rhino.head.tools.debugger.Dim dim24 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim24.setBreak();
        dim24.contextSwitch((int) ' ');
        dim24.go();
        dim24.setBreakOnReturn(true);
        dim24.contextSwitch(4);
        dim24.go();
        dim24.setBreakOnReturn(true);
        dim24.contextSwitch((int) (short) 1);
        dim24.detach();
        dim24.setReturnValue(3);
        dim24.go();
        dim24.setBreakOnEnter(true);
        dim24.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource47 = dim24.functionSourceByName("");
        dim24.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray49 = dim0.getObjectIds((java.lang.Object) dim24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNull(functionSource47);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
        dim0.dispose();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider16 = null;
        dim0.setSourceProvider(sourceProvider16);
        dim0.contextSwitch(4);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
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
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        java.lang.String str18 = dim15.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim15.setScopeProvider(scopeProvider19);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim15.functionSourceByName("undefined");
        dim15.clearAllBreakpoints();
        dim15.go();
        dim15.setReturnValue((int) (short) 1);
        dim15.setBreakOnReturn(false);
        dim15.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData30 = dim15.currentContextData();
        dim15.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim33 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim33.setBreak();
        dim33.dispose();
        dim33.setBreakOnEnter(false);
        dim33.contextSwitch(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData40 = dim33.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider41 = null;
        dim33.setSourceProvider(sourceProvider41);
        dim33.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = dim0.getObjectProperty((java.lang.Object) true, (java.lang.Object) dim33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertNull(functionSource22);
        org.junit.Assert.assertNull(contextData30);
        org.junit.Assert.assertNull(contextData40);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(false);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        java.lang.String str11 = dim0.eval("undefined");
        com.google.javascript.rhino.head.ContextFactory contextFactory12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        dim0.dispose();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        dim12.contextSwitch((int) (byte) 0);
        dim12.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim12.setScopeProvider(scopeProvider18);
        dim12.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim12.setScopeProvider(scopeProvider21);
        dim12.contextSwitch((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray25 = dim0.getObjectIds((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim20 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim20.setBreak();
        dim20.contextSwitch((int) (byte) 0);
        dim20.clearAllBreakpoints();
        dim20.setBreakOnReturn(false);
        dim20.go();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback28 = null;
        dim20.setGuiCallback(guiCallback28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dim0.objectToString((java.lang.Object) guiCallback28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.ContextFactory contextFactory10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback9 = null;
        dim0.setGuiCallback(guiCallback9);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("hi!", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        dim0.setBreakOnReturn(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        org.junit.Assert.assertNull(contextData10);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.setBreak();
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnEnter(true);
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        java.lang.String str17 = dim14.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim14.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim14.functionSourceByName("undefined");
        dim14.clearAllBreakpoints();
        dim14.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData24 = dim14.currentContextData();
        dim14.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider26 = null;
        dim14.setScopeProvider(scopeProvider26);
        java.lang.String[] strArray28 = dim14.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider29 = null;
        dim14.setScopeProvider(scopeProvider29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray31 = dim0.getObjectIds((java.lang.Object) scopeProvider29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(functionSource21);
        org.junit.Assert.assertNull(contextData24);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
        dim0.contextSwitch((int) (short) -1);
        org.junit.Assert.assertNull(sourceInfo8);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("");
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
        java.lang.String str16 = dim0.eval("undefined");
        dim0.setBreakOnReturn(true);
        dim0.detach();
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
        dim0.clearAllBreakpoints();
        dim0.setBreakOnEnter(true);
        java.lang.String[] strArray16 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData25 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider26 = null;
        dim0.setScopeProvider(scopeProvider26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(contextData25);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 100);
        dim0.dispose();
        dim0.detach();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
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
        dim0.go();
        dim0.setBreakOnExceptions(false);
        java.lang.String str17 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo21 = dim0.sourceInfo("");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(sourceInfo21);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        dim0.go();
        java.lang.String str16 = dim0.eval("");
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.detach();
        dim0.setBreakOnReturn(false);
        java.lang.String[] strArray9 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        java.lang.String[] strArray12 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNull(contextData18);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("undefined");
        java.lang.String str18 = dim0.eval("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
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
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnReturn(true);
        java.lang.String str18 = dim0.eval("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
        dim0.contextSwitch(4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource11);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("hi!");
        java.lang.String str14 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData17 = dim0.currentContextData();
        java.lang.String str19 = dim0.eval("hi!");
        java.lang.Class<?> wildcardClass20 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertNull(contextData17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.dispose();
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue(4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
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
        dim0.contextSwitch(100);
        dim0.go();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        dim0.go();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str18 = dim0.eval("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
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
        java.lang.Class<?> wildcardClass19 = strArray18.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
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
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue(2);
        java.lang.String[] strArray17 = dim0.functionNames();
        java.lang.String[] strArray18 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
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
        org.junit.Assert.assertNull(sourceInfo7);
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
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
        dim0.setBreakOnReturn(true);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(false);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        java.lang.String str11 = dim0.eval("undefined");
        dim0.contextSwitch(3);
        java.lang.Class<?> wildcardClass14 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.go();
        dim0.setBreak();
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setReturnValue(5);
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnExceptions(true);
        dim0.detach();
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        java.lang.String str15 = dim12.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider16 = null;
        dim12.setScopeProvider(scopeProvider16);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim12.setGuiCallback(guiCallback18);
        dim12.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData21 = dim12.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider22 = null;
        dim12.setSourceProvider(sourceProvider22);
        dim12.setBreakOnEnter(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = dim0.objectToString((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertNull(contextData21);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        dim0.contextSwitch((int) (byte) 0);
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
        java.lang.String str17 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim0.setGuiCallback(guiCallback18);
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) -1);
        dim0.setReturnValue(0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.Dim dim16 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim16.setBreak();
        java.lang.String str19 = dim16.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim16.setScopeProvider(scopeProvider20);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback22 = null;
        dim16.setGuiCallback(guiCallback22);
        dim16.contextSwitch((int) '4');
        dim16.dispose();
        dim16.setReturnValue((int) (byte) 1);
        dim16.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo32 = dim16.sourceInfo("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = dim0.objectToString((java.lang.Object) sourceInfo32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNull(sourceInfo32);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        java.lang.String[] strArray11 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        dim0.setBreakOnEnter(false);
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
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
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) 'a');
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData17 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) (byte) 0);
        dim18.clearAllBreakpoints();
        dim18.detach();
        dim18.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider26 = null;
        dim18.setScopeProvider(scopeProvider26);
        dim18.dispose();
        java.lang.String str30 = dim18.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData31 = dim18.currentContextData();
        dim18.go();
        dim18.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim35 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim35.setBreak();
        java.lang.String str38 = dim35.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider39 = null;
        dim35.setScopeProvider(scopeProvider39);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback41 = null;
        dim35.setGuiCallback(guiCallback41);
        dim35.contextSwitch((int) '4');
        dim35.dispose();
        dim35.setReturnValue((int) (byte) 1);
        dim35.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData49 = dim35.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider50 = null;
        dim35.setSourceProvider(sourceProvider50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = dim0.getObjectProperty((java.lang.Object) dim18, (java.lang.Object) sourceProvider50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(contextData17);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "undefined" + "'", str30, "undefined");
        org.junit.Assert.assertNull(contextData31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "undefined" + "'", str38, "undefined");
        org.junit.Assert.assertNull(contextData49);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim0.setScopeProvider(scopeProvider13);
        dim0.go();
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback21 = null;
        dim0.setGuiCallback(guiCallback21);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource24 = dim0.functionSourceByName("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNull(functionSource18);
        org.junit.Assert.assertNull(functionSource24);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        java.lang.String str21 = dim18.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim18.setScopeProvider(scopeProvider22);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim18.functionSourceByName("undefined");
        dim18.clearAllBreakpoints();
        java.lang.String[] strArray27 = dim18.functionNames();
        dim18.setBreakOnEnter(false);
        dim18.detach();
        dim18.setBreak();
        dim18.dispose();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray33 = dim0.getObjectIds((java.lang.Object) dim18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
        org.junit.Assert.assertNull(functionSource25);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue((int) ' ');
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
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
        dim0.setReturnValue((int) '4');
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue((int) (byte) -1);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        dim0.setBreakOnExceptions(true);
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback1 = null;
        dim0.setGuiCallback(guiCallback1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider3 = null;
        dim0.setScopeProvider(scopeProvider3);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo6 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertNull(sourceInfo6);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(true);
        java.lang.Class<?> wildcardClass15 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) (byte) 100);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
        dim0.setBreak();
        dim0.go();
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(functionSource13);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) (byte) 100);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("hi!");
        dim0.setReturnValue(100);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim16 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim16.setBreak();
        java.lang.String str19 = dim16.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim16.setScopeProvider(scopeProvider20);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource23 = dim16.functionSourceByName("undefined");
        dim16.clearAllBreakpoints();
        java.lang.String[] strArray25 = dim16.functionNames();
        dim16.setBreakOnEnter(false);
        dim16.clearAllBreakpoints();
        java.lang.String[] strArray29 = dim16.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo31 = dim16.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback32 = null;
        dim16.setGuiCallback(guiCallback32);
        dim16.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider35 = null;
        dim16.setSourceProvider(sourceProvider35);
        dim16.contextSwitch((int) (short) -1);
        dim16.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo42 = dim16.sourceInfo("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray43 = dim0.getObjectIds((java.lang.Object) dim16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNull(functionSource23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNull(sourceInfo31);
        org.junit.Assert.assertNull(sourceInfo42);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider7 = null;
        dim0.setSourceProvider(sourceProvider7);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource4 = dim0.functionSourceByName("");
        java.lang.String[] strArray5 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.go();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(functionSource4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        java.lang.String str17 = dim14.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim14.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim14.functionSourceByName("undefined");
        dim14.clearAllBreakpoints();
        dim14.go();
        dim14.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData25 = dim14.currentContextData();
        dim14.setBreakOnReturn(true);
        dim14.detach();
        java.lang.String str30 = dim14.eval("");
        dim14.setBreakOnExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray33 = dim0.getObjectIds((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(functionSource21);
        org.junit.Assert.assertNull(contextData25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "undefined" + "'", str30, "undefined");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
        org.junit.Assert.assertNull(sourceInfo12);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        dim0.setBreakOnExceptions(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        java.lang.String[] strArray14 = dim0.functionNames();
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        dim0.detach();
        dim0.detach();
        java.lang.String str15 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("");
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider20 = null;
        dim0.setSourceProvider(sourceProvider20);
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertNull(functionSource17);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) -1);
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        java.lang.String str17 = dim14.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim14.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim14.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo23 = dim14.sourceInfo("undefined");
        dim14.dispose();
        dim14.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider26 = null;
        dim14.setSourceProvider(sourceProvider26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray28 = dim0.getObjectIds((java.lang.Object) sourceProvider26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(functionSource21);
        org.junit.Assert.assertNull(sourceInfo23);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        dim0.detach();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = dim0.stringIsCompilableUnit("hi!");
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
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
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
        java.lang.String[] strArray14 = dim0.functionNames();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
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
        dim0.setBreak();
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        int int5 = contextData0.frameCount();
        int int6 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame8 = contextData0.getFrame((int) (byte) 0);
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
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) -1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        dim0.contextSwitch(5);
        dim0.setReturnValue((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo21 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNull(sourceInfo21);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData7 = dim0.currentContextData();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        dim0.go();
        dim0.setBreakOnReturn(true);
        java.lang.String str16 = dim0.eval("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = functionSource17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(functionSource17);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        dim0.contextSwitch(3);
        java.lang.Class<?> wildcardClass17 = dim0.getClass();
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
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
        dim0.dispose();
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider17 = null;
        dim0.setSourceProvider(sourceProvider17);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        dim0.setBreakOnExceptions(false);
        java.lang.String[] strArray17 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData18 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNull(contextData18);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider15 = null;
        dim0.setSourceProvider(sourceProvider15);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        dim19.contextSwitch((int) (byte) 0);
        dim19.clearAllBreakpoints();
        dim19.detach();
        dim19.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider27 = null;
        dim19.setScopeProvider(scopeProvider27);
        dim19.dispose();
        java.lang.String str31 = dim19.eval("hi!");
        java.lang.String[] strArray32 = dim19.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback33 = null;
        dim19.setGuiCallback(guiCallback33);
        dim19.dispose();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = dim0.getObjectProperty((java.lang.Object) (byte) -1, (java.lang.Object) dim19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "undefined" + "'", str31, "undefined");
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) -1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.contextSwitch((int) (short) 0);
        java.lang.String str9 = dim0.eval("undefined");
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "undefined" + "'", str9, "undefined");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider15 = null;
        dim0.setSourceProvider(sourceProvider15);
        java.lang.String[] strArray17 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource14);
        org.junit.Assert.assertNull(contextData15);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) -1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        dim0.contextSwitch(5);
        dim0.setReturnValue((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
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
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData16 = dim0.currentContextData();
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertNull(contextData16);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        java.lang.String str16 = dim13.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim13.setScopeProvider(scopeProvider17);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource20 = dim13.functionSourceByName("undefined");
        dim13.clearAllBreakpoints();
        java.lang.String[] strArray22 = dim13.functionNames();
        dim13.setBreakOnEnter(false);
        dim13.clearAllBreakpoints();
        java.lang.String[] strArray26 = dim13.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo28 = dim13.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo30 = dim13.sourceInfo("undefined");
        dim13.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo33 = dim13.sourceInfo("undefined");
        dim13.clearAllBreakpoints();
        dim13.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim37 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim37.setBreak();
        dim37.dispose();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = dim0.getObjectProperty((java.lang.Object) dim13, (java.lang.Object) dim37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNull(functionSource20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(sourceInfo28);
        org.junit.Assert.assertNull(sourceInfo30);
        org.junit.Assert.assertNull(sourceInfo33);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
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
        dim0.clearAllBreakpoints();
        dim0.setBreakOnEnter(true);
        dim0.go();
        dim0.setBreakOnReturn(false);
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
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
        dim0.setReturnValue((int) 'a');
        com.google.javascript.rhino.head.tools.debugger.Dim dim16 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim16.setBreak();
        dim16.contextSwitch((int) ' ');
        dim16.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider21 = null;
        dim16.setSourceProvider(sourceProvider21);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo24 = dim16.sourceInfo("");
        dim16.setBreakOnReturn(false);
        dim16.setBreak();
        dim16.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo30 = dim16.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider31 = null;
        dim16.setSourceProvider(sourceProvider31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray33 = dim0.getObjectIds((java.lang.Object) sourceProvider31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(sourceInfo24);
        org.junit.Assert.assertNull(sourceInfo30);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        com.google.javascript.rhino.head.ContextFactory contextFactory8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
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
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim0.setGuiCallback(guiCallback17);
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
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
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback19 = null;
        dim0.setGuiCallback(guiCallback19);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider21 = null;
        dim0.setSourceProvider(sourceProvider21);
        dim0.setReturnValue((int) (short) -1);
        dim0.contextSwitch((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.detach();
        java.lang.String[] strArray10 = dim0.functionNames();
        java.lang.String[] strArray11 = dim0.functionNames();
        java.lang.String[] strArray12 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim0.setScopeProvider(scopeProvider13);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("undefined");
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(functionSource17);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
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
        dim0.setBreakOnReturn(true);
        dim0.clearAllBreakpoints();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        dim0.go();
        java.lang.String str16 = dim0.eval("");
        dim0.setBreak();
        dim0.setReturnValue(10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNull(sourceInfo18);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("undefined");
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider17 = null;
        dim0.setSourceProvider(sourceProvider17);
        dim0.setBreakOnEnter(false);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(true);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        dim0.detach();
        java.lang.String[] strArray16 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.detach();
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        java.lang.Class<?> wildcardClass14 = dim0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource17);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame12 = contextData0.getFrame(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -6 ?? [0, 0)");
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
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        dim0.setBreakOnExceptions(true);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNull(contextData10);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
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
        dim0.setBreak();
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame17 = contextData0.getFrame(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -3 ?? [0, 0)");
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
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
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
        java.lang.String[] strArray15 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider16 = null;
        dim0.setScopeProvider(scopeProvider16);
        dim0.dispose();
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnExceptions(true);
        dim0.detach();
        java.lang.String str9 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        dim10.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim10.setGuiCallback(guiCallback14);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData16 = dim10.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim10.setGuiCallback(guiCallback17);
        dim10.setBreakOnEnter(false);
        java.lang.String[] strArray21 = dim10.functionNames();
        java.lang.Class<?> wildcardClass22 = dim10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray23 = dim0.getObjectIds((java.lang.Object) dim10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "undefined" + "'", str9, "undefined");
        org.junit.Assert.assertNull(contextData16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource13);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.detach();
        dim0.setReturnValue((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.setReturnValue((int) (short) 100);
        dim0.setBreakOnEnter(false);
        dim0.setBreakOnEnter(false);
        dim0.dispose();
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData16 = dim0.currentContextData();
        dim0.dispose();
        dim0.setReturnValue((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(contextData16);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        dim10.contextSwitch((int) (byte) 0);
        dim10.clearAllBreakpoints();
        dim10.detach();
        dim10.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim10.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider20 = null;
        dim10.setSourceProvider(sourceProvider20);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo23 = dim10.sourceInfo("");
        dim10.dispose();
        dim10.detach();
        dim10.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo28 = dim10.sourceInfo("undefined");
        java.lang.String[] strArray29 = dim10.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray30 = dim0.getObjectIds((java.lang.Object) dim10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo23);
        org.junit.Assert.assertNull(sourceInfo28);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.setReturnValue(10);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource9);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        java.lang.String str9 = dim0.eval("hi!");
        dim0.contextSwitch((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "undefined" + "'", str9, "undefined");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray8 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.detach();
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnEnter(false);
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
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
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
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
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim0.setGuiCallback(guiCallback18);
        com.google.javascript.rhino.head.tools.debugger.Dim dim20 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim20.setBreak();
        java.lang.String str23 = dim20.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider24 = null;
        dim20.setScopeProvider(scopeProvider24);
        dim20.setBreakOnReturn(false);
        dim20.setBreakOnExceptions(false);
        dim20.setReturnValue((int) (byte) -1);
        dim20.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider34 = null;
        dim20.setSourceProvider(sourceProvider34);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData36 = dim20.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource38 = dim20.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider39 = null;
        dim20.setScopeProvider(scopeProvider39);
        java.lang.String[] strArray41 = dim20.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = dim0.objectToString((java.lang.Object) strArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "undefined" + "'", str23, "undefined");
        org.junit.Assert.assertNull(contextData36);
        org.junit.Assert.assertNull(functionSource38);
        org.junit.Assert.assertNotNull(strArray41);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData15 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(contextData15);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        dim0.setBreak();
        dim0.setBreak();
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
        dim0.setBreak();
        com.google.javascript.rhino.head.ContextFactory contextFactory17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        java.lang.String[] strArray8 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("hi!");
        java.lang.String str12 = dim0.eval("");
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(sourceInfo10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        java.lang.String str14 = dim11.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim11.setScopeProvider(scopeProvider15);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim11.setGuiCallback(guiCallback17);
        dim11.contextSwitch((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = dim0.objectToString((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData19 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim20 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim20.setBreak();
        dim20.contextSwitch((int) ' ');
        dim20.go();
        dim20.setBreakOnReturn(true);
        dim20.contextSwitch(4);
        dim20.go();
        dim20.setBreakOnReturn(true);
        dim20.contextSwitch((int) (short) 1);
        dim20.detach();
        dim20.setReturnValue(3);
        dim20.go();
        dim20.setBreakOnEnter(true);
        dim20.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource43 = dim20.functionSourceByName("");
        dim20.go();
        dim20.dispose();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = dim0.objectToString((java.lang.Object) dim20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(contextData19);
        org.junit.Assert.assertNull(functionSource43);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
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
        dim0.contextSwitch((int) '#');
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback22 = null;
        dim0.setGuiCallback(guiCallback22);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider24 = null;
        dim0.setScopeProvider(scopeProvider24);
        com.google.javascript.rhino.head.tools.debugger.Dim dim26 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim26.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback28 = null;
        dim26.setGuiCallback(guiCallback28);
        dim26.clearAllBreakpoints();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray31 = dim0.getObjectIds((java.lang.Object) dim26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) -1);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnReturn(true);
        dim0.detach();
        dim0.setBreakOnExceptions(true);
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource13);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
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
        dim0.clearAllBreakpoints();
        java.lang.Class<?> wildcardClass14 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        java.lang.String str16 = dim0.eval("");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
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
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        java.lang.Class<?> wildcardClass14 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.setBreakOnExceptions(true);
        dim0.contextSwitch((int) (short) 10);
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        dim0.setBreak();
        dim0.contextSwitch(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.setBreak();
        dim0.contextSwitch(10);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
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
        java.lang.String[] strArray14 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider15 = null;
        dim0.setSourceProvider(sourceProvider15);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.go();
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
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
        dim0.setBreakOnEnter(true);
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
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
        dim0.detach();
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
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("hi!");
        dim0.contextSwitch(5);
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource16);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("undefined");
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(sourceInfo10);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        dim0.setReturnValue(4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        dim0.contextSwitch((int) (short) -1);
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnExceptions(true);
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback39 = null;
        dim23.setGuiCallback(guiCallback39);
        dim23.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider42 = null;
        dim23.setSourceProvider(sourceProvider42);
        dim23.contextSwitch((int) (short) -1);
        dim23.setBreakOnReturn(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = dim0.objectToString((java.lang.Object) dim23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "undefined" + "'", str26, "undefined");
        org.junit.Assert.assertNull(functionSource30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNull(sourceInfo38);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        java.lang.String[] strArray15 = dim0.functionNames();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo18 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(sourceInfo18);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
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
        dim0.go();
        java.lang.String str16 = dim0.eval("");
        java.lang.String str18 = dim0.eval("");
        dim0.contextSwitch(100);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim0.setScopeProvider(scopeProvider21);
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim0.setScopeProvider(scopeProvider13);
        dim0.setReturnValue(4);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider17 = null;
        dim0.setSourceProvider(sourceProvider17);
        dim0.dispose();
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo21 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback22 = null;
        dim0.setGuiCallback(guiCallback22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(sourceInfo21);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        java.lang.String[] strArray8 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("hi!");
        dim0.contextSwitch((int) (short) 0);
        com.google.javascript.rhino.head.ContextFactory contextFactory13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(sourceInfo10);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("");
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo7 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertNull(sourceInfo7);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
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
        dim0.contextSwitch((int) (short) 10);
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        dim0.contextSwitch((int) 'a');
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
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
        java.lang.String str16 = dim0.eval("undefined");
        dim0.go();
        java.lang.String str19 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData20 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData21 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNull(contextData20);
        org.junit.Assert.assertNull(contextData21);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
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
        java.lang.String str16 = dim0.eval("undefined");
        dim0.go();
        java.lang.String str19 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo21 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNull(sourceInfo21);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnReturn(true);
        java.lang.Class<?> wildcardClass10 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider16 = null;
        dim0.setScopeProvider(scopeProvider16);
        dim0.contextSwitch((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
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
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData15 = dim0.currentContextData();
        dim0.contextSwitch(100);
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNull(contextData15);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(false);
        dim0.go();
        dim0.go();
        java.lang.String str10 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "undefined" + "'", str10, "undefined");
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
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
        dim0.setBreak();
        java.lang.String str17 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(functionSource19);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame19 = contextData0.getFrame((-1));
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(true);
        dim0.detach();
        dim0.go();
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
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
        dim0.dispose();
        dim0.contextSwitch((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
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
        dim0.setReturnValue((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
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
        dim0.dispose();
        java.lang.String str16 = dim0.eval("undefined");
        dim0.setReturnValue(10);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource20 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNull(functionSource20);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
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
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim0.functionSourceByName("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(functionSource21);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider16 = null;
        dim0.setSourceProvider(sourceProvider16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
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
        java.lang.String str16 = dim0.eval("");
        java.lang.String str18 = dim0.eval("");
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(true);
        dim0.contextSwitch((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
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
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData16 = dim0.currentContextData();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData16);
        org.junit.Assert.assertNull(functionSource19);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo7 = dim0.sourceInfo("hi!");
        dim0.setBreak();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        java.lang.String str13 = dim10.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim10.setScopeProvider(scopeProvider14);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim10.functionSourceByName("undefined");
        dim10.setReturnValue((int) 'a');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo21 = dim10.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData22 = dim10.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback23 = null;
        dim10.setGuiCallback(guiCallback23);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData25 = dim10.currentContextData();
        dim10.setBreakOnReturn(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = dim0.objectToString((java.lang.Object) dim10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertNull(sourceInfo21);
        org.junit.Assert.assertNull(contextData22);
        org.junit.Assert.assertNull(contextData25);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        dim0.detach();
        java.lang.String[] strArray19 = dim0.functionNames();
        java.lang.String str21 = dim0.eval("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setBreakOnEnter(true);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("");
        dim0.contextSwitch((int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        java.lang.String str22 = dim19.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim19.setScopeProvider(scopeProvider23);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource26 = dim19.functionSourceByName("undefined");
        dim19.clearAllBreakpoints();
        java.lang.String[] strArray28 = dim19.functionNames();
        dim19.dispose();
        dim19.setBreakOnExceptions(false);
        dim19.setBreakOnEnter(false);
        dim19.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback35 = null;
        dim19.setGuiCallback(guiCallback35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = dim0.objectToString((java.lang.Object) dim19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
        org.junit.Assert.assertNull(functionSource26);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
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
        java.lang.String str17 = dim0.eval("");
        java.lang.String[] strArray18 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        java.lang.String[] strArray15 = dim0.functionNames();
        java.lang.String[] strArray16 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.detach();
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        dim0.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData20 = dim0.currentContextData();
        com.google.javascript.rhino.head.ContextFactory contextFactory21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(contextData20);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.contextSwitch(4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNull(functionSource9);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
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
        dim0.setBreakOnReturn(true);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        java.lang.String str21 = dim18.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim18.setScopeProvider(scopeProvider22);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback24 = null;
        dim18.setGuiCallback(guiCallback24);
        dim18.contextSwitch((int) '4');
        dim18.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider29 = null;
        dim18.setSourceProvider(sourceProvider29);
        dim18.setBreakOnExceptions(false);
        dim18.setBreakOnExceptions(false);
        dim18.clearAllBreakpoints();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray36 = dim0.getObjectIds((java.lang.Object) dim18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
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
        java.lang.String str19 = dim0.eval("");
        dim0.setBreakOnEnter(false);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim0.setScopeProvider(scopeProvider23);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo26 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider27 = null;
        dim0.setSourceProvider(sourceProvider27);
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNull(sourceInfo26);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreakOnExceptions(false);
        dim0.detach();
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = dim0.getObjectIds(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
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
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("undefined");
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("hi!");
        java.lang.String str14 = dim0.eval("");
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        java.lang.String str16 = dim13.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim13.setScopeProvider(scopeProvider17);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback19 = null;
        dim13.setGuiCallback(guiCallback19);
        dim13.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider22 = null;
        dim13.setSourceProvider(sourceProvider22);
        java.lang.String[] strArray24 = dim13.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback25 = null;
        dim13.setGuiCallback(guiCallback25);
        dim13.setBreakOnEnter(false);
        dim13.contextSwitch((int) ' ');
        dim13.setBreakOnExceptions(true);
        dim13.setReturnValue((int) (short) 100);
        com.google.javascript.rhino.head.tools.debugger.Dim dim35 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim35.setBreak();
        dim35.contextSwitch((int) ' ');
        dim35.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider40 = null;
        dim35.setSourceProvider(sourceProvider40);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo43 = dim35.sourceInfo("");
        dim35.setBreakOnReturn(false);
        dim35.setBreak();
        dim35.contextSwitch((int) 'a');
        java.lang.String str50 = dim35.eval("hi!");
        dim35.setBreakOnEnter(false);
        dim35.go();
        dim35.contextSwitch((int) (short) 0);
        dim35.setBreakOnReturn(false);
        dim35.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = dim0.getObjectProperty((java.lang.Object) (short) 100, (java.lang.Object) dim35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNull(sourceInfo43);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "undefined" + "'", str50, "undefined");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
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
        dim0.setReturnValue((int) (short) 100);
        java.lang.String str18 = dim0.eval("undefined");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
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
        dim0.go();
        java.lang.String str16 = dim0.eval("");
        java.lang.String str18 = dim0.eval("");
        dim0.contextSwitch(100);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim0.setScopeProvider(scopeProvider21);
        dim0.setReturnValue((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData17 = dim0.currentContextData();
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData17);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        dim0.setBreak();
        dim0.setBreakOnReturn(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.detach();
        java.lang.String str10 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "undefined" + "'", str10, "undefined");
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.go();
        dim0.clearAllBreakpoints();
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.dispose();
        dim0.setReturnValue(5);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("");
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        java.lang.String str20 = dim17.eval("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray21 = dim0.getObjectIds((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray13 = dim0.functionNames();
        dim0.detach();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNull(functionSource11);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        java.lang.String str13 = dim0.eval("hi!");
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
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
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        dim0.setBreak();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("");
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        dim0.go();
        dim0.setReturnValue(10);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue(4);
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        dim17.contextSwitch((int) (byte) 0);
        dim17.clearAllBreakpoints();
        dim17.detach();
        dim17.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider25 = null;
        dim17.setScopeProvider(scopeProvider25);
        dim17.dispose();
        java.lang.String str29 = dim17.eval("hi!");
        java.lang.String[] strArray30 = dim17.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback31 = null;
        dim17.setGuiCallback(guiCallback31);
        dim17.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData34 = dim17.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray35 = dim0.getObjectIds((java.lang.Object) contextData34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(contextData9);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "undefined" + "'", str29, "undefined");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNull(contextData34);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
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
        dim0.setBreakOnReturn(false);
        dim0.setReturnValue((int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
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
        dim0.setBreak();
        dim0.setBreakOnExceptions(false);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource24 = dim0.functionSourceByName("undefined");
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(functionSource24);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        dim0.setBreakOnReturn(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        dim0.go();
        dim0.setBreak();
        java.lang.String str17 = dim0.eval("hi!");
        dim0.setReturnValue(5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
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
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim0.setGuiCallback(guiCallback17);
        java.lang.String[] strArray19 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("");
        dim0.contextSwitch((int) (byte) 10);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("undefined");
        dim0.go();
        dim0.setBreak();
        java.lang.String str16 = dim0.eval("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback2 = null;
        dim0.setGuiCallback(guiCallback2);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(true);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim dim9 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim9.setBreak();
        java.lang.String str12 = dim9.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim9.setScopeProvider(scopeProvider13);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim9.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo18 = dim9.sourceInfo("undefined");
        dim9.dispose();
        dim9.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim9.setScopeProvider(scopeProvider21);
        dim9.go();
        dim9.setReturnValue((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = dim0.objectToString((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertNull(sourceInfo18);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider15 = null;
        dim0.setSourceProvider(sourceProvider15);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        dim0.setBreakOnReturn(true);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String str8 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("");
        dim0.clearAllBreakpoints();
        java.lang.String str13 = dim0.eval("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
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
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(true);
        dim0.setReturnValue(5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
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
        java.lang.String str19 = dim0.eval("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnExceptions(true);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
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
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(true);
        dim0.go();
        com.google.javascript.rhino.head.ContextFactory contextFactory17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame14 = contextData0.getFrame((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -36 ?? [0, 0)");
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
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim0.setScopeProvider(scopeProvider13);
        dim0.contextSwitch((-1));
        dim0.go();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNull(functionSource11);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
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
        dim0.setReturnValue((int) (byte) 100);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider16 = null;
        dim0.setSourceProvider(sourceProvider16);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("hi!");
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource19);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(false);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        org.junit.Assert.assertNull(functionSource9);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
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
        java.lang.String str16 = dim0.eval("");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim0.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.Dim dim20 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim20.setBreak();
        dim20.contextSwitch((int) ' ');
        dim20.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider25 = null;
        dim20.setSourceProvider(sourceProvider25);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo28 = dim20.sourceInfo("");
        dim20.setReturnValue(100);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource32 = dim20.functionSourceByName("hi!");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider33 = null;
        dim20.setSourceProvider(sourceProvider33);
        dim20.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback36 = null;
        dim20.setGuiCallback(guiCallback36);
        java.lang.String[] strArray38 = dim20.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = dim0.objectToString((java.lang.Object) strArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNull(sourceInfo28);
        org.junit.Assert.assertNull(functionSource32);
        org.junit.Assert.assertNotNull(strArray38);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("hi!");
        dim0.go();
        dim0.setBreakOnExceptions(true);
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray14 = dim0.functionNames();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNull(functionSource8);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
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
        dim0.setReturnValue((int) '#');
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        dim15.contextSwitch((int) ' ');
        java.lang.String[] strArray19 = dim15.functionNames();
        dim15.setBreakOnExceptions(false);
        dim15.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider23 = null;
        dim15.setSourceProvider(sourceProvider23);
        dim15.setBreak();
        dim15.setBreakOnEnter(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = dim0.objectToString((java.lang.Object) dim15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider22 = null;
        dim0.setSourceProvider(sourceProvider22);
        dim0.setBreak();
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        dim0.go();
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("hi!");
        dim0.clearAllBreakpoints();
        java.lang.String str18 = dim0.eval("");
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
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
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.setReturnValue((int) 'a');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        dim0.go();
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        dim0.setReturnValue(4);
        dim0.contextSwitch(4);
        dim0.setBreak();
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        java.lang.String str10 = dim0.eval("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "undefined" + "'", str10, "undefined");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.detach();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("hi!");
        java.lang.String[] strArray11 = dim0.functionNames();
        java.lang.String[] strArray12 = dim0.functionNames();
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource28 = dim13.functionSourceByName("");
        java.lang.String str30 = dim13.eval("hi!");
        dim13.contextSwitch(0);
        dim13.detach();
        dim13.clearAllBreakpoints();
        dim13.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray36 = dim0.getObjectIds((java.lang.Object) dim13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "undefined" + "'", str25, "undefined");
        org.junit.Assert.assertNull(contextData26);
        org.junit.Assert.assertNull(functionSource28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "undefined" + "'", str30, "undefined");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
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
        dim0.setBreakOnExceptions(true);
        dim0.setBreak();
        dim0.contextSwitch(3);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo24 = dim0.sourceInfo("undefined");
        java.lang.Object obj25 = null;
        com.google.javascript.rhino.head.tools.debugger.Dim dim26 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray27 = dim26.functionNames();
        dim26.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource30 = dim26.functionSourceByName("");
        java.lang.String[] strArray31 = dim26.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = dim0.getObjectProperty(obj25, (java.lang.Object) strArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(sourceInfo24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNull(functionSource30);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) -1);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("hi!");
        dim0.setReturnValue(5);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim20 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim20.setBreak();
        dim20.contextSwitch((int) (byte) 0);
        dim20.clearAllBreakpoints();
        dim20.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource27 = dim20.functionSourceByName("");
        dim20.setBreak();
        dim20.dispose();
        dim20.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider31 = null;
        dim20.setSourceProvider(sourceProvider31);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo34 = dim20.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider35 = null;
        dim20.setSourceProvider(sourceProvider35);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider37 = null;
        dim20.setSourceProvider(sourceProvider37);
        com.google.javascript.rhino.head.tools.debugger.Dim dim39 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim39.setBreak();
        dim39.contextSwitch((int) ' ');
        dim39.go();
        dim39.setBreak();
        dim39.dispose();
        java.lang.String str47 = dim39.eval("undefined");
        dim39.setBreakOnReturn(true);
        dim39.dispose();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = dim0.getObjectProperty((java.lang.Object) dim20, (java.lang.Object) dim39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNull(functionSource27);
        org.junit.Assert.assertNull(sourceInfo34);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "undefined" + "'", str47, "undefined");
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        java.lang.String[] strArray8 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("hi!");
        dim0.contextSwitch((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(sourceInfo10);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("");
        dim0.setBreakOnReturn(false);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("");
        dim0.contextSwitch((int) 'a');
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
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
        dim0.contextSwitch((int) (byte) 1);
        dim0.setBreak();
        dim0.setBreakOnReturn(true);
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim0.setScopeProvider(scopeProvider14);
        com.google.javascript.rhino.head.tools.debugger.Dim dim16 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim16.setBreak();
        dim16.contextSwitch((int) (byte) 0);
        dim16.clearAllBreakpoints();
        dim16.dispose();
        dim16.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData24 = dim16.currentContextData();
        dim16.go();
        dim16.setBreak();
        dim16.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = dim0.objectToString((java.lang.Object) dim16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(contextData24);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider17 = null;
        dim0.setSourceProvider(sourceProvider17);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData21 = dim0.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(contextData21);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
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
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        dim0.go();
        java.lang.String[] strArray14 = dim0.functionNames();
        dim0.detach();
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("hi!");
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertNull(sourceInfo9);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
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
        com.google.javascript.rhino.head.ContextFactory contextFactory17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("");
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
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
        dim0.go();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource14);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData7 = dim0.currentContextData();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData7);
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("");
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        dim0.setBreak();
        dim0.detach();
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray17 = dim13.functionNames();
        dim13.setBreakOnEnter(false);
        dim13.setReturnValue((int) (byte) 100);
        dim13.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData23 = dim13.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim13.functionSourceByName("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray26 = dim0.getObjectIds((java.lang.Object) functionSource25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNull(contextData23);
        org.junit.Assert.assertNull(functionSource25);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource11);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
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
        java.lang.String[] strArray12 = dim0.functionNames();
        com.google.javascript.rhino.head.ContextFactory contextFactory13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData9);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
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
        dim0.setBreakOnExceptions(true);
        dim0.contextSwitch((-1));
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
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
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo20 = dim0.sourceInfo("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider24 = null;
        dim0.setSourceProvider(sourceProvider24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(sourceInfo20);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider25 = null;
        dim0.setScopeProvider(scopeProvider25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(functionSource20);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
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
        dim0.contextSwitch((int) (byte) 1);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        dim19.contextSwitch((int) (byte) 0);
        dim19.clearAllBreakpoints();
        dim19.dispose();
        dim19.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource28 = dim19.functionSourceByName("undefined");
        java.lang.String[] strArray29 = dim19.functionNames();
        dim19.go();
        java.lang.String str32 = dim19.eval("hi!");
        dim19.setBreakOnExceptions(true);
        dim19.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim37 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim37.setBreak();
        dim37.contextSwitch((int) ' ');
        java.lang.String[] strArray41 = dim37.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider42 = null;
        dim37.setScopeProvider(scopeProvider42);
        dim37.setBreakOnEnter(true);
        java.lang.String str47 = dim37.eval("hi!");
        dim37.setReturnValue(4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = dim0.getObjectProperty((java.lang.Object) false, (java.lang.Object) dim37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "undefined" + "'", str32, "undefined");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "undefined" + "'", str47, "undefined");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        dim0.setBreakOnExceptions(false);
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray12 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) (byte) 0);
        dim13.clearAllBreakpoints();
        dim13.clearAllBreakpoints();
        dim13.contextSwitch((int) (byte) -1);
        dim13.setBreakOnEnter(false);
        dim13.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider24 = null;
        dim13.setScopeProvider(scopeProvider24);
        java.lang.Class<?> wildcardClass26 = dim13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray27 = dim0.getObjectIds((java.lang.Object) dim13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        java.lang.String str18 = dim15.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim15.setScopeProvider(scopeProvider19);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback21 = null;
        dim15.setGuiCallback(guiCallback21);
        dim15.contextSwitch((int) '4');
        dim15.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo27 = dim15.sourceInfo("undefined");
        dim15.detach();
        dim15.setBreakOnExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray31 = dim0.getObjectIds((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertNull(sourceInfo27);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.detach();
        dim0.clearAllBreakpoints();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        dim11.contextSwitch((int) ' ');
        java.lang.String[] strArray15 = dim11.functionNames();
        dim11.setBreakOnExceptions(false);
        dim11.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource20 = dim11.functionSourceByName("undefined");
        java.lang.String str22 = dim11.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource24 = dim11.functionSourceByName("undefined");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray25 = dim0.getObjectIds((java.lang.Object) dim11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(functionSource20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
        org.junit.Assert.assertNull(functionSource24);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
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
        dim0.detach();
        dim0.setBreakOnExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) (byte) 0);
        dim13.clearAllBreakpoints();
        dim13.dispose();
        dim13.setBreakOnExceptions(true);
        java.lang.String[] strArray21 = dim13.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo23 = dim13.sourceInfo("");
        dim13.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback25 = null;
        dim13.setGuiCallback(guiCallback25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = dim0.objectToString((java.lang.Object) guiCallback25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNull(sourceInfo23);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
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
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        java.lang.String str20 = dim17.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim17.setScopeProvider(scopeProvider21);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback23 = null;
        dim17.setGuiCallback(guiCallback23);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback25 = null;
        dim17.setGuiCallback(guiCallback25);
        dim17.setBreak();
        dim17.setBreakOnExceptions(false);
        dim17.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource33 = dim17.functionSourceByName("undefined");
        dim17.detach();
        java.lang.String str36 = dim17.eval("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = dim0.objectToString((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
        org.junit.Assert.assertNull(functionSource33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "undefined" + "'", str36, "undefined");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.detach();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("hi!", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(functionSource16);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
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
        dim0.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        org.junit.Assert.assertNull(functionSource11);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider16 = null;
        dim0.setSourceProvider(sourceProvider16);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider18 = null;
        dim0.setSourceProvider(sourceProvider18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
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
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("");
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback21 = null;
        dim0.setGuiCallback(guiCallback21);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo24 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertNull(functionSource18);
        org.junit.Assert.assertNull(sourceInfo24);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("");
        dim0.setReturnValue((int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource11);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim dim16 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim16.setBreak();
        java.lang.String str19 = dim16.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim16.setScopeProvider(scopeProvider20);
        dim16.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback24 = null;
        dim16.setGuiCallback(guiCallback24);
        dim16.dispose();
        dim16.detach();
        java.lang.String str29 = dim16.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim dim30 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim30.setBreak();
        dim30.contextSwitch((int) ' ');
        dim30.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider35 = null;
        dim30.setSourceProvider(sourceProvider35);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo38 = dim30.sourceInfo("");
        dim30.setBreakOnReturn(false);
        dim30.setBreak();
        dim30.setBreak();
        java.lang.Class<?> wildcardClass43 = dim30.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = dim0.getObjectProperty((java.lang.Object) dim16, (java.lang.Object) wildcardClass43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "undefined" + "'", str29, "undefined");
        org.junit.Assert.assertNull(sourceInfo38);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) -1);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("hi!");
        dim0.setReturnValue(5);
        dim0.setBreakOnEnter(false);
        dim0.setBreakOnReturn(false);
        java.lang.String[] strArray22 = dim0.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim0.setScopeProvider(scopeProvider14);
        java.lang.String str17 = dim0.eval("");
        dim0.contextSwitch(0);
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        dim0.setBreakOnReturn(false);
        dim0.go();
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback2 = null;
        dim0.setGuiCallback(guiCallback2);
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnEnter(false);
        dim0.dispose();
        org.junit.Assert.assertNull(functionSource8);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnExceptions(true);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim8 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim8.setBreak();
        dim8.contextSwitch((int) ' ');
        dim8.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim8.setSourceProvider(sourceProvider13);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim8.sourceInfo("");
        dim8.setBreakOnReturn(false);
        dim8.setBreak();
        dim8.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim8.setScopeProvider(scopeProvider21);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo24 = dim8.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback25 = null;
        dim8.setGuiCallback(guiCallback25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray27 = dim0.getObjectIds((java.lang.Object) guiCallback25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo16);
        org.junit.Assert.assertNull(sourceInfo24);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(functionSource19);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame14 = contextData0.getFrame((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -33 ?? [0, 0)");
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
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreakOnEnter(true);
        dim0.setReturnValue(3);
        com.google.javascript.rhino.head.ContextFactory contextFactory12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData21 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim22 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim22.setBreak();
        java.lang.String str25 = dim22.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider26 = null;
        dim22.setScopeProvider(scopeProvider26);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback28 = null;
        dim22.setGuiCallback(guiCallback28);
        dim22.contextSwitch((int) '4');
        dim22.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider33 = null;
        dim22.setSourceProvider(sourceProvider33);
        dim22.setBreakOnExceptions(false);
        java.lang.String str38 = dim22.eval("undefined");
        dim22.go();
        java.lang.String str41 = dim22.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData42 = dim22.currentContextData();
        dim22.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim44 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim44.setBreak();
        java.lang.String str47 = dim44.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider48 = null;
        dim44.setScopeProvider(scopeProvider48);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource51 = dim44.functionSourceByName("undefined");
        dim44.clearAllBreakpoints();
        dim44.go();
        java.lang.String str55 = dim44.eval("hi!");
        dim44.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider57 = null;
        dim44.setScopeProvider(scopeProvider57);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo60 = dim44.sourceInfo("undefined");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj61 = dim0.getObjectProperty((java.lang.Object) dim22, (java.lang.Object) dim44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "undefined" + "'", str25, "undefined");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "undefined" + "'", str38, "undefined");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "undefined" + "'", str41, "undefined");
        org.junit.Assert.assertNull(contextData42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "undefined" + "'", str47, "undefined");
        org.junit.Assert.assertNull(functionSource51);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "undefined" + "'", str55, "undefined");
        org.junit.Assert.assertNull(sourceInfo60);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnExceptions(true);
        dim0.detach();
        dim0.setReturnValue((int) 'a');
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("undefined");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData17 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider18 = null;
        dim0.setSourceProvider(sourceProvider18);
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource13);
        org.junit.Assert.assertNull(sourceInfo16);
        org.junit.Assert.assertNull(contextData17);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        dim0.setBreakOnExceptions(false);
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray12 = dim0.functionNames();
        java.lang.String[] strArray13 = dim0.functionNames();
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        dim0.setBreakOnExceptions(true);
        dim0.setBreak();
        dim0.detach();
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) -1);
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("undefined");
        dim0.dispose();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.detach();
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
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
        java.lang.String[] strArray19 = dim0.functionNames();
        dim0.go();
        dim0.detach();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
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
        dim0.setBreakOnEnter(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        dim0.setReturnValue(4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        dim0.contextSwitch((int) (short) -1);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        java.lang.String str24 = dim21.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider25 = null;
        dim21.setScopeProvider(scopeProvider25);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource28 = dim21.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo30 = dim21.sourceInfo("undefined");
        dim21.dispose();
        dim21.clearAllBreakpoints();
        dim21.clearAllBreakpoints();
        dim21.setBreakOnExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = dim0.objectToString((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "undefined" + "'", str24, "undefined");
        org.junit.Assert.assertNull(functionSource28);
        org.junit.Assert.assertNull(sourceInfo30);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.setReturnValue((int) (short) 1);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
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
        dim0.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("undefined");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData17 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData18 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource13);
        org.junit.Assert.assertNull(sourceInfo16);
        org.junit.Assert.assertNull(contextData17);
        org.junit.Assert.assertNull(contextData18);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
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
        java.lang.String[] strArray11 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback1 = null;
        dim0.setGuiCallback(guiCallback1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider3 = null;
        dim0.setScopeProvider(scopeProvider3);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnReturn(true);
        java.lang.String str17 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) ' ');
        dim18.setBreakOnEnter(true);
        java.lang.String str25 = dim18.eval("hi!");
        dim18.dispose();
        java.lang.String[] strArray27 = dim18.functionNames();
        dim18.contextSwitch((int) '4');
        dim18.contextSwitch(4);
        com.google.javascript.rhino.head.tools.debugger.Dim dim32 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim32.setBreak();
        dim32.contextSwitch((int) (byte) 0);
        dim32.clearAllBreakpoints();
        dim32.detach();
        dim32.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider40 = null;
        dim32.setScopeProvider(scopeProvider40);
        dim32.contextSwitch(100);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider44 = null;
        dim32.setSourceProvider(sourceProvider44);
        dim32.setBreakOnReturn(false);
        dim32.clearAllBreakpoints();
        dim32.setReturnValue((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = dim0.getObjectProperty((java.lang.Object) 4, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "undefined" + "'", str25, "undefined");
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.clearAllBreakpoints();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData15 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String[] strArray17 = dim0.functionNames();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(contextData15);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame11 = contextData0.getFrame((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -11 ?? [0, 0)");
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
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
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
        dim0.dispose();
        java.lang.String str16 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim0.setGuiCallback(guiCallback17);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider19 = null;
        dim0.setSourceProvider(sourceProvider19);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
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
        java.lang.String[] strArray21 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData22 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNull(contextData22);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
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
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("");
        dim0.contextSwitch((int) (byte) 10);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim0.setScopeProvider(scopeProvider13);
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim0.setScopeProvider(scopeProvider14);
        java.lang.String str17 = dim0.eval("");
        dim0.contextSwitch(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim0.setScopeProvider(scopeProvider20);
        dim0.dispose();
        java.lang.Class<?> wildcardClass23 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo23 = dim0.sourceInfo("");
        java.lang.String[] strArray24 = dim0.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(sourceInfo23);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame15 = contextData0.getFrame(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -2 ?? [0, 0)");
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
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
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
        dim0.clearAllBreakpoints();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "hi!");
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
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo12);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        java.lang.String str13 = dim0.eval("");
        com.google.javascript.rhino.head.ContextFactory contextFactory14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnExceptions(true);
        java.lang.String[] strArray8 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("");
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(sourceInfo10);
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.detach();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) '4');
        dim0.setReturnValue(5);
        dim0.go();
        java.lang.String str17 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("hi!");
        java.lang.String str21 = dim0.eval("hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(functionSource19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        java.lang.String[] strArray11 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        dim0.clearAllBreakpoints();
        java.lang.String str16 = dim0.eval("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.contextSwitch(100);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        java.lang.String str22 = dim19.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim19.setScopeProvider(scopeProvider23);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource26 = dim19.functionSourceByName("undefined");
        dim19.clearAllBreakpoints();
        dim19.go();
        dim19.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData30 = dim19.currentContextData();
        dim19.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim33 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim33.setBreak();
        dim33.contextSwitch((int) (byte) 0);
        dim33.clearAllBreakpoints();
        dim33.dispose();
        dim33.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource42 = dim33.functionSourceByName("undefined");
        java.lang.String[] strArray43 = dim33.functionNames();
        dim33.go();
        java.lang.String[] strArray45 = dim33.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = dim0.getObjectProperty((java.lang.Object) false, (java.lang.Object) dim33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
        org.junit.Assert.assertNull(functionSource26);
        org.junit.Assert.assertNull(contextData30);
        org.junit.Assert.assertNull(functionSource42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray45);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.dispose();
        dim0.setReturnValue(2);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertNull(sourceInfo10);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider16 = null;
        dim0.setSourceProvider(sourceProvider16);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider18 = null;
        dim0.setSourceProvider(sourceProvider18);
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
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
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
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
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnReturn(true);
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
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
        org.junit.Assert.assertNull(functionSource26);
        org.junit.Assert.assertNull(contextData30);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
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
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
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
        dim0.setReturnValue((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = dim0.getClass();
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(false);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        dim10.contextSwitch((int) (byte) 0);
        dim10.clearAllBreakpoints();
        dim10.dispose();
        dim10.setBreakOnReturn(false);
        dim10.clearAllBreakpoints();
        dim10.setReturnValue((int) (short) 10);
        java.lang.String str22 = dim10.eval("hi!");
        dim10.setBreak();
        dim10.dispose();
        dim10.dispose();
        dim10.setBreak();
        dim10.clearAllBreakpoints();
        dim10.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider30 = null;
        dim10.setSourceProvider(sourceProvider30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray32 = dim0.getObjectIds((java.lang.Object) dim10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
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
        java.lang.String str21 = dim0.eval("undefined");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        dim0.contextSwitch(3);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider17 = null;
        dim0.setSourceProvider(sourceProvider17);
        java.lang.Class<?> wildcardClass19 = dim0.getClass();
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
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
        dim0.dispose();
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
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
        dim0.setBreakOnReturn(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dim0.stringIsCompilableUnit("");
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
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim8 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim8.setBreak();
        dim8.contextSwitch((int) (byte) 0);
        dim8.clearAllBreakpoints();
        dim8.detach();
        dim8.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider16 = null;
        dim8.setScopeProvider(scopeProvider16);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider18 = null;
        dim8.setSourceProvider(sourceProvider18);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo21 = dim8.sourceInfo("");
        dim8.dispose();
        dim8.detach();
        dim8.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource26 = dim8.functionSourceByName("undefined");
        dim8.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource29 = dim8.functionSourceByName("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dim0.objectToString((java.lang.Object) dim8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNull(sourceInfo21);
        org.junit.Assert.assertNull(functionSource26);
        org.junit.Assert.assertNull(functionSource29);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource3 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider6 = null;
        dim0.setSourceProvider(sourceProvider6);
        dim0.setReturnValue((int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = dim0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(functionSource3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
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
        dim0.setReturnValue((int) '4');
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(true);
        dim0.dispose();
        dim0.setBreakOnEnter(true);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.setBreakOnEnter(false);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.contextSwitch(100);
        dim0.setBreakOnExceptions(false);
        dim0.clearAllBreakpoints();
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.go();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.setBreak();
        dim0.setReturnValue((int) '#');
        org.junit.Assert.assertNull(functionSource9);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("undefined");
        dim0.contextSwitch((int) 'a');
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(functionSource19);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim20 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim20.setBreak();
        dim20.contextSwitch((int) ' ');
        java.lang.String[] strArray24 = dim20.functionNames();
        dim20.setBreakOnExceptions(false);
        dim20.setBreakOnReturn(false);
        dim20.setBreak();
        java.lang.String[] strArray30 = dim20.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = dim0.objectToString((java.lang.Object) strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
        dim0.go();
        dim0.setBreakOnExceptions(false);
        java.lang.String str17 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(functionSource25);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
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
        dim0.setBreakOnExceptions(true);
        dim0.go();
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.clearAllBreakpoints();
        dim0.setBreak();
        dim0.go();
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.detach();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) '4');
        dim0.setReturnValue(5);
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        dim15.contextSwitch((int) ' ');
        dim15.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider20 = null;
        dim15.setSourceProvider(sourceProvider20);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback22 = null;
        dim15.setGuiCallback(guiCallback22);
        dim15.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = dim0.objectToString((java.lang.Object) dim15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
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
        java.lang.String str19 = dim0.eval("");
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData22 = dim0.currentContextData();
        dim0.dispose();
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNull(contextData22);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame16 = contextData0.getFrame((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -2 ?? [0, 0)");
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
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        java.lang.String[] strArray6 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(sourceInfo8);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
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
        dim0.clearAllBreakpoints();
        dim0.setBreakOnEnter(true);
        dim0.go();
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
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
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        java.lang.String[] strArray8 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(sourceInfo10);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setBreakOnEnter(true);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("");
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("hi!");
        java.lang.String str14 = dim0.eval("");
        dim0.dispose();
        java.lang.String[] strArray16 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim0.setGuiCallback(guiCallback17);
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
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo20 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        java.lang.String str24 = dim21.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider25 = null;
        dim21.setScopeProvider(scopeProvider25);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource28 = dim21.functionSourceByName("undefined");
        dim21.clearAllBreakpoints();
        java.lang.String[] strArray30 = dim21.functionNames();
        dim21.setBreakOnEnter(false);
        dim21.clearAllBreakpoints();
        java.lang.String[] strArray34 = dim21.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo36 = dim21.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource38 = dim21.functionSourceByName("undefined");
        dim21.setBreakOnReturn(true);
        dim21.contextSwitch((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray43 = dim0.getObjectIds((java.lang.Object) dim21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNull(sourceInfo18);
        org.junit.Assert.assertNull(sourceInfo20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "undefined" + "'", str24, "undefined");
        org.junit.Assert.assertNull(functionSource28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNull(sourceInfo36);
        org.junit.Assert.assertNull(functionSource38);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource20 = dim0.functionSourceByName("");
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(functionSource20);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String str9 = dim0.eval("hi!");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "undefined" + "'", str9, "undefined");
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
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
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim0.setScopeProvider(scopeProvider22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource17);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback20 = null;
        dim0.setGuiCallback(guiCallback20);
        com.google.javascript.rhino.head.tools.debugger.Dim dim22 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim22.setBreak();
        java.lang.String str25 = dim22.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider26 = null;
        dim22.setScopeProvider(scopeProvider26);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback28 = null;
        dim22.setGuiCallback(guiCallback28);
        dim22.contextSwitch((int) '4');
        dim22.dispose();
        dim22.setReturnValue((int) (byte) 1);
        dim22.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo38 = dim22.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider39 = null;
        dim22.setScopeProvider(scopeProvider39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray41 = dim0.getObjectIds((java.lang.Object) dim22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "undefined" + "'", str25, "undefined");
        org.junit.Assert.assertNull(sourceInfo38);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim0.setScopeProvider(scopeProvider13);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("");
        dim0.contextSwitch(0);
        dim0.dispose();
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue((int) '#');
        java.lang.Class<?> wildcardClass15 = dim0.getClass();
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.detach();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData9);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.setBreakOnEnter(true);
        dim0.detach();
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
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
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider18 = null;
        dim0.setSourceProvider(sourceProvider18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
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
        dim0.setBreak();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame3 = contextData0.getFrame((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -101 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback9 = null;
        dim0.setGuiCallback(guiCallback9);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("");
        java.lang.String[] strArray13 = dim0.functionNames();
        java.lang.String[] strArray14 = dim0.functionNames();
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.detach();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        java.lang.String[] strArray12 = dim0.functionNames();
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
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
        dim0.dispose();
        dim0.contextSwitch(100);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        java.lang.String str15 = dim0.eval("undefined");
        dim0.go();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue((-1));
        dim0.contextSwitch(10);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("");
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData7 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData7);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.contextSwitch((int) (short) 0);
        java.lang.String str9 = dim0.eval("undefined");
        dim0.setBreakOnReturn(true);
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "undefined" + "'", str9, "undefined");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
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
        dim0.setBreakOnEnter(true);
        java.lang.String[] strArray15 = dim0.functionNames();
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim0.setScopeProvider(scopeProvider13);
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.setBreakOnExceptions(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
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
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertNull(functionSource23);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreakOnExceptions(false);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        dim0.contextSwitch(10);
        dim0.dispose();
        dim0.contextSwitch((int) (short) -1);
        dim0.contextSwitch(4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
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
        java.lang.String[] strArray16 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData17 = dim0.currentContextData();
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNull(contextData17);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
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
        dim0.setBreak();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNull(functionSource13);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        dim19.contextSwitch((int) (byte) 0);
        dim19.clearAllBreakpoints();
        dim19.setBreakOnReturn(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = dim0.objectToString((java.lang.Object) true);
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
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        com.google.javascript.rhino.head.ContextFactory contextFactory14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        dim0.setBreak();
        dim0.setReturnValue((int) '#');
        dim0.contextSwitch(4);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim20 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim20.setBreak();
        dim20.contextSwitch((int) (byte) 0);
        dim20.clearAllBreakpoints();
        dim20.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider26 = null;
        dim20.setScopeProvider(scopeProvider26);
        dim20.detach();
        dim20.setBreakOnReturn(true);
        dim20.contextSwitch((int) '4');
        dim20.setReturnValue(5);
        dim20.go();
        dim20.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray37 = dim0.getObjectIds((java.lang.Object) dim20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        dim0.dispose();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
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
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("");
        java.lang.String str16 = dim0.eval("");
        java.lang.String[] strArray17 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim0.setGuiCallback(guiCallback18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
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
        dim0.go();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim0.setGuiCallback(guiCallback17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
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
        dim0.setBreakOnReturn(false);
        java.lang.String str19 = dim0.eval("undefined");
        dim0.setBreak();
        java.lang.String str22 = dim0.eval("undefined");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String str8 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("");
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
        org.junit.Assert.assertNull(functionSource10);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) 1);
        dim0.setBreakOnExceptions(true);
        dim0.go();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
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
        dim0.detach();
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider6 = null;
        dim0.setSourceProvider(sourceProvider6);
        dim0.clearAllBreakpoints();
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame6 = contextData0.getFrame(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -3 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim0.setScopeProvider(scopeProvider14);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        dim0.setBreakOnReturn(false);
        dim0.dispose();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("hi!", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
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
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider18 = null;
        dim0.setSourceProvider(sourceProvider18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
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
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider21 = null;
        dim0.setSourceProvider(sourceProvider21);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider6 = null;
        dim0.setSourceProvider(sourceProvider6);
        dim0.detach();
    }
}

