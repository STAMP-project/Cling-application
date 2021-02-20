import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(sourceInfo12);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = functionSource19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource19);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        dim14.dispose();
        dim14.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        java.lang.String str22 = dim19.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim19.setScopeProvider(scopeProvider23);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource26 = dim19.functionSourceByName("undefined");
        dim19.clearAllBreakpoints();
        dim19.setBreakOnExceptions(false);
        dim19.dispose();
        dim19.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback33 = null;
        dim19.setGuiCallback(guiCallback33);
        dim19.detach();
        dim19.setBreakOnExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = dim0.getObjectProperty((java.lang.Object) dim14, (java.lang.Object) dim19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
        org.junit.Assert.assertNull(functionSource26);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim16 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim16.setBreak();
        java.lang.String[] strArray18 = dim16.functionNames();
        dim16.contextSwitch(100);
        java.lang.Class<?> wildcardClass21 = dim16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray22 = dim0.getObjectIds((java.lang.Object) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.dispose();
        java.lang.String[] strArray9 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("undefined");
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(functionSource11);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        dim0.go();
        dim0.setBreakOnEnter(true);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        dim0.contextSwitch((int) (byte) 1);
        java.lang.String[] strArray15 = dim0.functionNames();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        java.lang.String str18 = dim0.eval("");
        dim0.setBreakOnEnter(true);
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        dim0.setBreakOnEnter(false);
        dim0.setBreakOnEnter(true);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        java.lang.Class<?> wildcardClass13 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        dim0.setBreakOnEnter(false);
        dim0.dispose();
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim0.setGuiCallback(guiCallback17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.setBreakOnEnter(false);
        java.lang.String[] strArray14 = dim0.functionNames();
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo18 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.ContextFactory contextFactory19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertNull(sourceInfo18);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim16 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim16.setBreak();
        java.lang.String str19 = dim16.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim16.setScopeProvider(scopeProvider20);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback22 = null;
        dim16.setGuiCallback(guiCallback22);
        dim16.contextSwitch((int) '4');
        dim16.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo28 = dim16.sourceInfo("undefined");
        dim16.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider30 = null;
        dim16.setScopeProvider(scopeProvider30);
        java.lang.String str33 = dim16.eval("");
        dim16.contextSwitch(0);
        dim16.detach();
        java.lang.String[] strArray37 = dim16.functionNames();
        dim16.dispose();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = dim0.objectToString((java.lang.Object) dim16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNull(sourceInfo28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "undefined" + "'", str33, "undefined");
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim0.setScopeProvider(scopeProvider23);
        dim0.setReturnValue((int) (short) 10);
        org.junit.Assert.assertNull(functionSource22);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        dim0.go();
        dim0.contextSwitch((int) (short) 0);
        com.google.javascript.rhino.head.ContextFactory contextFactory21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback20 = null;
        dim0.setGuiCallback(guiCallback20);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider22 = null;
        dim0.setSourceProvider(sourceProvider22);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        java.lang.Class<?> wildcardClass22 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNull(functionSource19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(10);
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        java.lang.String[] strArray8 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(sourceInfo10);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim0.setScopeProvider(scopeProvider13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame6 = contextData0.getFrame((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -33 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        dim0.dispose();
        java.lang.String str8 = dim0.eval("undefined");
        dim0.contextSwitch((int) (short) 1);
        dim0.setBreakOnReturn(true);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        java.lang.String str17 = dim14.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim14.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim14.functionSourceByName("undefined");
        dim14.clearAllBreakpoints();
        dim14.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider25 = null;
        dim14.setSourceProvider(sourceProvider25);
        dim14.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider29 = null;
        dim14.setScopeProvider(scopeProvider29);
        dim14.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource33 = dim14.functionSourceByName("");
        dim14.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim35 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim35.setBreak();
        java.lang.String str38 = dim35.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider39 = null;
        dim35.setScopeProvider(scopeProvider39);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource42 = dim35.functionSourceByName("undefined");
        dim35.clearAllBreakpoints();
        java.lang.String[] strArray44 = dim35.functionNames();
        dim35.setBreakOnEnter(false);
        dim35.clearAllBreakpoints();
        java.lang.String[] strArray48 = dim35.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo50 = dim35.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource52 = dim35.functionSourceByName("undefined");
        dim35.setBreakOnReturn(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = dim0.getObjectProperty((java.lang.Object) dim14, (java.lang.Object) dim35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(functionSource21);
        org.junit.Assert.assertNull(functionSource33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "undefined" + "'", str38, "undefined");
        org.junit.Assert.assertNull(functionSource42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNull(sourceInfo50);
        org.junit.Assert.assertNull(functionSource52);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        java.lang.String[] strArray10 = dim0.functionNames();
        java.lang.String[] strArray11 = dim0.functionNames();
        dim0.setReturnValue((int) (byte) 100);
        dim0.setReturnValue((int) (short) 10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String str8 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("");
        java.lang.String[] strArray11 = dim0.functionNames();
        dim0.detach();
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray14 = dim0.functionNames();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        dim0.setBreakOnReturn(true);
        java.lang.String str24 = dim0.eval("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "undefined" + "'", str24, "undefined");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        dim0.setBreak();
        dim0.detach();
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(sourceInfo19);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.dispose();
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        dim0.setReturnValue((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim0.setScopeProvider(scopeProvider22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        dim11.contextSwitch((int) (byte) 0);
        dim11.clearAllBreakpoints();
        dim11.dispose();
        dim11.setBreakOnEnter(true);
        java.lang.Class<?> wildcardClass19 = dim11.getClass();
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = dim0.getObjectProperty((java.lang.Object) dim11, obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        dim15.contextSwitch((int) (byte) 0);
        dim15.clearAllBreakpoints();
        dim15.detach();
        dim15.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim15.setScopeProvider(scopeProvider23);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider25 = null;
        dim15.setSourceProvider(sourceProvider25);
        java.lang.String str28 = dim15.eval("hi!");
        java.lang.String[] strArray29 = dim15.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider30 = null;
        dim15.setSourceProvider(sourceProvider30);
        dim15.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider33 = null;
        dim15.setScopeProvider(scopeProvider33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = dim0.objectToString((java.lang.Object) scopeProvider33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource11);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "undefined" + "'", str28, "undefined");
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        java.lang.String str18 = dim15.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim15.setScopeProvider(scopeProvider19);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback21 = null;
        dim15.setGuiCallback(guiCallback21);
        dim15.contextSwitch((int) '4');
        dim15.dispose();
        dim15.setReturnValue((int) (byte) 1);
        dim15.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData29 = dim15.currentContextData();
        dim15.dispose();
        dim15.setBreakOnReturn(false);
        dim15.contextSwitch((int) (short) 0);
        dim15.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray36 = dim0.getObjectIds((java.lang.Object) dim15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertNull(contextData29);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        java.lang.Class<?> wildcardClass15 = dim0.getClass();
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        dim0.go();
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(contextData9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim0.functionSourceByName("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(contextData16);
        org.junit.Assert.assertNull(contextData19);
        org.junit.Assert.assertNull(functionSource25);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        dim0.contextSwitch(10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(true);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource14 = dim0.functionSourceByName("");
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource14);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        dim21.contextSwitch((int) (byte) 0);
        dim21.clearAllBreakpoints();
        dim21.detach();
        dim21.setReturnValue(0);
        java.lang.Class<?> wildcardClass29 = dim21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dim0.objectToString((java.lang.Object) dim21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("hi!");
        dim0.detach();
        java.lang.Class<?> wildcardClass13 = dim0.getClass();
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim0.setGuiCallback(guiCallback17);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        dim0.setReturnValue((int) 'a');
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim0.setScopeProvider(scopeProvider21);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNull(sourceInfo18);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        dim0.go();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "undefined");
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
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData7);
        org.junit.Assert.assertNull(sourceInfo10);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        java.lang.String str27 = dim0.eval("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(functionSource19);
        org.junit.Assert.assertNull(sourceInfo23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "undefined" + "'", str27, "undefined");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider16 = null;
        dim0.setScopeProvider(scopeProvider16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame3 = contextData0.getFrame((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim0.setGuiCallback(guiCallback17);
        java.lang.String str20 = dim0.eval("");
        dim0.setReturnValue((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource13);
        org.junit.Assert.assertNull(sourceInfo16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreakOnEnter(true);
        dim0.dispose();
        java.lang.String[] strArray11 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.detach();
        dim0.go();
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
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        dim0.dispose();
        java.lang.String str8 = dim0.eval("undefined");
        dim0.contextSwitch((int) (short) 1);
        java.lang.String str12 = dim0.eval("");
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        dim0.contextSwitch((int) (byte) 10);
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        java.lang.String str18 = dim15.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim15.setScopeProvider(scopeProvider19);
        dim15.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider23 = null;
        dim15.setSourceProvider(sourceProvider23);
        java.lang.String[] strArray25 = dim15.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider26 = null;
        dim15.setSourceProvider(sourceProvider26);
        dim15.contextSwitch((int) (short) 0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider30 = null;
        dim15.setScopeProvider(scopeProvider30);
        com.google.javascript.rhino.head.tools.debugger.Dim dim32 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim32.setBreak();
        java.lang.String str35 = dim32.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider36 = null;
        dim32.setScopeProvider(scopeProvider36);
        dim32.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource40 = dim32.functionSourceByName("");
        dim32.contextSwitch((int) (byte) 10);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo44 = dim32.sourceInfo("undefined");
        dim32.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = dim0.getObjectProperty((java.lang.Object) dim15, (java.lang.Object) dim32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "undefined" + "'", str35, "undefined");
        org.junit.Assert.assertNull(functionSource40);
        org.junit.Assert.assertNull(sourceInfo44);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) ' ');
        dim18.setBreakOnEnter(true);
        java.lang.String str25 = dim18.eval("hi!");
        java.lang.String[] strArray26 = dim18.functionNames();
        dim18.setBreakOnEnter(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dim0.objectToString((java.lang.Object) dim18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "undefined" + "'", str25, "undefined");
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.contextSwitch((int) (byte) 0);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        dim12.contextSwitch((int) (byte) 0);
        dim12.clearAllBreakpoints();
        dim12.dispose();
        dim12.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim12.functionSourceByName("undefined");
        java.lang.String[] strArray22 = dim12.functionNames();
        dim12.go();
        java.lang.String str25 = dim12.eval("hi!");
        dim12.setBreakOnExceptions(true);
        dim12.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource31 = dim12.functionSourceByName("undefined");
        dim12.dispose();
        dim12.clearAllBreakpoints();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = dim0.objectToString((java.lang.Object) dim12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(functionSource21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "undefined" + "'", str25, "undefined");
        org.junit.Assert.assertNull(functionSource31);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        dim0.setReturnValue(4);
        dim0.go();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim0.setScopeProvider(scopeProvider14);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider16 = null;
        dim0.setSourceProvider(sourceProvider16);
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) (byte) 0);
        dim18.clearAllBreakpoints();
        dim18.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider24 = null;
        dim18.setScopeProvider(scopeProvider24);
        dim18.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider28 = null;
        dim18.setSourceProvider(sourceProvider28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray30 = dim0.getObjectIds((java.lang.Object) sourceProvider28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String str9 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "undefined" + "'", str9, "undefined");
        org.junit.Assert.assertNull(functionSource11);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        java.lang.String[] strArray16 = dim0.functionNames();
        dim0.dispose();
        dim0.setReturnValue((int) (byte) 0);
        dim0.setReturnValue(2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) (byte) 0);
        dim13.clearAllBreakpoints();
        dim13.dispose();
        dim13.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData21 = dim13.currentContextData();
        dim13.go();
        dim13.go();
        dim13.dispose();
        java.lang.String str26 = dim13.eval("undefined");
        java.lang.String[] strArray27 = dim13.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray28 = dim0.getObjectIds((java.lang.Object) strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "undefined" + "'", str26, "undefined");
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.clearAllBreakpoints();
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.setBreak();
        dim0.setBreak();
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        java.lang.String str21 = dim18.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim18.setScopeProvider(scopeProvider22);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim18.functionSourceByName("undefined");
        dim18.clearAllBreakpoints();
        dim18.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData28 = dim18.currentContextData();
        dim18.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider30 = null;
        dim18.setScopeProvider(scopeProvider30);
        java.lang.String[] strArray32 = dim18.functionNames();
        dim18.contextSwitch(1);
        java.lang.String str36 = dim18.eval("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider37 = null;
        dim18.setSourceProvider(sourceProvider37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = dim0.objectToString((java.lang.Object) dim18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNull(contextData15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
        org.junit.Assert.assertNull(functionSource25);
        org.junit.Assert.assertNull(contextData28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "undefined" + "'", str36, "undefined");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim20 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim20.setBreak();
        java.lang.String str23 = dim20.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider24 = null;
        dim20.setScopeProvider(scopeProvider24);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource27 = dim20.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo29 = dim20.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData30 = dim20.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo32 = dim20.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo34 = dim20.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource36 = dim20.functionSourceByName("hi!");
        dim20.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider38 = null;
        dim20.setSourceProvider(sourceProvider38);
        java.lang.String[] strArray40 = dim20.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = dim0.objectToString((java.lang.Object) dim20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "undefined" + "'", str23, "undefined");
        org.junit.Assert.assertNull(functionSource27);
        org.junit.Assert.assertNull(sourceInfo29);
        org.junit.Assert.assertNull(contextData30);
        org.junit.Assert.assertNull(sourceInfo32);
        org.junit.Assert.assertNull(sourceInfo34);
        org.junit.Assert.assertNull(functionSource36);
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame11 = contextData0.getFrame((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -98 ?? [0, 0)");
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
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.detach();
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray13 = dim0.functionNames();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        dim0.contextSwitch((int) (byte) 1);
        dim0.go();
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim0.setGuiCallback(guiCallback17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        java.lang.String[] strArray15 = dim0.functionNames();
        dim0.detach();
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue(3);
        dim0.contextSwitch((int) (byte) -1);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        java.lang.String str11 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(functionSource13);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.detach();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.ContextFactory contextFactory12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("");
        dim0.dispose();
        com.google.javascript.rhino.head.ContextFactory contextFactory21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource19);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.contextSwitch(1);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim0.setScopeProvider(scopeProvider14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider9 = null;
        dim0.setScopeProvider(scopeProvider9);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("undefined");
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(false);
        dim0.go();
        dim0.go();
        dim0.setReturnValue(100);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider20 = null;
        dim0.setSourceProvider(sourceProvider20);
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData24 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNull(contextData24);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.detach();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnExceptions(false);
        dim0.setBreak();
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        com.google.javascript.rhino.head.ContextFactory contextFactory11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData10);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo18 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(sourceInfo18);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertNull(sourceInfo8);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        dim0.setBreakOnExceptions(true);
        dim0.contextSwitch((int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("hi!");
        dim0.contextSwitch((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(functionSource13);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.detach();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnExceptions(false);
        java.lang.String str15 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("undefined");
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertNull(functionSource17);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(true);
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = dim0.getObjectProperty(obj19, obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        dim0.dispose();
        java.lang.String str8 = dim0.eval("undefined");
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        dim0.contextSwitch((int) '4');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        java.lang.String str9 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "undefined" + "'", str9, "undefined");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame16 = contextData0.getFrame((-1));
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
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        dim0.setBreakOnExceptions(true);
        java.lang.Class<?> wildcardClass22 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim0.setGuiCallback(guiCallback18);
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue(3);
        dim0.contextSwitch((int) (byte) -1);
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim10.functionSourceByName("");
        dim10.setBreakOnEnter(false);
        dim10.setBreakOnEnter(true);
        dim10.dispose();
        dim10.setBreakOnReturn(true);
        dim10.dispose();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider34 = null;
        dim10.setScopeProvider(scopeProvider34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray36 = dim0.getObjectIds((java.lang.Object) scopeProvider34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
        org.junit.Assert.assertNull(functionSource25);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        java.lang.String[] strArray21 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(sourceInfo19);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo6 = dim0.sourceInfo("");
        java.lang.String[] strArray7 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim8 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray9 = dim8.functionNames();
        dim8.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim8.functionSourceByName("");
        java.lang.String[] strArray13 = dim8.functionNames();
        java.lang.String[] strArray14 = dim8.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        java.lang.String str18 = dim15.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim15.setScopeProvider(scopeProvider19);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback21 = null;
        dim15.setGuiCallback(guiCallback21);
        dim15.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo26 = dim15.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData27 = dim15.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider28 = null;
        dim15.setSourceProvider(sourceProvider28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = dim0.getObjectProperty((java.lang.Object) dim8, (java.lang.Object) sourceProvider28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertNull(sourceInfo26);
        org.junit.Assert.assertNull(contextData27);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        java.lang.String[] strArray13 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        java.lang.String str21 = dim18.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim18.setScopeProvider(scopeProvider22);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim18.functionSourceByName("undefined");
        dim18.clearAllBreakpoints();
        java.lang.String[] strArray27 = dim18.functionNames();
        dim18.dispose();
        dim18.setBreakOnExceptions(false);
        dim18.setBreakOnEnter(false);
        dim18.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback34 = null;
        dim18.setGuiCallback(guiCallback34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray36 = dim0.getObjectIds((java.lang.Object) guiCallback34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
        org.junit.Assert.assertNull(functionSource25);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        java.lang.String str22 = dim19.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim19.setScopeProvider(scopeProvider23);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback25 = null;
        dim19.setGuiCallback(guiCallback25);
        dim19.contextSwitch((int) '4');
        dim19.dispose();
        dim19.setReturnValue((int) (byte) 1);
        dim19.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo35 = dim19.sourceInfo("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray36 = dim0.getObjectIds((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
        org.junit.Assert.assertNull(sourceInfo35);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame11 = contextData0.getFrame(2);
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
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray5 = dim0.functionNames();
        dim0.contextSwitch((int) (short) 0);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim9 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim9.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim9.setGuiCallback(guiCallback11);
        dim9.setBreakOnReturn(false);
        dim9.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim9.functionSourceByName("undefined");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dim0.objectToString((java.lang.Object) dim9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(functionSource17);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        dim0.setReturnValue(4);
        dim0.contextSwitch(100);
        dim0.setBreakOnExceptions(true);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertNull(contextData6);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
        dim0.clearAllBreakpoints();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        dim0.go();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnExceptions(true);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim8 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim8.setBreak();
        dim8.contextSwitch((int) ' ');
        java.lang.String[] strArray12 = dim8.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim8.setScopeProvider(scopeProvider13);
        dim8.setBreakOnEnter(true);
        dim8.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo19 = dim8.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim20 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim20.setBreak();
        java.lang.String str23 = dim20.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider24 = null;
        dim20.setScopeProvider(scopeProvider24);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource27 = dim20.functionSourceByName("undefined");
        dim20.clearAllBreakpoints();
        dim20.setBreakOnExceptions(false);
        dim20.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource33 = dim20.functionSourceByName("undefined");
        dim20.setBreakOnReturn(true);
        dim20.contextSwitch((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = dim0.getObjectProperty((java.lang.Object) "", (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNull(sourceInfo19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "undefined" + "'", str23, "undefined");
        org.junit.Assert.assertNull(functionSource27);
        org.junit.Assert.assertNull(functionSource33);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("");
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        dim21.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray25 = dim21.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData26 = dim21.currentContextData();
        dim21.setReturnValue((int) (short) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim dim29 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim29.setBreak();
        java.lang.String str32 = dim29.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider33 = null;
        dim29.setScopeProvider(scopeProvider33);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource36 = dim29.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo38 = dim29.sourceInfo("undefined");
        dim29.dispose();
        dim29.clearAllBreakpoints();
        dim29.setBreakOnExceptions(true);
        dim29.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider45 = null;
        dim29.setScopeProvider(scopeProvider45);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData47 = dim29.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = dim0.getObjectProperty((java.lang.Object) (short) 0, (java.lang.Object) contextData47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNull(contextData26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "undefined" + "'", str32, "undefined");
        org.junit.Assert.assertNull(functionSource36);
        org.junit.Assert.assertNull(sourceInfo38);
        org.junit.Assert.assertNull(contextData47);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider9 = null;
        dim0.setScopeProvider(scopeProvider9);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        java.lang.String str20 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim0.setScopeProvider(scopeProvider21);
        com.google.javascript.rhino.head.tools.debugger.Dim dim23 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim23.setBreak();
        java.lang.String str26 = dim23.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider27 = null;
        dim23.setScopeProvider(scopeProvider27);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource30 = dim23.functionSourceByName("undefined");
        dim23.clearAllBreakpoints();
        java.lang.String[] strArray32 = dim23.functionNames();
        java.lang.String[] strArray33 = dim23.functionNames();
        dim23.setReturnValue(4);
        dim23.detach();
        dim23.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = dim0.objectToString((java.lang.Object) dim23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "undefined" + "'", str26, "undefined");
        org.junit.Assert.assertNull(functionSource30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim dim7 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim7.setBreak();
        dim7.contextSwitch((int) (byte) 0);
        dim7.clearAllBreakpoints();
        dim7.detach();
        dim7.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim7.setScopeProvider(scopeProvider15);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider17 = null;
        dim7.setSourceProvider(sourceProvider17);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo20 = dim7.sourceInfo("");
        dim7.dispose();
        dim7.detach();
        dim7.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo25 = dim7.sourceInfo("undefined");
        java.lang.String[] strArray26 = dim7.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim27 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim27.setBreak();
        java.lang.String str30 = dim27.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider31 = null;
        dim27.setScopeProvider(scopeProvider31);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource34 = dim27.functionSourceByName("undefined");
        dim27.clearAllBreakpoints();
        java.lang.String[] strArray36 = dim27.functionNames();
        dim27.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider39 = null;
        dim27.setScopeProvider(scopeProvider39);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData41 = dim27.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = dim0.getObjectProperty((java.lang.Object) strArray26, (java.lang.Object) dim27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(sourceInfo20);
        org.junit.Assert.assertNull(sourceInfo25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "undefined" + "'", str30, "undefined");
        org.junit.Assert.assertNull(functionSource34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNull(contextData41);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim22 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim22.setBreak();
        dim22.contextSwitch((int) (byte) 0);
        dim22.clearAllBreakpoints();
        dim22.detach();
        dim22.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider30 = null;
        dim22.setScopeProvider(scopeProvider30);
        dim22.contextSwitch(100);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider34 = null;
        dim22.setSourceProvider(sourceProvider34);
        java.lang.String[] strArray36 = dim22.functionNames();
        dim22.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo39 = dim22.sourceInfo("hi!");
        dim22.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData42 = dim22.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray43 = dim0.getObjectIds((java.lang.Object) dim22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNull(sourceInfo39);
        org.junit.Assert.assertNull(contextData42);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("");
        dim0.setBreak();
        org.junit.Assert.assertNull(functionSource10);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        dim0.go();
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) 'a');
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        dim18.go();
        dim18.setBreakOnReturn(true);
        dim18.contextSwitch(4);
        dim18.go();
        dim18.setBreakOnReturn(true);
        dim18.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo32 = dim18.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider33 = null;
        dim18.setScopeProvider(scopeProvider33);
        dim18.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = dim0.objectToString((java.lang.Object) dim18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(sourceInfo32);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        java.lang.String str18 = dim15.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim15.setScopeProvider(scopeProvider19);
        dim15.setBreakOnReturn(false);
        dim15.setBreakOnExceptions(false);
        dim15.setReturnValue((int) (byte) -1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider27 = null;
        dim15.setScopeProvider(scopeProvider27);
        dim15.clearAllBreakpoints();
        dim15.setBreakOnExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray32 = dim0.getObjectIds((java.lang.Object) dim15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim15.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback20 = null;
        dim15.setGuiCallback(guiCallback20);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData22 = dim15.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = dim0.objectToString((java.lang.Object) dim15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNull(contextData22);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) (byte) 100);
        dim0.setReturnValue((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("");
        java.lang.String str16 = dim0.eval("hi!");
        dim0.contextSwitch((int) (short) -1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        java.lang.String str13 = dim0.eval("undefined");
        java.lang.String[] strArray14 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        java.lang.String str18 = dim15.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim15.setScopeProvider(scopeProvider19);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim15.functionSourceByName("undefined");
        dim15.clearAllBreakpoints();
        dim15.go();
        java.lang.String str26 = dim15.eval("hi!");
        dim15.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback28 = null;
        dim15.setGuiCallback(guiCallback28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray30 = dim0.getObjectIds((java.lang.Object) guiCallback28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertNull(functionSource22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "undefined" + "'", str26, "undefined");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback2 = null;
        dim0.setGuiCallback(guiCallback2);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("");
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String str11 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource17);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource13);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        java.lang.String str18 = dim0.eval("");
        com.google.javascript.rhino.head.ContextFactory contextFactory19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        java.lang.String str11 = dim0.eval("hi!");
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim0.setScopeProvider(scopeProvider14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(false);
        dim0.detach();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        dim0.setBreak();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.ContextFactory contextFactory13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        dim0.dispose();
        com.google.javascript.rhino.head.ContextFactory contextFactory14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        dim15.contextSwitch((int) (byte) 0);
        dim15.clearAllBreakpoints();
        dim15.detach();
        dim15.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim15.setScopeProvider(scopeProvider23);
        dim15.contextSwitch(100);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider27 = null;
        dim15.setSourceProvider(sourceProvider27);
        dim15.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource32 = dim15.functionSourceByName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray33 = dim0.getObjectIds((java.lang.Object) dim15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNull(functionSource32);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim0.setGuiCallback(guiCallback17);
        java.lang.String str20 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        java.lang.String str17 = dim14.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim14.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback20 = null;
        dim14.setGuiCallback(guiCallback20);
        dim14.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo25 = dim14.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData26 = dim14.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData27 = dim14.currentContextData();
        dim14.dispose();
        dim14.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData30 = dim14.currentContextData();
        dim14.dispose();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray32 = dim0.getObjectIds((java.lang.Object) dim14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(sourceInfo25);
        org.junit.Assert.assertNull(contextData26);
        org.junit.Assert.assertNull(contextData27);
        org.junit.Assert.assertNull(contextData30);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        java.lang.String str17 = dim14.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim14.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim14.functionSourceByName("undefined");
        dim14.clearAllBreakpoints();
        java.lang.String[] strArray23 = dim14.functionNames();
        dim14.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider26 = null;
        dim14.setScopeProvider(scopeProvider26);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource29 = dim14.functionSourceByName("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim dim30 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim30.setBreak();
        dim30.contextSwitch((int) (byte) 0);
        dim30.clearAllBreakpoints();
        dim30.detach();
        dim30.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider38 = null;
        dim30.setScopeProvider(scopeProvider38);
        dim30.contextSwitch(100);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider42 = null;
        dim30.setSourceProvider(sourceProvider42);
        java.lang.String[] strArray44 = dim30.functionNames();
        dim30.detach();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = dim0.getObjectProperty((java.lang.Object) dim14, (java.lang.Object) dim30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(functionSource21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(functionSource29);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        com.google.javascript.rhino.head.ContextFactory contextFactory17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource10);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        java.lang.String str16 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo20 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNull(functionSource18);
        org.junit.Assert.assertNull(sourceInfo20);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(true);
        java.lang.String str18 = dim0.eval("");
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        java.lang.String str14 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        dim15.contextSwitch((int) ' ');
        dim15.setBreakOnEnter(true);
        java.lang.String str22 = dim15.eval("hi!");
        java.lang.String[] strArray23 = dim15.functionNames();
        dim15.detach();
        dim15.setReturnValue(100);
        dim15.setReturnValue((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dim0.objectToString((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        java.lang.Class<?> wildcardClass12 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("");
        dim0.setReturnValue((int) ' ');
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo6 = dim0.sourceInfo("");
        java.lang.String[] strArray7 = dim0.functionNames();
        dim0.go();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.ContextFactory contextFactory10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        java.lang.Class<?> wildcardClass13 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        java.lang.String[] strArray21 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim22 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim22.setBreak();
        dim22.contextSwitch((int) (byte) 0);
        dim22.clearAllBreakpoints();
        dim22.dispose();
        dim22.setBreakOnReturn(false);
        dim22.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource32 = dim22.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource34 = dim22.functionSourceByName("");
        java.lang.String str36 = dim22.eval("");
        dim22.contextSwitch(4);
        dim22.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = dim0.objectToString((java.lang.Object) dim22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNull(functionSource32);
        org.junit.Assert.assertNull(functionSource34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "undefined" + "'", str36, "undefined");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame12 = contextData0.getFrame((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -53 ?? [0, 0)");
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
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        java.lang.String str16 = dim0.eval("hi!");
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertNull(functionSource11);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(contextData18);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider25 = null;
        dim0.setScopeProvider(scopeProvider25);
        java.lang.String str28 = dim0.eval("");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "undefined" + "'", str28, "undefined");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        java.lang.String str16 = dim0.eval("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        dim0.setBreakOnReturn(false);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(contextData9);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider7 = null;
        dim0.setSourceProvider(sourceProvider7);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        java.lang.String str17 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim0.setGuiCallback(guiCallback18);
        com.google.javascript.rhino.head.tools.debugger.Dim dim20 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim20.setBreak();
        dim20.contextSwitch((int) ' ');
        dim20.go();
        dim20.setBreakOnReturn(true);
        dim20.contextSwitch(4);
        dim20.go();
        dim20.setBreakOnReturn(true);
        dim20.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider34 = null;
        dim20.setScopeProvider(scopeProvider34);
        java.lang.String str37 = dim20.eval("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim38 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim38.setBreak();
        dim38.contextSwitch((int) (byte) 0);
        dim38.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider44 = null;
        dim38.setScopeProvider(scopeProvider44);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider46 = null;
        dim38.setScopeProvider(scopeProvider46);
        java.lang.Class<?> wildcardClass48 = dim38.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = dim0.getObjectProperty((java.lang.Object) str37, (java.lang.Object) dim38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "undefined" + "'", str37, "undefined");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        dim0.setReturnValue((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("hi!", "");
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
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        java.lang.String str15 = dim0.eval("");
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        dim0.go();
        dim0.contextSwitch(0);
        java.lang.String str14 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(contextData9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.dispose();
        dim0.contextSwitch(5);
        java.lang.String str14 = dim0.eval("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.setBreak();
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        com.google.javascript.rhino.head.ContextFactory contextFactory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.dispose();
        java.lang.String[] strArray9 = dim0.functionNames();
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.setReturnValue((int) (short) 0);
        dim0.setReturnValue((int) ' ');
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData15 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim16 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim16.setBreak();
        java.lang.String str19 = dim16.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim16.setScopeProvider(scopeProvider20);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource23 = dim16.functionSourceByName("undefined");
        dim16.clearAllBreakpoints();
        dim16.setBreakOnExceptions(false);
        dim16.dispose();
        dim16.setBreakOnEnter(false);
        dim16.contextSwitch((int) (byte) 100);
        dim16.setReturnValue((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray34 = dim0.getObjectIds((java.lang.Object) dim16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(contextData15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNull(functionSource23);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        dim12.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim12.setGuiCallback(guiCallback16);
        dim12.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData20 = dim12.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData21 = dim12.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim12.setScopeProvider(scopeProvider22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray24 = dim0.getObjectIds((java.lang.Object) scopeProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData20);
        org.junit.Assert.assertNull(contextData21);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider17 = null;
        dim0.setSourceProvider(sourceProvider17);
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        dim19.contextSwitch((int) ' ');
        dim19.go();
        dim19.setBreakOnReturn(true);
        dim19.contextSwitch(4);
        dim19.go();
        dim19.setBreakOnExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = dim0.objectToString((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim0.setScopeProvider(scopeProvider14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        dim0.setBreakOnExceptions(false);
        java.lang.Class<?> wildcardClass16 = dim0.getClass();
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim0.setScopeProvider(scopeProvider14);
        dim0.setReturnValue((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        java.lang.String str18 = dim15.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim15.setScopeProvider(scopeProvider19);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim15.functionSourceByName("undefined");
        dim15.clearAllBreakpoints();
        java.lang.String[] strArray24 = dim15.functionNames();
        dim15.setBreakOnEnter(false);
        dim15.clearAllBreakpoints();
        java.lang.String[] strArray28 = dim15.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo30 = dim15.sourceInfo("hi!");
        dim15.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider33 = null;
        dim15.setScopeProvider(scopeProvider33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray35 = dim0.getObjectIds((java.lang.Object) dim15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertNull(functionSource22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNull(sourceInfo30);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        dim0.dispose();
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dim0.objectToString(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
        com.google.javascript.rhino.head.ContextFactory contextFactory22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNull(contextData19);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(contextData9);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        java.lang.String[] strArray19 = dim0.functionNames();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider21 = null;
        dim0.setSourceProvider(sourceProvider21);
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.detach();
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("undefined");
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        dim19.contextSwitch((int) (byte) 0);
        dim19.clearAllBreakpoints();
        dim19.detach();
        dim19.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider27 = null;
        dim19.setScopeProvider(scopeProvider27);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider29 = null;
        dim19.setSourceProvider(sourceProvider29);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo32 = dim19.sourceInfo("");
        dim19.dispose();
        dim19.detach();
        dim19.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo37 = dim19.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo39 = dim19.sourceInfo("");
        java.lang.String str41 = dim19.eval("undefined");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray42 = dim0.getObjectIds((java.lang.Object) str41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertNull(sourceInfo32);
        org.junit.Assert.assertNull(sourceInfo37);
        org.junit.Assert.assertNull(sourceInfo39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "undefined" + "'", str41, "undefined");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(false);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim dim7 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim7.setBreak();
        java.lang.String str10 = dim7.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim7.setScopeProvider(scopeProvider11);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource14 = dim7.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim7.sourceInfo("undefined");
        dim7.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim7.functionSourceByName("hi!");
        java.lang.String str21 = dim7.eval("");
        dim7.dispose();
        java.lang.String[] strArray23 = dim7.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim24 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim24.setBreak();
        java.lang.String str27 = dim24.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider28 = null;
        dim24.setScopeProvider(scopeProvider28);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource31 = dim24.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo33 = dim24.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData34 = dim24.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo36 = dim24.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo38 = dim24.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource40 = dim24.functionSourceByName("hi!");
        dim24.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider42 = null;
        dim24.setSourceProvider(sourceProvider42);
        java.lang.String[] strArray44 = dim24.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = dim0.getObjectProperty((java.lang.Object) dim7, (java.lang.Object) dim24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "undefined" + "'", str10, "undefined");
        org.junit.Assert.assertNull(functionSource14);
        org.junit.Assert.assertNull(sourceInfo16);
        org.junit.Assert.assertNull(functionSource19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "undefined" + "'", str27, "undefined");
        org.junit.Assert.assertNull(functionSource31);
        org.junit.Assert.assertNull(sourceInfo33);
        org.junit.Assert.assertNull(contextData34);
        org.junit.Assert.assertNull(sourceInfo36);
        org.junit.Assert.assertNull(sourceInfo38);
        org.junit.Assert.assertNull(functionSource40);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
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
        java.lang.Object obj13 = null;
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        dim14.contextSwitch((int) ' ');
        java.lang.String[] strArray18 = dim14.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim14.setScopeProvider(scopeProvider19);
        dim14.setBreakOnEnter(true);
        dim14.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim14.functionSourceByName("undefined");
        dim14.clearAllBreakpoints();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = dim0.getObjectProperty(obj13, (java.lang.Object) dim14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNull(functionSource25);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnEnter(false);
        java.lang.String str13 = dim0.eval("hi!");
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        com.google.javascript.rhino.head.ContextFactory contextFactory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame12 = contextData0.getFrame(2);
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
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider9 = null;
        dim0.setScopeProvider(scopeProvider9);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("undefined");
        dim0.setBreak();
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        java.lang.String str9 = dim0.eval("hi!");
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "undefined" + "'", str9, "undefined");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) (byte) -1);
        java.lang.String str21 = dim0.eval("hi!");
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.contextSwitch((int) (byte) 1);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
        org.junit.Assert.assertNull(contextData9);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        dim0.contextSwitch(2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("hi!");
        dim0.dispose();
        java.lang.Class<?> wildcardClass15 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String str8 = dim0.eval("hi!");
        dim0.go();
        dim0.go();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) -1);
        dim0.setReturnValue(0);
        dim0.setReturnValue(1);
        dim0.setBreakOnExceptions(true);
        dim0.contextSwitch((int) (byte) 100);
        dim0.detach();
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
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
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        java.lang.Class<?> wildcardClass13 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        dim17.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback21 = null;
        dim17.setGuiCallback(guiCallback21);
        dim17.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData25 = dim17.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData26 = dim17.currentContextData();
        dim17.go();
        dim17.setReturnValue(10);
        java.lang.String[] strArray30 = dim17.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim31 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim31.setBreak();
        java.lang.String str34 = dim31.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider35 = null;
        dim31.setScopeProvider(scopeProvider35);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource38 = dim31.functionSourceByName("undefined");
        dim31.clearAllBreakpoints();
        dim31.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData42 = dim31.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider43 = null;
        dim31.setSourceProvider(sourceProvider43);
        dim31.go();
        dim31.setBreak();
        java.lang.String str48 = dim31.eval("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = dim0.getObjectProperty((java.lang.Object) strArray30, (java.lang.Object) dim31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(contextData25);
        org.junit.Assert.assertNull(contextData26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "undefined" + "'", str34, "undefined");
        org.junit.Assert.assertNull(functionSource38);
        org.junit.Assert.assertNull(contextData42);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "undefined" + "'", str48, "undefined");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        java.lang.String[] strArray9 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        java.lang.String str15 = dim12.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider16 = null;
        dim12.setScopeProvider(scopeProvider16);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim12.setGuiCallback(guiCallback18);
        dim12.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo23 = dim12.sourceInfo("undefined");
        dim12.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider26 = null;
        dim12.setSourceProvider(sourceProvider26);
        com.google.javascript.rhino.head.tools.debugger.Dim dim28 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim28.setBreak();
        dim28.contextSwitch((int) ' ');
        dim28.setBreakOnEnter(true);
        java.lang.String str35 = dim28.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource37 = dim28.functionSourceByName("undefined");
        dim28.contextSwitch(4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback40 = null;
        dim28.setGuiCallback(guiCallback40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = dim0.getObjectProperty((java.lang.Object) dim12, (java.lang.Object) dim28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertNull(sourceInfo23);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "undefined" + "'", str35, "undefined");
        org.junit.Assert.assertNull(functionSource37);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        java.lang.String str16 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback19 = null;
        dim0.setGuiCallback(guiCallback19);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData15 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(contextData15);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame16 = contextData0.getFrame(5);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider15 = null;
        dim0.setSourceProvider(sourceProvider15);
        dim0.detach();
        dim0.dispose();
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo14);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData17 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        dim19.contextSwitch((int) (byte) 0);
        dim19.clearAllBreakpoints();
        dim19.dispose();
        dim19.setBreakOnReturn(false);
        dim19.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource29 = dim19.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource31 = dim19.functionSourceByName("");
        java.lang.String str33 = dim19.eval("");
        dim19.contextSwitch(4);
        dim19.go();
        dim19.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim39 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim39.setBreak();
        dim39.contextSwitch((int) (byte) 0);
        dim39.clearAllBreakpoints();
        dim39.setBreakOnReturn(false);
        dim39.go();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback47 = null;
        dim39.setGuiCallback(guiCallback47);
        java.lang.String str50 = dim39.eval("undefined");
        dim39.setBreakOnEnter(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = dim0.getObjectProperty((java.lang.Object) dim19, (java.lang.Object) dim39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertNull(contextData17);
        org.junit.Assert.assertNull(functionSource29);
        org.junit.Assert.assertNull(functionSource31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "undefined" + "'", str33, "undefined");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "undefined" + "'", str50, "undefined");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        dim0.contextSwitch((-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue(3);
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.setReturnValue((int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        dim0.detach();
        java.lang.String str22 = dim0.eval("");
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.detach();
        dim0.dispose();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData18 = dim0.currentContextData();
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(true);
        java.lang.String str24 = dim0.eval("undefined");
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData15);
        org.junit.Assert.assertNull(contextData18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "undefined" + "'", str24, "undefined");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback2 = null;
        dim0.setGuiCallback(guiCallback2);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider4 = null;
        dim0.setSourceProvider(sourceProvider4);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider6 = null;
        dim0.setSourceProvider(sourceProvider6);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider19 = null;
        dim14.setSourceProvider(sourceProvider19);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo22 = dim14.sourceInfo("");
        dim14.setBreakOnReturn(false);
        dim14.setBreak();
        dim14.setBreak();
        dim14.setBreakOnReturn(false);
        dim14.detach();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray30 = dim0.getObjectIds((java.lang.Object) dim14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNull(sourceInfo22);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
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
        dim0.setBreak();
        dim0.go();
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData19 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo21 = dim0.sourceInfo("");
        dim0.go();
        dim0.go();
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNull(contextData19);
        org.junit.Assert.assertNull(sourceInfo21);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo26 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData27 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(sourceInfo26);
        org.junit.Assert.assertNull(contextData27);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(false);
        dim0.go();
        dim0.contextSwitch((int) (short) 100);
        dim0.setBreakOnEnter(true);
        dim0.detach();
        java.lang.String str14 = dim0.eval("undefined");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
        java.lang.String str14 = dim0.eval("undefined");
        com.google.javascript.rhino.head.ContextFactory contextFactory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        dim15.contextSwitch((int) (byte) 0);
        dim15.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim15.setScopeProvider(scopeProvider21);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim15.setScopeProvider(scopeProvider23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = dim0.objectToString((java.lang.Object) scopeProvider23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue(3);
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray10 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame15 = contextData0.getFrame(100);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String str8 = dim0.eval("hi!");
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (short) 10);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("hi!");
        java.lang.String str13 = dim0.eval("hi!");
        dim0.setReturnValue(10);
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
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
        dim0.go();
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo18 = dim0.sourceInfo("hi!");
        dim0.setReturnValue((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo18);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.ContextFactory contextFactory11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        dim0.contextSwitch((int) (byte) 0);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo7 = dim0.sourceInfo("hi!");
        dim0.setBreak();
        dim0.contextSwitch((int) (short) -1);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("hi!");
        dim0.go();
        org.junit.Assert.assertNull(sourceInfo7);
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
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
        com.google.javascript.rhino.head.ContextFactory contextFactory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(contextData9);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame4 = contextData0.getFrame(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -6 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNull(contextData15);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        dim0.setBreakOnEnter(false);
        java.lang.Class<?> wildcardClass13 = dim0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.setBreakOnEnter(false);
        dim0.setBreakOnExceptions(true);
        java.lang.String str13 = dim0.eval("undefined");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData15 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(contextData15);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim6 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim6.setBreak();
        dim6.contextSwitch((int) (byte) 0);
        dim6.clearAllBreakpoints();
        dim6.detach();
        dim6.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim6.setScopeProvider(scopeProvider14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dim0.objectToString((java.lang.Object) scopeProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
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
        dim0.setBreakOnEnter(false);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setReturnValue(5);
        dim0.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("");
        dim0.go();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(functionSource11);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        dim0.setReturnValue(0);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        dim21.contextSwitch((int) ' ');
        dim21.go();
        dim21.setBreakOnReturn(true);
        dim21.contextSwitch(4);
        dim21.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider31 = null;
        dim21.setScopeProvider(scopeProvider31);
        java.lang.String[] strArray33 = dim21.functionNames();
        dim21.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray35 = dim0.getObjectIds((java.lang.Object) dim21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue(4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        dim0.setReturnValue(4);
        dim0.go();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        java.lang.String[] strArray16 = dim0.functionNames();
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim0.setScopeProvider(scopeProvider22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback2 = null;
        dim0.setGuiCallback(guiCallback2);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        java.lang.String[] strArray6 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        dim0.setBreak();
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(true);
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) ' ');
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        dim15.contextSwitch((int) ' ');
        dim15.go();
        dim15.setBreakOnReturn(true);
        dim15.contextSwitch(4);
        dim15.go();
        dim15.setBreakOnReturn(true);
        dim15.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider29 = null;
        dim15.setScopeProvider(scopeProvider29);
        java.lang.String str32 = dim15.eval("");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData33 = dim15.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim34 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim34.setBreak();
        java.lang.String str37 = dim34.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider38 = null;
        dim34.setScopeProvider(scopeProvider38);
        dim34.go();
        dim34.contextSwitch((int) (byte) 1);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData43 = dim34.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData44 = dim34.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = dim0.getObjectProperty((java.lang.Object) dim15, (java.lang.Object) contextData44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "undefined" + "'", str32, "undefined");
        org.junit.Assert.assertNull(contextData33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "undefined" + "'", str37, "undefined");
        org.junit.Assert.assertNull(contextData43);
        org.junit.Assert.assertNull(contextData44);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
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
        java.lang.Class<?> wildcardClass16 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo5 = dim0.sourceInfo("");
        dim0.contextSwitch((int) 'a');
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim dim9 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim9.setBreak();
        dim9.contextSwitch((int) (byte) 0);
        dim9.clearAllBreakpoints();
        dim9.detach();
        dim9.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo18 = dim9.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback19 = null;
        dim9.setGuiCallback(guiCallback19);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData21 = dim9.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback22 = null;
        dim9.setGuiCallback(guiCallback22);
        dim9.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray25 = dim0.getObjectIds((java.lang.Object) dim9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo5);
        org.junit.Assert.assertNull(sourceInfo18);
        org.junit.Assert.assertNull(contextData21);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray8 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("hi!");
        dim0.setReturnValue(100);
        java.lang.String str14 = dim0.eval("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("hi!");
        dim0.setBreak();
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.detach();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("hi!");
        java.lang.String[] strArray11 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        dim12.contextSwitch((int) ' ');
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider16 = null;
        dim12.setScopeProvider(scopeProvider16);
        dim12.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        java.lang.String str22 = dim19.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim19.setScopeProvider(scopeProvider23);
        dim19.setBreakOnReturn(false);
        dim19.setBreakOnExceptions(false);
        dim19.setBreakOnReturn(true);
        dim19.clearAllBreakpoints();
        dim19.contextSwitch((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = dim0.getObjectProperty((java.lang.Object) dim12, (java.lang.Object) dim19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
        java.lang.String[] strArray16 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo18 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim0.setScopeProvider(scopeProvider19);
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource14);
        org.junit.Assert.assertNull(contextData15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNull(sourceInfo18);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData7 = dim0.currentContextData();
        org.junit.Assert.assertNull(contextData7);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnEnter(true);
        dim0.detach();
        dim0.setBreakOnReturn(true);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        dim0.detach();
        java.lang.String str19 = dim0.eval("");
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
        dim20.clearAllBreakpoints();
        dim20.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim dim42 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim42.setBreak();
        dim42.contextSwitch((int) ' ');
        java.lang.String[] strArray46 = dim42.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData47 = dim42.currentContextData();
        dim42.setBreak();
        dim42.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider50 = null;
        dim42.setSourceProvider(sourceProvider50);
        java.lang.String[] strArray52 = dim42.functionNames();
        java.lang.String[] strArray53 = dim42.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = dim0.getObjectProperty((java.lang.Object) dim20, (java.lang.Object) strArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNull(contextData47);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim0.setGuiCallback(guiCallback17);
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource16);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("");
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(contextData16);
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(contextData17);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider2 = null;
        dim0.setSourceProvider(sourceProvider2);
        com.google.javascript.rhino.head.ContextFactory contextFactory4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) (byte) 0);
        dim13.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim13.setScopeProvider(scopeProvider19);
        java.lang.String[] strArray21 = dim13.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo23 = dim13.sourceInfo("hi!");
        dim13.contextSwitch((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = dim0.objectToString((java.lang.Object) dim13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNull(sourceInfo23);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.detach();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        dim0.setBreak();
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        dim0.setBreakOnReturn(false);
        dim0.go();
        java.lang.String[] strArray28 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider16 = null;
        dim0.setSourceProvider(sourceProvider16);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("hi!", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo12);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        dim0.detach();
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (byte) -1);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        java.lang.String str20 = dim17.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim17.setScopeProvider(scopeProvider21);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource24 = dim17.functionSourceByName("undefined");
        dim17.clearAllBreakpoints();
        dim17.go();
        java.lang.String str28 = dim17.eval("hi!");
        dim17.detach();
        dim17.clearAllBreakpoints();
        dim17.setBreakOnEnter(true);
        dim17.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback34 = null;
        dim17.setGuiCallback(guiCallback34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray36 = dim0.getObjectIds((java.lang.Object) guiCallback34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
        org.junit.Assert.assertNull(functionSource24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "undefined" + "'", str28, "undefined");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
        dim0.contextSwitch((int) (byte) -1);
        com.google.javascript.rhino.head.ContextFactory contextFactory25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource20 = dim0.functionSourceByName("");
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertNull(functionSource20);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        dim0.detach();
        java.lang.String[] strArray15 = dim0.functionNames();
        com.google.javascript.rhino.head.ContextFactory contextFactory16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.clearAllBreakpoints();
        java.lang.Class<?> wildcardClass11 = dim0.getClass();
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback2 = null;
        dim0.setGuiCallback(guiCallback2);
        dim0.setBreak();
        java.lang.String str6 = dim0.eval("undefined");
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim9 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim9.setBreak();
        java.lang.String str12 = dim9.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim9.setScopeProvider(scopeProvider13);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim9.functionSourceByName("undefined");
        dim9.clearAllBreakpoints();
        dim9.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData20 = dim9.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider21 = null;
        dim9.setSourceProvider(sourceProvider21);
        dim9.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo26 = dim9.sourceInfo("undefined");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = dim0.objectToString((java.lang.Object) dim9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertNull(contextData20);
        org.junit.Assert.assertNull(sourceInfo26);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.detach();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.contextSwitch((int) '#');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("undefined");
        dim0.contextSwitch(2);
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource11);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData15 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("");
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(contextData15);
        org.junit.Assert.assertNull(functionSource17);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        com.google.javascript.rhino.head.tools.debugger.Dim dim8 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim8.setBreak();
        dim8.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim8.setGuiCallback(guiCallback12);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim8.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim8.setGuiCallback(guiCallback15);
        java.lang.String[] strArray17 = dim8.functionNames();
        dim8.setReturnValue(100);
        dim8.contextSwitch((int) (byte) 1);
        dim8.setBreak();
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = dim0.getObjectProperty((java.lang.Object) dim8, (java.lang.Object) dim23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "undefined" + "'", str26, "undefined");
        org.junit.Assert.assertNull(functionSource30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNull(sourceInfo38);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.detach();
        dim0.clearAllBreakpoints();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData9);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        dim0.setBreakOnEnter(false);
        dim0.contextSwitch(100);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        java.lang.String str16 = dim0.eval("");
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(functionSource17);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) -1);
        dim0.setReturnValue(0);
        dim0.setReturnValue(1);
        dim0.setBreakOnExceptions(true);
        dim0.contextSwitch((int) (byte) 100);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        dim21.contextSwitch((int) (byte) 0);
        dim21.clearAllBreakpoints();
        dim21.dispose();
        dim21.setBreakOnReturn(false);
        dim21.clearAllBreakpoints();
        dim21.setReturnValue((int) (short) 10);
        java.lang.String str33 = dim21.eval("hi!");
        dim21.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource36 = dim21.functionSourceByName("");
        dim21.setBreakOnEnter(false);
        dim21.setBreakOnEnter(true);
        dim21.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim42 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim42.setBreak();
        dim42.contextSwitch((int) (byte) 0);
        dim42.clearAllBreakpoints();
        dim42.dispose();
        dim42.contextSwitch((int) (short) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData50 = dim42.currentContextData();
        dim42.setBreakOnEnter(false);
        dim42.detach();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = dim0.getObjectProperty((java.lang.Object) dim21, (java.lang.Object) dim42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "undefined" + "'", str33, "undefined");
        org.junit.Assert.assertNull(functionSource36);
        org.junit.Assert.assertNull(contextData50);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
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
        java.lang.String str18 = dim0.eval("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider19 = null;
        dim0.setSourceProvider(sourceProvider19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("");
        java.lang.Class<?> wildcardClass18 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        dim14.contextSwitch((int) ' ');
        dim14.setBreakOnEnter(true);
        dim14.setBreakOnExceptions(false);
        dim14.dispose();
        dim14.detach();
        dim14.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData25 = dim14.currentContextData();
        dim14.detach();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = dim0.objectToString((java.lang.Object) dim14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData25);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.dispose();
        dim0.contextSwitch(5);
        dim0.go();
        java.lang.Class<?> wildcardClass14 = dim0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue((int) (byte) 1);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.ContextFactory contextFactory23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray5 = dim0.functionNames();
        dim0.contextSwitch((int) (short) 0);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(sourceInfo10);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        java.lang.String str21 = dim18.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim18.setScopeProvider(scopeProvider22);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim18.functionSourceByName("undefined");
        dim18.clearAllBreakpoints();
        dim18.go();
        dim18.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData29 = dim18.currentContextData();
        dim18.setBreakOnReturn(true);
        dim18.detach();
        java.lang.String str34 = dim18.eval("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = dim0.objectToString((java.lang.Object) dim18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
        org.junit.Assert.assertNull(functionSource25);
        org.junit.Assert.assertNull(contextData29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "undefined" + "'", str34, "undefined");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
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
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim dim23 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim23.setBreak();
        dim23.contextSwitch((int) (byte) 0);
        dim23.clearAllBreakpoints();
        dim23.detach();
        dim23.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider31 = null;
        dim23.setScopeProvider(scopeProvider31);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider33 = null;
        dim23.setSourceProvider(sourceProvider33);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo36 = dim23.sourceInfo("");
        dim23.dispose();
        dim23.detach();
        dim23.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource41 = dim23.functionSourceByName("undefined");
        dim23.go();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback43 = null;
        dim23.setGuiCallback(guiCallback43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray45 = dim0.getObjectIds((java.lang.Object) guiCallback43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNull(functionSource22);
        org.junit.Assert.assertNull(sourceInfo36);
        org.junit.Assert.assertNull(functionSource41);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
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
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "undefined");
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
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String str11 = dim0.eval("undefined");
        dim0.setBreakOnReturn(false);
        dim0.setReturnValue((int) (short) -1);
        dim0.dispose();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("");
        dim0.setReturnValue(100);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.detach();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("hi!");
        java.lang.String str12 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        java.lang.String str16 = dim13.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim13.setScopeProvider(scopeProvider17);
        dim13.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider21 = null;
        dim13.setSourceProvider(sourceProvider21);
        java.lang.String[] strArray23 = dim13.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider24 = null;
        dim13.setSourceProvider(sourceProvider24);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider26 = null;
        dim13.setSourceProvider(sourceProvider26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray28 = dim0.getObjectIds((java.lang.Object) dim13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("hi!");
        dim0.detach();
        dim0.detach();
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource3 = dim0.functionSourceByName("");
        org.junit.Assert.assertNull(functionSource3);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.detach();
        dim0.setBreakOnExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.detach();
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray13 = dim0.functionNames();
        dim0.setReturnValue((int) (short) 1);
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider30 = null;
        dim16.setSourceProvider(sourceProvider30);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback32 = null;
        dim16.setGuiCallback(guiCallback32);
        com.google.javascript.rhino.head.tools.debugger.Dim dim34 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim34.setBreak();
        java.lang.String str37 = dim34.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider38 = null;
        dim34.setScopeProvider(scopeProvider38);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback40 = null;
        dim34.setGuiCallback(guiCallback40);
        dim34.contextSwitch((int) '4');
        dim34.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo46 = dim34.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback47 = null;
        dim34.setGuiCallback(guiCallback47);
        dim34.setBreakOnExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = dim0.getObjectProperty((java.lang.Object) dim16, (java.lang.Object) dim34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNull(functionSource23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "undefined" + "'", str37, "undefined");
        org.junit.Assert.assertNull(sourceInfo46);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
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
        dim0.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider3 = null;
        dim0.setScopeProvider(scopeProvider3);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback5 = null;
        dim0.setGuiCallback(guiCallback5);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider7 = null;
        dim0.setScopeProvider(scopeProvider7);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
        dim0.detach();
        dim0.contextSwitch(100);
        dim0.setReturnValue(100);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        dim14.contextSwitch((int) (byte) 0);
        dim14.clearAllBreakpoints();
        dim14.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim14.setScopeProvider(scopeProvider20);
        dim14.setBreakOnEnter(true);
        dim14.dispose();
        java.lang.String[] strArray25 = dim14.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = dim0.objectToString((java.lang.Object) strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.detach();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("");
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider9 = null;
        dim0.setScopeProvider(scopeProvider9);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.ContextFactory contextFactory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        dim0.go();
        dim0.contextSwitch((int) (short) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData21 = dim0.currentContextData();
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertNull(contextData21);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        dim15.contextSwitch((int) ' ');
        dim15.go();
        dim15.setBreak();
        java.lang.String[] strArray21 = dim15.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray22 = dim0.getObjectIds((java.lang.Object) strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("");
        java.lang.Class<?> wildcardClass12 = dim0.getClass();
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim0.setScopeProvider(scopeProvider13);
        dim0.contextSwitch((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo26 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim27 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim27.setBreak();
        java.lang.String str30 = dim27.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider31 = null;
        dim27.setScopeProvider(scopeProvider31);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback33 = null;
        dim27.setGuiCallback(guiCallback33);
        dim27.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo38 = dim27.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData39 = dim27.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider40 = null;
        dim27.setSourceProvider(sourceProvider40);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource43 = dim27.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData44 = dim27.currentContextData();
        dim27.clearAllBreakpoints();
        dim27.contextSwitch((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray48 = dim0.getObjectIds((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(sourceInfo26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "undefined" + "'", str30, "undefined");
        org.junit.Assert.assertNull(sourceInfo38);
        org.junit.Assert.assertNull(contextData39);
        org.junit.Assert.assertNull(functionSource43);
        org.junit.Assert.assertNull(contextData44);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("hi!");
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
        dim17.dispose();
        dim17.setBreakOnExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray34 = dim0.getObjectIds((java.lang.Object) dim17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "undefined" + "'", str29, "undefined");
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.contextSwitch((int) (short) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim9 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim9.setBreak();
        dim9.contextSwitch((int) ' ');
        dim9.setBreakOnEnter(true);
        java.lang.String str16 = dim9.eval("hi!");
        dim9.dispose();
        java.lang.String[] strArray18 = dim9.functionNames();
        java.lang.String[] strArray19 = dim9.functionNames();
        java.lang.Class<?> wildcardClass20 = strArray19.getClass();
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        dim21.contextSwitch((int) ' ');
        java.lang.String[] strArray25 = dim21.functionNames();
        dim21.setBreakOnExceptions(false);
        dim21.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider29 = null;
        dim21.setSourceProvider(sourceProvider29);
        dim21.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider32 = null;
        dim21.setSourceProvider(sourceProvider32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = dim0.getObjectProperty((java.lang.Object) strArray19, (java.lang.Object) dim21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        int int5 = contextData0.frameCount();
        int int6 = contextData0.frameCount();
        int int7 = contextData0.frameCount();
        int int8 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame10 = contextData0.getFrame(100);
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
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
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
        dim0.contextSwitch((int) (short) 10);
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnExceptions(false);
        dim0.go();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(functionSource11);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback21 = null;
        dim0.setGuiCallback(guiCallback21);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource24 = dim0.functionSourceByName("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNull(functionSource24);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        dim15.contextSwitch((int) ' ');
        dim15.go();
        dim15.setBreakOnReturn(true);
        dim15.contextSwitch(4);
        dim15.go();
        java.lang.String[] strArray25 = dim15.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim26 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim26.setBreak();
        dim26.contextSwitch((int) (byte) 0);
        dim26.clearAllBreakpoints();
        dim26.dispose();
        dim26.setBreakOnExceptions(true);
        java.lang.String[] strArray34 = dim26.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo36 = dim26.sourceInfo("");
        dim26.detach();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = dim0.getObjectProperty((java.lang.Object) strArray25, (java.lang.Object) dim26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNull(sourceInfo36);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
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
        dim0.go();
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray8 = dim0.functionNames();
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim0.setScopeProvider(scopeProvider14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(functionSource13);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData24 = dim0.currentContextData();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim26 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim26.setBreak();
        java.lang.String str29 = dim26.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider30 = null;
        dim26.setScopeProvider(scopeProvider30);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource33 = dim26.functionSourceByName("undefined");
        dim26.clearAllBreakpoints();
        dim26.setBreakOnExceptions(false);
        dim26.dispose();
        dim26.setBreak();
        dim26.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim dim40 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim40.setBreak();
        dim40.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback44 = null;
        dim40.setGuiCallback(guiCallback44);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData46 = dim40.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback47 = null;
        dim40.setGuiCallback(guiCallback47);
        dim40.setBreakOnExceptions(false);
        dim40.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo53 = dim40.sourceInfo("");
        dim40.contextSwitch(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = dim0.getObjectProperty((java.lang.Object) dim26, (java.lang.Object) dim40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource23);
        org.junit.Assert.assertNull(contextData24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "undefined" + "'", str29, "undefined");
        org.junit.Assert.assertNull(functionSource33);
        org.junit.Assert.assertNull(contextData46);
        org.junit.Assert.assertNull(sourceInfo53);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        dim21.contextSwitch((int) (byte) 0);
        dim21.clearAllBreakpoints();
        dim21.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider27 = null;
        dim21.setScopeProvider(scopeProvider27);
        dim21.setBreakOnEnter(true);
        dim21.setBreakOnExceptions(true);
        dim21.setReturnValue((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = dim0.objectToString((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource19);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
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
        dim0.setBreakOnExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("hi!", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
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
        dim0.setReturnValue((int) '4');
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.detach();
        dim0.dispose();
        dim0.contextSwitch(2);
        java.lang.String str14 = dim0.eval("hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
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
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
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
        dim0.setBreak();
        dim0.setBreakOnEnter(false);
        dim0.setBreakOnEnter(false);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        java.lang.String[] strArray8 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("hi!");
        dim0.setReturnValue(4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(sourceInfo10);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        java.lang.String str13 = dim10.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim10.setScopeProvider(scopeProvider14);
        dim10.go();
        dim10.contextSwitch((int) (byte) 1);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData19 = dim10.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData20 = dim10.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        java.lang.String str24 = dim21.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider25 = null;
        dim21.setScopeProvider(scopeProvider25);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback27 = null;
        dim21.setGuiCallback(guiCallback27);
        dim21.contextSwitch((int) '4');
        dim21.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider32 = null;
        dim21.setScopeProvider(scopeProvider32);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData34 = dim21.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo36 = dim21.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback37 = null;
        dim21.setGuiCallback(guiCallback37);
        java.lang.String[] strArray39 = dim21.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo41 = dim21.sourceInfo("");
        java.lang.Class<?> wildcardClass42 = dim21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = dim0.getObjectProperty((java.lang.Object) dim10, (java.lang.Object) wildcardClass42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(contextData19);
        org.junit.Assert.assertNull(contextData20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "undefined" + "'", str24, "undefined");
        org.junit.Assert.assertNull(contextData34);
        org.junit.Assert.assertNull(sourceInfo36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNull(sourceInfo41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        java.lang.String[] strArray9 = dim0.functionNames();
        java.lang.String str11 = dim0.eval("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
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
        com.google.javascript.rhino.head.ContextFactory contextFactory22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(contextData19);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
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
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        java.lang.String str21 = dim18.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim18.setScopeProvider(scopeProvider22);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim18.functionSourceByName("undefined");
        dim18.clearAllBreakpoints();
        dim18.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData28 = dim18.currentContextData();
        dim18.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim30 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim30.setBreak();
        dim30.contextSwitch((int) (byte) 0);
        dim30.clearAllBreakpoints();
        dim30.setBreakOnReturn(true);
        dim30.setBreakOnExceptions(true);
        dim30.setBreakOnExceptions(true);
        java.lang.String[] strArray41 = dim30.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = dim0.getObjectProperty((java.lang.Object) dim18, (java.lang.Object) strArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
        org.junit.Assert.assertNull(functionSource25);
        org.junit.Assert.assertNull(contextData28);
        org.junit.Assert.assertNotNull(strArray41);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo5 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) -1);
        dim0.setReturnValue((int) (short) 0);
        dim0.setBreakOnReturn(true);
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(sourceInfo5);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
        dim0.setBreakOnReturn(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.dispose();
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.contextSwitch((int) '4');
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.dispose();
        java.lang.String[] strArray11 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        dim0.detach();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        dim0.setBreak();
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.contextSwitch((int) (short) 0);
        dim0.detach();
        dim0.clearAllBreakpoints();
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        dim0.setBreakOnEnter(true);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider15 = null;
        dim0.setSourceProvider(sourceProvider15);
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        dim17.contextSwitch((int) ' ');
        dim17.go();
        dim17.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo24 = dim17.sourceInfo("hi!");
        dim17.setBreak();
        dim17.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim28 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim28.setBreak();
        java.lang.String str31 = dim28.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider32 = null;
        dim28.setScopeProvider(scopeProvider32);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource35 = dim28.functionSourceByName("undefined");
        java.lang.String[] strArray36 = dim28.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = dim0.getObjectProperty((java.lang.Object) true, (java.lang.Object) dim28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource14);
        org.junit.Assert.assertNull(sourceInfo24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "undefined" + "'", str31, "undefined");
        org.junit.Assert.assertNull(functionSource35);
        org.junit.Assert.assertNotNull(strArray36);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame3 = contextData0.getFrame(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
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
        dim0.detach();
        dim0.setBreakOnExceptions(true);
        dim0.contextSwitch(5);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) ' ');
        dim13.setBreakOnEnter(true);
        dim13.setBreakOnExceptions(false);
        dim13.dispose();
        dim13.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo24 = dim13.sourceInfo("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray25 = dim0.getObjectIds((java.lang.Object) dim13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(sourceInfo24);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
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
        java.lang.Class<?> wildcardClass21 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.ContextFactory contextFactory7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) (byte) 100);
        dim0.setReturnValue((int) (short) 1);
        dim0.setBreakOnReturn(true);
        java.lang.Class<?> wildcardClass13 = dim0.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo22 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback23 = null;
        dim0.setGuiCallback(guiCallback23);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo22);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData18 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(contextData18);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
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
        java.lang.Class<?> wildcardClass15 = dim0.getClass();
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback9 = null;
        dim0.setGuiCallback(guiCallback9);
        dim0.contextSwitch((int) (short) 1);
        dim0.setReturnValue((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim0.setGuiCallback(guiCallback17);
        dim0.setBreak();
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
        org.junit.Assert.assertNull(functionSource13);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnExceptions(true);
        dim0.detach();
        java.lang.String str9 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "undefined" + "'", str9, "undefined");
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
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
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) 'a');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
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
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim20 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim20.setBreak();
        dim20.contextSwitch((int) (byte) 0);
        dim20.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider26 = null;
        dim20.setScopeProvider(scopeProvider26);
        java.lang.String[] strArray28 = dim20.functionNames();
        dim20.clearAllBreakpoints();
        dim20.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray31 = dim0.getObjectIds((java.lang.Object) dim20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
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
        dim0.setReturnValue((int) (short) -1);
        dim0.setBreakOnReturn(true);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setBreakOnEnter(true);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("");
        dim0.setReturnValue((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource11);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        dim0.setBreakOnEnter(false);
        dim0.contextSwitch(100);
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) ' ');
        dim13.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider18 = null;
        dim13.setSourceProvider(sourceProvider18);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo21 = dim13.sourceInfo("");
        dim13.setBreakOnReturn(false);
        dim13.setBreak();
        dim13.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo27 = dim13.sourceInfo("hi!");
        dim13.setBreakOnExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray30 = dim0.getObjectIds((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNull(sourceInfo21);
        org.junit.Assert.assertNull(sourceInfo27);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnReturn(false);
        dim0.go();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        java.lang.String str12 = dim0.eval("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
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
        java.lang.Class<?> wildcardClass17 = dim0.getClass();
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
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
        dim0.detach();
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnReturn(true);
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
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
        dim0.contextSwitch((int) (short) 0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(sourceInfo10);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo5 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo7 = dim0.sourceInfo("");
        dim0.setBreakOnExceptions(true);
        org.junit.Assert.assertNull(sourceInfo5);
        org.junit.Assert.assertNull(sourceInfo7);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
        dim0.dispose();
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String str11 = dim0.eval("undefined");
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        java.lang.String str7 = dim0.eval("");
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
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
        java.lang.Class<?> wildcardClass21 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNull(functionSource18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertNull(functionSource22);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
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
        dim0.setBreakOnReturn(false);
        dim0.detach();
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider18 = null;
        dim0.setSourceProvider(sourceProvider18);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
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
        java.lang.String[] strArray19 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback20 = null;
        dim0.setGuiCallback(guiCallback20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider16 = null;
        dim0.setScopeProvider(scopeProvider16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider17 = null;
        dim0.setSourceProvider(sourceProvider17);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim0.setScopeProvider(scopeProvider20);
        dim0.setBreakOnExceptions(false);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.setBreakOnEnter(true);
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame9 = contextData0.getFrame((-1));
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
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
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
        dim0.setBreakOnReturn(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(true);
        dim0.setBreak();
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
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
        com.google.javascript.rhino.head.ContextFactory contextFactory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.clearAllBreakpoints();
        dim0.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.detach();
        dim0.setBreak();
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
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
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
        java.lang.String str21 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider22 = null;
        dim0.setSourceProvider(sourceProvider22);
        java.lang.String[] strArray24 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
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
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(0);
        dim0.setBreak();
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        java.lang.String str21 = dim18.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim18.setScopeProvider(scopeProvider22);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim18.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo27 = dim18.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData28 = dim18.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo30 = dim18.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo32 = dim18.sourceInfo("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = dim0.objectToString((java.lang.Object) sourceInfo32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
        org.junit.Assert.assertNull(functionSource25);
        org.junit.Assert.assertNull(sourceInfo27);
        org.junit.Assert.assertNull(contextData28);
        org.junit.Assert.assertNull(sourceInfo30);
        org.junit.Assert.assertNull(sourceInfo32);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("hi!");
        java.lang.Class<?> wildcardClass12 = dim0.getClass();
        org.junit.Assert.assertNull(functionSource11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setReturnValue(5);
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        java.lang.String str14 = dim11.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim11.setScopeProvider(scopeProvider15);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim11.functionSourceByName("undefined");
        dim11.clearAllBreakpoints();
        dim11.setBreakOnExceptions(false);
        dim11.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource24 = dim11.functionSourceByName("undefined");
        dim11.setBreakOnReturn(true);
        dim11.contextSwitch((int) (byte) 10);
        com.google.javascript.rhino.head.tools.debugger.Dim dim29 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim29.setBreak();
        java.lang.String str32 = dim29.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider33 = null;
        dim29.setScopeProvider(scopeProvider33);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback35 = null;
        dim29.setGuiCallback(guiCallback35);
        dim29.contextSwitch((int) '4');
        dim29.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider40 = null;
        dim29.setScopeProvider(scopeProvider40);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData42 = dim29.currentContextData();
        java.lang.String[] strArray43 = dim29.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = dim0.getObjectProperty((java.lang.Object) dim11, (java.lang.Object) strArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(functionSource18);
        org.junit.Assert.assertNull(functionSource24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "undefined" + "'", str32, "undefined");
        org.junit.Assert.assertNull(contextData42);
        org.junit.Assert.assertNotNull(strArray43);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.dispose();
        dim0.dispose();
        dim0.go();
        dim0.clearAllBreakpoints();
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        dim10.contextSwitch((int) (byte) 0);
        dim10.clearAllBreakpoints();
        dim10.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim10.functionSourceByName("");
        dim10.setBreak();
        dim10.dispose();
        dim10.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim10.functionSourceByName("");
        dim10.setReturnValue((int) (byte) 10);
        dim10.clearAllBreakpoints();
        dim10.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray27 = dim0.getObjectIds((java.lang.Object) dim10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertNull(functionSource22);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim22 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim22.setBreak();
        dim22.contextSwitch((int) ' ');
        dim22.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider27 = null;
        dim22.setSourceProvider(sourceProvider27);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo30 = dim22.sourceInfo("");
        dim22.setBreakOnReturn(false);
        dim22.setBreakOnExceptions(true);
        dim22.dispose();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = dim0.objectToString((java.lang.Object) dim22);
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
        org.junit.Assert.assertNull(sourceInfo20);
        org.junit.Assert.assertNull(sourceInfo30);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreakOnEnter(false);
        java.lang.String[] strArray5 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame17 = contextData0.getFrame(10);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        java.lang.String str18 = dim15.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim15.setScopeProvider(scopeProvider19);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback21 = null;
        dim15.setGuiCallback(guiCallback21);
        dim15.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider24 = null;
        dim15.setSourceProvider(sourceProvider24);
        java.lang.String[] strArray26 = dim15.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback27 = null;
        dim15.setGuiCallback(guiCallback27);
        dim15.clearAllBreakpoints();
        dim15.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim32 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim32.setBreak();
        dim32.contextSwitch((int) ' ');
        dim32.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider37 = null;
        dim32.setSourceProvider(sourceProvider37);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo40 = dim32.sourceInfo("");
        dim32.setBreakOnReturn(false);
        dim32.setBreak();
        dim32.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource46 = dim32.functionSourceByName("");
        java.lang.String[] strArray47 = dim32.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = dim0.getObjectProperty((java.lang.Object) true, (java.lang.Object) dim32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(sourceInfo40);
        org.junit.Assert.assertNull(functionSource46);
        org.junit.Assert.assertNotNull(strArray47);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        java.lang.String[] strArray10 = dim0.functionNames();
        java.lang.Class<?> wildcardClass11 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
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
        java.lang.String[] strArray21 = dim0.functionNames();
        dim0.dispose();
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) (byte) 100);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim0.setScopeProvider(scopeProvider14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData10);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim0.setScopeProvider(scopeProvider18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(functionSource17);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        java.lang.String[] strArray10 = dim0.functionNames();
        java.lang.String[] strArray11 = dim0.functionNames();
        dim0.setReturnValue((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider16 = null;
        dim0.setSourceProvider(sourceProvider16);
        java.lang.String[] strArray18 = dim0.functionNames();
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnExceptions(false);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.detach();
        dim0.setBreakOnReturn(true);
        dim0.setReturnValue(0);
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
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
        java.lang.String[] strArray19 = dim0.functionNames();
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider15 = null;
        dim0.setSourceProvider(sourceProvider15);
        dim0.go();
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource14);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim0.setScopeProvider(scopeProvider20);
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource19);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
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
        java.lang.String[] strArray16 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.setBreak();
        dim0.detach();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
        java.lang.String[] strArray14 = dim0.functionNames();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider16 = null;
        dim0.setScopeProvider(scopeProvider16);
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("hi!");
        java.lang.String str13 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
        dim0.setBreakOnExceptions(true);
        java.lang.String[] strArray22 = dim0.functionNames();
        dim0.setReturnValue((int) '4');
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback2 = null;
        dim0.setGuiCallback(guiCallback2);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource5 = dim0.functionSourceByName("");
        dim0.contextSwitch((int) (byte) 1);
        org.junit.Assert.assertNull(functionSource5);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
        dim0.go();
        java.lang.String[] strArray17 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
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
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
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
        dim0.setReturnValue((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setBreakOnEnter(true);
        dim0.setBreak();
        dim0.setReturnValue(1);
        dim0.dispose();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        java.lang.String str22 = dim19.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim19.setScopeProvider(scopeProvider23);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback25 = null;
        dim19.setGuiCallback(guiCallback25);
        dim19.contextSwitch((int) '4');
        dim19.dispose();
        dim19.setReturnValue((int) (byte) 1);
        dim19.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo34 = dim19.sourceInfo("undefined");
        dim19.detach();
        dim19.setBreak();
        dim19.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray38 = dim0.getObjectIds((java.lang.Object) dim19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
        org.junit.Assert.assertNull(sourceInfo34);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
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
        dim0.setBreakOnExceptions(true);
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dim0.objectToString(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        dim0.dispose();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
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
        dim0.setBreakOnReturn(false);
        java.lang.String str15 = dim0.eval("");
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 0);
        java.lang.String str20 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider21 = null;
        dim0.setSourceProvider(sourceProvider21);
        com.google.javascript.rhino.head.tools.debugger.Dim dim23 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim23.setBreak();
        java.lang.String str26 = dim23.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider27 = null;
        dim23.setScopeProvider(scopeProvider27);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback29 = null;
        dim23.setGuiCallback(guiCallback29);
        dim23.contextSwitch((int) '4');
        dim23.dispose();
        dim23.setReturnValue((int) (byte) 1);
        dim23.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData37 = dim23.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider38 = null;
        dim23.setSourceProvider(sourceProvider38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = dim0.objectToString((java.lang.Object) sourceProvider38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "undefined" + "'", str26, "undefined");
        org.junit.Assert.assertNull(contextData37);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
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
        dim0.contextSwitch(10);
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
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
        java.lang.String str15 = dim0.eval("hi!");
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider16 = null;
        dim0.setSourceProvider(sourceProvider16);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) 1);
        com.google.javascript.rhino.head.tools.debugger.Dim dim22 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim22.setBreak();
        java.lang.String str25 = dim22.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider26 = null;
        dim22.setScopeProvider(scopeProvider26);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource29 = dim22.functionSourceByName("undefined");
        dim22.clearAllBreakpoints();
        java.lang.String[] strArray31 = dim22.functionNames();
        dim22.dispose();
        dim22.setBreakOnExceptions(false);
        dim22.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData37 = dim22.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim38 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim38.setBreak();
        dim38.contextSwitch((int) ' ');
        dim38.setBreakOnEnter(true);
        java.lang.String str45 = dim38.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback46 = null;
        dim38.setGuiCallback(guiCallback46);
        dim38.setBreak();
        dim38.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider50 = null;
        dim38.setScopeProvider(scopeProvider50);
        dim38.setReturnValue((int) (short) 0);
        dim38.setBreakOnEnter(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = dim0.getObjectProperty((java.lang.Object) dim22, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "undefined" + "'", str25, "undefined");
        org.junit.Assert.assertNull(functionSource29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNull(contextData37);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "undefined" + "'", str45, "undefined");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
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
        dim0.setBreakOnReturn(false);
        dim0.dispose();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData23 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(contextData23);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
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
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame6 = contextData0.getFrame(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -6 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider16 = null;
        dim0.setScopeProvider(scopeProvider16);
        dim0.setBreakOnEnter(false);
        java.lang.Class<?> wildcardClass20 = dim0.getClass();
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
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
        dim0.go();
        dim0.setBreakOnEnter(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        dim0.detach();
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(contextData10);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue(3);
        java.lang.String[] strArray8 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        java.lang.String str13 = dim10.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim10.setScopeProvider(scopeProvider14);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim10.functionSourceByName("undefined");
        dim10.clearAllBreakpoints();
        dim10.go();
        java.lang.String str21 = dim10.eval("hi!");
        dim10.detach();
        dim10.clearAllBreakpoints();
        dim10.setBreakOnEnter(true);
        dim10.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback27 = null;
        dim10.setGuiCallback(guiCallback27);
        dim10.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource31 = dim10.functionSourceByName("undefined");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray32 = dim0.getObjectIds((java.lang.Object) functionSource31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(contextData9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
        org.junit.Assert.assertNull(functionSource31);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim0.functionSourceByName("");
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(functionSource22);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
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
        dim0.setBreak();
        dim0.dispose();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim22 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim22.setBreak();
        dim22.contextSwitch((int) ' ');
        dim22.go();
        dim22.setBreak();
        dim22.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource31 = dim22.functionSourceByName("");
        dim22.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray33 = dim0.getObjectIds((java.lang.Object) dim22);
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
        org.junit.Assert.assertNull(functionSource31);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("hi!");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        dim15.contextSwitch((int) (byte) 0);
        dim15.clearAllBreakpoints();
        dim15.detach();
        dim15.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim15.setScopeProvider(scopeProvider23);
        dim15.contextSwitch(100);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider27 = null;
        dim15.setSourceProvider(sourceProvider27);
        java.lang.String[] strArray29 = dim15.functionNames();
        dim15.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo32 = dim15.sourceInfo("hi!");
        dim15.setBreakOnReturn(true);
        java.lang.String[] strArray35 = dim15.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim36 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim36.setBreak();
        dim36.contextSwitch((int) ' ');
        java.lang.String[] strArray40 = dim36.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider41 = null;
        dim36.setScopeProvider(scopeProvider41);
        dim36.setBreakOnEnter(true);
        dim36.setBreak();
        dim36.setReturnValue(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = dim0.getObjectProperty((java.lang.Object) strArray35, (java.lang.Object) dim36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNull(sourceInfo32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) (byte) 0);
        dim13.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim13.setScopeProvider(scopeProvider19);
        dim13.setBreak();
        dim13.detach();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = dim0.getObjectProperty((java.lang.Object) dim13, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        java.lang.String str18 = dim0.eval("undefined");
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
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
        dim0.contextSwitch((-1));
        java.lang.Class<?> wildcardClass20 = dim0.getClass();
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
        java.lang.String str17 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        java.lang.String str21 = dim18.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim18.setScopeProvider(scopeProvider22);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim18.functionSourceByName("undefined");
        dim18.clearAllBreakpoints();
        dim18.go();
        dim18.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData29 = dim18.currentContextData();
        dim18.setBreakOnReturn(true);
        dim18.detach();
        java.lang.String str34 = dim18.eval("");
        dim18.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider36 = null;
        dim18.setScopeProvider(scopeProvider36);
        dim18.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider39 = null;
        dim18.setSourceProvider(sourceProvider39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = dim0.objectToString((java.lang.Object) dim18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
        org.junit.Assert.assertNull(functionSource25);
        org.junit.Assert.assertNull(contextData29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "undefined" + "'", str34, "undefined");
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        dim0.contextSwitch((int) (byte) -1);
        java.lang.String str20 = dim0.eval("");
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.detach();
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("undefined");
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        java.lang.String[] strArray19 = dim0.functionNames();
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        dim0.setReturnValue((int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
        dim0.dispose();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData22 = dim0.currentContextData();
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(functionSource19);
        org.junit.Assert.assertNull(contextData22);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
        dim0.setBreakOnEnter(false);
        dim0.contextSwitch((int) (byte) 1);
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
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
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) (byte) 0);
        dim18.clearAllBreakpoints();
        dim18.dispose();
        dim18.setBreakOnReturn(false);
        dim18.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource28 = dim18.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource30 = dim18.functionSourceByName("");
        java.lang.String str32 = dim18.eval("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider33 = null;
        dim18.setScopeProvider(scopeProvider33);
        dim18.setBreakOnExceptions(false);
        dim18.detach();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray38 = dim0.getObjectIds((java.lang.Object) dim18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource28);
        org.junit.Assert.assertNull(functionSource30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "undefined" + "'", str32, "undefined");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        dim0.detach();
        java.lang.String str12 = dim0.eval("hi!");
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
        dim13.contextSwitch(3);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider30 = null;
        dim13.setSourceProvider(sourceProvider30);
        com.google.javascript.rhino.head.tools.debugger.Dim dim32 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim32.setBreak();
        dim32.contextSwitch((int) (byte) 0);
        dim32.clearAllBreakpoints();
        dim32.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider38 = null;
        dim32.setScopeProvider(scopeProvider38);
        dim32.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = dim0.getObjectProperty((java.lang.Object) sourceProvider30, (java.lang.Object) dim32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(sourceInfo22);
        org.junit.Assert.assertNull(contextData25);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = contextData10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData10);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.detach();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData10);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback9 = null;
        dim0.setGuiCallback(guiCallback9);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) ' ');
        dim13.go();
        dim13.setBreakOnReturn(true);
        dim13.contextSwitch(4);
        dim13.go();
        dim13.setBreakOnReturn(true);
        dim13.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider27 = null;
        dim13.setSourceProvider(sourceProvider27);
        dim13.contextSwitch(100);
        dim13.clearAllBreakpoints();
        dim13.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider33 = null;
        dim13.setScopeProvider(scopeProvider33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray35 = dim0.getObjectIds((java.lang.Object) dim13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource14);
        org.junit.Assert.assertNull(contextData15);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        java.lang.String str8 = dim0.eval("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        java.lang.String str13 = dim0.eval("");
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
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
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
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
        dim0.setBreakOnReturn(true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
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
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData15 = dim0.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData15);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("");
        dim0.setReturnValue(100);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("hi!");
        dim0.detach();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
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
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) ' ');
        java.lang.String[] strArray22 = dim18.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim18.setScopeProvider(scopeProvider23);
        dim18.setBreakOnEnter(true);
        dim18.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource29 = dim18.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo31 = dim18.sourceInfo("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = dim0.objectToString((java.lang.Object) dim18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNull(functionSource29);
        org.junit.Assert.assertNull(sourceInfo31);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource20 = dim0.functionSourceByName("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = functionSource20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(sourceInfo16);
        org.junit.Assert.assertNull(functionSource20);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.go();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
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
        java.lang.Class<?> wildcardClass23 = dim0.getClass();
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim0.setScopeProvider(scopeProvider20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNull(functionSource19);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnEnter(false);
        java.lang.String str13 = dim0.eval("hi!");
        dim0.setBreakOnReturn(false);
        java.lang.String[] strArray16 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData19 = dim0.currentContextData();
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim0.setScopeProvider(scopeProvider22);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNull(contextData19);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
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
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) 'a');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo19 = dim0.sourceInfo("");
        java.lang.String[] strArray20 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNull(functionSource8);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
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
        java.lang.String[] strArray19 = dim0.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("");
        dim0.setBreakOnExceptions(false);
        java.lang.String[] strArray19 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
        java.lang.Class<?> wildcardClass19 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
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
        dim0.setReturnValue((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
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
        java.lang.String str19 = dim0.eval("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
    }
}

