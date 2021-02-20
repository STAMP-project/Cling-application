import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        dim0.contextSwitch((int) '#');
        com.google.javascript.rhino.head.ContextFactory contextFactory4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(sourceInfo19);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        dim15.contextSwitch((int) (byte) 0);
        dim15.clearAllBreakpoints();
        dim15.dispose();
        dim15.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource24 = dim15.functionSourceByName("undefined");
        java.lang.String[] strArray25 = dim15.functionNames();
        dim15.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider28 = null;
        dim15.setScopeProvider(scopeProvider28);
        dim15.go();
        java.lang.String[] strArray31 = dim15.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray32 = dim0.getObjectIds((java.lang.Object) dim15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(functionSource24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        dim0.setBreak();
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        java.lang.String[] strArray17 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim0.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider20 = null;
        dim0.setSourceProvider(sourceProvider20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertNull(contextData17);
        org.junit.Assert.assertNull(contextData18);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        java.lang.String[] strArray8 = dim0.functionNames();
        java.lang.String[] strArray9 = dim0.functionNames();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim0.functionSourceByName("");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(functionSource21);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider18 = null;
        dim0.setSourceProvider(sourceProvider18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame14 = contextData0.getFrame((int) (short) 0);
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
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        int int5 = contextData0.frameCount();
        int int6 = contextData0.frameCount();
        java.lang.Class<?> wildcardClass7 = contextData0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("undefined");
        dim0.go();
        org.junit.Assert.assertNull(sourceInfo10);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        java.lang.String str22 = dim19.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim19.setScopeProvider(scopeProvider23);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource26 = dim19.functionSourceByName("undefined");
        dim19.clearAllBreakpoints();
        dim19.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData30 = dim19.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider31 = null;
        dim19.setSourceProvider(sourceProvider31);
        dim19.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo36 = dim19.sourceInfo("undefined");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray37 = dim0.getObjectIds((java.lang.Object) "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(contextData16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
        org.junit.Assert.assertNull(functionSource26);
        org.junit.Assert.assertNull(contextData30);
        org.junit.Assert.assertNull(sourceInfo36);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        dim17.contextSwitch((int) ' ');
        dim17.go();
        dim17.setBreakOnReturn(true);
        dim17.contextSwitch(4);
        dim17.go();
        dim17.setBreakOnReturn(true);
        dim17.contextSwitch((int) (short) 1);
        dim17.detach();
        dim17.setReturnValue(3);
        dim17.go();
        dim17.dispose();
        dim17.setBreakOnEnter(true);
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource53 = dim38.functionSourceByName("");
        java.lang.String str55 = dim38.eval("hi!");
        dim38.setBreakOnReturn(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = dim0.getObjectProperty((java.lang.Object) true, (java.lang.Object) dim38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "undefined" + "'", str50, "undefined");
        org.junit.Assert.assertNull(contextData51);
        org.junit.Assert.assertNull(functionSource53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "undefined" + "'", str55, "undefined");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        dim0.setReturnValue((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        java.lang.String str24 = dim21.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider25 = null;
        dim21.setScopeProvider(scopeProvider25);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource28 = dim21.functionSourceByName("undefined");
        dim21.clearAllBreakpoints();
        dim21.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData32 = dim21.currentContextData();
        dim21.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider35 = null;
        dim21.setScopeProvider(scopeProvider35);
        dim21.clearAllBreakpoints();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray38 = dim0.getObjectIds((java.lang.Object) dim21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "undefined" + "'", str24, "undefined");
        org.junit.Assert.assertNull(functionSource28);
        org.junit.Assert.assertNull(contextData32);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        dim0.setReturnValue(4);
        dim0.contextSwitch(4);
        dim0.detach();
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        java.lang.String[] strArray17 = dim0.functionNames();
        dim0.setBreakOnExceptions(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource10);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) (byte) 0);
        dim13.clearAllBreakpoints();
        dim13.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim13.setScopeProvider(scopeProvider19);
        dim13.detach();
        dim13.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray23 = dim0.getObjectIds((java.lang.Object) dim13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.setReturnValue((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        dim12.contextSwitch((int) (byte) 0);
        dim12.clearAllBreakpoints();
        dim12.detach();
        dim12.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim12.setScopeProvider(scopeProvider20);
        dim12.dispose();
        dim12.contextSwitch(5);
        com.google.javascript.rhino.head.tools.debugger.Dim dim25 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim25.setBreak();
        dim25.contextSwitch((int) (byte) 0);
        dim25.clearAllBreakpoints();
        dim25.dispose();
        dim25.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData33 = dim25.currentContextData();
        dim25.detach();
        dim25.dispose();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = dim0.getObjectProperty((java.lang.Object) dim12, (java.lang.Object) dim25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData33);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        java.lang.String str14 = dim11.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim11.setScopeProvider(scopeProvider15);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim11.functionSourceByName("undefined");
        dim11.clearAllBreakpoints();
        dim11.go();
        dim11.setReturnValue((int) (short) 1);
        dim11.setBreakOnReturn(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray25 = dim0.getObjectIds((java.lang.Object) dim11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String[] strArray7 = dim0.functionNames();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        int int5 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame7 = contextData0.getFrame(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo14);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.setReturnValue((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        dim0.contextSwitch(2);
        java.lang.Class<?> wildcardClass15 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertNull(contextData21);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(true);
        dim0.dispose();
        dim0.dispose();
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider18 = null;
        dim0.setSourceProvider(sourceProvider18);
        java.lang.String[] strArray20 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim20 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim20.setBreak();
        java.lang.String str23 = dim20.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider24 = null;
        dim20.setScopeProvider(scopeProvider24);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback26 = null;
        dim20.setGuiCallback(guiCallback26);
        dim20.contextSwitch((int) '4');
        dim20.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo32 = dim20.sourceInfo("undefined");
        dim20.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData34 = dim20.currentContextData();
        dim20.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData36 = dim20.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim37 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim37.setBreak();
        java.lang.String str40 = dim37.eval("hi!");
        dim37.setBreakOnExceptions(true);
        dim37.setBreakOnReturn(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = dim0.getObjectProperty((java.lang.Object) contextData36, (java.lang.Object) dim37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "undefined" + "'", str23, "undefined");
        org.junit.Assert.assertNull(sourceInfo32);
        org.junit.Assert.assertNull(contextData34);
        org.junit.Assert.assertNull(contextData36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "undefined" + "'", str40, "undefined");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        dim0.setBreakOnEnter(true);
        dim0.go();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        dim17.contextSwitch((int) (byte) 0);
        dim17.clearAllBreakpoints();
        dim17.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim17.setScopeProvider(scopeProvider23);
        dim17.setBreakOnEnter(true);
        dim17.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim29 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim29.setBreak();
        java.lang.String str32 = dim29.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider33 = null;
        dim29.setScopeProvider(scopeProvider33);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback35 = null;
        dim29.setGuiCallback(guiCallback35);
        dim29.contextSwitch((int) '4');
        dim29.dispose();
        dim29.detach();
        dim29.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = dim0.getObjectProperty((java.lang.Object) false, (java.lang.Object) dim29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "undefined" + "'", str32, "undefined");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.go();
        java.lang.String str12 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) (byte) 0);
        dim13.clearAllBreakpoints();
        dim13.detach();
        dim13.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim13.setScopeProvider(scopeProvider21);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider23 = null;
        dim13.setSourceProvider(sourceProvider23);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo26 = dim13.sourceInfo("");
        dim13.dispose();
        dim13.detach();
        dim13.go();
        java.lang.String str31 = dim13.eval("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = dim0.objectToString((java.lang.Object) dim13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(sourceInfo26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "undefined" + "'", str31, "undefined");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        java.lang.String str21 = dim18.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim18.setScopeProvider(scopeProvider22);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim18.functionSourceByName("undefined");
        dim18.clearAllBreakpoints();
        dim18.detach();
        dim18.setReturnValue(3);
        dim18.setReturnValue(0);
        dim18.setBreakOnEnter(true);
        dim18.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo37 = dim18.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource39 = dim18.functionSourceByName("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray40 = dim0.getObjectIds((java.lang.Object) functionSource39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
        org.junit.Assert.assertNull(functionSource25);
        org.junit.Assert.assertNull(sourceInfo37);
        org.junit.Assert.assertNull(functionSource39);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        dim0.setBreakOnReturn(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(contextData16);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnReturn(false);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        java.lang.String str18 = dim0.eval("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        dim0.detach();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(true);
        dim0.dispose();
        dim0.setReturnValue((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "");
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
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback2 = null;
        dim0.setGuiCallback(guiCallback2);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        java.lang.String[] strArray17 = dim0.functionNames();
        dim0.contextSwitch(4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        int int5 = contextData0.frameCount();
        int int6 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame8 = contextData0.getFrame(2);
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
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource19);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        java.lang.String str16 = dim13.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim13.setScopeProvider(scopeProvider17);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource20 = dim13.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo22 = dim13.sourceInfo("undefined");
        dim13.dispose();
        dim13.clearAllBreakpoints();
        java.lang.Class<?> wildcardClass25 = dim13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = dim0.objectToString((java.lang.Object) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNull(functionSource20);
        org.junit.Assert.assertNull(sourceInfo22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame14 = contextData0.getFrame(100);
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
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        java.lang.Class<?> wildcardClass12 = dim0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim14.setGuiCallback(guiCallback16);
        dim14.setBreakOnReturn(false);
        dim14.setBreakOnExceptions(true);
        dim14.setBreakOnExceptions(true);
        java.lang.Class<?> wildcardClass24 = dim14.getClass();
        com.google.javascript.rhino.head.tools.debugger.Dim dim25 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim25.setBreak();
        dim25.contextSwitch((int) ' ');
        java.lang.String[] strArray29 = dim25.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider30 = null;
        dim25.setScopeProvider(scopeProvider30);
        dim25.setBreakOnEnter(true);
        dim25.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource36 = dim25.functionSourceByName("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = dim0.getObjectProperty((java.lang.Object) wildcardClass24, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNull(functionSource36);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim13.setGuiCallback(guiCallback17);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData19 = dim13.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback20 = null;
        dim13.setGuiCallback(guiCallback20);
        dim13.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim13.functionSourceByName("");
        dim13.contextSwitch((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray28 = dim0.getObjectIds((java.lang.Object) dim13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData19);
        org.junit.Assert.assertNull(functionSource25);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("undefined");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) (byte) 0);
        dim18.contextSwitch((int) (short) 1);
        dim18.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim25 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim25.setBreak();
        dim25.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray29 = dim25.functionNames();
        dim25.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider32 = null;
        dim25.setSourceProvider(sourceProvider32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = dim0.getObjectProperty((java.lang.Object) dim18, (java.lang.Object) sourceProvider32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim16 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim16.setBreak();
        dim16.contextSwitch((int) (byte) 0);
        dim16.clearAllBreakpoints();
        dim16.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource23 = dim16.functionSourceByName("");
        dim16.setBreak();
        dim16.dispose();
        dim16.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider27 = null;
        dim16.setSourceProvider(sourceProvider27);
        java.lang.String[] strArray29 = dim16.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim30 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim30.setBreak();
        dim30.contextSwitch((int) ' ');
        dim30.setBreakOnEnter(true);
        java.lang.String str37 = dim30.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback38 = null;
        dim30.setGuiCallback(guiCallback38);
        dim30.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData41 = dim30.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = dim0.getObjectProperty((java.lang.Object) dim16, (java.lang.Object) contextData41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(functionSource23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "undefined" + "'", str37, "undefined");
        org.junit.Assert.assertNull(contextData41);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        com.google.javascript.rhino.head.ContextFactory contextFactory16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        java.lang.String[] strArray17 = dim0.functionNames();
        java.lang.Class<?> wildcardClass18 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        java.lang.Class<?> wildcardClass11 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider3 = null;
        dim0.setScopeProvider(scopeProvider3);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback5 = null;
        dim0.setGuiCallback(guiCallback5);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData7 = dim0.currentContextData();
        org.junit.Assert.assertNull(contextData7);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo5 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo7 = dim0.sourceInfo("");
        org.junit.Assert.assertNull(sourceInfo5);
        org.junit.Assert.assertNull(sourceInfo7);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData9);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setBreakOnEnter(true);
        dim0.setBreak();
        java.lang.String str11 = dim0.eval("");
        dim0.clearAllBreakpoints();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        dim21.contextSwitch((int) ' ');
        java.lang.String[] strArray25 = dim21.functionNames();
        dim21.setBreakOnExceptions(false);
        dim21.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider29 = null;
        dim21.setSourceProvider(sourceProvider29);
        dim21.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray32 = dim0.getObjectIds((java.lang.Object) dim21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback2 = null;
        dim0.setGuiCallback(guiCallback2);
        dim0.setBreakOnReturn(false);
        dim0.detach();
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        dim0.setBreak();
        com.google.javascript.rhino.head.ContextFactory contextFactory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo9);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(contextData9);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim0.setScopeProvider(scopeProvider18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("");
        java.lang.Class<?> wildcardClass9 = dim0.getClass();
        org.junit.Assert.assertNull(functionSource8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.go();
        java.lang.String str8 = dim0.eval("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.detach();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider9 = null;
        dim0.setScopeProvider(scopeProvider9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        java.lang.String str10 = dim0.eval("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "undefined" + "'", str10, "undefined");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        java.lang.Class<?> wildcardClass14 = dim0.getClass();
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource9);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setBreakOnEnter(true);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("");
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource11);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.ContextFactory contextFactory7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        dim11.contextSwitch((int) ' ');
        dim11.go();
        dim11.setBreakOnReturn(true);
        dim11.contextSwitch(4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim11.functionSourceByName("");
        dim11.setBreakOnExceptions(true);
        dim11.setReturnValue((int) '#');
        com.google.javascript.rhino.head.tools.debugger.Dim dim26 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim26.setBreak();
        dim26.contextSwitch((int) ' ');
        dim26.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider31 = null;
        dim26.setSourceProvider(sourceProvider31);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo34 = dim26.sourceInfo("");
        dim26.setBreakOnReturn(false);
        dim26.setBreak();
        dim26.clearAllBreakpoints();
        dim26.setBreakOnEnter(true);
        dim26.dispose();
        dim26.setBreakOnExceptions(true);
        dim26.setReturnValue((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = dim0.getObjectProperty((java.lang.Object) dim11, (java.lang.Object) dim26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNull(functionSource21);
        org.junit.Assert.assertNull(sourceInfo34);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource14);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.contextSwitch(2);
        com.google.javascript.rhino.head.tools.debugger.Dim dim7 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim7.setBreak();
        java.lang.String str10 = dim7.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim7.setScopeProvider(scopeProvider11);
        dim7.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim7.setGuiCallback(guiCallback15);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData17 = dim7.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray18 = dim0.getObjectIds((java.lang.Object) contextData17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "undefined" + "'", str10, "undefined");
        org.junit.Assert.assertNull(contextData17);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        dim0.contextSwitch((int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource13);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource14 = dim0.functionSourceByName("");
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource14);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        dim15.contextSwitch((int) (byte) 0);
        dim15.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim15.setScopeProvider(scopeProvider21);
        dim15.setBreak();
        dim15.setReturnValue(4);
        dim15.go();
        java.lang.String[] strArray27 = dim15.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray28 = dim0.getObjectIds((java.lang.Object) strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim20 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim20.setBreak();
        dim20.contextSwitch((int) (byte) 0);
        dim20.clearAllBreakpoints();
        dim20.detach();
        dim20.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider28 = null;
        dim20.setScopeProvider(scopeProvider28);
        dim20.dispose();
        java.lang.String str32 = dim20.eval("hi!");
        java.lang.String[] strArray33 = dim20.functionNames();
        dim20.dispose();
        dim20.clearAllBreakpoints();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray36 = dim0.getObjectIds((java.lang.Object) dim20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "undefined" + "'", str32, "undefined");
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        dim0.setBreakOnReturn(false);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim0.setGuiCallback(guiCallback18);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo21 = dim0.sourceInfo("undefined");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertNull(sourceInfo21);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.dispose();
        java.lang.String[] strArray9 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        java.lang.String str14 = dim11.eval("hi!");
        dim11.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim11.setGuiCallback(guiCallback17);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData19 = dim11.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider20 = null;
        dim11.setSourceProvider(sourceProvider20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray22 = dim0.getObjectIds((java.lang.Object) sourceProvider20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(contextData19);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        dim0.setBreakOnEnter(false);
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        dim0.setBreakOnReturn(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(functionSource17);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo5 = dim0.sourceInfo("");
        dim0.contextSwitch((int) 'a');
        com.google.javascript.rhino.head.tools.debugger.Dim dim8 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim8.setBreak();
        dim8.contextSwitch((int) (byte) 0);
        dim8.clearAllBreakpoints();
        dim8.clearAllBreakpoints();
        dim8.contextSwitch((int) (byte) -1);
        dim8.setBreakOnEnter(false);
        dim8.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim8.setScopeProvider(scopeProvider19);
        dim8.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim23 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim23.setBreak();
        java.lang.String str26 = dim23.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider27 = null;
        dim23.setScopeProvider(scopeProvider27);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource30 = dim23.functionSourceByName("undefined");
        java.lang.String[] strArray31 = dim23.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = dim0.getObjectProperty((java.lang.Object) true, (java.lang.Object) strArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo5);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "undefined" + "'", str26, "undefined");
        org.junit.Assert.assertNull(functionSource30);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.go();
        dim0.setBreakOnExceptions(true);
        java.lang.String str11 = dim0.eval("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("undefined");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = sourceInfo14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo14);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim8 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim8.setBreak();
        dim8.dispose();
        dim8.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim8.setScopeProvider(scopeProvider13);
        java.lang.String str16 = dim8.eval("hi!");
        dim8.dispose();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dim0.objectToString((java.lang.Object) dim8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnEnter(false);
        dim0.dispose();
        org.junit.Assert.assertNull(functionSource10);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim16 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim16.setBreak();
        dim16.contextSwitch((int) ' ');
        dim16.go();
        dim16.setBreak();
        dim16.dispose();
        java.lang.String str24 = dim16.eval("undefined");
        dim16.setBreakOnReturn(true);
        java.lang.Object obj27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = dim0.getObjectProperty((java.lang.Object) dim16, obj27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "undefined" + "'", str24, "undefined");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        dim0.contextSwitch(2);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData22 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim23 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim23.setBreak();
        dim23.setBreakOnReturn(false);
        dim23.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim29 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim29.setBreak();
        java.lang.String str32 = dim29.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider33 = null;
        dim29.setScopeProvider(scopeProvider33);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource36 = dim29.functionSourceByName("undefined");
        dim29.clearAllBreakpoints();
        dim29.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData40 = dim29.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider41 = null;
        dim29.setSourceProvider(sourceProvider41);
        dim29.detach();
        dim29.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = dim0.getObjectProperty((java.lang.Object) false, (java.lang.Object) dim29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(contextData22);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "undefined" + "'", str32, "undefined");
        org.junit.Assert.assertNull(functionSource36);
        org.junit.Assert.assertNull(contextData40);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("undefined");
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame15 = contextData0.getFrame(2);
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
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        java.lang.String str17 = dim14.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim14.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim14.functionSourceByName("undefined");
        dim14.clearAllBreakpoints();
        dim14.go();
        java.lang.String str25 = dim14.eval("hi!");
        dim14.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider27 = null;
        dim14.setSourceProvider(sourceProvider27);
        dim14.setBreakOnExceptions(true);
        dim14.go();
        dim14.setBreakOnExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = dim0.objectToString((java.lang.Object) dim14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(functionSource21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "undefined" + "'", str25, "undefined");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame14 = contextData0.getFrame((int) (byte) 1);
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
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNull(contextData16);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setBreakOnEnter(true);
        java.lang.String str10 = dim0.eval("hi!");
        java.lang.Class<?> wildcardClass11 = dim0.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "undefined" + "'", str10, "undefined");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.contextSwitch(1);
        dim0.contextSwitch((int) (byte) 10);
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        dim14.contextSwitch((int) ' ');
        java.lang.String[] strArray18 = dim14.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData19 = dim14.currentContextData();
        dim14.setBreak();
        dim14.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback22 = null;
        dim14.setGuiCallback(guiCallback22);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim14.functionSourceByName("undefined");
        dim14.clearAllBreakpoints();
        java.lang.String str28 = dim14.eval("undefined");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray29 = dim0.getObjectIds((java.lang.Object) dim14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNull(contextData19);
        org.junit.Assert.assertNull(functionSource25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "undefined" + "'", str28, "undefined");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        dim11.contextSwitch((int) ' ');
        dim11.go();
        dim11.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo18 = dim11.sourceInfo("hi!");
        dim11.setBreak();
        dim11.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim22 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim22.setBreak();
        dim22.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback26 = null;
        dim22.setGuiCallback(guiCallback26);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData28 = dim22.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback29 = null;
        dim22.setGuiCallback(guiCallback29);
        java.lang.String[] strArray31 = dim22.functionNames();
        dim22.setReturnValue(100);
        dim22.setBreakOnReturn(true);
        dim22.setBreakOnEnter(false);
        java.lang.String str39 = dim22.eval("undefined");
        java.lang.String str41 = dim22.eval("undefined");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = dim0.getObjectProperty((java.lang.Object) dim11, (java.lang.Object) "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo18);
        org.junit.Assert.assertNull(contextData28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "undefined" + "'", str39, "undefined");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "undefined" + "'", str41, "undefined");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) (byte) 0);
        dim18.clearAllBreakpoints();
        dim18.contextSwitch(2);
        java.lang.String[] strArray25 = dim18.functionNames();
        dim18.setReturnValue((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray28 = dim0.getObjectIds((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData15);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider7 = null;
        dim0.setScopeProvider(scopeProvider7);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim16 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim16.setBreak();
        dim16.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback20 = null;
        dim16.setGuiCallback(guiCallback20);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData22 = dim16.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback23 = null;
        dim16.setGuiCallback(guiCallback23);
        dim16.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider27 = null;
        dim16.setSourceProvider(sourceProvider27);
        dim16.contextSwitch(3);
        dim16.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray32 = dim0.getObjectIds((java.lang.Object) dim16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData22);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback21 = null;
        dim0.setGuiCallback(guiCallback21);
        com.google.javascript.rhino.head.ContextFactory contextFactory23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        dim0.dispose();
        java.lang.String str20 = dim0.eval("undefined");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        java.lang.String str13 = dim10.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim10.setScopeProvider(scopeProvider14);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim10.functionSourceByName("undefined");
        dim10.clearAllBreakpoints();
        dim10.detach();
        dim10.setReturnValue(3);
        dim10.setReturnValue(0);
        dim10.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo27 = dim10.sourceInfo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = dim0.objectToString((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertNull(sourceInfo27);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        dim0.setReturnValue(10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame10 = contextData0.getFrame(2);
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
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        dim0.go();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData7 = dim0.currentContextData();
        org.junit.Assert.assertNull(contextData7);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.setReturnValue((int) 'a');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) ' ');
        dim13.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider18 = null;
        dim13.setSourceProvider(sourceProvider18);
        dim13.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim22 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim22.setBreak();
        dim22.contextSwitch((int) (byte) 0);
        dim22.clearAllBreakpoints();
        dim22.dispose();
        dim22.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource31 = dim22.functionSourceByName("undefined");
        java.lang.String[] strArray32 = dim22.functionNames();
        dim22.go();
        java.lang.String str35 = dim22.eval("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = dim0.getObjectProperty((java.lang.Object) dim13, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(functionSource31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "undefined" + "'", str35, "undefined");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        dim10.contextSwitch((int) (byte) 0);
        dim10.clearAllBreakpoints();
        dim10.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim10.functionSourceByName("");
        dim10.setBreak();
        dim10.dispose();
        dim10.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim22 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim22.setBreak();
        java.lang.String str25 = dim22.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider26 = null;
        dim22.setScopeProvider(scopeProvider26);
        dim22.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource30 = dim22.functionSourceByName("hi!");
        dim22.setBreakOnEnter(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = dim0.getObjectProperty((java.lang.Object) dim10, (java.lang.Object) dim22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "undefined" + "'", str25, "undefined");
        org.junit.Assert.assertNull(functionSource30);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) (byte) 0);
        dim13.clearAllBreakpoints();
        dim13.detach();
        dim13.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim13.setScopeProvider(scopeProvider21);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider23 = null;
        dim13.setSourceProvider(sourceProvider23);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo26 = dim13.sourceInfo("");
        dim13.dispose();
        dim13.detach();
        dim13.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo31 = dim13.sourceInfo("undefined");
        java.lang.String[] strArray32 = dim13.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray33 = dim0.getObjectIds((java.lang.Object) dim13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo26);
        org.junit.Assert.assertNull(sourceInfo31);
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnExceptions(true);
        java.lang.String[] strArray8 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(sourceInfo10);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo7 = dim0.sourceInfo("hi!");
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        org.junit.Assert.assertNull(sourceInfo7);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame4 = contextData0.getFrame((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -98 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.clearAllBreakpoints();
        dim0.setBreak();
        java.lang.String[] strArray11 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        java.lang.String str15 = dim0.eval("undefined");
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue((int) (byte) -1);
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray9 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(contextData10);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(functionSource17);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData7);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame2 = contextData0.getFrame((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -33 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        dim14.contextSwitch((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dim0.objectToString((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(functionSource13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(sourceInfo25);
        org.junit.Assert.assertNull(contextData26);
        org.junit.Assert.assertNull(contextData27);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertNull(functionSource11);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        java.lang.String str20 = dim17.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim17.setScopeProvider(scopeProvider21);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource24 = dim17.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo26 = dim17.sourceInfo("undefined");
        dim17.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo29 = dim17.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider30 = null;
        dim17.setScopeProvider(scopeProvider30);
        dim17.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = dim0.objectToString((java.lang.Object) dim17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
        org.junit.Assert.assertNull(functionSource24);
        org.junit.Assert.assertNull(sourceInfo26);
        org.junit.Assert.assertNull(sourceInfo29);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        java.lang.String[] strArray14 = dim0.functionNames();
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider7 = null;
        dim0.setScopeProvider(scopeProvider7);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("");
        java.lang.String[] strArray11 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        dim12.contextSwitch((int) ' ');
        dim12.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider17 = null;
        dim12.setSourceProvider(sourceProvider17);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo20 = dim12.sourceInfo("");
        dim12.setBreakOnReturn(false);
        dim12.setBreak();
        dim12.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource26 = dim12.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData27 = dim12.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider28 = null;
        dim12.setSourceProvider(sourceProvider28);
        dim12.contextSwitch((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray32 = dim0.getObjectIds((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(sourceInfo10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(sourceInfo20);
        org.junit.Assert.assertNull(functionSource26);
        org.junit.Assert.assertNull(contextData27);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        com.google.javascript.rhino.head.ContextFactory contextFactory14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("");
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        com.google.javascript.rhino.head.ContextFactory contextFactory17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.contextSwitch(3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        com.google.javascript.rhino.head.ContextFactory contextFactory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        dim0.dispose();
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo19 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertNull(sourceInfo19);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        dim13.clearAllBreakpoints();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray32 = dim0.getObjectIds((java.lang.Object) dim13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNull(functionSource20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(sourceInfo28);
        org.junit.Assert.assertNull(sourceInfo30);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        java.lang.Class<?> wildcardClass11 = contextData0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = dim0.stringIsCompilableUnit("hi!");
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
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setReturnValue(5);
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        java.lang.String str14 = dim11.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim11.setScopeProvider(scopeProvider15);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim11.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo20 = dim11.sourceInfo("undefined");
        dim11.dispose();
        dim11.contextSwitch(10);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback24 = null;
        dim11.setGuiCallback(guiCallback24);
        java.lang.String[] strArray26 = dim11.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray27 = dim0.getObjectIds((java.lang.Object) dim11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(functionSource18);
        org.junit.Assert.assertNull(sourceInfo20);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        java.lang.String[] strArray17 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        java.lang.String str17 = dim0.eval("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame11 = contextData0.getFrame(1);
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
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("undefined");
        dim0.detach();
        dim0.contextSwitch((int) 'a');
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource16);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource13);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource14);
        org.junit.Assert.assertNull(contextData15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNull(sourceInfo18);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.clearAllBreakpoints();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        java.lang.String str13 = dim10.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim10.setScopeProvider(scopeProvider14);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim10.functionSourceByName("undefined");
        dim10.clearAllBreakpoints();
        java.lang.String[] strArray19 = dim10.functionNames();
        dim10.setBreakOnEnter(false);
        dim10.clearAllBreakpoints();
        java.lang.String[] strArray23 = dim10.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider24 = null;
        dim10.setSourceProvider(sourceProvider24);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource27 = dim10.functionSourceByName("hi!");
        java.lang.String[] strArray28 = dim10.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray29 = dim0.getObjectIds((java.lang.Object) strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(functionSource27);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData25 = dim0.currentContextData();
        org.junit.Assert.assertNull(functionSource22);
        org.junit.Assert.assertNull(contextData25);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) -1);
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData16 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("undefined");
        dim0.setReturnValue(10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData16);
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnEnter(false);
        dim0.contextSwitch(4);
        dim0.setBreakOnEnter(true);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) ' ');
        dim18.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider23 = null;
        dim18.setSourceProvider(sourceProvider23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = dim0.objectToString((java.lang.Object) dim18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.setReturnValue((int) 'a');
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String[] strArray2 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim3 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim3.setBreak();
        java.lang.String str6 = dim3.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider7 = null;
        dim3.setScopeProvider(scopeProvider7);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim3.functionSourceByName("undefined");
        dim3.clearAllBreakpoints();
        dim3.go();
        dim3.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim3.currentContextData();
        dim3.setBreakOnReturn(true);
        dim3.clearAllBreakpoints();
        dim3.setBreakOnExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dim0.objectToString((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) (byte) 0);
        dim18.clearAllBreakpoints();
        dim18.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider24 = null;
        dim18.setScopeProvider(scopeProvider24);
        dim18.setBreakOnEnter(true);
        dim18.setBreakOnEnter(false);
        java.lang.Class<?> wildcardClass30 = dim18.getClass();
        com.google.javascript.rhino.head.tools.debugger.Dim dim31 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim31.setBreak();
        java.lang.String str34 = dim31.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider35 = null;
        dim31.setScopeProvider(scopeProvider35);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource38 = dim31.functionSourceByName("undefined");
        dim31.clearAllBreakpoints();
        dim31.setBreakOnExceptions(false);
        dim31.dispose();
        java.lang.String str44 = dim31.eval("hi!");
        java.lang.String[] strArray45 = dim31.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider46 = null;
        dim31.setSourceProvider(sourceProvider46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = dim0.getObjectProperty((java.lang.Object) dim18, (java.lang.Object) sourceProvider46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "undefined" + "'", str34, "undefined");
        org.junit.Assert.assertNull(functionSource38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "undefined" + "'", str44, "undefined");
        org.junit.Assert.assertNotNull(strArray45);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.detach();
        java.lang.Class<?> wildcardClass10 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnExceptions(true);
        dim0.setReturnValue((-1));
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        java.lang.String str13 = dim10.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim10.setScopeProvider(scopeProvider14);
        dim10.setBreakOnReturn(false);
        dim10.setBreakOnExceptions(false);
        dim10.setReturnValue((int) (byte) -1);
        dim10.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider24 = null;
        dim10.setSourceProvider(sourceProvider24);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData26 = dim10.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource28 = dim10.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider29 = null;
        dim10.setScopeProvider(scopeProvider29);
        dim10.detach();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray32 = dim0.getObjectIds((java.lang.Object) dim10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(contextData26);
        org.junit.Assert.assertNull(functionSource28);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        dim0.setBreak();
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo14);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("undefined");
        java.lang.Object obj9 = null;
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        java.lang.String str13 = dim10.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim10.setScopeProvider(scopeProvider14);
        dim10.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim10.setGuiCallback(guiCallback18);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData20 = dim10.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = dim0.getObjectProperty(obj9, (java.lang.Object) dim10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(contextData20);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("");
        dim0.setReturnValue((int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        dim0.detach();
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        dim17.contextSwitch((int) ' ');
        java.lang.String[] strArray21 = dim17.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData22 = dim17.currentContextData();
        dim17.setBreak();
        dim17.setBreak();
        dim17.contextSwitch((int) (byte) 100);
        com.google.javascript.rhino.head.tools.debugger.Dim dim27 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim27.setBreak();
        java.lang.String str30 = dim27.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider31 = null;
        dim27.setScopeProvider(scopeProvider31);
        dim27.setBreakOnReturn(false);
        dim27.setBreakOnExceptions(false);
        dim27.setReturnValue((int) (byte) -1);
        dim27.setReturnValue(0);
        dim27.setReturnValue(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = dim0.getObjectProperty((java.lang.Object) dim17, (java.lang.Object) dim27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNull(contextData22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "undefined" + "'", str30, "undefined");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(functionSource13);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim16 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim16.setBreak();
        dim16.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback20 = null;
        dim16.setGuiCallback(guiCallback20);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData22 = dim16.currentContextData();
        dim16.detach();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = dim0.objectToString((java.lang.Object) dim16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(contextData22);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        dim0.setReturnValue(4);
        dim0.contextSwitch(4);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        dim0.setReturnValue((int) (short) -1);
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        dim15.contextSwitch((int) ' ');
        dim15.go();
        dim15.setBreakOnReturn(true);
        dim15.contextSwitch(4);
        dim15.go();
        dim15.setBreakOnReturn(true);
        dim15.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider29 = null;
        dim15.setSourceProvider(sourceProvider29);
        dim15.contextSwitch(100);
        java.lang.String str34 = dim15.eval("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = dim0.objectToString((java.lang.Object) dim15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "undefined" + "'", str34, "undefined");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim0.setScopeProvider(scopeProvider19);
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray22 = dim0.getObjectIds(obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(functionSource16);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        dim17.contextSwitch((int) (byte) 0);
        dim17.clearAllBreakpoints();
        dim17.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim17.setScopeProvider(scopeProvider23);
        dim17.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider26 = null;
        dim17.setSourceProvider(sourceProvider26);
        java.lang.Class<?> wildcardClass28 = dim17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dim0.objectToString((java.lang.Object) wildcardClass28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo20 = dim0.sourceInfo("undefined");
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNull(sourceInfo18);
        org.junit.Assert.assertNull(sourceInfo20);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnExceptions(false);
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource9);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnReturn(false);
        dim0.go();
        dim0.setBreakOnEnter(false);
        dim0.dispose();
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.detach();
        dim0.setReturnValue((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        dim0.contextSwitch((int) (byte) 100);
        dim0.setReturnValue((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame5 = contextData0.getFrame(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -6 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        java.lang.String str30 = dim16.eval("undefined");
        dim16.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData32 = dim16.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo34 = dim16.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource36 = dim16.functionSourceByName("undefined");
        dim16.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim38 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim38.setBreak();
        dim38.contextSwitch((int) (byte) 0);
        dim38.clearAllBreakpoints();
        dim38.detach();
        dim38.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo47 = dim38.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider48 = null;
        dim38.setScopeProvider(scopeProvider48);
        dim38.setBreakOnEnter(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = dim0.getObjectProperty((java.lang.Object) dim16, (java.lang.Object) dim38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "undefined" + "'", str30, "undefined");
        org.junit.Assert.assertNull(contextData32);
        org.junit.Assert.assertNull(sourceInfo34);
        org.junit.Assert.assertNull(functionSource36);
        org.junit.Assert.assertNull(sourceInfo47);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        com.google.javascript.rhino.head.ContextFactory contextFactory16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        dim0.detach();
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) 1);
        dim0.setBreakOnExceptions(true);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("hi!");
        dim0.detach();
        java.lang.Class<?> wildcardClass13 = dim0.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim0.setScopeProvider(scopeProvider19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(contextData18);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        dim0.dispose();
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
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        java.lang.String str18 = dim15.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim15.setScopeProvider(scopeProvider19);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim15.functionSourceByName("undefined");
        dim15.clearAllBreakpoints();
        dim15.clearAllBreakpoints();
        java.lang.String[] strArray25 = dim15.functionNames();
        dim15.setBreak();
        dim15.detach();
        dim15.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim29 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim29.setBreak();
        java.lang.String str32 = dim29.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider33 = null;
        dim29.setScopeProvider(scopeProvider33);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback35 = null;
        dim29.setGuiCallback(guiCallback35);
        dim29.contextSwitch((int) '4');
        dim29.dispose();
        dim29.setReturnValue((int) (byte) 1);
        dim29.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData43 = dim29.currentContextData();
        dim29.dispose();
        dim29.detach();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = dim0.getObjectProperty((java.lang.Object) dim15, (java.lang.Object) dim29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertNull(functionSource22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "undefined" + "'", str32, "undefined");
        org.junit.Assert.assertNull(contextData43);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnExceptions(false);
        java.lang.String str21 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim0.setScopeProvider(scopeProvider22);
        dim0.setReturnValue(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim7 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim7.setBreak();
        dim7.contextSwitch((int) (byte) 0);
        dim7.clearAllBreakpoints();
        dim7.dispose();
        dim7.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData15 = dim7.currentContextData();
        dim7.go();
        dim7.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dim0.objectToString((java.lang.Object) dim7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData15);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        com.google.javascript.rhino.head.ContextFactory contextFactory17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String str9 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource11 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "undefined" + "'", str9, "undefined");
        org.junit.Assert.assertNull(functionSource11);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        com.google.javascript.rhino.head.ContextFactory contextFactory18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        dim0.setBreak();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim0.setScopeProvider(scopeProvider14);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("");
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(functionSource16);
        org.junit.Assert.assertNull(contextData17);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider16 = null;
        dim0.setScopeProvider(scopeProvider16);
        dim0.setReturnValue(10);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider20 = null;
        dim0.setSourceProvider(sourceProvider20);
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        dim0.go();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        org.junit.Assert.assertNull(functionSource13);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim0.setScopeProvider(scopeProvider18);
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        java.lang.String str16 = dim13.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim13.setScopeProvider(scopeProvider17);
        dim13.setBreakOnReturn(false);
        dim13.setBreakOnExceptions(false);
        dim13.setReturnValue((int) (byte) -1);
        dim13.setReturnValue(0);
        dim13.contextSwitch((int) (short) 1);
        java.lang.String[] strArray29 = dim13.functionNames();
        dim13.setBreakOnEnter(false);
        dim13.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray33 = dim0.getObjectIds((java.lang.Object) dim13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        java.lang.String[] strArray6 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim dim7 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim7.setBreak();
        java.lang.String str10 = dim7.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim7.setScopeProvider(scopeProvider11);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource14 = dim7.functionSourceByName("undefined");
        dim7.clearAllBreakpoints();
        dim7.go();
        dim7.dispose();
        dim7.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dim0.objectToString((java.lang.Object) dim7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "undefined" + "'", str10, "undefined");
        org.junit.Assert.assertNull(functionSource14);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        dim0.setBreakOnExceptions(false);
        java.lang.String str12 = dim0.eval("");
        dim0.setBreak();
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(functionSource8);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) 'a');
        dim0.setReturnValue((int) '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        java.lang.String str10 = dim0.eval("undefined");
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "undefined" + "'", str10, "undefined");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        dim0.contextSwitch((int) (short) 100);
        java.lang.String[] strArray17 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.go();
        dim0.setBreakOnExceptions(true);
        dim0.go();
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo5 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = dim0.getClass();
        org.junit.Assert.assertNull(sourceInfo5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNull(contextData10);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("");
        dim0.setReturnValue(100);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("hi!");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame5 = contextData0.getFrame(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -11 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        dim14.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData25 = dim14.currentContextData();
        dim14.setBreakOnReturn(false);
        java.lang.String str29 = dim14.eval("");
        dim14.clearAllBreakpoints();
        dim14.setReturnValue((int) (short) 0);
        java.lang.String str34 = dim14.eval("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray35 = dim0.getObjectIds((java.lang.Object) str34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(functionSource21);
        org.junit.Assert.assertNull(contextData25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "undefined" + "'", str29, "undefined");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "undefined" + "'", str34, "undefined");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreakOnEnter(false);
        dim0.contextSwitch(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData7 = dim0.currentContextData();
        dim0.setReturnValue((int) 'a');
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        org.junit.Assert.assertNull(contextData7);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        org.junit.Assert.assertNull(contextData5);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(false);
        dim0.detach();
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.detach();
        dim0.setReturnValue((int) 'a');
        java.lang.String[] strArray11 = dim0.functionNames();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.setReturnValue((int) 'a');
        dim0.setReturnValue(4);
        java.lang.String str13 = dim0.eval("");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource31 = dim15.functionSourceByName("undefined");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = dim0.getObjectProperty((java.lang.Object) (short) 1, (java.lang.Object) "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertNull(sourceInfo26);
        org.junit.Assert.assertNull(contextData27);
        org.junit.Assert.assertNull(functionSource31);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 100);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        java.lang.String str19 = dim0.eval("");
        java.lang.String str21 = dim0.eval("");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo19 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(sourceInfo19);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(sourceInfo24);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim0.setScopeProvider(scopeProvider21);
        com.google.javascript.rhino.head.tools.debugger.Dim dim23 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim23.setBreak();
        java.lang.String str26 = dim23.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider27 = null;
        dim23.setScopeProvider(scopeProvider27);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback29 = null;
        dim23.setGuiCallback(guiCallback29);
        dim23.contextSwitch((int) '4');
        dim23.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData34 = dim23.currentContextData();
        dim23.setBreakOnExceptions(false);
        dim23.go();
        java.lang.String str39 = dim23.eval("");
        java.lang.String str41 = dim23.eval("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray42 = dim0.getObjectIds((java.lang.Object) dim23);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "undefined" + "'", str26, "undefined");
        org.junit.Assert.assertNull(contextData34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "undefined" + "'", str39, "undefined");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "undefined" + "'", str41, "undefined");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.setReturnValue((int) 'a');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        dim0.setReturnValue(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setReturnValue(1);
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.ContextFactory contextFactory14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(contextData16);
        org.junit.Assert.assertNull(sourceInfo18);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame2 = contextData0.getFrame((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -53 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreak();
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        java.lang.String[] strArray12 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        java.lang.Class<?> wildcardClass8 = dim0.getClass();
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.detach();
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray8 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        dim0.go();
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(contextData18);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.contextSwitch((int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        com.google.javascript.rhino.head.ContextFactory contextFactory17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNull(functionSource18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim0.setScopeProvider(scopeProvider19);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        java.lang.String str17 = dim14.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim14.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim14.functionSourceByName("undefined");
        dim14.clearAllBreakpoints();
        dim14.setBreakOnExceptions(false);
        dim14.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource27 = dim14.functionSourceByName("undefined");
        dim14.setBreakOnReturn(true);
        java.lang.String str31 = dim14.eval("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = dim0.objectToString((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(functionSource21);
        org.junit.Assert.assertNull(functionSource27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "undefined" + "'", str31, "undefined");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.setBreakOnExceptions(false);
        java.lang.Class<?> wildcardClass11 = dim0.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(contextData16);
        org.junit.Assert.assertNull(contextData19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "undefined" + "'", str23, "undefined");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        dim0.dispose();
        dim0.detach();
        dim0.contextSwitch((int) '4');
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
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
            dim0.evalScript("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        org.junit.Assert.assertNull(sourceInfo9);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        dim0.go();
        org.junit.Assert.assertNull(sourceInfo8);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider16 = null;
        dim0.setSourceProvider(sourceProvider16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource13);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim0.setScopeProvider(scopeProvider18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider17 = null;
        dim0.setSourceProvider(sourceProvider17);
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNull(functionSource8);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        dim0.setReturnValue(3);
        java.lang.String str21 = dim0.eval("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim0.setScopeProvider(scopeProvider18);
        dim0.setBreakOnExceptions(true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        java.lang.String str18 = dim0.eval("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        dim0.go();
        dim0.setBreakOnExceptions(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        int int5 = contextData0.frameCount();
        int int6 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame8 = contextData0.getFrame(5);
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
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        java.lang.String str13 = dim10.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim10.setScopeProvider(scopeProvider14);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim10.functionSourceByName("undefined");
        dim10.clearAllBreakpoints();
        java.lang.String[] strArray19 = dim10.functionNames();
        dim10.setBreakOnEnter(false);
        dim10.clearAllBreakpoints();
        java.lang.String[] strArray23 = dim10.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo25 = dim10.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback26 = null;
        dim10.setGuiCallback(guiCallback26);
        java.lang.Class<?> wildcardClass28 = dim10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray29 = dim0.getObjectIds((java.lang.Object) dim10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(sourceInfo25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame14 = contextData0.getFrame(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -5 ?? [0, 0)");
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
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        java.lang.Class<?> wildcardClass15 = strArray14.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        dim10.setBreakOnEnter(true);
        java.lang.String str17 = dim10.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim10.setGuiCallback(guiCallback18);
        com.google.javascript.rhino.head.tools.debugger.Dim dim20 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim20.setBreak();
        dim20.contextSwitch((int) ' ');
        dim20.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider25 = null;
        dim20.setSourceProvider(sourceProvider25);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo28 = dim20.sourceInfo("");
        dim20.setBreakOnReturn(false);
        dim20.setBreak();
        dim20.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo34 = dim20.sourceInfo("hi!");
        dim20.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider37 = null;
        dim20.setSourceProvider(sourceProvider37);
        dim20.contextSwitch((int) (byte) 10);
        dim20.contextSwitch((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = dim0.getObjectProperty((java.lang.Object) guiCallback18, (java.lang.Object) dim20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(sourceInfo28);
        org.junit.Assert.assertNull(sourceInfo34);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        java.lang.String str15 = dim12.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider16 = null;
        dim12.setScopeProvider(scopeProvider16);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim12.functionSourceByName("undefined");
        dim12.clearAllBreakpoints();
        dim12.go();
        dim12.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData23 = dim12.currentContextData();
        dim12.setBreakOnReturn(true);
        dim12.detach();
        dim12.setReturnValue((int) (byte) 10);
        dim12.setBreakOnReturn(true);
        dim12.setBreakOnEnter(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray33 = dim0.getObjectIds((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertNull(functionSource19);
        org.junit.Assert.assertNull(contextData23);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame6 = contextData0.getFrame((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(contextData9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        dim0.setBreakOnExceptions(true);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        dim0.go();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String str9 = dim0.eval("hi!");
        dim0.dispose();
        com.google.javascript.rhino.head.ContextFactory contextFactory11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "undefined" + "'", str9, "undefined");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.ContextFactory contextFactory9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim0.setScopeProvider(scopeProvider14);
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        java.lang.String[] strArray13 = dim0.functionNames();
        java.lang.Class<?> wildcardClass14 = dim0.getClass();
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        java.lang.String str15 = dim12.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider16 = null;
        dim12.setScopeProvider(scopeProvider16);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim12.functionSourceByName("undefined");
        dim12.clearAllBreakpoints();
        java.lang.String[] strArray21 = dim12.functionNames();
        dim12.setBreakOnEnter(false);
        dim12.clearAllBreakpoints();
        java.lang.String[] strArray25 = dim12.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo27 = dim12.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo29 = dim12.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo31 = dim12.sourceInfo("hi!");
        dim12.setBreak();
        dim12.setBreakOnReturn(true);
        java.lang.Class<?> wildcardClass35 = dim12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = dim0.objectToString((java.lang.Object) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertNull(functionSource19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNull(sourceInfo27);
        org.junit.Assert.assertNull(sourceInfo29);
        org.junit.Assert.assertNull(sourceInfo31);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        java.lang.String str18 = dim15.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim15.setScopeProvider(scopeProvider19);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback21 = null;
        dim15.setGuiCallback(guiCallback21);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback23 = null;
        dim15.setGuiCallback(guiCallback23);
        com.google.javascript.rhino.head.tools.debugger.Dim dim25 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim25.setBreak();
        java.lang.String str28 = dim25.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider29 = null;
        dim25.setScopeProvider(scopeProvider29);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback31 = null;
        dim25.setGuiCallback(guiCallback31);
        dim25.contextSwitch((int) '4');
        dim25.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData36 = dim25.currentContextData();
        dim25.setBreakOnExceptions(false);
        dim25.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider40 = null;
        dim25.setScopeProvider(scopeProvider40);
        dim25.setBreakOnEnter(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = dim0.getObjectProperty((java.lang.Object) guiCallback23, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "undefined" + "'", str28, "undefined");
        org.junit.Assert.assertNull(contextData36);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.contextSwitch((int) (byte) 0);
        dim0.detach();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        dim12.contextSwitch((int) ' ');
        dim12.go();
        dim12.setBreak();
        dim12.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource20 = dim12.functionSourceByName("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = dim0.objectToString((java.lang.Object) functionSource20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNull(functionSource20);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreakOnEnter(true);
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) -1);
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("hi!");
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dim0.objectToString(obj17);
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
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        dim0.setReturnValue((int) '#');
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        com.google.javascript.rhino.head.tools.debugger.Dim dim16 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim16.setBreak();
        java.lang.String str19 = dim16.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim16.setScopeProvider(scopeProvider20);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource23 = dim16.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo25 = dim16.sourceInfo("undefined");
        dim16.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo28 = dim16.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider29 = null;
        dim16.setScopeProvider(scopeProvider29);
        dim16.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim dim32 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim32.setBreak();
        java.lang.String str35 = dim32.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider36 = null;
        dim32.setScopeProvider(scopeProvider36);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback38 = null;
        dim32.setGuiCallback(guiCallback38);
        dim32.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo43 = dim32.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData44 = dim32.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData45 = dim32.currentContextData();
        dim32.dispose();
        dim32.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = dim0.getObjectProperty((java.lang.Object) dim16, (java.lang.Object) dim32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNull(functionSource23);
        org.junit.Assert.assertNull(sourceInfo25);
        org.junit.Assert.assertNull(sourceInfo28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "undefined" + "'", str35, "undefined");
        org.junit.Assert.assertNull(sourceInfo43);
        org.junit.Assert.assertNull(contextData44);
        org.junit.Assert.assertNull(contextData45);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        dim0.contextSwitch((int) (byte) 100);
        dim0.setReturnValue((int) (short) -1);
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) ' ');
        dim18.setBreakOnEnter(true);
        dim18.setBreakOnExceptions(false);
        dim18.dispose();
        dim18.setReturnValue((-1));
        java.lang.String[] strArray29 = dim18.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray30 = dim0.getObjectIds((java.lang.Object) dim18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame2 = contextData0.getFrame(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -4 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(true);
        dim0.dispose();
        com.google.javascript.rhino.head.ContextFactory contextFactory9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        dim21.contextSwitch((int) ' ');
        dim21.go();
        dim21.setBreakOnReturn(true);
        dim21.contextSwitch(4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource31 = dim21.functionSourceByName("");
        dim21.setBreakOnExceptions(true);
        dim21.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim36 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim36.setBreak();
        java.lang.String str39 = dim36.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider40 = null;
        dim36.setScopeProvider(scopeProvider40);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback42 = null;
        dim36.setGuiCallback(guiCallback42);
        dim36.contextSwitch((int) '4');
        dim36.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider47 = null;
        dim36.setSourceProvider(sourceProvider47);
        dim36.setBreakOnExceptions(false);
        dim36.dispose();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = dim0.getObjectProperty((java.lang.Object) true, (java.lang.Object) dim36);
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "undefined" + "'", str39, "undefined");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        dim17.contextSwitch((int) ' ');
        dim17.go();
        dim17.setBreakOnReturn(true);
        dim17.contextSwitch(4);
        dim17.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider27 = null;
        dim17.setScopeProvider(scopeProvider27);
        dim17.setReturnValue((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray31 = dim0.getObjectIds((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(sourceInfo14);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        java.lang.Class<?> wildcardClass16 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.detach();
        dim0.dispose();
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.setReturnValue((int) 'a');
        dim0.setReturnValue(4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        dim0.dispose();
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData18 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int19 = contextData18.frameCount();
        int int20 = contextData18.frameCount();
        int int21 = contextData18.frameCount();
        int int22 = contextData18.frameCount();
        int int23 = contextData18.frameCount();
        com.google.javascript.rhino.head.tools.debugger.Dim dim24 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim24.setBreak();
        dim24.contextSwitch((int) (byte) 0);
        dim24.clearAllBreakpoints();
        dim24.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource31 = dim24.functionSourceByName("");
        dim24.setBreak();
        dim24.dispose();
        dim24.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData35 = dim24.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback36 = null;
        dim24.setGuiCallback(guiCallback36);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback38 = null;
        dim24.setGuiCallback(guiCallback38);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo41 = dim24.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData42 = dim24.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = dim0.getObjectProperty((java.lang.Object) contextData18, (java.lang.Object) dim24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(functionSource31);
        org.junit.Assert.assertNull(contextData35);
        org.junit.Assert.assertNull(sourceInfo41);
        org.junit.Assert.assertNull(contextData42);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        dim0.setReturnValue(10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData17 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNull(contextData17);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.dispose();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnEnter(false);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame13 = contextData0.getFrame((int) '4');
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        java.lang.String str17 = dim14.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim14.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim14.functionSourceByName("undefined");
        dim14.clearAllBreakpoints();
        dim14.setBreakOnExceptions(false);
        dim14.dispose();
        java.lang.String str27 = dim14.eval("hi!");
        dim14.go();
        dim14.setBreakOnExceptions(false);
        dim14.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource34 = dim14.functionSourceByName("hi!");
        dim14.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider37 = null;
        dim14.setSourceProvider(sourceProvider37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = dim0.objectToString((java.lang.Object) sourceProvider37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(functionSource21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "undefined" + "'", str27, "undefined");
        org.junit.Assert.assertNull(functionSource34);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        dim0.setReturnValue((int) (short) 10);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback24 = null;
        dim0.setGuiCallback(guiCallback24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        java.lang.String str18 = dim15.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim15.setScopeProvider(scopeProvider19);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim15.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo24 = dim15.sourceInfo("undefined");
        dim15.dispose();
        dim15.dispose();
        dim15.setBreak();
        dim15.setBreakOnExceptions(true);
        java.lang.String[] strArray30 = dim15.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray31 = dim0.getObjectIds((java.lang.Object) dim15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertNull(functionSource22);
        org.junit.Assert.assertNull(sourceInfo24);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.detach();
        dim0.dispose();
        dim0.contextSwitch(2);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData7 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        java.lang.Class<?> wildcardClass9 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo18 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        java.lang.String str22 = dim19.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim19.setScopeProvider(scopeProvider23);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource26 = dim19.functionSourceByName("undefined");
        dim19.clearAllBreakpoints();
        dim19.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider30 = null;
        dim19.setSourceProvider(sourceProvider30);
        dim19.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider34 = null;
        dim19.setScopeProvider(scopeProvider34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = dim0.objectToString((java.lang.Object) scopeProvider34);
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
        org.junit.Assert.assertNull(sourceInfo18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
        org.junit.Assert.assertNull(functionSource26);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        int int5 = contextData0.frameCount();
        int int6 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame8 = contextData0.getFrame((int) (byte) 10);
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
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        dim14.contextSwitch((int) (byte) 0);
        dim14.clearAllBreakpoints();
        dim14.dispose();
        dim14.setBreakOnReturn(false);
        dim14.clearAllBreakpoints();
        dim14.setReturnValue((int) (short) 10);
        java.lang.String str26 = dim14.eval("hi!");
        dim14.setBreak();
        java.lang.String str29 = dim14.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider30 = null;
        dim14.setScopeProvider(scopeProvider30);
        dim14.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray33 = dim0.getObjectIds((java.lang.Object) dim14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "undefined" + "'", str26, "undefined");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "undefined" + "'", str29, "undefined");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.detach();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        java.lang.String str13 = dim10.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim10.setScopeProvider(scopeProvider14);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim10.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo19 = dim10.sourceInfo("undefined");
        dim10.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim10.functionSourceByName("hi!");
        java.lang.String str24 = dim10.eval("");
        dim10.clearAllBreakpoints();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = dim0.objectToString((java.lang.Object) dim10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertNull(sourceInfo19);
        org.junit.Assert.assertNull(functionSource22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "undefined" + "'", str24, "undefined");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.setBreakOnReturn(true);
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        dim0.contextSwitch(10);
        dim0.setBreakOnExceptions(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertNull(contextData9);
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        com.google.javascript.rhino.head.ContextFactory contextFactory18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        dim0.setReturnValue(3);
        dim0.setBreakOnReturn(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo18 = dim0.sourceInfo("");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo21 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo18);
        org.junit.Assert.assertNull(sourceInfo21);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.dispose();
        dim0.setBreak();
        dim0.contextSwitch((int) (short) 1);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnExceptions(true);
        dim0.detach();
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(true);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        dim0.go();
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
        java.lang.String[] strArray28 = dim14.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dim0.objectToString((java.lang.Object) strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNull(contextData22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "undefined" + "'", str27, "undefined");
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        dim0.go();
        dim0.setBreakOnEnter(true);
        java.lang.String[] strArray11 = dim0.functionNames();
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback2 = null;
        dim0.setGuiCallback(guiCallback2);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertNull(sourceInfo8);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        dim0.contextSwitch(100);
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) (byte) 100);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.ContextFactory contextFactory13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        dim0.setReturnValue(4);
        dim0.go();
        java.lang.String[] strArray12 = dim0.functionNames();
        java.lang.String[] strArray13 = dim0.functionNames();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        dim0.setReturnValue(10);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo24 = dim0.sourceInfo("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(sourceInfo24);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.detach();
        dim0.dispose();
        dim0.dispose();
        java.lang.Class<?> wildcardClass12 = dim0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        dim17.contextSwitch((int) (byte) 0);
        dim17.clearAllBreakpoints();
        dim17.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider23 = null;
        dim17.setScopeProvider(scopeProvider23);
        dim17.detach();
        dim17.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback28 = null;
        dim17.setGuiCallback(guiCallback28);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo31 = dim17.sourceInfo("undefined");
        dim17.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider34 = null;
        dim17.setScopeProvider(scopeProvider34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray36 = dim0.getObjectIds((java.lang.Object) scopeProvider34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNull(sourceInfo31);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        dim0.setBreakOnExceptions(false);
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        dim0.detach();
        dim0.contextSwitch((int) ' ');
        com.google.javascript.rhino.head.tools.debugger.Dim dim20 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim20.setBreak();
        dim20.contextSwitch((int) (byte) 0);
        dim20.clearAllBreakpoints();
        dim20.dispose();
        dim20.setBreakOnReturn(false);
        dim20.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource30 = dim20.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource32 = dim20.functionSourceByName("");
        java.lang.String str34 = dim20.eval("");
        dim20.setBreak();
        dim20.dispose();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = dim0.objectToString((java.lang.Object) dim20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource30);
        org.junit.Assert.assertNull(functionSource32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "undefined" + "'", str34, "undefined");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData7 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        dim0.setReturnValue((-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData7);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        dim0.setBreakOnExceptions(true);
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo14);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        java.lang.Class<?> wildcardClass15 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String str8 = dim0.eval("hi!");
        dim0.go();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        dim0.detach();
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        java.lang.Class<?> wildcardClass18 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        dim0.setBreakOnEnter(false);
        java.lang.String str15 = dim0.eval("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("");
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource9);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource3 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider6 = null;
        dim0.setSourceProvider(sourceProvider6);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(functionSource3);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim0.setScopeProvider(scopeProvider14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "hi!");
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
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(contextData15);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        java.lang.String[] strArray9 = dim0.functionNames();
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame15 = contextData0.getFrame((int) 'a');
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(contextData19);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData9);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        java.lang.Class<?> wildcardClass12 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        java.lang.String str14 = dim11.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim11.setScopeProvider(scopeProvider15);
        dim11.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider19 = null;
        dim11.setSourceProvider(sourceProvider19);
        java.lang.String[] strArray21 = dim11.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dim0.objectToString((java.lang.Object) dim11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        dim19.contextSwitch((int) ' ');
        dim19.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider24 = null;
        dim19.setSourceProvider(sourceProvider24);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo27 = dim19.sourceInfo("");
        dim19.setBreakOnReturn(false);
        dim19.setBreak();
        dim19.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource33 = dim19.functionSourceByName("");
        java.lang.String[] strArray34 = dim19.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray35 = dim0.getObjectIds((java.lang.Object) dim19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNull(sourceInfo27);
        org.junit.Assert.assertNull(functionSource33);
        org.junit.Assert.assertNotNull(strArray34);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        java.lang.String str21 = dim18.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim18.setScopeProvider(scopeProvider22);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback24 = null;
        dim18.setGuiCallback(guiCallback24);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback26 = null;
        dim18.setGuiCallback(guiCallback26);
        dim18.setBreak();
        dim18.setBreakOnExceptions(false);
        dim18.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource34 = dim18.functionSourceByName("undefined");
        dim18.detach();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray36 = dim0.getObjectIds((java.lang.Object) dim18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
        org.junit.Assert.assertNull(functionSource34);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) (byte) 0);
        dim18.clearAllBreakpoints();
        dim18.clearAllBreakpoints();
        dim18.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim25 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim25.setBreak();
        dim25.contextSwitch((int) (byte) 0);
        dim25.clearAllBreakpoints();
        dim25.setBreakOnReturn(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = dim0.getObjectProperty((java.lang.Object) dim18, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.clearAllBreakpoints();
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        dim0.dispose();
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) (byte) 0);
        dim18.clearAllBreakpoints();
        dim18.dispose();
        dim18.setBreakOnReturn(false);
        dim18.clearAllBreakpoints();
        dim18.setReturnValue((int) (short) 10);
        java.lang.String str30 = dim18.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData31 = dim18.currentContextData();
        dim18.dispose();
        dim18.setBreakOnExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray35 = dim0.getObjectIds((java.lang.Object) dim18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "undefined" + "'", str30, "undefined");
        org.junit.Assert.assertNull(contextData31);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        java.lang.String[] strArray15 = dim0.functionNames();
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
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        com.google.javascript.rhino.head.ContextFactory contextFactory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        dim0.setBreak();
        dim0.setBreakOnExceptions(false);
        java.lang.Object obj14 = null;
        com.google.javascript.rhino.head.tools.debugger.Dim dim15 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim15.setBreak();
        java.lang.String str18 = dim15.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim15.setScopeProvider(scopeProvider19);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback21 = null;
        dim15.setGuiCallback(guiCallback21);
        dim15.contextSwitch((int) '4');
        dim15.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider26 = null;
        dim15.setScopeProvider(scopeProvider26);
        dim15.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback29 = null;
        dim15.setGuiCallback(guiCallback29);
        java.lang.String[] strArray31 = dim15.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = dim0.getObjectProperty(obj14, (java.lang.Object) dim15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData16 = dim0.currentContextData();
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource14);
        org.junit.Assert.assertNull(contextData16);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        java.lang.String str21 = dim18.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim18.setScopeProvider(scopeProvider22);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim18.functionSourceByName("undefined");
        dim18.clearAllBreakpoints();
        dim18.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider28 = null;
        dim18.setSourceProvider(sourceProvider28);
        com.google.javascript.rhino.head.tools.debugger.Dim dim30 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim30.setBreak();
        java.lang.String str33 = dim30.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider34 = null;
        dim30.setScopeProvider(scopeProvider34);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource37 = dim30.functionSourceByName("undefined");
        dim30.clearAllBreakpoints();
        dim30.detach();
        dim30.setReturnValue(3);
        dim30.setReturnValue(0);
        dim30.setBreakOnEnter(true);
        dim30.setBreakOnReturn(true);
        dim30.go();
        dim30.setBreak();
        dim30.setBreakOnEnter(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = dim0.getObjectProperty((java.lang.Object) sourceProvider28, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
        org.junit.Assert.assertNull(functionSource25);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "undefined" + "'", str33, "undefined");
        org.junit.Assert.assertNull(functionSource37);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        dim11.contextSwitch((int) (byte) 0);
        dim11.clearAllBreakpoints();
        dim11.detach();
        dim11.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim11.setScopeProvider(scopeProvider19);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider21 = null;
        dim11.setSourceProvider(sourceProvider21);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo24 = dim11.sourceInfo("");
        dim11.dispose();
        dim11.detach();
        dim11.setBreakOnReturn(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray29 = dim0.getObjectIds((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo24);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource14 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource14);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(sourceInfo14);
        org.junit.Assert.assertNull(functionSource16);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        int int5 = contextData0.frameCount();
        int int6 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame8 = contextData0.getFrame((int) (short) 100);
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
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
        org.junit.Assert.assertNull(sourceInfo12);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame11 = contextData0.getFrame((int) (short) 1);
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
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        java.lang.String str17 = dim14.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim14.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim14.functionSourceByName("undefined");
        dim14.clearAllBreakpoints();
        dim14.detach();
        dim14.setReturnValue(3);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo27 = dim14.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource29 = dim14.functionSourceByName("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dim0.objectToString((java.lang.Object) functionSource29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(functionSource21);
        org.junit.Assert.assertNull(sourceInfo27);
        org.junit.Assert.assertNull(functionSource29);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource17);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "hi!");
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
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        dim21.contextSwitch((int) ' ');
        java.lang.String[] strArray25 = dim21.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider26 = null;
        dim21.setScopeProvider(scopeProvider26);
        com.google.javascript.rhino.head.tools.debugger.Dim dim28 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim28.setBreak();
        dim28.contextSwitch((int) (byte) 0);
        dim28.clearAllBreakpoints();
        dim28.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource35 = dim28.functionSourceByName("");
        dim28.setBreak();
        dim28.dispose();
        dim28.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider39 = null;
        dim28.setSourceProvider(sourceProvider39);
        dim28.setReturnValue((int) (short) 100);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider43 = null;
        dim28.setSourceProvider(sourceProvider43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = dim0.getObjectProperty((java.lang.Object) scopeProvider26, (java.lang.Object) dim28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNull(functionSource35);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback20 = null;
        dim18.setGuiCallback(guiCallback20);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider22 = null;
        dim18.setSourceProvider(sourceProvider22);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider24 = null;
        dim18.setSourceProvider(sourceProvider24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray26 = dim0.getObjectIds((java.lang.Object) sourceProvider24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        dim0.clearAllBreakpoints();
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo23 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNull(contextData19);
        org.junit.Assert.assertNull(sourceInfo23);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        dim0.go();
        dim0.setBreak();
        dim0.setReturnValue((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.setBreakOnEnter(false);
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim19 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim19.setBreak();
        dim19.contextSwitch((int) (byte) 0);
        dim19.clearAllBreakpoints();
        dim19.dispose();
        dim19.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData27 = dim19.currentContextData();
        dim19.go();
        dim19.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dim0.objectToString((java.lang.Object) dim19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNull(sourceInfo18);
        org.junit.Assert.assertNull(contextData27);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertNull(contextData18);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) (byte) 0);
        dim18.clearAllBreakpoints();
        dim18.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider24 = null;
        dim18.setScopeProvider(scopeProvider24);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource27 = dim18.functionSourceByName("undefined");
        java.lang.String str29 = dim18.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider30 = null;
        dim18.setScopeProvider(scopeProvider30);
        java.lang.String[] strArray32 = dim18.functionNames();
        dim18.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim34 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim34.setBreak();
        dim34.contextSwitch((int) (byte) 0);
        dim34.clearAllBreakpoints();
        dim34.detach();
        dim34.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo43 = dim34.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback44 = null;
        dim34.setGuiCallback(guiCallback44);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData46 = dim34.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback47 = null;
        dim34.setGuiCallback(guiCallback47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = dim0.getObjectProperty((java.lang.Object) dim18, (java.lang.Object) guiCallback47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(functionSource27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "undefined" + "'", str29, "undefined");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNull(sourceInfo43);
        org.junit.Assert.assertNull(contextData46);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setBreak();
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        java.lang.Class<?> wildcardClass15 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(functionSource14);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.contextSwitch((int) (byte) 10);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource14 = dim0.functionSourceByName("");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(functionSource14);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
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
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        java.lang.String str7 = dim0.eval("");
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback23 = null;
        dim0.setGuiCallback(guiCallback23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(contextData16);
        org.junit.Assert.assertNull(sourceInfo18);
        org.junit.Assert.assertNull(sourceInfo20);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim0.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo21 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(sourceInfo21);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        java.lang.String str18 = dim0.eval("undefined");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData33 = dim19.currentContextData();
        dim19.dispose();
        dim19.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource37 = dim19.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim dim38 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim38.setBreak();
        dim38.contextSwitch((int) ' ');
        dim38.go();
        dim38.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo45 = dim38.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider46 = null;
        dim38.setSourceProvider(sourceProvider46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = dim0.getObjectProperty((java.lang.Object) dim19, (java.lang.Object) dim38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
        org.junit.Assert.assertNull(contextData33);
        org.junit.Assert.assertNull(functionSource37);
        org.junit.Assert.assertNull(sourceInfo45);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource11);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String str11 = dim0.eval("undefined");
        dim0.setBreakOnReturn(false);
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
        dim14.setBreakOnReturn(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray30 = dim0.getObjectIds((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(functionSource21);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        java.lang.Class<?> wildcardClass16 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim15.functionSourceByName("undefined");
        dim15.clearAllBreakpoints();
        java.lang.String[] strArray24 = dim15.functionNames();
        dim15.setBreakOnEnter(false);
        dim15.clearAllBreakpoints();
        java.lang.String[] strArray28 = dim15.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo30 = dim15.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo32 = dim15.sourceInfo("undefined");
        dim15.dispose();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback34 = null;
        dim15.setGuiCallback(guiCallback34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = dim0.objectToString((java.lang.Object) dim15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertNull(functionSource22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNull(sourceInfo30);
        org.junit.Assert.assertNull(sourceInfo32);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim16 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim16.setBreak();
        dim16.contextSwitch((int) (byte) 0);
        dim16.clearAllBreakpoints();
        dim16.detach();
        dim16.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider24 = null;
        dim16.setScopeProvider(scopeProvider24);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider26 = null;
        dim16.setSourceProvider(sourceProvider26);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo29 = dim16.sourceInfo("");
        dim16.dispose();
        dim16.detach();
        dim16.go();
        java.lang.String str34 = dim16.eval("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = dim0.objectToString((java.lang.Object) str34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "undefined" + "'", str34, "undefined");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        dim0.setReturnValue((int) (byte) 100);
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.detach();
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        java.lang.String[] strArray18 = dim0.functionNames();
        java.lang.String str20 = dim0.eval("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback19 = null;
        dim0.setGuiCallback(guiCallback19);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo7 = dim0.sourceInfo("hi!");
        dim0.setBreak();
        dim0.contextSwitch((int) (short) -1);
        dim0.setBreak();
        org.junit.Assert.assertNull(sourceInfo7);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim0.setGuiCallback(guiCallback18);
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource17);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        dim0.detach();
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertNull(contextData15);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) (byte) 0);
        dim13.clearAllBreakpoints();
        dim13.dispose();
        dim13.setBreakOnReturn(false);
        dim13.contextSwitch(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = dim0.objectToString((java.lang.Object) dim13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo8);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim20 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim20.setBreak();
        dim20.contextSwitch((int) (byte) 0);
        dim20.clearAllBreakpoints();
        dim20.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource27 = dim20.functionSourceByName("");
        dim20.setBreak();
        dim20.dispose();
        dim20.setReturnValue((int) 'a');
        dim20.setBreak();
        java.lang.String str34 = dim20.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback35 = null;
        dim20.setGuiCallback(guiCallback35);
        com.google.javascript.rhino.head.tools.debugger.Dim dim37 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim37.setBreak();
        dim37.contextSwitch((int) ' ');
        java.lang.String[] strArray41 = dim37.functionNames();
        dim37.setBreakOnExceptions(false);
        dim37.setBreakOnReturn(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = dim0.getObjectProperty((java.lang.Object) dim20, (java.lang.Object) dim37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(functionSource27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "undefined" + "'", str34, "undefined");
        org.junit.Assert.assertNotNull(strArray41);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        java.lang.String str16 = dim13.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim13.setScopeProvider(scopeProvider17);
        dim13.detach();
        dim13.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo23 = dim13.sourceInfo("hi!");
        java.lang.String[] strArray24 = dim13.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = dim0.objectToString((java.lang.Object) strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNull(sourceInfo23);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("hi!");
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnReturn(false);
        dim0.go();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame6 = contextData0.getFrame(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        java.lang.String str14 = dim0.eval("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(functionSource13);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        java.lang.String str20 = dim0.eval("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        java.lang.String str10 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "undefined" + "'", str10, "undefined");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.detach();
        java.lang.String str10 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "undefined" + "'", str10, "undefined");
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
            boolean boolean22 = dim0.stringIsCompilableUnit("hi!");
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
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnReturn(false);
        dim0.go();
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
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) -1);
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData16 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider19 = null;
        dim0.setScopeProvider(scopeProvider19);
        dim0.detach();
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData16);
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        java.lang.String[] strArray6 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider7 = null;
        dim0.setScopeProvider(scopeProvider7);
        dim0.contextSwitch((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(true);
        dim0.setReturnValue(0);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData17 = dim0.currentContextData();
        java.lang.String[] strArray18 = dim0.functionNames();
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource14);
        org.junit.Assert.assertNull(contextData15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNull(contextData17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }
}

