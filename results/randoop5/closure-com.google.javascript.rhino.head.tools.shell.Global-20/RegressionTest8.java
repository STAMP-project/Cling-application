import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = com.google.javascript.rhino.head.ScriptableObject.getProperty(scriptable0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable9 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global2, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins10 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction11 = global2.getBuiltinCtor(builtins10);
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        global15.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17, (int) (short) 10);
        java.lang.Object obj20 = global13.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15);
        boolean boolean21 = global2.has("", (com.google.javascript.rhino.head.Scriptable) global15);
        boolean boolean22 = global2.hasPrototypeMap();
        java.io.PrintStream printStream23 = global2.getErr();
        com.google.javascript.rhino.head.Context context25 = null;
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        global28.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global30, (int) (short) 10);
        java.lang.Object obj33 = global26.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global28);
        global26.delete("hi!");
        com.google.javascript.rhino.head.Context context36 = null;
        com.google.javascript.rhino.head.Scriptable scriptable37 = null;
        java.lang.Object[] objArray43 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function44 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context36, scriptable37, objArray43, function44);
        com.google.javascript.rhino.head.tools.shell.Global global46 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean48 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global46, "");
        com.google.javascript.rhino.head.tools.shell.Global global50 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        global54.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global56, (int) (short) 10);
        java.lang.Object obj59 = global52.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global54);
        java.lang.Object obj60 = global50.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global54);
        int int61 = global54.size();
        boolean boolean63 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global54, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject65 = global46.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global54, false);
        java.lang.Object obj66 = com.google.javascript.rhino.head.tools.shell.Global.toint32(context25, (com.google.javascript.rhino.head.Scriptable) global26, objArray43, (com.google.javascript.rhino.head.Function) idFunctionObject65);
        idFunctionObject65.delete((int) (short) 0);
        boolean boolean69 = global2.has("JavaImporter", (com.google.javascript.rhino.head.Scriptable) idFunctionObject65);
        com.google.javascript.rhino.head.Scriptable scriptable70 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean72 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global2, "JavaImporter");
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNull(baseFunction11);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(printStream23);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(idFunctionObject65);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 0 + "'", obj66, 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(scriptable70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        global8.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10, (int) (short) 10);
        java.lang.Object obj13 = global6.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global8);
        global0.setAttributes("", (com.google.javascript.rhino.head.Scriptable) global8, (int) (short) 1);
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        global17.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19, (int) (short) 10);
        global19.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Context context25 = null;
        java.lang.String[] strArray26 = global19.getPrompts(context25);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins27 = null;
        com.google.javascript.rhino.head.Scriptable scriptable28 = global19.getBuiltinPrototype(builtins27);
        global19.setSealedStdLib(true);
        global0.defineConst("function", (com.google.javascript.rhino.head.Scriptable) global19);
        com.google.javascript.rhino.head.Context context32 = null;
        java.lang.String[] strArray33 = global0.getPrompts(context32);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(scriptable28);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = global0.getParentScope();
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        java.lang.Object obj16 = global9.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11);
        java.lang.Object obj17 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global0, obj16);
        boolean boolean18 = global0.avoidObjectDetection();
        // The following exception was thrown during execution in test generation
        try {
            global0.activatePrototypeMap(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean14 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global12, "");
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        global20.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global22, (int) (short) 10);
        java.lang.Object obj25 = global18.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global20);
        java.lang.Object obj26 = global16.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global20);
        int int27 = global20.size();
        boolean boolean29 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global20, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject31 = global12.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global20, false);
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        global32.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global34, (int) (short) 10);
        global34.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream40 = null;
        global34.setIn(inputStream40);
        com.google.javascript.rhino.head.Scriptable scriptable42 = global34.getParentScope();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        global47.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global49, (int) (short) 10);
        java.lang.Object obj52 = global45.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global47);
        java.lang.Object obj53 = global43.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global47);
        global34.setParentScope((com.google.javascript.rhino.head.Scriptable) global43);
        global12.setParentScope((com.google.javascript.rhino.head.Scriptable) global43);
        boolean boolean56 = global4.has("", (com.google.javascript.rhino.head.Scriptable) global43);
        com.google.javascript.rhino.head.Scriptable scriptable57 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global4);
        global4.cacheBuiltins();
        java.io.PrintStream printStream59 = global4.getOut();
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(idFunctionObject31);
        org.junit.Assert.assertNull(scriptable42);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(scriptable57);
        org.junit.Assert.assertNotNull(printStream59);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Context context2 = null;
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global7 = new com.google.javascript.rhino.head.tools.shell.Global();
        global5.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global7, (int) (short) 10);
        java.lang.Object obj10 = global3.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5);
        global3.delete("hi!");
        com.google.javascript.rhino.head.ImporterTopLevel.init(context2, (com.google.javascript.rhino.head.Scriptable) global3, false);
        java.io.PrintStream printStream15 = global3.getErr();
        java.io.InputStream inputStream16 = global3.getIn();
        java.lang.Object[] objArray17 = global3.getIds();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        global18.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global20, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        global25.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27, (int) (short) 10);
        java.lang.Object obj30 = global23.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global25);
        boolean boolean32 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global25, "");
        global20.setParentScope((com.google.javascript.rhino.head.Scriptable) global25);
        boolean boolean35 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global20, "");
        com.google.javascript.rhino.head.Context context36 = null;
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        global39.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41, (int) (short) 10);
        java.lang.Object obj44 = global37.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global39);
        boolean boolean46 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global39, "");
        com.google.javascript.rhino.head.Scriptable scriptable47 = global39.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable49 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global48);
        java.lang.Object[] objArray50 = global48.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        global55.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global57, (int) (short) 10);
        java.lang.Object obj60 = global53.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global55);
        java.lang.Object obj61 = global51.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global55);
        int int62 = global55.size();
        boolean boolean64 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global55, "");
        com.google.javascript.rhino.head.Context context65 = null;
        java.lang.String[] strArray68 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        com.google.javascript.rhino.head.commonjs.module.Require require72 = global55.installRequire(context65, (java.util.List<java.lang.String>) strList69, true);
        com.google.javascript.rhino.head.tools.shell.Global.load(context36, scriptable47, objArray50, (com.google.javascript.rhino.head.Function) require72);
        boolean boolean74 = global20.hasInstance((com.google.javascript.rhino.head.Scriptable) require72);
        boolean boolean76 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) require72, (int) 'a');
        com.google.javascript.rhino.head.Scriptable scriptable78 = null;
        java.lang.Object obj79 = require72.get((int) (short) -1, scriptable78);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj80 = com.google.javascript.rhino.head.tools.shell.Global.spawn(context0, scriptable1, objArray17, (com.google.javascript.rhino.head.Function) require72);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: Argument to spawn() must be a function or script.");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(printStream15);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(scriptable47);
        org.junit.Assert.assertNotNull(scriptable49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(require72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(obj79);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable9 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global2, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins10 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction11 = global2.getBuiltinCtor(builtins10);
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        global15.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17, (int) (short) 10);
        java.lang.Object obj20 = global13.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15);
        boolean boolean21 = global2.has("", (com.google.javascript.rhino.head.Scriptable) global15);
        boolean boolean22 = global15.isEmpty();
        global15.delete("function");
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNull(baseFunction11);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global7 = new com.google.javascript.rhino.head.tools.shell.Global();
        global5.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global7, (int) (short) 10);
        java.lang.Object obj10 = global3.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5);
        java.lang.Object obj11 = global1.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global5);
        int int12 = global5.size();
        boolean boolean14 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global5, "");
        global5.cacheBuiltins();
        global5.delete("hi!");
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global5, "");
        int int20 = global5.size();
        java.lang.String str21 = global5.getTypeOf();
        com.google.javascript.rhino.head.Scriptable scriptable22 = global5.getParentScope();
        global5.sealObject();
        java.io.PrintStream printStream24 = global5.getOut();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        java.lang.Object obj32 = global25.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins33 = null;
        com.google.javascript.rhino.head.Scriptable scriptable34 = global25.getBuiltinPrototype(builtins33);
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        global35.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global37, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        global42.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global44, (int) (short) 10);
        java.lang.Object obj47 = global40.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global42);
        boolean boolean49 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global42, "");
        global37.setParentScope((com.google.javascript.rhino.head.Scriptable) global42);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global37, "hi!");
        boolean boolean53 = global25.hasInstance((com.google.javascript.rhino.head.Scriptable) global37);
        com.google.javascript.rhino.head.Scriptable scriptable54 = global25.getParentScope();
        java.lang.Object obj55 = global5.getAssociatedValue((java.lang.Object) global25);
        com.google.javascript.rhino.head.ImporterTopLevel.init(context0, (com.google.javascript.rhino.head.Scriptable) global25, true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "object" + "'", str21, "object");
        org.junit.Assert.assertNull(scriptable22);
        org.junit.Assert.assertNotNull(printStream24);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(scriptable34);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(scriptable54);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable1 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global0);
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        global10.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global12, (int) (short) 10);
        java.lang.Object obj15 = global8.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10);
        boolean boolean17 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global10, "");
        global5.setParentScope((com.google.javascript.rhino.head.Scriptable) global10);
        boolean boolean19 = global0.has("", (com.google.javascript.rhino.head.Scriptable) global5);
        com.google.javascript.rhino.head.Context context20 = null;
        java.lang.String[] strArray21 = global0.getPrompts(context20);
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        global25.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27, (int) (short) 10);
        java.lang.Object obj30 = global23.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global25);
        com.google.javascript.rhino.head.Scriptable scriptable31 = global23.getParentScope();
        java.lang.Object obj33 = global23.getAssociatedValue((java.lang.Object) 0.0f);
        java.io.InputStream inputStream34 = global23.getIn();
        java.io.InputStream inputStream35 = global23.getIn();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) global23, "object", true);
        global0.defineConst("", (com.google.javascript.rhino.head.Scriptable) global23);
        boolean boolean41 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global23, "object");
        org.junit.Assert.assertNull(scriptable1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(scriptable31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        global0.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        global13.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream19 = null;
        global13.setIn(inputStream19);
        java.lang.Object obj21 = global0.get(0, (com.google.javascript.rhino.head.Scriptable) global13);
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        java.lang.Object obj32 = global25.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27);
        java.lang.Object obj33 = global23.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global27);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global13, 10, (java.lang.Object) global27);
        com.google.javascript.rhino.head.Context context35 = null;
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable37 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global36);
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        global39.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global46 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        global46.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global48, (int) (short) 10);
        java.lang.Object obj51 = global44.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global46);
        boolean boolean53 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global46, "");
        global41.setParentScope((com.google.javascript.rhino.head.Scriptable) global46);
        boolean boolean55 = global36.has("", (com.google.javascript.rhino.head.Scriptable) global41);
        com.google.javascript.rhino.head.Context context56 = null;
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        global57.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global59, (int) (short) 10);
        global36.defineOwnProperties(context56, (com.google.javascript.rhino.head.ScriptableObject) global57);
        com.google.javascript.rhino.head.tools.shell.Global global63 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global67 = new com.google.javascript.rhino.head.tools.shell.Global();
        global65.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global67, (int) (short) 10);
        java.lang.Object obj70 = global63.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global65);
        com.google.javascript.rhino.head.Scriptable scriptable71 = global63.getParentScope();
        java.lang.Object obj73 = global63.getAssociatedValue((java.lang.Object) 0.0f);
        java.lang.Object[] objArray74 = global63.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global75 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean77 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global75, "");
        com.google.javascript.rhino.head.tools.shell.Global global79 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global81 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global83 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global85 = new com.google.javascript.rhino.head.tools.shell.Global();
        global83.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global85, (int) (short) 10);
        java.lang.Object obj88 = global81.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global83);
        java.lang.Object obj89 = global79.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global83);
        int int90 = global83.size();
        boolean boolean92 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global83, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject94 = global75.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global83, false);
        global27.importPackage(context35, (com.google.javascript.rhino.head.Scriptable) global57, objArray74, (com.google.javascript.rhino.head.Function) idFunctionObject94);
        boolean boolean96 = global57.isExtensible();
        global57.sealObject();
        java.lang.String str98 = global57.getTypeOf();
        java.io.PrintStream printStream99 = global57.getErr();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNull(scriptable37);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNull(scriptable71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertNotNull(obj89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(idFunctionObject94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "object" + "'", str98, "object");
        org.junit.Assert.assertNotNull(printStream99);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        boolean boolean12 = global4.avoidObjectDetection();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable15 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global14);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject17 = global4.exportAsJSClass(100, scriptable15, false);
        com.google.javascript.rhino.head.Scriptable scriptable19 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) idFunctionObject17, "");
        idFunctionObject17.sealObject();
        boolean boolean21 = idFunctionObject17.isExtensible();
        // The following exception was thrown during execution in test generation
        try {
            idFunctionObject17.delete("JavaImporter");
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: Cannot modify a property of a sealed object: JavaImporter.");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scriptable15);
        org.junit.Assert.assertNotNull(idFunctionObject17);
        org.junit.Assert.assertNull(scriptable19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        boolean boolean13 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global4, "");
        global4.cacheBuiltins();
        global4.delete("hi!");
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global4, "");
        int int19 = global4.size();
        global4.sealObject();
        java.lang.Object obj22 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global4, "");
        java.io.InputStream inputStream23 = global4.getIn();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        global24.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global26, (int) (short) 10);
        global26.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Context context32 = null;
        java.lang.String[] strArray33 = global26.getPrompts(context32);
        java.io.PrintStream printStream34 = null;
        global26.setErr(printStream34);
        global26.cacheBuiltins();
        global26.setAttributes((int) (byte) 0, 13);
        com.google.javascript.rhino.head.Scriptable scriptable40 = global26.getParentScope();
        java.io.PrintStream printStream41 = global26.getErr();
        global4.setOut(printStream41);
        // The following exception was thrown during execution in test generation
        try {
            global4.delete("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: Cannot modify a property of a sealed object: hi!.");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNull(scriptable40);
        org.junit.Assert.assertNotNull(printStream41);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        boolean boolean13 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global4, "");
        com.google.javascript.rhino.head.Context context14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        com.google.javascript.rhino.head.commonjs.module.Require require21 = global4.installRequire(context14, (java.util.List<java.lang.String>) strList18, true);
        boolean boolean22 = global4.avoidObjectDetection();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        java.lang.Object obj32 = global25.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27);
        java.lang.Object obj33 = global23.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global27);
        int int34 = global27.size();
        boolean boolean36 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global27, "");
        com.google.javascript.rhino.head.Context context37 = null;
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        com.google.javascript.rhino.head.commonjs.module.Require require44 = global27.installRequire(context37, (java.util.List<java.lang.String>) strList41, true);
        boolean boolean45 = global27.hasPrototypeMap();
        global27.setAttributes("", (int) (byte) 1);
        com.google.javascript.rhino.head.Context context49 = null;
        com.google.javascript.rhino.head.tools.shell.Global global50 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        global52.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global54, (int) (short) 10);
        java.lang.Object obj57 = global50.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global52);
        com.google.javascript.rhino.head.Scriptable scriptable58 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global50);
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        global60.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global62, (int) (short) 10);
        global62.setAttributes("", (int) (short) 0);
        boolean boolean68 = global50.has((int) (byte) 0, (com.google.javascript.rhino.head.Scriptable) global62);
        int int72 = global27.runDoctest(context49, (com.google.javascript.rhino.head.Scriptable) global50, "object", "hi!", (int) (byte) 0);
        global4.setPrototype((com.google.javascript.rhino.head.Scriptable) global50);
        boolean boolean74 = global50.isEmpty();
        boolean boolean75 = global50.isSealed();
        // The following exception was thrown during execution in test generation
        try {
            int int77 = global50.getAttributes(10);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: Property 10 not found.");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(require21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(require44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNull(scriptable58);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        java.lang.Object obj8 = global1.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins9 = null;
        com.google.javascript.rhino.head.Scriptable scriptable10 = global1.getBuiltinPrototype(builtins9);
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        global18.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global20, (int) (short) 10);
        java.lang.Object obj23 = global16.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18);
        boolean boolean25 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global18, "");
        global13.setParentScope((com.google.javascript.rhino.head.Scriptable) global18);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global13, "hi!");
        boolean boolean29 = global1.hasInstance((com.google.javascript.rhino.head.Scriptable) global13);
        global13.delete("hi!");
        boolean boolean32 = global13.hasPrototypeMap();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        global36.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global38, (int) (short) 10);
        java.lang.Object obj41 = global34.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global36);
        boolean boolean43 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global36, "");
        com.google.javascript.rhino.head.Context context44 = null;
        com.google.javascript.rhino.head.Scriptable scriptable45 = null;
        java.lang.Object[] objArray51 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function52 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context44, scriptable45, objArray51, function52);
        java.lang.Object obj54 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global36, (java.lang.Object) scriptable45);
        com.google.javascript.rhino.head.Context context55 = null;
        java.lang.String[] strArray56 = global36.getPrompts(context55);
        com.google.javascript.rhino.head.Scriptable scriptable58 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global36, "function");
        java.lang.Object obj59 = global13.get((int) (short) -1, (com.google.javascript.rhino.head.Scriptable) global36);
        com.google.javascript.rhino.head.ImporterTopLevel.init(context0, (com.google.javascript.rhino.head.Scriptable) global36, false);
        com.google.javascript.rhino.head.Scriptable scriptable62 = global36.getParentScope();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(scriptable10);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNull(scriptable58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNull(scriptable62);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins11 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction12 = global0.getBuiltinCtor(builtins11);
        java.lang.Object obj14 = global0.getAssociatedValue((java.lang.Object) (short) 0);
        boolean boolean16 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global0, (int) (byte) -1);
        com.google.javascript.rhino.head.Context context17 = null;
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        global18.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global20, (int) (short) 10);
        global20.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        global29.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global31, (int) (short) 10);
        java.lang.Object obj34 = global27.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29);
        boolean boolean36 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global29, "");
        boolean boolean37 = global29.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable39 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global38);
        java.lang.Object[] objArray40 = global38.getAllIds();
        java.lang.Object obj41 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global29, (java.lang.Object) global38);
        com.google.javascript.rhino.head.Context context42 = null;
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global46 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        global46.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global48, (int) (short) 10);
        java.lang.Object obj51 = global44.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global46);
        com.google.javascript.rhino.head.Scriptable scriptable52 = global46.getPrototype();
        global38.defineOwnProperty(context42, (java.lang.Object) 'a', (com.google.javascript.rhino.head.ScriptableObject) global46);
        java.lang.Object obj55 = global38.get((java.lang.Object) 100L);
        boolean boolean56 = global20.has("object", (com.google.javascript.rhino.head.Scriptable) global38);
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable60 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global59);
        java.lang.Object[] objArray61 = global59.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean64 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global62, "");
        global57.put("", (com.google.javascript.rhino.head.Scriptable) global59, (java.lang.Object) boolean64);
        java.io.InputStream inputStream66 = global59.getIn();
        global38.setIn(inputStream66);
        com.google.javascript.rhino.head.Scriptable scriptable68 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global38);
        global0.defineOwnProperties(context17, (com.google.javascript.rhino.head.ScriptableObject) global38);
        java.io.InputStream inputStream70 = global38.getIn();
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(baseFunction12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(scriptable39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNull(scriptable52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(scriptable60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(inputStream66);
        org.junit.Assert.assertNull(scriptable68);
        org.junit.Assert.assertNotNull(inputStream70);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean8 = global0.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        global14.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16, (int) (short) 10);
        java.lang.Object obj19 = global12.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global14);
        java.lang.Object obj20 = global10.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global14);
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) global0, "", obj20, (int) (byte) 10);
        boolean boolean23 = global0.isInitialized();
        com.google.javascript.rhino.head.Context context24 = null;
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        java.lang.Object obj32 = global25.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27);
        boolean boolean34 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global27, "");
        com.google.javascript.rhino.head.Scriptable scriptable35 = global27.getPrototype();
        java.io.PrintStream printStream36 = null;
        global27.setOut(printStream36);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins38 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction39 = global27.getBuiltinCtor(builtins38);
        int int43 = global0.runDoctest(context24, (com.google.javascript.rhino.head.Scriptable) global27, "JavaImporter", "", (-1));
        global27.delete("hi!");
        java.lang.Object obj49 = global27.getGetterOrSetter("hi!", 0, false);
        java.lang.Object obj51 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global27, "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(scriptable35);
        org.junit.Assert.assertNull(baseFunction39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(obj51);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Context context8 = null;
        java.lang.String[] strArray9 = global2.getPrompts(context8);
        java.lang.String str10 = global2.getTypeOf();
        boolean boolean12 = global2.isConst("hi!");
        java.io.InputStream inputStream13 = global2.getIn();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        global16.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18, (int) (short) 10);
        java.lang.Object obj21 = global14.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16);
        boolean boolean23 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global16, "");
        java.lang.Object obj25 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global16, "hi!");
        global2.setPrototype((com.google.javascript.rhino.head.Scriptable) global16);
        com.google.javascript.rhino.head.Scriptable scriptable28 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global2, "JavaImporter");
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) global2, "hi!", true);
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        global33.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global35, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean40 = global39.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        global42.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global44, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        global49.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global51, (int) (short) 10);
        java.lang.Object obj54 = global47.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global49);
        boolean boolean56 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global49, "");
        global44.setParentScope((com.google.javascript.rhino.head.Scriptable) global49);
        com.google.javascript.rhino.head.Context context58 = null;
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int63 = global44.runDoctest(context58, (com.google.javascript.rhino.head.Scriptable) global59, "", "hi!", (int) (short) 10);
        java.lang.Object obj64 = global39.get((int) (byte) 100, (com.google.javascript.rhino.head.Scriptable) global44);
        boolean boolean66 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global44, (int) (short) 1);
        java.lang.Object obj67 = global33.associateValue((java.lang.Object) 2, (java.lang.Object) (short) 1);
        boolean boolean69 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global33, 0);
        // The following exception was thrown during execution in test generation
        try {
            global2.setAttributes(11, (com.google.javascript.rhino.head.Scriptable) global33, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "object" + "'", str10, "object");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(scriptable28);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (short) 1 + "'", obj67, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        java.lang.Object obj8 = global1.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3);
        boolean boolean10 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global3, "");
        boolean boolean11 = global3.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable13 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global12);
        java.lang.Object[] objArray14 = global12.getAllIds();
        java.lang.Object obj15 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global3, (java.lang.Object) global12);
        com.google.javascript.rhino.head.Context context16 = null;
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        global19.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21, (int) (short) 10);
        java.lang.Object obj24 = global17.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19);
        boolean boolean26 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global19, "");
        com.google.javascript.rhino.head.Scriptable scriptable27 = global19.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable29 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global28);
        java.lang.Object[] objArray30 = global28.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        global35.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global37, (int) (short) 10);
        java.lang.Object obj40 = global33.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global35);
        java.lang.Object obj41 = global31.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global35);
        int int42 = global35.size();
        boolean boolean44 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global35, "");
        com.google.javascript.rhino.head.Context context45 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        com.google.javascript.rhino.head.commonjs.module.Require require52 = global35.installRequire(context45, (java.util.List<java.lang.String>) strList49, true);
        com.google.javascript.rhino.head.tools.shell.Global.load(context16, scriptable27, objArray30, (com.google.javascript.rhino.head.Function) require52);
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        global54.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global56, (int) (short) 10);
        global56.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global63 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        global63.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global65, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global68 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global70 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global72 = new com.google.javascript.rhino.head.tools.shell.Global();
        global70.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global72, (int) (short) 10);
        java.lang.Object obj75 = global68.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global70);
        boolean boolean77 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global70, "");
        global65.setParentScope((com.google.javascript.rhino.head.Scriptable) global70);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject80 = global56.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global65, false);
        com.google.javascript.rhino.head.tools.shell.Global.quit(context0, (com.google.javascript.rhino.head.Scriptable) global12, objArray30, (com.google.javascript.rhino.head.Function) idFunctionObject80);
        global12.setAttributes("hi!", (int) (short) 0);
        java.lang.Object obj86 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global12, (int) (short) 100);
        java.lang.Object[] objArray87 = global12.getAllIds();
        com.google.javascript.rhino.head.Context context88 = null;
        java.lang.String[] strArray89 = global12.getPrompts(context88);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scriptable13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(scriptable27);
        org.junit.Assert.assertNotNull(scriptable29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(require52);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(idFunctionObject80);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray87), "[hi!]");
        org.junit.Assert.assertNotNull(strArray89);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = global0.getParentScope();
        java.lang.Object obj10 = global0.getAssociatedValue((java.lang.Object) 0.0f);
        com.google.javascript.rhino.head.Context context11 = null;
        java.lang.String[] strArray12 = global0.getPrompts(context11);
        boolean boolean14 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global0, "");
        global0.delete(8);
        boolean boolean17 = global0.hasPrototypeMap();
        com.google.javascript.rhino.head.Context context18 = null;
        java.lang.String[] strArray19 = global0.getPrompts(context18);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        global0.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        global13.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream19 = null;
        global13.setIn(inputStream19);
        java.lang.Object obj21 = global0.get(0, (com.google.javascript.rhino.head.Scriptable) global13);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins22 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction23 = global0.getBuiltinCtor(builtins22);
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        java.lang.Object obj32 = global25.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27);
        com.google.javascript.rhino.head.Scriptable scriptable33 = global25.getParentScope();
        boolean boolean34 = global25.isSealed();
        java.io.PrintStream printStream35 = global25.getOut();
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        global40.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global42, (int) (short) 10);
        java.lang.Object obj45 = global38.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global40);
        java.lang.Object obj46 = global36.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global40);
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean49 = global48.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        global51.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global58 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        global58.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global60, (int) (short) 10);
        java.lang.Object obj63 = global56.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global58);
        boolean boolean65 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global58, "");
        global53.setParentScope((com.google.javascript.rhino.head.Scriptable) global58);
        com.google.javascript.rhino.head.Context context67 = null;
        com.google.javascript.rhino.head.tools.shell.Global global68 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int72 = global53.runDoctest(context67, (com.google.javascript.rhino.head.Scriptable) global68, "", "hi!", (int) (short) 10);
        java.lang.Object obj73 = global48.get((int) (byte) 100, (com.google.javascript.rhino.head.Scriptable) global53);
        boolean boolean74 = global36.has((int) (short) 0, (com.google.javascript.rhino.head.Scriptable) global48);
        global25.setParentScope((com.google.javascript.rhino.head.Scriptable) global48);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject77 = global0.exportAsJSClass((int) ' ', (com.google.javascript.rhino.head.Scriptable) global48, false);
        global48.cacheBuiltins();
        boolean boolean80 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global48, "function");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(baseFunction23);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(scriptable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(printStream35);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(idFunctionObject77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        global9.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        global16.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18, (int) (short) 10);
        java.lang.Object obj21 = global14.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16);
        boolean boolean23 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global16, "");
        global11.setParentScope((com.google.javascript.rhino.head.Scriptable) global16);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject26 = global2.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global11, false);
        java.lang.Object[] objArray27 = idFunctionObject26.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable30 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global29);
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        global32.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global34, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        global39.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41, (int) (short) 10);
        java.lang.Object obj44 = global37.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global39);
        boolean boolean46 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global39, "");
        global34.setParentScope((com.google.javascript.rhino.head.Scriptable) global39);
        boolean boolean48 = global29.has("", (com.google.javascript.rhino.head.Scriptable) global34);
        idFunctionObject26.setAttributes((int) (short) 0, (com.google.javascript.rhino.head.Scriptable) global34, 0);
        boolean boolean51 = idFunctionObject26.isExtensible();
        java.lang.Object obj53 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject26, "hi!");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(idFunctionObject26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[arguments, prototype, name, arity, length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[arguments, prototype, name, arity, length]");
        org.junit.Assert.assertNull(scriptable30);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(obj53);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = global0.getParentScope();
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        java.lang.Object obj16 = global9.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11);
        java.lang.Object obj17 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global0, obj16);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins18 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction19 = global0.getBuiltinCtor(builtins18);
        boolean boolean20 = global0.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        global24.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global26, (int) (short) 10);
        java.lang.Object obj29 = global22.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global24);
        global22.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        global33.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global35, (int) (short) 10);
        global35.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream41 = null;
        global35.setIn(inputStream41);
        java.lang.Object obj43 = global22.get(0, (com.google.javascript.rhino.head.Scriptable) global35);
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        global49.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global51, (int) (short) 10);
        java.lang.Object obj54 = global47.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global49);
        java.lang.Object obj55 = global45.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global49);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global35, 10, (java.lang.Object) global49);
        com.google.javascript.rhino.head.tools.shell.Global global58 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        global58.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global60, (int) (short) 10);
        global60.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream66 = null;
        global60.setIn(inputStream66);
        global60.delete("");
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global35, 0, (java.lang.Object) global60);
        global0.setAttributes("JavaImporter", (com.google.javascript.rhino.head.Scriptable) global35, (int) (byte) 1);
        boolean boolean73 = global0.isInitialized();
        boolean boolean74 = global0.isInitialized();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(baseFunction19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = global2.getPrototype();
        java.io.InputStream inputStream9 = global2.getIn();
        java.lang.Object[] objArray10 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable11 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(scriptable11);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        java.lang.Object obj8 = global1.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3);
        global1.delete("hi!");
        com.google.javascript.rhino.head.Context context11 = null;
        com.google.javascript.rhino.head.Scriptable scriptable12 = null;
        java.lang.Object[] objArray18 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function19 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context11, scriptable12, objArray18, function19);
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean23 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global21, "");
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        global29.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global31, (int) (short) 10);
        java.lang.Object obj34 = global27.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29);
        java.lang.Object obj35 = global25.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global29);
        int int36 = global29.size();
        boolean boolean38 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global29, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject40 = global21.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global29, false);
        java.lang.Object obj41 = com.google.javascript.rhino.head.tools.shell.Global.toint32(context0, (com.google.javascript.rhino.head.Scriptable) global1, objArray18, (com.google.javascript.rhino.head.Function) idFunctionObject40);
        idFunctionObject40.delete((int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global46 = new com.google.javascript.rhino.head.tools.shell.Global();
        global44.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global46, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        global51.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53, (int) (short) 10);
        java.lang.Object obj56 = global49.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global51);
        boolean boolean58 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global51, "");
        global46.setParentScope((com.google.javascript.rhino.head.Scriptable) global51);
        java.lang.Object obj61 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global51, "");
        com.google.javascript.rhino.head.tools.shell.Global global63 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global67 = new com.google.javascript.rhino.head.tools.shell.Global();
        global65.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global67, (int) (short) 10);
        java.lang.Object obj70 = global63.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global65);
        boolean boolean72 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global65, "");
        com.google.javascript.rhino.head.Context context73 = null;
        com.google.javascript.rhino.head.Scriptable scriptable74 = null;
        java.lang.Object[] objArray80 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function81 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context73, scriptable74, objArray80, function81);
        java.lang.Object obj83 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global65, (java.lang.Object) scriptable74);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject85 = global51.exportAsJSClass((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) global65, false);
        com.google.javascript.rhino.head.Scriptable scriptable86 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) idFunctionObject85);
        idFunctionObject40.setParentScope(scriptable86);
        java.lang.Object obj89 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject40, "hi!");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(idFunctionObject40);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0 + "'", obj41, 0);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(idFunctionObject85);
        org.junit.Assert.assertNotNull(scriptable86);
        org.junit.Assert.assertNotNull(obj89);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean9 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global2, "");
        com.google.javascript.rhino.head.Scriptable scriptable10 = global2.getPrototype();
        global2.activatePrototypeMap((int) '4');
        com.google.javascript.rhino.head.TopLevel.Builtins builtins13 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction14 = global2.getBuiltinCtor(builtins13);
        java.io.InputStream inputStream15 = global2.getIn();
        com.google.javascript.rhino.head.Scriptable scriptable16 = null;
        global2.setPrototype(scriptable16);
        boolean boolean18 = global2.isSealed();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        global21.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23, (int) (short) 10);
        java.lang.Object obj26 = global19.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21);
        global19.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        global30.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global32, (int) (short) 10);
        global32.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream38 = null;
        global32.setIn(inputStream38);
        java.lang.Object obj40 = global19.get(0, (com.google.javascript.rhino.head.Scriptable) global32);
        com.google.javascript.rhino.head.Scriptable scriptable41 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global32);
        java.lang.Object obj42 = global2.getAssociatedValue((java.lang.Object) scriptable41);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins43 = null;
        com.google.javascript.rhino.head.Scriptable scriptable44 = global2.getBuiltinPrototype(builtins43);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(scriptable10);
        org.junit.Assert.assertNull(baseFunction14);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(scriptable41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(scriptable44);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        global9.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        global16.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18, (int) (short) 10);
        java.lang.Object obj21 = global14.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16);
        boolean boolean23 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global16, "");
        global11.setParentScope((com.google.javascript.rhino.head.Scriptable) global16);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject26 = global2.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global11, false);
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        global30.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global32, (int) (short) 10);
        java.lang.Object obj35 = global28.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global30);
        com.google.javascript.rhino.head.Scriptable scriptable36 = global30.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        global40.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global42, (int) (short) 10);
        java.lang.Object obj45 = global38.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global40);
        boolean boolean47 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global40, "");
        boolean boolean48 = global40.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable50 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global49);
        java.lang.Object[] objArray51 = global49.getAllIds();
        java.lang.Object obj52 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global40, (java.lang.Object) global49);
        global30.setAttributes((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) global49, 1);
        global2.defineConst("object", (com.google.javascript.rhino.head.Scriptable) global30);
        global30.cacheBuiltins();
        global30.activatePrototypeMap(11);
        com.google.javascript.rhino.head.ContextFactory contextFactory59 = null;
        // The following exception was thrown during execution in test generation
        try {
            global30.init(contextFactory59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(idFunctionObject26);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(scriptable36);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(scriptable50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Context context8 = null;
        java.lang.String[] strArray9 = global2.getPrompts(context8);
        java.lang.String str10 = global2.getTypeOf();
        com.google.javascript.rhino.head.Scriptable scriptable11 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins12 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction13 = global2.getBuiltinCtor(builtins12);
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        global19.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21, (int) (short) 10);
        java.lang.Object obj24 = global17.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19);
        java.lang.Object obj25 = global15.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global19);
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean29 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global27, "");
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        global35.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global37, (int) (short) 10);
        java.lang.Object obj40 = global33.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global35);
        java.lang.Object obj41 = global31.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global35);
        int int42 = global35.size();
        boolean boolean44 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global35, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject46 = global27.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global35, false);
        boolean boolean47 = global35.isSealed();
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        global15.defineProperty("hi!", (java.lang.Object) boolean47, method48, method49, 0);
        java.io.InputStream inputStream52 = global15.getIn();
        global2.setAttributes("object", (com.google.javascript.rhino.head.Scriptable) global15, (int) (byte) 0);
        boolean boolean56 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global2, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "object" + "'", str10, "object");
        org.junit.Assert.assertNull(scriptable11);
        org.junit.Assert.assertNull(baseFunction13);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(idFunctionObject46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(inputStream52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global7 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        global7.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global9, (int) (short) 10);
        java.lang.Object obj12 = global5.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global7);
        boolean boolean14 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global7, "");
        global2.setParentScope((com.google.javascript.rhino.head.Scriptable) global7);
        java.lang.Object obj17 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global7, "");
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        global21.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23, (int) (short) 10);
        java.lang.Object obj26 = global19.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21);
        boolean boolean28 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global21, "");
        com.google.javascript.rhino.head.Context context29 = null;
        com.google.javascript.rhino.head.Scriptable scriptable30 = null;
        java.lang.Object[] objArray36 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function37 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context29, scriptable30, objArray36, function37);
        java.lang.Object obj39 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global21, (java.lang.Object) scriptable30);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject41 = global7.exportAsJSClass((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) global21, false);
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        global42.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global44, (int) (short) 10);
        boolean boolean48 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global42, "hi!");
        global42.preventExtensions();
        boolean boolean50 = global42.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        global53.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global55, (int) (short) 10);
        java.lang.Object obj58 = global51.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53);
        com.google.javascript.rhino.head.Scriptable scriptable59 = global51.getParentScope();
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        global62.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global64, (int) (short) 10);
        java.lang.Object obj67 = global60.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global62);
        java.lang.Object obj68 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global51, obj67);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins69 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction70 = global51.getBuiltinCtor(builtins69);
        boolean boolean71 = global51.hasPrototypeMap();
        java.lang.Object[] objArray72 = global51.getIds();
        java.io.InputStream inputStream73 = global51.getIn();
        global42.setIn(inputStream73);
        global7.setIn(inputStream73);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(idFunctionObject41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNull(scriptable59);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(baseFunction70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertNotNull(inputStream73);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = global0.getParentScope();
        java.lang.Object obj10 = global0.getAssociatedValue((java.lang.Object) 0.0f);
        java.lang.Object[] objArray11 = global0.getAllIds();
        com.google.javascript.rhino.head.TopLevel.Builtins builtins12 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction13 = global0.getBuiltinCtor(builtins12);
        com.google.javascript.rhino.head.Context context14 = null;
        java.lang.String[] strArray15 = global0.getPrompts(context14);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(baseFunction13);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = global2.getPrototype();
        boolean boolean10 = global2.isConst("JavaImporter");
        global2.delete("object");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = global2.getGetterOrSetter("object", 4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: object");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global0.preventExtensions();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        global10.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global12, (int) (short) 10);
        java.lang.Object obj15 = global8.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10);
        java.lang.Object obj16 = global6.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global10);
        int int17 = global10.size();
        boolean boolean19 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global10, "");
        global10.cacheBuiltins();
        global10.delete("hi!");
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global10, "");
        int int25 = global10.size();
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        global26.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global28, (int) (short) 10);
        global28.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable35 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global28, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins36 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction37 = global28.getBuiltinCtor(builtins36);
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        global41.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global43, (int) (short) 10);
        java.lang.Object obj46 = global39.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41);
        boolean boolean47 = global28.has("", (com.google.javascript.rhino.head.Scriptable) global41);
        java.io.InputStream inputStream48 = global28.getIn();
        global10.setIn(inputStream48);
        global0.setIn(inputStream48);
        global0.sealObject();
        // The following exception was thrown during execution in test generation
        try {
            global0.setAttributes("", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNull(scriptable35);
        org.junit.Assert.assertNull(baseFunction37);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(inputStream48);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        global1.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3, (int) (short) 10);
        global3.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        global10.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global12, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        global17.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19, (int) (short) 10);
        java.lang.Object obj22 = global15.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17);
        boolean boolean24 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global17, "");
        global12.setParentScope((com.google.javascript.rhino.head.Scriptable) global17);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject27 = global3.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global12, false);
        java.io.PrintStream printStream28 = global12.getOut();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        global31.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global33, (int) (short) 10);
        java.lang.Object obj36 = global29.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global31);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins37 = null;
        com.google.javascript.rhino.head.Scriptable scriptable38 = global29.getBuiltinPrototype(builtins37);
        java.lang.Object[] objArray39 = global29.getIds();
        boolean boolean41 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global29, "object");
        java.lang.Object obj42 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global12, (java.lang.Object) boolean41);
        com.google.javascript.rhino.head.ImporterTopLevel.init(context0, (com.google.javascript.rhino.head.Scriptable) global12, true);
        com.google.javascript.rhino.head.Scriptable scriptable45 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global12);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(idFunctionObject27);
        org.junit.Assert.assertNotNull(printStream28);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNull(scriptable38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(scriptable45);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean2 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global0, "");
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        global8.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10, (int) (short) 10);
        java.lang.Object obj13 = global6.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global8);
        java.lang.Object obj14 = global4.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global8);
        int int15 = global8.size();
        boolean boolean17 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global8, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject19 = global0.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global8, false);
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        global20.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global22, (int) (short) 10);
        global22.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream28 = null;
        global22.setIn(inputStream28);
        com.google.javascript.rhino.head.Scriptable scriptable30 = global22.getParentScope();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        global35.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global37, (int) (short) 10);
        java.lang.Object obj40 = global33.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global35);
        java.lang.Object obj41 = global31.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global35);
        global22.setParentScope((com.google.javascript.rhino.head.Scriptable) global31);
        global0.setParentScope((com.google.javascript.rhino.head.Scriptable) global31);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins44 = null;
        com.google.javascript.rhino.head.Scriptable scriptable45 = global31.getBuiltinPrototype(builtins44);
        boolean boolean46 = global31.isSealed();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable48 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global47);
        global47.setSealedStdLib(true);
        global31.setParentScope((com.google.javascript.rhino.head.Scriptable) global47);
        com.google.javascript.rhino.head.Context context52 = null;
        java.lang.String[] strArray53 = global47.getPrompts(context52);
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global58 = new com.google.javascript.rhino.head.tools.shell.Global();
        global56.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global58, (int) (short) 10);
        java.lang.Object obj61 = global54.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global56);
        com.google.javascript.rhino.head.Scriptable scriptable62 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global54);
        com.google.javascript.rhino.head.Scriptable scriptable63 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global54);
        boolean boolean65 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global54, (int) (short) 10);
        boolean boolean66 = global54.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global68 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean70 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global68, "");
        com.google.javascript.rhino.head.tools.shell.Global global72 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global74 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global76 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global78 = new com.google.javascript.rhino.head.tools.shell.Global();
        global76.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global78, (int) (short) 10);
        java.lang.Object obj81 = global74.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global76);
        java.lang.Object obj82 = global72.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global76);
        int int83 = global76.size();
        boolean boolean85 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global76, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject87 = global68.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global76, false);
        java.lang.Object obj89 = global76.getAssociatedValue((java.lang.Object) (short) 1);
        com.google.javascript.rhino.head.Scriptable scriptable90 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) global76);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global54, "object", (java.lang.Object) scriptable90);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins92 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction93 = global54.getBuiltinCtor(builtins92);
        boolean boolean95 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global54, 100);
        boolean boolean96 = global47.hasInstance((com.google.javascript.rhino.head.Scriptable) global54);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(idFunctionObject19);
        org.junit.Assert.assertNull(scriptable30);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNull(scriptable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(scriptable48);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNull(scriptable62);
        org.junit.Assert.assertNull(scriptable63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(idFunctionObject87);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNull(scriptable90);
        org.junit.Assert.assertNull(baseFunction93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean9 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global2, "");
        com.google.javascript.rhino.head.Scriptable scriptable10 = global2.getPrototype();
        global2.activatePrototypeMap((int) '4');
        com.google.javascript.rhino.head.TopLevel.Builtins builtins13 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction14 = global2.getBuiltinCtor(builtins13);
        java.io.InputStream inputStream15 = global2.getIn();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        global19.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21, (int) (short) 10);
        java.lang.Object obj24 = global17.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19);
        global17.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        global28.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global30, (int) (short) 10);
        global30.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream36 = null;
        global30.setIn(inputStream36);
        java.lang.Object obj38 = global17.get(0, (com.google.javascript.rhino.head.Scriptable) global30);
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global46 = new com.google.javascript.rhino.head.tools.shell.Global();
        global44.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global46, (int) (short) 10);
        java.lang.Object obj49 = global42.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global44);
        java.lang.Object obj50 = global40.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global44);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global30, 10, (java.lang.Object) global44);
        boolean boolean52 = global44.isEmpty();
        boolean boolean53 = global2.has("JavaImporter", (com.google.javascript.rhino.head.Scriptable) global44);
        com.google.javascript.rhino.head.Context context54 = null;
        java.lang.String[] strArray55 = global2.getPrompts(context54);
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        global57.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global59, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global66 = new com.google.javascript.rhino.head.tools.shell.Global();
        global64.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global66, (int) (short) 10);
        java.lang.Object obj69 = global62.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global64);
        boolean boolean71 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global64, "");
        global59.setParentScope((com.google.javascript.rhino.head.Scriptable) global64);
        java.io.InputStream inputStream73 = global59.getIn();
        boolean boolean74 = global2.has("function", (com.google.javascript.rhino.head.Scriptable) global59);
        boolean boolean76 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global59, 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(scriptable10);
        org.junit.Assert.assertNull(baseFunction14);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(inputStream73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        global0.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        global13.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream19 = null;
        global13.setIn(inputStream19);
        java.lang.Object obj21 = global0.get(0, (com.google.javascript.rhino.head.Scriptable) global13);
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        global23.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global25, (int) (short) 10);
        global25.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable32 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global25, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins33 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction34 = global25.getBuiltinCtor(builtins33);
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        global38.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global40, (int) (short) 10);
        java.lang.Object obj43 = global36.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global38);
        boolean boolean44 = global25.has("", (com.google.javascript.rhino.head.Scriptable) global38);
        boolean boolean45 = global25.hasPrototypeMap();
        java.io.PrintStream printStream46 = global25.getErr();
        boolean boolean47 = global13.has("hi!", (com.google.javascript.rhino.head.Scriptable) global25);
        global13.sealObject();
        com.google.javascript.rhino.head.tools.shell.Global global50 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable51 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global50);
        boolean boolean53 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global50, "");
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        global54.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global56, (int) (short) 10);
        global56.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream62 = null;
        global56.setIn(inputStream62);
        com.google.javascript.rhino.head.Scriptable scriptable64 = global56.getParentScope();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global56, "hi!", (java.lang.Object) 1.0d);
        java.io.PrintStream printStream68 = global56.getOut();
        global56.sealObject();
        global13.putConst("JavaImporter", (com.google.javascript.rhino.head.Scriptable) global50, (java.lang.Object) global56);
        // The following exception was thrown during execution in test generation
        try {
            int int72 = global50.getAttributes("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: Property hi! not found.");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(scriptable32);
        org.junit.Assert.assertNull(baseFunction34);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(printStream46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(scriptable51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(scriptable64);
        org.junit.Assert.assertNotNull(printStream68);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins8 = null;
        com.google.javascript.rhino.head.Scriptable scriptable9 = global0.getBuiltinPrototype(builtins8);
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        global10.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global12, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        global17.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19, (int) (short) 10);
        java.lang.Object obj22 = global15.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17);
        boolean boolean24 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global17, "");
        global12.setParentScope((com.google.javascript.rhino.head.Scriptable) global17);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global12, "hi!");
        boolean boolean28 = global0.hasInstance((com.google.javascript.rhino.head.Scriptable) global12);
        global12.delete("hi!");
        boolean boolean31 = global12.hasPrototypeMap();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        global35.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global37, (int) (short) 10);
        java.lang.Object obj40 = global33.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global35);
        boolean boolean42 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global35, "");
        com.google.javascript.rhino.head.Context context43 = null;
        com.google.javascript.rhino.head.Scriptable scriptable44 = null;
        java.lang.Object[] objArray50 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function51 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context43, scriptable44, objArray50, function51);
        java.lang.Object obj53 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global35, (java.lang.Object) scriptable44);
        com.google.javascript.rhino.head.Context context54 = null;
        java.lang.String[] strArray55 = global35.getPrompts(context54);
        com.google.javascript.rhino.head.Scriptable scriptable57 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global35, "function");
        java.lang.Object obj58 = global12.get((int) (short) -1, (com.google.javascript.rhino.head.Scriptable) global35);
        global35.cacheBuiltins();
        global35.preventExtensions();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNull(scriptable57);
        org.junit.Assert.assertNotNull(obj58);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean9 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global2, "");
        boolean boolean10 = global2.isExtensible();
        java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 1);
        global2.setSealedStdLib(false);
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        global18.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global20, (int) (short) 10);
        java.lang.Object obj23 = global16.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18);
        boolean boolean25 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global18, "");
        com.google.javascript.rhino.head.Scriptable scriptable26 = global18.getPrototype();
        global18.activatePrototypeMap((int) '4');
        com.google.javascript.rhino.head.Scriptable scriptable29 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global18);
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        global32.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global34, (int) (short) 10);
        java.lang.Object obj37 = global30.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global32);
        com.google.javascript.rhino.head.Scriptable scriptable38 = global30.getParentScope();
        java.lang.Object obj40 = global30.getAssociatedValue((java.lang.Object) 0.0f);
        java.lang.Object[] objArray41 = global30.getAllIds();
        java.io.InputStream inputStream42 = global30.getIn();
        global18.setIn(inputStream42);
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        global2.defineProperty("function", (java.lang.Object) global18, method44, method45, 4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(scriptable26);
        org.junit.Assert.assertNull(scriptable29);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNull(scriptable38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(inputStream42);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        global4.setAttributes((-1), (int) (byte) 0);
        com.google.javascript.rhino.head.Scriptable scriptable15 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global4);
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean18 = global17.isEmpty();
        com.google.javascript.rhino.head.Context context19 = null;
        com.google.javascript.rhino.head.Context context20 = null;
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        global23.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global25, (int) (short) 10);
        java.lang.Object obj28 = global21.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23);
        boolean boolean30 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global23, "");
        boolean boolean31 = global23.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable33 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global32);
        java.lang.Object[] objArray34 = global32.getAllIds();
        java.lang.Object obj35 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global23, (java.lang.Object) global32);
        com.google.javascript.rhino.head.Context context36 = null;
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        global40.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global42, (int) (short) 10);
        java.lang.Object obj45 = global38.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global40);
        com.google.javascript.rhino.head.Scriptable scriptable46 = global40.getPrototype();
        global32.defineOwnProperty(context36, (java.lang.Object) 'a', (com.google.javascript.rhino.head.ScriptableObject) global40);
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global50 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        global52.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global54, (int) (short) 10);
        java.lang.Object obj57 = global50.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global52);
        java.lang.Object obj58 = global48.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global52);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins59 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction60 = global48.getBuiltinCtor(builtins59);
        java.lang.Object obj62 = global48.getAssociatedValue((java.lang.Object) (short) 0);
        global48.delete(0);
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global67 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global69 = new com.google.javascript.rhino.head.tools.shell.Global();
        global67.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global69, (int) (short) 10);
        java.lang.Object obj72 = global65.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global67);
        com.google.javascript.rhino.head.Scriptable scriptable73 = global65.getParentScope();
        boolean boolean74 = global65.isSealed();
        java.io.PrintStream printStream75 = global65.getErr();
        global48.setOut(printStream75);
        global40.setErr(printStream75);
        com.google.javascript.rhino.head.ImporterTopLevel.init(context20, (com.google.javascript.rhino.head.Scriptable) global40, false);
        com.google.javascript.rhino.head.Context context80 = null;
        java.lang.String[] strArray86 = new java.lang.String[] { "hi!", "function", "JavaImporter", "JavaImporter", "object" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        com.google.javascript.rhino.head.commonjs.module.Require require90 = global40.installRequire(context80, (java.util.List<java.lang.String>) strList87, true);
        com.google.javascript.rhino.head.commonjs.module.Require require92 = global17.installRequire(context19, (java.util.List<java.lang.String>) strList87, true);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) global4, "object", (java.lang.Object) context19);
        int int94 = global4.size();
        java.io.PrintStream printStream95 = global4.getOut();
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(scriptable15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(scriptable33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNull(scriptable46);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNull(baseFunction60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNull(scriptable73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(printStream75);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(require90);
        org.junit.Assert.assertNotNull(require92);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 3 + "'", int94 == 3);
        org.junit.Assert.assertNotNull(printStream95);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean2 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global0, "");
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        global8.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10, (int) (short) 10);
        java.lang.Object obj13 = global6.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global8);
        java.lang.Object obj14 = global4.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global8);
        int int15 = global8.size();
        boolean boolean17 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global8, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject19 = global0.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global8, false);
        boolean boolean21 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global8, "JavaImporter");
        com.google.javascript.rhino.head.Context context22 = null;
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        global23.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global25, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean30 = global29.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        global32.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global34, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        global39.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41, (int) (short) 10);
        java.lang.Object obj44 = global37.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global39);
        boolean boolean46 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global39, "");
        global34.setParentScope((com.google.javascript.rhino.head.Scriptable) global39);
        com.google.javascript.rhino.head.Context context48 = null;
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int53 = global34.runDoctest(context48, (com.google.javascript.rhino.head.Scriptable) global49, "", "hi!", (int) (short) 10);
        java.lang.Object obj54 = global29.get((int) (byte) 100, (com.google.javascript.rhino.head.Scriptable) global34);
        boolean boolean56 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global34, (int) (short) 1);
        java.lang.Object obj57 = global23.associateValue((java.lang.Object) 2, (java.lang.Object) (short) 1);
        int int61 = global8.runDoctest(context22, (com.google.javascript.rhino.head.Scriptable) global23, "object", "function", (int) (short) 1);
        com.google.javascript.rhino.head.Context context62 = null;
        // The following exception was thrown during execution in test generation
        try {
            global23.initStandardObjects(context62, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(idFunctionObject19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (short) 1 + "'", obj57, (short) 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global7 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        global7.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global9, (int) (short) 10);
        java.lang.Object obj12 = global5.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global7);
        boolean boolean14 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global7, "");
        global2.setParentScope((com.google.javascript.rhino.head.Scriptable) global7);
        java.io.InputStream inputStream16 = global2.getIn();
        com.google.javascript.rhino.head.Scriptable scriptable18 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global2, "hi!");
        global2.delete("object");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNull(scriptable18);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins11 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction12 = global0.getBuiltinCtor(builtins11);
        java.io.InputStream inputStream13 = global0.getIn();
        com.google.javascript.rhino.head.TopLevel.Builtins builtins14 = null;
        com.google.javascript.rhino.head.Scriptable scriptable15 = global0.getBuiltinPrototype(builtins14);
        com.google.javascript.rhino.head.Scriptable scriptable17 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global0, "");
        boolean boolean18 = global0.avoidObjectDetection();
        com.google.javascript.rhino.head.Context context19 = null;
        // The following exception was thrown during execution in test generation
        try {
            global0.init(context19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(baseFunction12);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNull(scriptable15);
        org.junit.Assert.assertNull(scriptable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        global4.setAttributes((-1), (int) (byte) 0);
        com.google.javascript.rhino.head.Scriptable scriptable15 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global4);
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean18 = global17.isEmpty();
        com.google.javascript.rhino.head.Context context19 = null;
        com.google.javascript.rhino.head.Context context20 = null;
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        global23.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global25, (int) (short) 10);
        java.lang.Object obj28 = global21.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23);
        boolean boolean30 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global23, "");
        boolean boolean31 = global23.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable33 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global32);
        java.lang.Object[] objArray34 = global32.getAllIds();
        java.lang.Object obj35 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global23, (java.lang.Object) global32);
        com.google.javascript.rhino.head.Context context36 = null;
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        global40.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global42, (int) (short) 10);
        java.lang.Object obj45 = global38.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global40);
        com.google.javascript.rhino.head.Scriptable scriptable46 = global40.getPrototype();
        global32.defineOwnProperty(context36, (java.lang.Object) 'a', (com.google.javascript.rhino.head.ScriptableObject) global40);
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global50 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        global52.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global54, (int) (short) 10);
        java.lang.Object obj57 = global50.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global52);
        java.lang.Object obj58 = global48.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global52);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins59 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction60 = global48.getBuiltinCtor(builtins59);
        java.lang.Object obj62 = global48.getAssociatedValue((java.lang.Object) (short) 0);
        global48.delete(0);
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global67 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global69 = new com.google.javascript.rhino.head.tools.shell.Global();
        global67.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global69, (int) (short) 10);
        java.lang.Object obj72 = global65.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global67);
        com.google.javascript.rhino.head.Scriptable scriptable73 = global65.getParentScope();
        boolean boolean74 = global65.isSealed();
        java.io.PrintStream printStream75 = global65.getErr();
        global48.setOut(printStream75);
        global40.setErr(printStream75);
        com.google.javascript.rhino.head.ImporterTopLevel.init(context20, (com.google.javascript.rhino.head.Scriptable) global40, false);
        com.google.javascript.rhino.head.Context context80 = null;
        java.lang.String[] strArray86 = new java.lang.String[] { "hi!", "function", "JavaImporter", "JavaImporter", "object" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        com.google.javascript.rhino.head.commonjs.module.Require require90 = global40.installRequire(context80, (java.util.List<java.lang.String>) strList87, true);
        com.google.javascript.rhino.head.commonjs.module.Require require92 = global17.installRequire(context19, (java.util.List<java.lang.String>) strList87, true);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) global4, "object", (java.lang.Object) context19);
        int int94 = global4.size();
        boolean boolean95 = global4.isSealed();
        boolean boolean96 = global4.avoidObjectDetection();
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(scriptable15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(scriptable33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNull(scriptable46);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNull(baseFunction60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNull(scriptable73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(printStream75);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(require90);
        org.junit.Assert.assertNotNull(require92);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 3 + "'", int94 == 3);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global7 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        global7.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global9, (int) (short) 10);
        java.lang.Object obj12 = global5.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global7);
        boolean boolean14 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global7, "");
        global2.setParentScope((com.google.javascript.rhino.head.Scriptable) global7);
        java.lang.Object obj17 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global7, "");
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        global21.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23, (int) (short) 10);
        java.lang.Object obj26 = global19.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21);
        boolean boolean28 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global21, "");
        com.google.javascript.rhino.head.Context context29 = null;
        com.google.javascript.rhino.head.Scriptable scriptable30 = null;
        java.lang.Object[] objArray36 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function37 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context29, scriptable30, objArray36, function37);
        java.lang.Object obj39 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global21, (java.lang.Object) scriptable30);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject41 = global7.exportAsJSClass((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) global21, false);
        boolean boolean43 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global7, (int) (short) 100);
        com.google.javascript.rhino.head.Context context44 = null;
        java.lang.String[] strArray45 = global7.getPrompts(context44);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(idFunctionObject41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strArray45);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream8 = null;
        global2.setIn(inputStream8);
        com.google.javascript.rhino.head.Scriptable scriptable10 = global2.getParentScope();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global2, "hi!", (java.lang.Object) 1.0d);
        com.google.javascript.rhino.head.Context context14 = null;
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        global17.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19, (int) (short) 10);
        java.lang.Object obj22 = global15.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17);
        boolean boolean24 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global17, "");
        boolean boolean25 = global17.isSealed();
        java.lang.Object obj27 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global17, 0);
        global2.defineOwnProperties(context14, (com.google.javascript.rhino.head.ScriptableObject) global17);
        boolean boolean30 = global2.isConst("hi!");
        java.io.PrintStream printStream31 = global2.getErr();
        org.junit.Assert.assertNull(scriptable10);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(printStream31);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        global1.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        global8.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10, (int) (short) 10);
        java.lang.Object obj13 = global6.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global8);
        boolean boolean15 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global8, "");
        global3.setParentScope((com.google.javascript.rhino.head.Scriptable) global8);
        java.lang.Object obj18 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global8, "");
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable20 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global19);
        java.lang.Object[] objArray21 = global19.getAllIds();
        com.google.javascript.rhino.head.Context context22 = null;
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        global25.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27, (int) (short) 10);
        java.lang.Object obj30 = global23.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global25);
        boolean boolean32 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global25, "");
        com.google.javascript.rhino.head.Scriptable scriptable33 = global25.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable35 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global34);
        java.lang.Object[] objArray36 = global34.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        global41.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global43, (int) (short) 10);
        java.lang.Object obj46 = global39.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41);
        java.lang.Object obj47 = global37.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global41);
        int int48 = global41.size();
        boolean boolean50 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global41, "");
        com.google.javascript.rhino.head.Context context51 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        com.google.javascript.rhino.head.commonjs.module.Require require58 = global41.installRequire(context51, (java.util.List<java.lang.String>) strList55, true);
        com.google.javascript.rhino.head.tools.shell.Global.load(context22, scriptable33, objArray36, (com.google.javascript.rhino.head.Function) require58);
        java.lang.Object obj60 = com.google.javascript.rhino.head.tools.shell.Global.doctest(context0, (com.google.javascript.rhino.head.Scriptable) global8, objArray21, (com.google.javascript.rhino.head.Function) require58);
        global8.preventExtensions();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable65 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global64);
        java.lang.Object[] objArray66 = global64.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global67 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean69 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global67, "");
        global62.put("", (com.google.javascript.rhino.head.Scriptable) global64, (java.lang.Object) boolean69);
        java.io.InputStream inputStream71 = global64.getIn();
        global8.setIn(inputStream71);
        global8.setAttributes("JavaImporter", 3);
        // The following exception was thrown during execution in test generation
        try {
            int int77 = global8.getAttributes("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: Property hi! not found.");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(scriptable20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(scriptable33);
        org.junit.Assert.assertNotNull(scriptable35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(require58);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + false + "'", obj60, false);
        org.junit.Assert.assertNotNull(scriptable65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(inputStream71);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean9 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global2, "");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins10 = null;
        com.google.javascript.rhino.head.Scriptable scriptable11 = global2.getBuiltinPrototype(builtins10);
        com.google.javascript.rhino.head.Scriptable scriptable12 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        global13.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15, (int) (short) 10);
        global15.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable22 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global15, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins23 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction24 = global15.getBuiltinCtor(builtins23);
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        global28.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global30, (int) (short) 10);
        java.lang.Object obj33 = global26.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global28);
        boolean boolean34 = global15.has("", (com.google.javascript.rhino.head.Scriptable) global28);
        boolean boolean35 = global15.hasPrototypeMap();
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable38 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global37);
        global37.setSealedStdLib(true);
        global15.defineConst("hi!", (com.google.javascript.rhino.head.Scriptable) global37);
        java.lang.Object obj42 = global2.getAssociatedValue((java.lang.Object) "hi!");
        global2.setAttributes(3, (int) (short) 1);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(scriptable11);
        org.junit.Assert.assertNotNull(scriptable12);
        org.junit.Assert.assertNull(scriptable22);
        org.junit.Assert.assertNull(baseFunction24);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(scriptable38);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean9 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global2, "");
        com.google.javascript.rhino.head.Scriptable scriptable10 = global2.getPrototype();
        java.io.PrintStream printStream11 = null;
        global2.setOut(printStream11);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins13 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction14 = global2.getBuiltinCtor(builtins13);
        global2.sealObject();
        boolean boolean17 = global2.isConst("hi!");
        java.lang.String str18 = global2.getClassName();
        global2.preventExtensions();
        com.google.javascript.rhino.head.Scriptable scriptable20 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(scriptable10);
        org.junit.Assert.assertNull(baseFunction14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JavaImporter" + "'", str18, "JavaImporter");
        org.junit.Assert.assertNotNull(scriptable20);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean9 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global2, "");
        com.google.javascript.rhino.head.Scriptable scriptable10 = global2.getPrototype();
        global2.activatePrototypeMap((int) '4');
        com.google.javascript.rhino.head.Scriptable scriptable13 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        global16.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18, (int) (short) 10);
        java.lang.Object obj21 = global14.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16);
        com.google.javascript.rhino.head.Scriptable scriptable22 = global14.getParentScope();
        java.lang.Object obj24 = global14.getAssociatedValue((java.lang.Object) 0.0f);
        java.lang.Object[] objArray25 = global14.getAllIds();
        java.io.InputStream inputStream26 = global14.getIn();
        global2.setIn(inputStream26);
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable29 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global28);
        java.lang.Object[] objArray30 = global28.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        global31.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global33, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        global38.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global40, (int) (short) 10);
        java.lang.Object obj43 = global36.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global38);
        boolean boolean45 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global38, "");
        global33.setParentScope((com.google.javascript.rhino.head.Scriptable) global38);
        java.lang.Object obj47 = global2.associateValue((java.lang.Object) global28, (java.lang.Object) global38);
        com.google.javascript.rhino.head.Scriptable scriptable48 = global28.getPrototype();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(scriptable10);
        org.junit.Assert.assertNull(scriptable13);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(scriptable22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertNotNull(scriptable29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNull(scriptable48);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        boolean boolean13 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global4, "");
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        global15.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17, (int) (short) 10);
        global17.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        global26.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global28, (int) (short) 10);
        java.lang.Object obj31 = global24.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global26);
        boolean boolean33 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global26, "");
        boolean boolean34 = global26.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable36 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global35);
        java.lang.Object[] objArray37 = global35.getAllIds();
        java.lang.Object obj38 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global26, (java.lang.Object) global35);
        com.google.javascript.rhino.head.Context context39 = null;
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        global43.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global45, (int) (short) 10);
        java.lang.Object obj48 = global41.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global43);
        com.google.javascript.rhino.head.Scriptable scriptable49 = global43.getPrototype();
        global35.defineOwnProperty(context39, (java.lang.Object) 'a', (com.google.javascript.rhino.head.ScriptableObject) global43);
        java.lang.Object obj52 = global35.get((java.lang.Object) 100L);
        boolean boolean53 = global17.has("object", (com.google.javascript.rhino.head.Scriptable) global35);
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable57 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global56);
        java.lang.Object[] objArray58 = global56.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean61 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global59, "");
        global54.put("", (com.google.javascript.rhino.head.Scriptable) global56, (java.lang.Object) boolean61);
        java.io.InputStream inputStream63 = global56.getIn();
        global35.setIn(inputStream63);
        global4.defineProperty("hi!", (java.lang.Object) inputStream63, (int) (short) 10);
        com.google.javascript.rhino.head.Scriptable scriptable67 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) global4);
        global4.sealObject();
        java.lang.Object obj69 = null;
        com.google.javascript.rhino.head.tools.shell.Global global70 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global72 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global74 = new com.google.javascript.rhino.head.tools.shell.Global();
        global72.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global74, (int) (short) 10);
        java.lang.Object obj77 = global70.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global72);
        boolean boolean79 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global72, "");
        boolean boolean80 = global72.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global81 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable82 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global81);
        java.lang.Object[] objArray83 = global81.getAllIds();
        java.lang.Object obj84 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global72, (java.lang.Object) global81);
        global72.delete((int) (byte) 10);
        java.lang.String str87 = global72.getTypeOf();
        java.io.PrintStream printStream88 = global72.getErr();
        boolean boolean89 = global72.isEmpty();
        com.google.javascript.rhino.head.Scriptable scriptable90 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global72);
        boolean boolean91 = global72.hasPrototypeMap();
        java.lang.Object obj92 = global4.associateValue(obj69, (java.lang.Object) global72);
        com.google.javascript.rhino.head.Scriptable scriptable93 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) global72);
        boolean boolean94 = global72.isSealed();
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(scriptable36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNull(scriptable49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(scriptable57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(inputStream63);
        org.junit.Assert.assertNull(scriptable67);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(scriptable82);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[]");
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "object" + "'", str87, "object");
        org.junit.Assert.assertNotNull(printStream88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(scriptable90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(obj92);
        org.junit.Assert.assertNull(scriptable93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable1 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global0);
        global0.sealObject();
        java.lang.Object[] objArray3 = global0.getAllIds();
        com.google.javascript.rhino.head.TopLevel.Builtins builtins4 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = global0.getBuiltinPrototype(builtins4);
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        global12.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global14, (int) (short) 10);
        java.lang.Object obj17 = global10.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global12);
        java.lang.Object obj18 = global8.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global12);
        int int19 = global12.size();
        boolean boolean20 = global12.avoidObjectDetection();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable23 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global22);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject25 = global12.exportAsJSClass(100, scriptable23, false);
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        global29.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        global36.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global38, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        global43.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global45, (int) (short) 10);
        java.lang.Object obj48 = global41.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global43);
        boolean boolean50 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global43, "");
        global38.setParentScope((com.google.javascript.rhino.head.Scriptable) global43);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject53 = global29.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global38, false);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject25, "", (java.lang.Object) (short) 100);
        boolean boolean56 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject25, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            global0.setGetterOrSetter("JavaImporter", (int) (byte) 0, (com.google.javascript.rhino.head.Callable) idFunctionObject25, true);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: Cannot modify a property of a sealed object: JavaImporter.");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(scriptable1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(scriptable5);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(scriptable23);
        org.junit.Assert.assertNotNull(idFunctionObject25);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(idFunctionObject53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global7 = new com.google.javascript.rhino.head.tools.shell.Global();
        global5.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global7, (int) (short) 10);
        java.lang.Object obj10 = global3.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5);
        java.lang.Object obj11 = global1.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global5);
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean14 = global13.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        global16.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        global23.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global25, (int) (short) 10);
        java.lang.Object obj28 = global21.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23);
        boolean boolean30 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global23, "");
        global18.setParentScope((com.google.javascript.rhino.head.Scriptable) global23);
        com.google.javascript.rhino.head.Context context32 = null;
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int37 = global18.runDoctest(context32, (com.google.javascript.rhino.head.Scriptable) global33, "", "hi!", (int) (short) 10);
        java.lang.Object obj38 = global13.get((int) (byte) 100, (com.google.javascript.rhino.head.Scriptable) global18);
        boolean boolean39 = global1.has((int) (short) 0, (com.google.javascript.rhino.head.Scriptable) global13);
        boolean boolean40 = global1.isInitialized();
        boolean boolean41 = global1.hasPrototypeMap();
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global46 = new com.google.javascript.rhino.head.tools.shell.Global();
        global44.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global46, (int) (short) 10);
        java.lang.Object obj49 = global42.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global44);
        com.google.javascript.rhino.head.Scriptable scriptable50 = global42.getParentScope();
        java.lang.Object obj52 = global42.getAssociatedValue((java.lang.Object) 0.0f);
        java.lang.Object[] objArray53 = global42.getAllIds();
        java.io.InputStream inputStream54 = global42.getIn();
        com.google.javascript.rhino.head.Scriptable scriptable55 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) global42);
        java.lang.Object[] objArray56 = global42.getIds();
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        global57.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global59, (int) (short) 10);
        global59.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global66 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global68 = new com.google.javascript.rhino.head.tools.shell.Global();
        global66.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global68, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global71 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global73 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global75 = new com.google.javascript.rhino.head.tools.shell.Global();
        global73.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global75, (int) (short) 10);
        java.lang.Object obj78 = global71.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global73);
        boolean boolean80 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global73, "");
        global68.setParentScope((com.google.javascript.rhino.head.Scriptable) global73);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject83 = global59.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global68, false);
        boolean boolean84 = idFunctionObject83.isSealed();
        com.google.javascript.rhino.head.tools.shell.Global.quit(context0, (com.google.javascript.rhino.head.Scriptable) global1, objArray56, (com.google.javascript.rhino.head.Function) idFunctionObject83);
        com.google.javascript.rhino.head.Scriptable scriptable86 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global1);
        boolean boolean87 = global1.hasPrototypeMap();
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNull(scriptable50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(inputStream54);
        org.junit.Assert.assertNull(scriptable55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(idFunctionObject83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(scriptable86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global7 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        global7.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global9, (int) (short) 10);
        java.lang.Object obj12 = global5.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global7);
        boolean boolean14 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global7, "");
        global2.setParentScope((com.google.javascript.rhino.head.Scriptable) global7);
        com.google.javascript.rhino.head.Context context16 = null;
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int21 = global2.runDoctest(context16, (com.google.javascript.rhino.head.Scriptable) global17, "", "hi!", (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        global24.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global26, (int) (short) 10);
        java.lang.Object obj29 = global22.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global24);
        global22.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        global33.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global35, (int) (short) 10);
        global35.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream41 = null;
        global35.setIn(inputStream41);
        java.lang.Object obj43 = global22.get(0, (com.google.javascript.rhino.head.Scriptable) global35);
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        global49.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global51, (int) (short) 10);
        java.lang.Object obj54 = global47.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global49);
        java.lang.Object obj55 = global45.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global49);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global35, 10, (java.lang.Object) global49);
        global2.setParentScope((com.google.javascript.rhino.head.Scriptable) global35);
        com.google.javascript.rhino.head.Scriptable scriptable58 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global2);
        java.lang.Object[] objArray59 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable60 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) global2);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNull(scriptable58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertNull(scriptable60);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        global1.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        global8.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10, (int) (short) 10);
        java.lang.Object obj13 = global6.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global8);
        boolean boolean15 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global8, "");
        global3.setParentScope((com.google.javascript.rhino.head.Scriptable) global8);
        java.lang.Object obj18 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global8, "");
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable20 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global19);
        java.lang.Object[] objArray21 = global19.getAllIds();
        com.google.javascript.rhino.head.Context context22 = null;
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        global25.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27, (int) (short) 10);
        java.lang.Object obj30 = global23.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global25);
        boolean boolean32 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global25, "");
        com.google.javascript.rhino.head.Scriptable scriptable33 = global25.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable35 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global34);
        java.lang.Object[] objArray36 = global34.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        global41.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global43, (int) (short) 10);
        java.lang.Object obj46 = global39.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41);
        java.lang.Object obj47 = global37.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global41);
        int int48 = global41.size();
        boolean boolean50 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global41, "");
        com.google.javascript.rhino.head.Context context51 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        com.google.javascript.rhino.head.commonjs.module.Require require58 = global41.installRequire(context51, (java.util.List<java.lang.String>) strList55, true);
        com.google.javascript.rhino.head.tools.shell.Global.load(context22, scriptable33, objArray36, (com.google.javascript.rhino.head.Function) require58);
        java.lang.Object obj60 = com.google.javascript.rhino.head.tools.shell.Global.doctest(context0, (com.google.javascript.rhino.head.Scriptable) global8, objArray21, (com.google.javascript.rhino.head.Function) require58);
        global8.preventExtensions();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        global62.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global64, (int) (short) 10);
        global64.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable71 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global64, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins72 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction73 = global64.getBuiltinCtor(builtins72);
        com.google.javascript.rhino.head.tools.shell.Global global75 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global77 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global79 = new com.google.javascript.rhino.head.tools.shell.Global();
        global77.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global79, (int) (short) 10);
        java.lang.Object obj82 = global75.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global77);
        boolean boolean83 = global64.has("", (com.google.javascript.rhino.head.Scriptable) global77);
        java.io.PrintStream printStream84 = global64.getErr();
        boolean boolean86 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global64, (int) (byte) -1);
        java.io.InputStream inputStream87 = global64.getIn();
        int int88 = global64.size();
        global8.setPrototype((com.google.javascript.rhino.head.Scriptable) global64);
        boolean boolean90 = global8.hasPrototypeMap();
        boolean boolean91 = global8.avoidObjectDetection();
        com.google.javascript.rhino.head.Context context92 = null;
        java.lang.String[] strArray93 = global8.getPrompts(context92);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(scriptable20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(scriptable33);
        org.junit.Assert.assertNotNull(scriptable35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(require58);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + false + "'", obj60, false);
        org.junit.Assert.assertNull(scriptable71);
        org.junit.Assert.assertNull(baseFunction73);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(printStream84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(inputStream87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(strArray93);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Context context8 = null;
        java.lang.String[] strArray9 = global2.getPrompts(context8);
        java.lang.String str10 = global2.getTypeOf();
        com.google.javascript.rhino.head.Context context11 = null;
        com.google.javascript.rhino.head.Context context12 = null;
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        global15.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17, (int) (short) 10);
        java.lang.Object obj20 = global13.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15);
        boolean boolean22 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global15, "");
        com.google.javascript.rhino.head.Scriptable scriptable23 = global15.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable25 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global24);
        java.lang.Object[] objArray26 = global24.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        global31.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global33, (int) (short) 10);
        java.lang.Object obj36 = global29.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global31);
        java.lang.Object obj37 = global27.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global31);
        int int38 = global31.size();
        boolean boolean40 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global31, "");
        com.google.javascript.rhino.head.Context context41 = null;
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        com.google.javascript.rhino.head.commonjs.module.Require require48 = global31.installRequire(context41, (java.util.List<java.lang.String>) strList45, true);
        com.google.javascript.rhino.head.tools.shell.Global.load(context12, scriptable23, objArray26, (com.google.javascript.rhino.head.Function) require48);
        com.google.javascript.rhino.head.Context context50 = null;
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        global51.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global61 = new com.google.javascript.rhino.head.tools.shell.Global();
        global59.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global61, (int) (short) 10);
        java.lang.Object obj64 = global57.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global59);
        global51.setAttributes("", (com.google.javascript.rhino.head.Scriptable) global59, (int) (short) 1);
        require48.defineOwnProperties(context50, (com.google.javascript.rhino.head.ScriptableObject) global59);
        global2.defineOwnProperties(context11, (com.google.javascript.rhino.head.ScriptableObject) require48);
        com.google.javascript.rhino.head.tools.shell.Global global70 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global72 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global74 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global76 = new com.google.javascript.rhino.head.tools.shell.Global();
        global74.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global76, (int) (short) 10);
        java.lang.Object obj79 = global72.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global74);
        java.lang.Object obj80 = global70.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global74);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins81 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction82 = global70.getBuiltinCtor(builtins81);
        java.io.InputStream inputStream83 = global70.getIn();
        java.lang.Object obj84 = global2.get(0, (com.google.javascript.rhino.head.Scriptable) global70);
        java.lang.String str85 = global70.getClassName();
        java.lang.Object obj87 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global70, "function");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins88 = null;
        com.google.javascript.rhino.head.Scriptable scriptable89 = global70.getBuiltinPrototype(builtins88);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "object" + "'", str10, "object");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(scriptable23);
        org.junit.Assert.assertNotNull(scriptable25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(require48);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertNull(baseFunction82);
        org.junit.Assert.assertNotNull(inputStream83);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "JavaImporter" + "'", str85, "JavaImporter");
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertNull(scriptable89);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        boolean boolean5 = global2.isInitialized();
        java.lang.Object[] objArray6 = global2.getIds();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        boolean boolean13 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global4, "");
        com.google.javascript.rhino.head.Context context14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        com.google.javascript.rhino.head.commonjs.module.Require require21 = global4.installRequire(context14, (java.util.List<java.lang.String>) strList18, true);
        com.google.javascript.rhino.head.Scriptable scriptable22 = global4.getParentScope();
        boolean boolean24 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global4, (int) '4');
        java.io.PrintStream printStream25 = global4.getOut();
        boolean boolean27 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global4, "");
        com.google.javascript.rhino.head.Scriptable scriptable28 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) global4);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(require21);
        org.junit.Assert.assertNull(scriptable22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(printStream25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(scriptable28);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean8 = global0.isExtensible();
        boolean boolean10 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global0, (int) (short) 100);
        com.google.javascript.rhino.head.Context context11 = null;
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        global14.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16, (int) (short) 10);
        java.lang.Object obj19 = global12.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global14);
        global12.delete("hi!");
        global0.defineOwnProperties(context11, (com.google.javascript.rhino.head.ScriptableObject) global12);
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        global25.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27, (int) (short) 10);
        java.lang.Object obj30 = global23.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global25);
        com.google.javascript.rhino.head.Scriptable scriptable31 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global23);
        com.google.javascript.rhino.head.Scriptable scriptable32 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global23);
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        global38.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global40, (int) (short) 10);
        java.lang.Object obj43 = global36.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global38);
        java.lang.Object obj44 = global34.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global38);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins45 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction46 = global34.getBuiltinCtor(builtins45);
        java.lang.Object obj48 = global34.getAssociatedValue((java.lang.Object) (short) 0);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global34, "");
        boolean boolean51 = global34.isSealed();
        java.lang.Object obj52 = global23.get((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) global34);
        boolean boolean53 = global12.hasInstance((com.google.javascript.rhino.head.Scriptable) global34);
        boolean boolean55 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global12, 2);
        boolean boolean57 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global12, "function");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(scriptable31);
        org.junit.Assert.assertNull(scriptable32);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNull(baseFunction46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        java.lang.Object obj16 = global9.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11);
        boolean boolean18 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global11, "");
        boolean boolean19 = global11.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable21 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global20);
        java.lang.Object[] objArray22 = global20.getAllIds();
        java.lang.Object obj23 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global11, (java.lang.Object) global20);
        com.google.javascript.rhino.head.Context context24 = null;
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        global28.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global30, (int) (short) 10);
        java.lang.Object obj33 = global26.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global28);
        com.google.javascript.rhino.head.Scriptable scriptable34 = global28.getPrototype();
        global20.defineOwnProperty(context24, (java.lang.Object) 'a', (com.google.javascript.rhino.head.ScriptableObject) global28);
        java.lang.Object obj37 = global20.get((java.lang.Object) 100L);
        boolean boolean38 = global2.has("object", (com.google.javascript.rhino.head.Scriptable) global20);
        int int40 = global2.getAttributes("");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins41 = null;
        com.google.javascript.rhino.head.Scriptable scriptable42 = global2.getBuiltinPrototype(builtins41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = com.google.javascript.rhino.head.ScriptableObject.getProperty(scriptable42, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(scriptable21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNull(scriptable34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(scriptable42);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins8 = null;
        com.google.javascript.rhino.head.Scriptable scriptable9 = global0.getBuiltinPrototype(builtins8);
        com.google.javascript.rhino.head.Scriptable scriptable10 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global0);
        com.google.javascript.rhino.head.Scriptable scriptable11 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global0);
        global0.cacheBuiltins();
        com.google.javascript.rhino.head.TopLevel.Builtins builtins13 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction14 = global0.getBuiltinCtor(builtins13);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNotNull(scriptable10);
        org.junit.Assert.assertNotNull(scriptable11);
        org.junit.Assert.assertNull(baseFunction14);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global0.preventExtensions();
        com.google.javascript.rhino.head.Scriptable scriptable6 = global0.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global7 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        global7.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global9, (int) (short) 10);
        global9.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Context context15 = null;
        java.lang.String[] strArray16 = global9.getPrompts(context15);
        java.lang.String str17 = global9.getTypeOf();
        com.google.javascript.rhino.head.Context context18 = null;
        com.google.javascript.rhino.head.Context context19 = null;
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        global22.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global24, (int) (short) 10);
        java.lang.Object obj27 = global20.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global22);
        boolean boolean29 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global22, "");
        com.google.javascript.rhino.head.Scriptable scriptable30 = global22.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable32 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global31);
        java.lang.Object[] objArray33 = global31.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        global38.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global40, (int) (short) 10);
        java.lang.Object obj43 = global36.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global38);
        java.lang.Object obj44 = global34.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global38);
        int int45 = global38.size();
        boolean boolean47 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global38, "");
        com.google.javascript.rhino.head.Context context48 = null;
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        com.google.javascript.rhino.head.commonjs.module.Require require55 = global38.installRequire(context48, (java.util.List<java.lang.String>) strList52, true);
        com.google.javascript.rhino.head.tools.shell.Global.load(context19, scriptable30, objArray33, (com.google.javascript.rhino.head.Function) require55);
        com.google.javascript.rhino.head.Context context57 = null;
        com.google.javascript.rhino.head.tools.shell.Global global58 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        global58.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global60, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global66 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global68 = new com.google.javascript.rhino.head.tools.shell.Global();
        global66.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global68, (int) (short) 10);
        java.lang.Object obj71 = global64.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global66);
        global58.setAttributes("", (com.google.javascript.rhino.head.Scriptable) global66, (int) (short) 1);
        require55.defineOwnProperties(context57, (com.google.javascript.rhino.head.ScriptableObject) global66);
        global9.defineOwnProperties(context18, (com.google.javascript.rhino.head.ScriptableObject) require55);
        com.google.javascript.rhino.head.tools.shell.Global global77 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global79 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global81 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global83 = new com.google.javascript.rhino.head.tools.shell.Global();
        global81.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global83, (int) (short) 10);
        java.lang.Object obj86 = global79.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global81);
        java.lang.Object obj87 = global77.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global81);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins88 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction89 = global77.getBuiltinCtor(builtins88);
        java.io.InputStream inputStream90 = global77.getIn();
        java.lang.Object obj91 = global9.get(0, (com.google.javascript.rhino.head.Scriptable) global77);
        java.lang.Object obj92 = global0.get(obj91);
        org.junit.Assert.assertNull(scriptable6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "object" + "'", str17, "object");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(scriptable30);
        org.junit.Assert.assertNotNull(scriptable32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(require55);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertNull(baseFunction89);
        org.junit.Assert.assertNotNull(inputStream90);
        org.junit.Assert.assertNotNull(obj91);
        org.junit.Assert.assertNull(obj92);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        global1.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        global8.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10, (int) (short) 10);
        java.lang.Object obj13 = global6.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global8);
        boolean boolean15 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global8, "");
        global3.setParentScope((com.google.javascript.rhino.head.Scriptable) global8);
        java.lang.Object obj18 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global8, "");
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable20 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global19);
        java.lang.Object[] objArray21 = global19.getAllIds();
        com.google.javascript.rhino.head.Context context22 = null;
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        global25.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27, (int) (short) 10);
        java.lang.Object obj30 = global23.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global25);
        boolean boolean32 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global25, "");
        com.google.javascript.rhino.head.Scriptable scriptable33 = global25.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable35 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global34);
        java.lang.Object[] objArray36 = global34.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        global41.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global43, (int) (short) 10);
        java.lang.Object obj46 = global39.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41);
        java.lang.Object obj47 = global37.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global41);
        int int48 = global41.size();
        boolean boolean50 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global41, "");
        com.google.javascript.rhino.head.Context context51 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        com.google.javascript.rhino.head.commonjs.module.Require require58 = global41.installRequire(context51, (java.util.List<java.lang.String>) strList55, true);
        com.google.javascript.rhino.head.tools.shell.Global.load(context22, scriptable33, objArray36, (com.google.javascript.rhino.head.Function) require58);
        java.lang.Object obj60 = com.google.javascript.rhino.head.tools.shell.Global.doctest(context0, (com.google.javascript.rhino.head.Scriptable) global8, objArray21, (com.google.javascript.rhino.head.Function) require58);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) global8, "", true);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins64 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction65 = global8.getBuiltinCtor(builtins64);
        com.google.javascript.rhino.head.tools.shell.Global global67 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global69 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global71 = new com.google.javascript.rhino.head.tools.shell.Global();
        global69.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global71, (int) (short) 10);
        java.lang.Object obj74 = global67.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global69);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins75 = null;
        com.google.javascript.rhino.head.Scriptable scriptable76 = global67.getBuiltinPrototype(builtins75);
        com.google.javascript.rhino.head.tools.shell.Global global77 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global79 = new com.google.javascript.rhino.head.tools.shell.Global();
        global77.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global79, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global82 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global84 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global86 = new com.google.javascript.rhino.head.tools.shell.Global();
        global84.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global86, (int) (short) 10);
        java.lang.Object obj89 = global82.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global84);
        boolean boolean91 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global84, "");
        global79.setParentScope((com.google.javascript.rhino.head.Scriptable) global84);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global79, "hi!");
        boolean boolean95 = global67.hasInstance((com.google.javascript.rhino.head.Scriptable) global79);
        com.google.javascript.rhino.head.Scriptable scriptable96 = global67.getParentScope();
        java.lang.Object obj97 = global8.get("hi!", (com.google.javascript.rhino.head.Scriptable) global67);
        java.io.PrintStream printStream98 = global67.getOut();
        java.lang.Object[] objArray99 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global67);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(scriptable20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(scriptable33);
        org.junit.Assert.assertNotNull(scriptable35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(require58);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + false + "'", obj60, false);
        org.junit.Assert.assertNull(baseFunction65);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNull(scriptable76);
        org.junit.Assert.assertNotNull(obj89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNull(scriptable96);
        org.junit.Assert.assertNotNull(obj97);
        org.junit.Assert.assertNotNull(printStream98);
        org.junit.Assert.assertNotNull(objArray99);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray99), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray99), "[]");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        int int12 = global4.size();
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        java.lang.Object obj8 = global1.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3);
        boolean boolean10 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global3, "");
        boolean boolean11 = global3.isSealed();
        com.google.javascript.rhino.head.Context context12 = null;
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        global15.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17, (int) (short) 10);
        java.lang.Object obj20 = global13.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15);
        boolean boolean22 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global15, "");
        com.google.javascript.rhino.head.Scriptable scriptable23 = global15.getPrototype();
        global15.activatePrototypeMap((int) '4');
        com.google.javascript.rhino.head.TopLevel.Builtins builtins26 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction27 = global15.getBuiltinCtor(builtins26);
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable29 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global28);
        java.lang.Object[] objArray30 = global28.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        global35.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global37, (int) (short) 10);
        java.lang.Object obj40 = global33.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global35);
        java.lang.Object obj41 = global31.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global35);
        int int42 = global35.size();
        boolean boolean44 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global35, "");
        com.google.javascript.rhino.head.Context context45 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        com.google.javascript.rhino.head.commonjs.module.Require require52 = global35.installRequire(context45, (java.util.List<java.lang.String>) strList49, true);
        com.google.javascript.rhino.head.tools.shell.Global.load(context12, (com.google.javascript.rhino.head.Scriptable) baseFunction27, objArray30, (com.google.javascript.rhino.head.Function) require52);
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        global54.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global56, (int) (short) 10);
        global56.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global63 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        global63.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global65, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global68 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global70 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global72 = new com.google.javascript.rhino.head.tools.shell.Global();
        global70.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global72, (int) (short) 10);
        java.lang.Object obj75 = global68.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global70);
        boolean boolean77 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global70, "");
        global65.setParentScope((com.google.javascript.rhino.head.Scriptable) global70);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject80 = global56.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global65, false);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject80, "");
        com.google.javascript.rhino.head.tools.shell.Global.gc(context0, (com.google.javascript.rhino.head.Scriptable) global3, objArray30, (com.google.javascript.rhino.head.Function) idFunctionObject80);
        com.google.javascript.rhino.head.Scriptable scriptable84 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global3);
        java.lang.String str85 = global3.getClassName();
        com.google.javascript.rhino.head.Scriptable scriptable87 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global3, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(scriptable23);
        org.junit.Assert.assertNull(baseFunction27);
        org.junit.Assert.assertNotNull(scriptable29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(require52);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(idFunctionObject80);
        org.junit.Assert.assertNull(scriptable84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "JavaImporter" + "'", str85, "JavaImporter");
        org.junit.Assert.assertNull(scriptable87);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable1 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global0);
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        global10.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global12, (int) (short) 10);
        java.lang.Object obj15 = global8.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10);
        boolean boolean17 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global10, "");
        global5.setParentScope((com.google.javascript.rhino.head.Scriptable) global10);
        boolean boolean19 = global0.has("", (com.google.javascript.rhino.head.Scriptable) global5);
        com.google.javascript.rhino.head.Context context20 = null;
        java.lang.String[] strArray21 = global0.getPrompts(context20);
        boolean boolean23 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global0, "hi!");
        java.io.InputStream inputStream24 = global0.getIn();
        java.lang.Object obj26 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global0, (-1));
        java.io.PrintStream printStream27 = global0.getOut();
        com.google.javascript.rhino.head.Scriptable scriptable29 = null;
        boolean boolean30 = global0.has((int) (short) 100, scriptable29);
        com.google.javascript.rhino.head.tools.shell.QuitAction quitAction31 = null;
        // The following exception was thrown during execution in test generation
        try {
            global0.initQuitAction(quitAction31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quitAction is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scriptable1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(printStream27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        global9.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        global16.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18, (int) (short) 10);
        java.lang.Object obj21 = global14.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16);
        boolean boolean23 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global16, "");
        global11.setParentScope((com.google.javascript.rhino.head.Scriptable) global16);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject26 = global2.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global11, false);
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        global30.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global32, (int) (short) 10);
        java.lang.Object obj35 = global28.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global30);
        com.google.javascript.rhino.head.Scriptable scriptable36 = global30.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        global40.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global42, (int) (short) 10);
        java.lang.Object obj45 = global38.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global40);
        boolean boolean47 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global40, "");
        boolean boolean48 = global40.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable50 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global49);
        java.lang.Object[] objArray51 = global49.getAllIds();
        java.lang.Object obj52 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global40, (java.lang.Object) global49);
        global30.setAttributes((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) global49, 1);
        global2.defineConst("object", (com.google.javascript.rhino.head.Scriptable) global30);
        global30.cacheBuiltins();
        global30.activatePrototypeMap(1);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(idFunctionObject26);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(scriptable36);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(scriptable50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable1 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global0);
        global0.setSealedStdLib(true);
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        global0.setPrototype(scriptable4);
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        global6.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global8, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        global13.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15, (int) (short) 10);
        java.lang.Object obj18 = global11.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13);
        boolean boolean20 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global13, "");
        global8.setParentScope((com.google.javascript.rhino.head.Scriptable) global13);
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        global22.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global24, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        global29.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global31, (int) (short) 10);
        java.lang.Object obj34 = global27.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29);
        boolean boolean36 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global29, "");
        global24.setParentScope((com.google.javascript.rhino.head.Scriptable) global29);
        boolean boolean39 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global24, "");
        com.google.javascript.rhino.head.Context context40 = null;
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        global43.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global45, (int) (short) 10);
        java.lang.Object obj48 = global41.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global43);
        boolean boolean50 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global43, "");
        com.google.javascript.rhino.head.Scriptable scriptable51 = global43.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable53 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global52);
        java.lang.Object[] objArray54 = global52.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global61 = new com.google.javascript.rhino.head.tools.shell.Global();
        global59.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global61, (int) (short) 10);
        java.lang.Object obj64 = global57.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global59);
        java.lang.Object obj65 = global55.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global59);
        int int66 = global59.size();
        boolean boolean68 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global59, "");
        com.google.javascript.rhino.head.Context context69 = null;
        java.lang.String[] strArray72 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        com.google.javascript.rhino.head.commonjs.module.Require require76 = global59.installRequire(context69, (java.util.List<java.lang.String>) strList73, true);
        com.google.javascript.rhino.head.tools.shell.Global.load(context40, scriptable51, objArray54, (com.google.javascript.rhino.head.Function) require76);
        boolean boolean78 = global24.hasInstance((com.google.javascript.rhino.head.Scriptable) require76);
        java.lang.Object obj79 = global0.associateValue((java.lang.Object) global8, (java.lang.Object) require76);
        global8.setAttributes(0, 3);
        org.junit.Assert.assertNull(scriptable1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(scriptable51);
        org.junit.Assert.assertNotNull(scriptable53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(require76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(obj79);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        java.lang.Object obj8 = global1.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3);
        boolean boolean10 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global3, "");
        com.google.javascript.rhino.head.Scriptable scriptable11 = global3.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable13 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global12);
        java.lang.Object[] objArray14 = global12.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        global19.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21, (int) (short) 10);
        java.lang.Object obj24 = global17.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19);
        java.lang.Object obj25 = global15.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global19);
        int int26 = global19.size();
        boolean boolean28 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global19, "");
        com.google.javascript.rhino.head.Context context29 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        com.google.javascript.rhino.head.commonjs.module.Require require36 = global19.installRequire(context29, (java.util.List<java.lang.String>) strList33, true);
        com.google.javascript.rhino.head.tools.shell.Global.load(context0, scriptable11, objArray14, (com.google.javascript.rhino.head.Function) require36);
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        global39.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global46 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        global46.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global48, (int) (short) 10);
        java.lang.Object obj51 = global44.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global46);
        boolean boolean53 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global46, "");
        global41.setParentScope((com.google.javascript.rhino.head.Scriptable) global46);
        com.google.javascript.rhino.head.Context context55 = null;
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int60 = global41.runDoctest(context55, (com.google.javascript.rhino.head.Scriptable) global56, "", "hi!", (int) (short) 10);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject62 = require36.exportAsJSClass((int) '4', (com.google.javascript.rhino.head.Scriptable) global41, false);
        global41.activatePrototypeMap((int) '#');
        com.google.javascript.rhino.head.tools.shell.Global global66 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global68 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global70 = new com.google.javascript.rhino.head.tools.shell.Global();
        global68.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global70, (int) (short) 10);
        java.lang.Object obj73 = global66.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global68);
        boolean boolean75 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global68, "");
        com.google.javascript.rhino.head.Context context76 = null;
        com.google.javascript.rhino.head.Scriptable scriptable77 = null;
        java.lang.Object[] objArray83 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function84 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context76, scriptable77, objArray83, function84);
        java.lang.Object obj86 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global68, (java.lang.Object) scriptable77);
        com.google.javascript.rhino.head.Context context87 = null;
        java.lang.String[] strArray88 = global68.getPrompts(context87);
        global68.setSealedStdLib(false);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) global41, "JavaImporter", (java.lang.Object) global68);
        com.google.javascript.rhino.head.Context context92 = null;
        java.lang.String[] strArray93 = global68.getPrompts(context92);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(scriptable11);
        org.junit.Assert.assertNotNull(scriptable13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(require36);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(idFunctionObject62);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(strArray93);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        global9.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        global16.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18, (int) (short) 10);
        java.lang.Object obj21 = global14.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16);
        boolean boolean23 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global16, "");
        global11.setParentScope((com.google.javascript.rhino.head.Scriptable) global16);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject26 = global2.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global11, false);
        java.lang.Object[] objArray27 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global11);
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        global31.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global33, (int) (short) 10);
        java.lang.Object obj36 = global29.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global31);
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        global37.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global39, (int) (short) 10);
        global39.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable46 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global39, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins47 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction48 = global39.getBuiltinCtor(builtins47);
        com.google.javascript.rhino.head.tools.shell.Global global50 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        global52.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global54, (int) (short) 10);
        java.lang.Object obj57 = global50.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global52);
        boolean boolean58 = global39.has("", (com.google.javascript.rhino.head.Scriptable) global52);
        java.io.PrintStream printStream59 = global39.getErr();
        global29.setErr(printStream59);
        com.google.javascript.rhino.head.tools.shell.Global global61 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global63 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        global63.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global65, (int) (short) 10);
        java.lang.Object obj68 = global61.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global63);
        boolean boolean70 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global63, "");
        com.google.javascript.rhino.head.Scriptable scriptable71 = global63.getPrototype();
        java.io.PrintStream printStream72 = null;
        global63.setOut(printStream72);
        java.lang.Object[] objArray74 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global63);
        global11.put("", (com.google.javascript.rhino.head.Scriptable) global29, (java.lang.Object) objArray74);
        boolean boolean76 = global11.isSealed();
        boolean boolean78 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global11, 3);
        global11.preventExtensions();
        com.google.javascript.rhino.head.TopLevel.Builtins builtins80 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Scriptable scriptable81 = null; // flaky: com.google.javascript.rhino.head.TopLevel.getBuiltinPrototype((com.google.javascript.rhino.head.Scriptable) global11, builtins80);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(idFunctionObject26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNull(scriptable46);
        org.junit.Assert.assertNull(baseFunction48);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(printStream59);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(scriptable71);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        global0.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        global13.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream19 = null;
        global13.setIn(inputStream19);
        java.lang.Object obj21 = global0.get(0, (com.google.javascript.rhino.head.Scriptable) global13);
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        java.lang.Object obj32 = global25.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27);
        java.lang.Object obj33 = global23.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global27);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global13, 10, (java.lang.Object) global27);
        boolean boolean35 = global27.isEmpty();
        global27.delete((int) (byte) -1);
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        global41.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global43, (int) (short) 10);
        java.lang.Object obj46 = global39.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41);
        boolean boolean47 = global39.isInitialized();
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject49 = global27.exportAsJSClass(1, (com.google.javascript.rhino.head.Scriptable) global39, false);
        com.google.javascript.rhino.head.Scriptable scriptable51 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global27, "function");
        boolean boolean52 = global27.isInitialized();
        java.lang.Class<?> wildcardClass53 = global27.getClass();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(idFunctionObject49);
        org.junit.Assert.assertNull(scriptable51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        com.google.javascript.rhino.head.Scriptable scriptable11 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) global4);
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        global12.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global14, (int) (short) 10);
        global14.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable21 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global14, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins22 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction23 = global14.getBuiltinCtor(builtins22);
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        java.lang.Object obj32 = global25.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27);
        boolean boolean33 = global14.has("", (com.google.javascript.rhino.head.Scriptable) global27);
        java.io.InputStream inputStream34 = global14.getIn();
        global4.setIn(inputStream34);
        java.lang.Object[] objArray36 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global4);
        com.google.javascript.rhino.head.Scriptable scriptable37 = global4.getParentScope();
        global4.delete("");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(scriptable11);
        org.junit.Assert.assertNull(scriptable21);
        org.junit.Assert.assertNull(baseFunction23);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNull(scriptable37);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        global0.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        global13.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream19 = null;
        global13.setIn(inputStream19);
        java.lang.Object obj21 = global0.get(0, (com.google.javascript.rhino.head.Scriptable) global13);
        com.google.javascript.rhino.head.Scriptable scriptable22 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global13);
        global13.cacheBuiltins();
        java.lang.Object obj25 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global13, (-1));
        com.google.javascript.rhino.head.Scriptable scriptable26 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global13);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(scriptable22);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(scriptable26);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        java.lang.Object obj16 = global9.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11);
        boolean boolean18 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global11, "");
        boolean boolean19 = global11.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable21 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global20);
        java.lang.Object[] objArray22 = global20.getAllIds();
        java.lang.Object obj23 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global11, (java.lang.Object) global20);
        com.google.javascript.rhino.head.Context context24 = null;
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        global28.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global30, (int) (short) 10);
        java.lang.Object obj33 = global26.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global28);
        com.google.javascript.rhino.head.Scriptable scriptable34 = global28.getPrototype();
        global20.defineOwnProperty(context24, (java.lang.Object) 'a', (com.google.javascript.rhino.head.ScriptableObject) global28);
        java.lang.Object obj37 = global20.get((java.lang.Object) 100L);
        boolean boolean38 = global2.has("object", (com.google.javascript.rhino.head.Scriptable) global20);
        boolean boolean40 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global20, (int) (short) 0);
        global20.delete("function");
        boolean boolean44 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global20, (int) '#');
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(scriptable21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNull(scriptable34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean9 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global2, "");
        com.google.javascript.rhino.head.Context context10 = null;
        com.google.javascript.rhino.head.Scriptable scriptable11 = null;
        java.lang.Object[] objArray17 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function18 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context10, scriptable11, objArray17, function18);
        java.lang.Object obj20 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global2, (java.lang.Object) scriptable11);
        com.google.javascript.rhino.head.Context context21 = null;
        java.lang.String[] strArray22 = global2.getPrompts(context21);
        global2.setSealedStdLib(false);
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable27 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global26);
        global26.setSealedStdLib(true);
        boolean boolean31 = global26.isConst("hi!");
        java.lang.Object obj32 = null;
        java.lang.Object obj34 = global26.associateValue(obj32, (java.lang.Object) (byte) 100);
        boolean boolean35 = global2.has("object", (com.google.javascript.rhino.head.Scriptable) global26);
        com.google.javascript.rhino.head.Scriptable scriptable36 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global26);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins37 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction38 = global26.getBuiltinCtor(builtins37);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNull(scriptable27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 100 + "'", obj34, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(scriptable36);
        org.junit.Assert.assertNull(baseFunction38);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        global2.delete("hi!");
        com.google.javascript.rhino.head.ImporterTopLevel.init(context1, (com.google.javascript.rhino.head.Scriptable) global2, false);
        java.lang.String str14 = global2.getTypeOf();
        java.lang.String str15 = global2.getClassName();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        global16.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18, (int) (short) 10);
        global18.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        global25.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        global32.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global34, (int) (short) 10);
        java.lang.Object obj37 = global30.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global32);
        boolean boolean39 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global32, "");
        global27.setParentScope((com.google.javascript.rhino.head.Scriptable) global32);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject42 = global18.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global27, false);
        java.lang.Object[] objArray43 = idFunctionObject42.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable45 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global44);
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        global51.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53, (int) (short) 10);
        java.lang.Object obj56 = global49.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global51);
        java.lang.Object obj57 = global47.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global51);
        int int58 = global51.size();
        java.io.PrintStream printStream59 = global51.getErr();
        boolean boolean61 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global51, "hi!");
        com.google.javascript.rhino.head.tools.shell.Global global63 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable66 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global65);
        java.lang.Object[] objArray67 = global65.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global68 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean70 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global68, "");
        global63.put("", (com.google.javascript.rhino.head.Scriptable) global65, (java.lang.Object) boolean70);
        global51.defineConst("object", (com.google.javascript.rhino.head.Scriptable) global65);
        java.lang.Object[] objArray73 = global51.getAllIds();
        java.lang.Object obj75 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global51, (int) (byte) 0);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject77 = global44.exportAsJSClass(3, (com.google.javascript.rhino.head.Scriptable) global51, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj78 = com.google.javascript.rhino.head.tools.shell.Global.sync(context0, (com.google.javascript.rhino.head.Scriptable) global2, objArray43, (com.google.javascript.rhino.head.Function) idFunctionObject77);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: no message resource found for message property msg.sync.args");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "object" + "'", str14, "object");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JavaImporter" + "'", str15, "JavaImporter");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(idFunctionObject42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[arguments, prototype, name, arity, length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[arguments, prototype, name, arity, length]");
        org.junit.Assert.assertNull(scriptable45);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(printStream59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(scriptable66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[1]");
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertNotNull(idFunctionObject77);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        java.lang.Object obj8 = global1.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3);
        boolean boolean10 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global3, "");
        boolean boolean11 = global3.isSealed();
        com.google.javascript.rhino.head.Context context12 = null;
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        global15.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17, (int) (short) 10);
        java.lang.Object obj20 = global13.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15);
        boolean boolean22 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global15, "");
        com.google.javascript.rhino.head.Scriptable scriptable23 = global15.getPrototype();
        global15.activatePrototypeMap((int) '4');
        com.google.javascript.rhino.head.TopLevel.Builtins builtins26 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction27 = global15.getBuiltinCtor(builtins26);
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable29 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global28);
        java.lang.Object[] objArray30 = global28.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        global35.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global37, (int) (short) 10);
        java.lang.Object obj40 = global33.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global35);
        java.lang.Object obj41 = global31.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global35);
        int int42 = global35.size();
        boolean boolean44 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global35, "");
        com.google.javascript.rhino.head.Context context45 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        com.google.javascript.rhino.head.commonjs.module.Require require52 = global35.installRequire(context45, (java.util.List<java.lang.String>) strList49, true);
        com.google.javascript.rhino.head.tools.shell.Global.load(context12, (com.google.javascript.rhino.head.Scriptable) baseFunction27, objArray30, (com.google.javascript.rhino.head.Function) require52);
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        global54.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global56, (int) (short) 10);
        global56.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global63 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        global63.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global65, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global68 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global70 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global72 = new com.google.javascript.rhino.head.tools.shell.Global();
        global70.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global72, (int) (short) 10);
        java.lang.Object obj75 = global68.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global70);
        boolean boolean77 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global70, "");
        global65.setParentScope((com.google.javascript.rhino.head.Scriptable) global70);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject80 = global56.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global65, false);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject80, "");
        com.google.javascript.rhino.head.tools.shell.Global.gc(context0, (com.google.javascript.rhino.head.Scriptable) global3, objArray30, (com.google.javascript.rhino.head.Function) idFunctionObject80);
        java.lang.Object obj85 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject80, (int) (byte) 100);
        boolean boolean87 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject80, (int) (byte) -1);
        java.lang.Object[] objArray88 = idFunctionObject80.getIds();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(scriptable23);
        org.junit.Assert.assertNull(baseFunction27);
        org.junit.Assert.assertNotNull(scriptable29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(require52);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(idFunctionObject80);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray88), "[]");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        java.lang.Object obj8 = global1.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3);
        boolean boolean10 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global3, "");
        boolean boolean11 = global3.isSealed();
        com.google.javascript.rhino.head.Context context12 = null;
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        global15.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17, (int) (short) 10);
        java.lang.Object obj20 = global13.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15);
        boolean boolean22 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global15, "");
        com.google.javascript.rhino.head.Scriptable scriptable23 = global15.getPrototype();
        global15.activatePrototypeMap((int) '4');
        com.google.javascript.rhino.head.TopLevel.Builtins builtins26 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction27 = global15.getBuiltinCtor(builtins26);
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable29 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global28);
        java.lang.Object[] objArray30 = global28.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        global35.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global37, (int) (short) 10);
        java.lang.Object obj40 = global33.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global35);
        java.lang.Object obj41 = global31.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global35);
        int int42 = global35.size();
        boolean boolean44 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global35, "");
        com.google.javascript.rhino.head.Context context45 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        com.google.javascript.rhino.head.commonjs.module.Require require52 = global35.installRequire(context45, (java.util.List<java.lang.String>) strList49, true);
        com.google.javascript.rhino.head.tools.shell.Global.load(context12, (com.google.javascript.rhino.head.Scriptable) baseFunction27, objArray30, (com.google.javascript.rhino.head.Function) require52);
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        global54.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global56, (int) (short) 10);
        global56.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global63 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        global63.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global65, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global68 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global70 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global72 = new com.google.javascript.rhino.head.tools.shell.Global();
        global70.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global72, (int) (short) 10);
        java.lang.Object obj75 = global68.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global70);
        boolean boolean77 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global70, "");
        global65.setParentScope((com.google.javascript.rhino.head.Scriptable) global70);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject80 = global56.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global65, false);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject80, "");
        com.google.javascript.rhino.head.tools.shell.Global.gc(context0, (com.google.javascript.rhino.head.Scriptable) global3, objArray30, (com.google.javascript.rhino.head.Function) idFunctionObject80);
        java.lang.Object[] objArray84 = idFunctionObject80.getIds();
        java.lang.Object obj86 = null;
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject80, 2, obj86);
        boolean boolean88 = idFunctionObject80.hasPrototypeMap();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(scriptable23);
        org.junit.Assert.assertNull(baseFunction27);
        org.junit.Assert.assertNotNull(scriptable29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(require52);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(idFunctionObject80);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        boolean boolean13 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global4, "");
        global4.cacheBuiltins();
        global4.delete("hi!");
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global4, "");
        java.io.PrintStream printStream19 = global4.getErr();
        boolean boolean21 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global4, 4);
        boolean boolean22 = global4.isEmpty();
        java.io.InputStream inputStream23 = global4.getIn();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable28 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global27);
        java.lang.Object[] objArray29 = global27.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean32 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global30, "");
        global25.put("", (com.google.javascript.rhino.head.Scriptable) global27, (java.lang.Object) boolean32);
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = global27.get(obj34);
        com.google.javascript.rhino.head.Scriptable scriptable36 = global27.getParentScope();
        boolean boolean37 = global27.isSealed();
        // The following exception was thrown during execution in test generation
        try {
            global4.defineProperty("", (java.lang.Object) global27, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(printStream19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertNotNull(scriptable28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(scriptable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean2 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global0, "");
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        global8.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10, (int) (short) 10);
        java.lang.Object obj13 = global6.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global8);
        java.lang.Object obj14 = global4.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global8);
        int int15 = global8.size();
        boolean boolean17 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global8, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject19 = global0.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global8, false);
        global0.cacheBuiltins();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        global24.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global26, (int) (short) 10);
        java.lang.Object obj29 = global22.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global24);
        boolean boolean31 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global24, "");
        boolean boolean32 = global24.isExtensible();
        java.lang.Object obj34 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global24, (int) (short) 1);
        java.lang.String str35 = global24.getTypeOf();
        java.lang.Object obj36 = global0.get("", (com.google.javascript.rhino.head.Scriptable) global24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(idFunctionObject19);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "object" + "'", str35, "object");
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global7 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        global7.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global9, (int) (short) 10);
        java.lang.Object obj12 = global5.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global7);
        boolean boolean14 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global7, "");
        global2.setParentScope((com.google.javascript.rhino.head.Scriptable) global7);
        java.lang.Object obj17 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global7, "");
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        global21.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23, (int) (short) 10);
        java.lang.Object obj26 = global19.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21);
        boolean boolean28 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global21, "");
        com.google.javascript.rhino.head.Context context29 = null;
        com.google.javascript.rhino.head.Scriptable scriptable30 = null;
        java.lang.Object[] objArray36 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function37 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context29, scriptable30, objArray36, function37);
        java.lang.Object obj39 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global21, (java.lang.Object) scriptable30);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject41 = global7.exportAsJSClass((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) global21, false);
        boolean boolean43 = global21.isConst("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable45 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global44);
        global21.setParentScope((com.google.javascript.rhino.head.Scriptable) global44);
        com.google.javascript.rhino.head.Context context47 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "JavaImporter", "object", "JavaImporter", "" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        com.google.javascript.rhino.head.commonjs.module.Require require56 = global44.installRequire(context47, (java.util.List<java.lang.String>) strList53, true);
        com.google.javascript.rhino.head.Context context57 = null;
        java.lang.String[] strArray58 = global44.getPrompts(context57);
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        global62.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global64, (int) (short) 10);
        java.lang.Object obj67 = global60.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global62);
        com.google.javascript.rhino.head.Scriptable scriptable68 = global60.getParentScope();
        java.lang.Object obj70 = global60.getAssociatedValue((java.lang.Object) 0.0f);
        com.google.javascript.rhino.head.Context context71 = null;
        java.lang.String[] strArray72 = global60.getPrompts(context71);
        java.lang.Object obj73 = global44.get("JavaImporter", (com.google.javascript.rhino.head.Scriptable) global60);
        boolean boolean75 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global44, (int) (short) -1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(idFunctionObject41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(scriptable45);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(require56);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNull(scriptable68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean5 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global3, "");
        com.google.javascript.rhino.head.tools.shell.Global global7 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        java.lang.Object obj16 = global9.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11);
        java.lang.Object obj17 = global7.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global11);
        int int18 = global11.size();
        boolean boolean20 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global11, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject22 = global3.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global11, false);
        com.google.javascript.rhino.head.Scriptable scriptable23 = global11.getParentScope();
        com.google.javascript.rhino.head.Context context24 = null;
        java.lang.String[] strArray25 = global11.getPrompts(context24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", (java.lang.Object[]) strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(idFunctionObject22);
        org.junit.Assert.assertNull(scriptable23);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean13 = global12.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        global15.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        global22.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global24, (int) (short) 10);
        java.lang.Object obj27 = global20.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global22);
        boolean boolean29 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global22, "");
        global17.setParentScope((com.google.javascript.rhino.head.Scriptable) global22);
        com.google.javascript.rhino.head.Context context31 = null;
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int36 = global17.runDoctest(context31, (com.google.javascript.rhino.head.Scriptable) global32, "", "hi!", (int) (short) 10);
        java.lang.Object obj37 = global12.get((int) (byte) 100, (com.google.javascript.rhino.head.Scriptable) global17);
        boolean boolean38 = global0.has((int) (short) 0, (com.google.javascript.rhino.head.Scriptable) global12);
        boolean boolean39 = global12.avoidObjectDetection();
        global12.delete("hi!");
        boolean boolean42 = global12.isInitialized();
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable45 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global44);
        global44.setSealedStdLib(true);
        boolean boolean49 = global44.isConst("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global50 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        global52.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global54, (int) (short) 10);
        java.lang.Object obj57 = global50.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global52);
        boolean boolean58 = global50.isExtensible();
        boolean boolean60 = global50.isConst("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global61 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global63 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        global63.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global65, (int) (short) 10);
        java.lang.Object obj68 = global61.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global63);
        boolean boolean69 = global61.isExtensible();
        global50.setParentScope((com.google.javascript.rhino.head.Scriptable) global61);
        java.lang.Object obj71 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global44, (java.lang.Object) global61);
        boolean boolean72 = global12.has(1, (com.google.javascript.rhino.head.Scriptable) global61);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(scriptable45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = global0.getParentScope();
        java.lang.Object obj10 = global0.getAssociatedValue((java.lang.Object) 0.0f);
        global0.delete(1);
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        global13.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15, (int) (short) 10);
        global15.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        global22.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global24, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        global29.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global31, (int) (short) 10);
        java.lang.Object obj34 = global27.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29);
        boolean boolean36 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global29, "");
        global24.setParentScope((com.google.javascript.rhino.head.Scriptable) global29);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject39 = global15.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global24, false);
        java.lang.Object[] objArray40 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global24);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) global24, "JavaImporter", true);
        global0.setPrototype((com.google.javascript.rhino.head.Scriptable) global24);
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean46 = global45.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global50 = new com.google.javascript.rhino.head.tools.shell.Global();
        global48.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global50, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        global55.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global57, (int) (short) 10);
        java.lang.Object obj60 = global53.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global55);
        boolean boolean62 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global55, "");
        global50.setParentScope((com.google.javascript.rhino.head.Scriptable) global55);
        com.google.javascript.rhino.head.Context context64 = null;
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int69 = global50.runDoctest(context64, (com.google.javascript.rhino.head.Scriptable) global65, "", "hi!", (int) (short) 10);
        java.lang.Object obj70 = global45.get((int) (byte) 100, (com.google.javascript.rhino.head.Scriptable) global50);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins71 = null;
        com.google.javascript.rhino.head.Scriptable scriptable72 = global45.getBuiltinPrototype(builtins71);
        global45.setSealedStdLib(true);
        com.google.javascript.rhino.head.tools.shell.Global global76 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global78 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global80 = new com.google.javascript.rhino.head.tools.shell.Global();
        global78.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global80, (int) (short) 10);
        java.lang.Object obj83 = global76.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global78);
        boolean boolean85 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global78, "");
        com.google.javascript.rhino.head.Scriptable scriptable86 = global78.getPrototype();
        global78.activatePrototypeMap((int) '4');
        com.google.javascript.rhino.head.TopLevel.Builtins builtins89 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction90 = global78.getBuiltinCtor(builtins89);
        java.io.InputStream inputStream91 = global78.getIn();
        global78.setAttributes("hi!", 10);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) global45, "", (java.lang.Object) global78);
        global0.setPrototype((com.google.javascript.rhino.head.Scriptable) global45);
        boolean boolean98 = global0.isConst("object");
        global0.preventExtensions();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(idFunctionObject39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNull(scriptable72);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNull(scriptable86);
        org.junit.Assert.assertNull(baseFunction90);
        org.junit.Assert.assertNotNull(inputStream91);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        java.lang.Object obj8 = global1.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3);
        boolean boolean10 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global3, "");
        com.google.javascript.rhino.head.Scriptable scriptable11 = global3.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable13 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global12);
        java.lang.Object[] objArray14 = global12.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        global19.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21, (int) (short) 10);
        java.lang.Object obj24 = global17.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19);
        java.lang.Object obj25 = global15.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global19);
        int int26 = global19.size();
        boolean boolean28 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global19, "");
        com.google.javascript.rhino.head.Context context29 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        com.google.javascript.rhino.head.commonjs.module.Require require36 = global19.installRequire(context29, (java.util.List<java.lang.String>) strList33, true);
        com.google.javascript.rhino.head.tools.shell.Global.load(context0, scriptable11, objArray14, (com.google.javascript.rhino.head.Function) require36);
        com.google.javascript.rhino.head.Context context38 = null;
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        global39.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        global47.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global49, (int) (short) 10);
        java.lang.Object obj52 = global45.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global47);
        global39.setAttributes("", (com.google.javascript.rhino.head.Scriptable) global47, (int) (short) 1);
        require36.defineOwnProperties(context38, (com.google.javascript.rhino.head.ScriptableObject) global47);
        boolean boolean56 = global47.isEmpty();
        java.lang.Object[] objArray57 = global47.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable61 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global60);
        com.google.javascript.rhino.head.tools.shell.Global global63 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        global63.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global65, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global68 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global70 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global72 = new com.google.javascript.rhino.head.tools.shell.Global();
        global70.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global72, (int) (short) 10);
        java.lang.Object obj75 = global68.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global70);
        boolean boolean77 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global70, "");
        global65.setParentScope((com.google.javascript.rhino.head.Scriptable) global70);
        boolean boolean79 = global60.has("", (com.google.javascript.rhino.head.Scriptable) global65);
        com.google.javascript.rhino.head.Context context80 = null;
        java.lang.String[] strArray81 = global60.getPrompts(context80);
        boolean boolean83 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global60, "hi!");
        java.io.InputStream inputStream84 = global60.getIn();
        global60.delete("object");
        // The following exception was thrown during execution in test generation
        try {
            global47.initPrototypeValue(0, "hi!", (java.lang.Object) global60, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(scriptable11);
        org.junit.Assert.assertNotNull(scriptable13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(require36);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[1]");
        org.junit.Assert.assertNull(scriptable61);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(inputStream84);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        global1.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        global8.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10, (int) (short) 10);
        java.lang.Object obj13 = global6.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global8);
        boolean boolean15 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global8, "");
        global3.setParentScope((com.google.javascript.rhino.head.Scriptable) global8);
        com.google.javascript.rhino.head.Context context17 = null;
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int22 = global3.runDoctest(context17, (com.google.javascript.rhino.head.Scriptable) global18, "", "hi!", (int) (short) 10);
        com.google.javascript.rhino.head.Context context23 = null;
        com.google.javascript.rhino.head.Scriptable scriptable24 = null;
        java.lang.Object[] objArray30 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function31 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context23, scriptable24, objArray30, function31);
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        global33.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global35, (int) (short) 10);
        global35.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        global42.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global44, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        global49.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global51, (int) (short) 10);
        java.lang.Object obj54 = global47.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global49);
        boolean boolean56 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global49, "");
        global44.setParentScope((com.google.javascript.rhino.head.Scriptable) global49);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject59 = global35.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global44, false);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject59, "");
        java.lang.Object obj62 = com.google.javascript.rhino.head.tools.shell.Global.doctest(context0, (com.google.javascript.rhino.head.Scriptable) global18, objArray30, (com.google.javascript.rhino.head.Function) idFunctionObject59);
        java.lang.Object[] objArray63 = global18.getAllIds();
        com.google.javascript.rhino.head.Scriptable scriptable64 = global18.getPrototype();
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(idFunctionObject59);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 0 + "'", obj62, 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertNull(scriptable64);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable9 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global2, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins10 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction11 = global2.getBuiltinCtor(builtins10);
        com.google.javascript.rhino.head.Scriptable scriptable12 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global2);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNull(baseFunction11);
        org.junit.Assert.assertNull(scriptable12);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global0);
        com.google.javascript.rhino.head.Scriptable scriptable9 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global0);
        boolean boolean11 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global0, (int) (short) 10);
        boolean boolean12 = global0.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean16 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global14, "");
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        global22.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global24, (int) (short) 10);
        java.lang.Object obj27 = global20.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global22);
        java.lang.Object obj28 = global18.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global22);
        int int29 = global22.size();
        boolean boolean31 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global22, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject33 = global14.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global22, false);
        java.lang.Object obj35 = global22.getAssociatedValue((java.lang.Object) (short) 1);
        com.google.javascript.rhino.head.Scriptable scriptable36 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) global22);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global0, "object", (java.lang.Object) scriptable36);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins38 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction39 = global0.getBuiltinCtor(builtins38);
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        global43.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global45, (int) (short) 10);
        java.lang.Object obj48 = global41.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global43);
        com.google.javascript.rhino.head.Scriptable scriptable49 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global41);
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        global51.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53, (int) (short) 10);
        global53.setAttributes("", (int) (short) 0);
        boolean boolean59 = global41.has((int) (byte) 0, (com.google.javascript.rhino.head.Scriptable) global53);
        com.google.javascript.rhino.head.Scriptable scriptable60 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global41);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins61 = null;
        com.google.javascript.rhino.head.Scriptable scriptable62 = global41.getBuiltinPrototype(builtins61);
        com.google.javascript.rhino.head.tools.shell.Global global63 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable66 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global65);
        java.lang.Object[] objArray67 = global65.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global68 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean70 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global68, "");
        global63.put("", (com.google.javascript.rhino.head.Scriptable) global65, (java.lang.Object) boolean70);
        java.lang.Object obj72 = null;
        java.lang.Object obj73 = global65.get(obj72);
        boolean boolean74 = global65.isEmpty();
        global65.cacheBuiltins();
        com.google.javascript.rhino.head.Scriptable scriptable76 = global65.getPrototype();
        // The following exception was thrown during execution in test generation
        try {
            baseFunction39.putConst("JavaImporter", (com.google.javascript.rhino.head.Scriptable) global41, (java.lang.Object) scriptable76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(idFunctionObject33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(scriptable36);
        org.junit.Assert.assertNull(baseFunction39);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNull(scriptable49);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(scriptable60);
        org.junit.Assert.assertNull(scriptable62);
        org.junit.Assert.assertNotNull(scriptable66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(scriptable76);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins11 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction12 = global0.getBuiltinCtor(builtins11);
        java.lang.Object obj14 = global0.getAssociatedValue((java.lang.Object) (short) 0);
        global0.delete(0);
        global0.cacheBuiltins();
        global0.cacheBuiltins();
        boolean boolean19 = global0.avoidObjectDetection();
        boolean boolean21 = global0.isConst("JavaImporter");
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        java.lang.Object obj32 = global25.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27);
        java.lang.Object obj33 = global23.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global27);
        int int34 = global27.size();
        java.io.PrintStream printStream35 = global27.getErr();
        boolean boolean37 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global27, "hi!");
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        global40.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global42, (int) (short) 10);
        java.lang.Object obj45 = global38.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global40);
        boolean boolean47 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global40, "");
        com.google.javascript.rhino.head.Scriptable scriptable48 = global40.getPrototype();
        global40.activatePrototypeMap((int) '4');
        com.google.javascript.rhino.head.Scriptable scriptable51 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global40);
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        global54.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global56, (int) (short) 10);
        java.lang.Object obj59 = global52.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global54);
        com.google.javascript.rhino.head.Scriptable scriptable60 = global52.getParentScope();
        java.lang.Object obj62 = global52.getAssociatedValue((java.lang.Object) 0.0f);
        java.lang.Object[] objArray63 = global52.getAllIds();
        java.io.InputStream inputStream64 = global52.getIn();
        global40.setIn(inputStream64);
        global27.setIn(inputStream64);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins67 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction68 = global27.getBuiltinCtor(builtins67);
        global27.delete("");
        // The following exception was thrown during execution in test generation
        try {
            int int71 = global0.getAttributes("", (com.google.javascript.rhino.head.Scriptable) global27);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: Property  not found.");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(baseFunction12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(printStream35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(scriptable48);
        org.junit.Assert.assertNull(scriptable51);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNull(scriptable60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertNotNull(inputStream64);
        org.junit.Assert.assertNull(baseFunction68);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean9 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global2, "");
        boolean boolean10 = global2.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable12 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global11);
        java.lang.Object[] objArray13 = global11.getAllIds();
        java.lang.Object obj14 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global2, (java.lang.Object) global11);
        com.google.javascript.rhino.head.Context context15 = null;
        com.google.javascript.rhino.head.Context context16 = null;
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        global21.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23, (int) (short) 10);
        java.lang.Object obj26 = global19.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21);
        java.lang.Object obj27 = global17.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global21);
        int int28 = global21.size();
        boolean boolean30 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global21, "");
        com.google.javascript.rhino.head.Context context31 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        com.google.javascript.rhino.head.commonjs.module.Require require38 = global21.installRequire(context31, (java.util.List<java.lang.String>) strList35, true);
        boolean boolean39 = global21.hasPrototypeMap();
        global21.setAttributes("", (int) (byte) 1);
        com.google.javascript.rhino.head.Context context43 = null;
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global46 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        global46.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global48, (int) (short) 10);
        java.lang.Object obj51 = global44.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global46);
        com.google.javascript.rhino.head.Scriptable scriptable52 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global44);
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        global54.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global56, (int) (short) 10);
        global56.setAttributes("", (int) (short) 0);
        boolean boolean62 = global44.has((int) (byte) 0, (com.google.javascript.rhino.head.Scriptable) global56);
        int int66 = global21.runDoctest(context43, (com.google.javascript.rhino.head.Scriptable) global44, "object", "hi!", (int) (byte) 0);
        com.google.javascript.rhino.head.ImporterTopLevel.init(context16, (com.google.javascript.rhino.head.Scriptable) global21, true);
        global21.preventExtensions();
        int int73 = global2.runDoctest(context15, (com.google.javascript.rhino.head.Scriptable) global21, "JavaImporter", "object", (int) '4');
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global2, "hi!");
        com.google.javascript.rhino.head.Context context76 = null;
        com.google.javascript.rhino.head.Scriptable scriptable77 = null;
        int int81 = global2.runDoctest(context76, scriptable77, "function", "JavaImporter", 11);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(scriptable12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(require38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNull(scriptable52);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        global1.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        global8.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10, (int) (short) 10);
        java.lang.Object obj13 = global6.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global8);
        boolean boolean15 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global8, "");
        global3.setParentScope((com.google.javascript.rhino.head.Scriptable) global8);
        com.google.javascript.rhino.head.ImporterTopLevel.init(context0, (com.google.javascript.rhino.head.Scriptable) global8, true);
        com.google.javascript.rhino.head.Context context19 = null;
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        global22.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global24, (int) (short) 10);
        java.lang.Object obj27 = global20.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global22);
        boolean boolean29 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global22, "");
        com.google.javascript.rhino.head.Scriptable scriptable30 = global22.getPrototype();
        global22.activatePrototypeMap((int) '4');
        com.google.javascript.rhino.head.Scriptable scriptable33 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global22);
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        global36.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global38, (int) (short) 10);
        java.lang.Object obj41 = global34.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global36);
        com.google.javascript.rhino.head.Scriptable scriptable42 = global34.getParentScope();
        java.lang.Object obj44 = global34.getAssociatedValue((java.lang.Object) 0.0f);
        java.lang.Object[] objArray45 = global34.getAllIds();
        java.io.InputStream inputStream46 = global34.getIn();
        global22.setIn(inputStream46);
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable49 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global48);
        java.lang.Object[] objArray50 = global48.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        global51.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global58 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        global58.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global60, (int) (short) 10);
        java.lang.Object obj63 = global56.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global58);
        boolean boolean65 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global58, "");
        global53.setParentScope((com.google.javascript.rhino.head.Scriptable) global58);
        java.lang.Object obj67 = global22.associateValue((java.lang.Object) global48, (java.lang.Object) global58);
        boolean boolean68 = global48.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global69 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean71 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global69, "");
        com.google.javascript.rhino.head.tools.shell.Global global73 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global75 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global77 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global79 = new com.google.javascript.rhino.head.tools.shell.Global();
        global77.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global79, (int) (short) 10);
        java.lang.Object obj82 = global75.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global77);
        java.lang.Object obj83 = global73.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global77);
        int int84 = global77.size();
        boolean boolean86 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global77, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject88 = global69.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global77, false);
        boolean boolean90 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global77, "");
        java.lang.Object obj91 = global48.get((java.lang.Object) global77);
        global8.defineOwnProperties(context19, (com.google.javascript.rhino.head.ScriptableObject) global48);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(scriptable30);
        org.junit.Assert.assertNull(scriptable33);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNull(scriptable42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(inputStream46);
        org.junit.Assert.assertNotNull(scriptable49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(idFunctionObject88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNull(obj91);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean8 = global0.isInitialized();
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global0, "hi!");
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        global14.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16, (int) (short) 10);
        java.lang.Object obj19 = global12.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global14);
        boolean boolean20 = global12.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        global26.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global28, (int) (short) 10);
        java.lang.Object obj31 = global24.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global26);
        java.lang.Object obj32 = global22.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global26);
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) global12, "", obj32, (int) (byte) 10);
        boolean boolean35 = global12.isInitialized();
        com.google.javascript.rhino.head.TopLevel.Builtins builtins36 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction37 = global12.getBuiltinCtor(builtins36);
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        global38.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global40, (int) (short) 10);
        global40.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable47 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global40, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins48 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction49 = global40.getBuiltinCtor(builtins48);
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        global53.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global55, (int) (short) 10);
        java.lang.Object obj58 = global51.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53);
        boolean boolean59 = global40.has("", (com.google.javascript.rhino.head.Scriptable) global53);
        java.io.PrintStream printStream60 = global40.getErr();
        global12.setOut(printStream60);
        boolean boolean62 = global0.has("hi!", (com.google.javascript.rhino.head.Scriptable) global12);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(baseFunction37);
        org.junit.Assert.assertNull(scriptable47);
        org.junit.Assert.assertNull(baseFunction49);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(printStream60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        boolean boolean13 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global4, "");
        global4.cacheBuiltins();
        com.google.javascript.rhino.head.Scriptable scriptable15 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        global4.defineProperty("", (java.lang.Object) "hi!", method18, method19, (int) (byte) 1);
        global4.delete("function");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(scriptable15);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable1 = global0.getParentScope();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        global10.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global12, (int) (short) 10);
        java.lang.Object obj15 = global8.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10);
        boolean boolean17 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global10, "");
        global5.setParentScope((com.google.javascript.rhino.head.Scriptable) global10);
        java.lang.Object obj20 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global10, "");
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        global24.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global26, (int) (short) 10);
        java.lang.Object obj29 = global22.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global24);
        boolean boolean31 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global24, "");
        com.google.javascript.rhino.head.Context context32 = null;
        com.google.javascript.rhino.head.Scriptable scriptable33 = null;
        java.lang.Object[] objArray39 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function40 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context32, scriptable33, objArray39, function40);
        java.lang.Object obj42 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global24, (java.lang.Object) scriptable33);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject44 = global10.exportAsJSClass((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) global24, false);
        boolean boolean46 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global10, (int) (short) 100);
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global50 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        global52.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global54, (int) (short) 10);
        java.lang.Object obj57 = global50.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global52);
        java.lang.Object obj58 = global48.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global52);
        int int59 = global52.size();
        boolean boolean60 = global52.avoidObjectDetection();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable63 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global62);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject65 = global52.exportAsJSClass(100, scriptable63, false);
        boolean boolean66 = global10.has((int) (short) 10, (com.google.javascript.rhino.head.Scriptable) idFunctionObject65);
        boolean boolean67 = idFunctionObject65.isSealed();
        java.lang.Object obj68 = global0.get("function", (com.google.javascript.rhino.head.Scriptable) idFunctionObject65);
        global0.setSealedStdLib(true);
        com.google.javascript.rhino.head.tools.shell.Global global71 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global73 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global75 = new com.google.javascript.rhino.head.tools.shell.Global();
        global73.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global75, (int) (short) 10);
        java.lang.Object obj78 = global71.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global73);
        boolean boolean80 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global73, "");
        com.google.javascript.rhino.head.Scriptable scriptable81 = global73.getPrototype();
        java.io.PrintStream printStream82 = null;
        global73.setOut(printStream82);
        global73.activatePrototypeMap(8);
        com.google.javascript.rhino.head.tools.shell.Global global87 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable88 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global87);
        global87.delete(4);
        global73.setAttributes("object", (com.google.javascript.rhino.head.Scriptable) global87, (int) (short) 0);
        java.lang.Object obj94 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global87, (int) (short) -1);
        java.io.InputStream inputStream95 = global87.getIn();
        global0.setIn(inputStream95);
        org.junit.Assert.assertNull(scriptable1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(idFunctionObject44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(scriptable63);
        org.junit.Assert.assertNotNull(idFunctionObject65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(scriptable81);
        org.junit.Assert.assertNull(scriptable88);
        org.junit.Assert.assertNotNull(obj94);
        org.junit.Assert.assertNotNull(inputStream95);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        boolean boolean13 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global4, "");
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        global15.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17, (int) (short) 10);
        global17.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        global26.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global28, (int) (short) 10);
        java.lang.Object obj31 = global24.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global26);
        boolean boolean33 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global26, "");
        boolean boolean34 = global26.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable36 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global35);
        java.lang.Object[] objArray37 = global35.getAllIds();
        java.lang.Object obj38 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global26, (java.lang.Object) global35);
        com.google.javascript.rhino.head.Context context39 = null;
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        global43.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global45, (int) (short) 10);
        java.lang.Object obj48 = global41.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global43);
        com.google.javascript.rhino.head.Scriptable scriptable49 = global43.getPrototype();
        global35.defineOwnProperty(context39, (java.lang.Object) 'a', (com.google.javascript.rhino.head.ScriptableObject) global43);
        java.lang.Object obj52 = global35.get((java.lang.Object) 100L);
        boolean boolean53 = global17.has("object", (com.google.javascript.rhino.head.Scriptable) global35);
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable57 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global56);
        java.lang.Object[] objArray58 = global56.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean61 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global59, "");
        global54.put("", (com.google.javascript.rhino.head.Scriptable) global56, (java.lang.Object) boolean61);
        java.io.InputStream inputStream63 = global56.getIn();
        global35.setIn(inputStream63);
        global4.defineProperty("hi!", (java.lang.Object) inputStream63, (int) (short) 10);
        com.google.javascript.rhino.head.Scriptable scriptable67 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) global4);
        global4.sealObject();
        java.lang.Object obj69 = null;
        com.google.javascript.rhino.head.tools.shell.Global global70 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global72 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global74 = new com.google.javascript.rhino.head.tools.shell.Global();
        global72.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global74, (int) (short) 10);
        java.lang.Object obj77 = global70.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global72);
        boolean boolean79 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global72, "");
        boolean boolean80 = global72.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global81 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable82 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global81);
        java.lang.Object[] objArray83 = global81.getAllIds();
        java.lang.Object obj84 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global72, (java.lang.Object) global81);
        global72.delete((int) (byte) 10);
        java.lang.String str87 = global72.getTypeOf();
        java.io.PrintStream printStream88 = global72.getErr();
        boolean boolean89 = global72.isEmpty();
        com.google.javascript.rhino.head.Scriptable scriptable90 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global72);
        boolean boolean91 = global72.hasPrototypeMap();
        java.lang.Object obj92 = global4.associateValue(obj69, (java.lang.Object) global72);
        java.lang.Object obj94 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global4, "function");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(scriptable36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNull(scriptable49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(scriptable57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(inputStream63);
        org.junit.Assert.assertNull(scriptable67);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(scriptable82);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[]");
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "object" + "'", str87, "object");
        org.junit.Assert.assertNotNull(printStream88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(scriptable90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(obj92);
        org.junit.Assert.assertNotNull(obj94);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable9 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global2, "hi!");
        com.google.javascript.rhino.head.Context context11 = null;
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        global14.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16, (int) (short) 10);
        java.lang.Object obj19 = global12.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global14);
        boolean boolean21 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global14, "");
        com.google.javascript.rhino.head.Scriptable scriptable22 = global14.getPrototype();
        global14.activatePrototypeMap((int) '4');
        com.google.javascript.rhino.head.TopLevel.Builtins builtins25 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction26 = global14.getBuiltinCtor(builtins25);
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable28 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global27);
        java.lang.Object[] objArray29 = global27.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        global34.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global36, (int) (short) 10);
        java.lang.Object obj39 = global32.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global34);
        java.lang.Object obj40 = global30.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global34);
        int int41 = global34.size();
        boolean boolean43 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global34, "");
        com.google.javascript.rhino.head.Context context44 = null;
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        com.google.javascript.rhino.head.commonjs.module.Require require51 = global34.installRequire(context44, (java.util.List<java.lang.String>) strList48, true);
        com.google.javascript.rhino.head.tools.shell.Global.load(context11, (com.google.javascript.rhino.head.Scriptable) baseFunction26, objArray29, (com.google.javascript.rhino.head.Function) require51);
        require51.activatePrototypeMap(100);
        global2.defineConst("object", (com.google.javascript.rhino.head.Scriptable) require51);
        com.google.javascript.rhino.head.Context context56 = null;
        java.lang.String[] strArray58 = new java.lang.String[] { "JavaImporter" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        com.google.javascript.rhino.head.commonjs.module.Require require62 = global2.installRequire(context56, (java.util.List<java.lang.String>) strList59, true);
        global2.delete(10);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(scriptable22);
        org.junit.Assert.assertNull(baseFunction26);
        org.junit.Assert.assertNotNull(scriptable28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(require51);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(require62);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        java.lang.Object obj8 = global1.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3);
        boolean boolean9 = global1.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        global15.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17, (int) (short) 10);
        java.lang.Object obj20 = global13.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15);
        java.lang.Object obj21 = global11.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global15);
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) global1, "", obj21, (int) (byte) 10);
        boolean boolean24 = global1.isInitialized();
        com.google.javascript.rhino.head.TopLevel.Builtins builtins25 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction26 = global1.getBuiltinCtor(builtins25);
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        global29.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable36 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global29, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins37 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction38 = global29.getBuiltinCtor(builtins37);
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        global42.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global44, (int) (short) 10);
        java.lang.Object obj47 = global40.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global42);
        boolean boolean48 = global29.has("", (com.google.javascript.rhino.head.Scriptable) global42);
        java.io.PrintStream printStream49 = global29.getErr();
        global1.setOut(printStream49);
        java.lang.Object obj54 = global1.getGetterOrSetter("object", (int) (short) 0, false);
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global58 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        global60.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global62, (int) (short) 10);
        java.lang.Object obj65 = global58.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global60);
        java.lang.Object obj66 = global56.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global60);
        int int67 = global60.size();
        boolean boolean69 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global60, "");
        global60.cacheBuiltins();
        com.google.javascript.rhino.head.Scriptable scriptable71 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global60);
        global60.delete("JavaImporter");
        com.google.javascript.rhino.head.Scriptable scriptable75 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global60, "JavaImporter");
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global60, "");
        boolean boolean78 = global1.has("hi!", (com.google.javascript.rhino.head.Scriptable) global60);
        com.google.javascript.rhino.head.ImporterTopLevel.init(context0, (com.google.javascript.rhino.head.Scriptable) global1, true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(baseFunction26);
        org.junit.Assert.assertNull(scriptable36);
        org.junit.Assert.assertNull(baseFunction38);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(printStream49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(scriptable71);
        org.junit.Assert.assertNull(scriptable75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins11 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction12 = global0.getBuiltinCtor(builtins11);
        java.lang.Object obj14 = global0.getAssociatedValue((java.lang.Object) (short) 0);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global0, "");
        boolean boolean17 = global0.isSealed();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        global20.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global22, (int) (short) 10);
        java.lang.Object obj25 = global18.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global20);
        boolean boolean27 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global20, "");
        com.google.javascript.rhino.head.Scriptable scriptable28 = global20.getPrototype();
        java.io.PrintStream printStream29 = null;
        global20.setOut(printStream29);
        java.lang.Object obj32 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global20, "JavaImporter");
        global0.setParentScope((com.google.javascript.rhino.head.Scriptable) global20);
        java.io.InputStream inputStream34 = global0.getIn();
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(baseFunction12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(scriptable28);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(inputStream34);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        boolean boolean12 = global4.avoidObjectDetection();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable15 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global14);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject17 = global4.exportAsJSClass(100, scriptable15, false);
        com.google.javascript.rhino.head.Scriptable scriptable19 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) idFunctionObject17, "");
        idFunctionObject17.sealObject();
        boolean boolean21 = idFunctionObject17.isExtensible();
        com.google.javascript.rhino.head.Scriptable scriptable22 = idFunctionObject17.getPrototype();
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scriptable15);
        org.junit.Assert.assertNotNull(idFunctionObject17);
        org.junit.Assert.assertNull(scriptable19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(scriptable22);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global0);
        com.google.javascript.rhino.head.Scriptable scriptable9 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global0);
        java.lang.String str10 = global0.getClassName();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        global16.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18, (int) (short) 10);
        java.lang.Object obj21 = global14.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16);
        java.lang.Object obj22 = global12.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global16);
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean25 = global24.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        global34.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global36, (int) (short) 10);
        java.lang.Object obj39 = global32.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global34);
        boolean boolean41 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global34, "");
        global29.setParentScope((com.google.javascript.rhino.head.Scriptable) global34);
        com.google.javascript.rhino.head.Context context43 = null;
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int48 = global29.runDoctest(context43, (com.google.javascript.rhino.head.Scriptable) global44, "", "hi!", (int) (short) 10);
        java.lang.Object obj49 = global24.get((int) (byte) 100, (com.google.javascript.rhino.head.Scriptable) global29);
        boolean boolean50 = global12.has((int) (short) 0, (com.google.javascript.rhino.head.Scriptable) global24);
        boolean boolean51 = global24.avoidObjectDetection();
        global24.delete("hi!");
        global24.setAttributes("", 13);
        java.lang.Object obj57 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global24);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JavaImporter" + "'", str10, "JavaImporter");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(obj57);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Context context8 = null;
        java.lang.String[] strArray9 = global2.getPrompts(context8);
        java.io.PrintStream printStream10 = null;
        global2.setErr(printStream10);
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        global13.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        global20.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global22, (int) (short) 10);
        java.lang.Object obj25 = global18.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global20);
        boolean boolean27 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global20, "");
        global15.setParentScope((com.google.javascript.rhino.head.Scriptable) global20);
        java.lang.Object obj30 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global20, "");
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        global34.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global36, (int) (short) 10);
        java.lang.Object obj39 = global32.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global34);
        boolean boolean41 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global34, "");
        com.google.javascript.rhino.head.Context context42 = null;
        com.google.javascript.rhino.head.Scriptable scriptable43 = null;
        java.lang.Object[] objArray49 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function50 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context42, scriptable43, objArray49, function50);
        java.lang.Object obj52 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global34, (java.lang.Object) scriptable43);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject54 = global20.exportAsJSClass((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) global34, false);
        java.lang.Object obj55 = global2.get("JavaImporter", (com.google.javascript.rhino.head.Scriptable) global34);
        boolean boolean56 = global2.avoidObjectDetection();
        com.google.javascript.rhino.head.tools.shell.Global global58 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable59 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global58);
        com.google.javascript.rhino.head.tools.shell.Global global61 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean63 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global61, "");
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global67 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global69 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global71 = new com.google.javascript.rhino.head.tools.shell.Global();
        global69.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global71, (int) (short) 10);
        java.lang.Object obj74 = global67.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global69);
        java.lang.Object obj75 = global65.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global69);
        int int76 = global69.size();
        boolean boolean78 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global69, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject80 = global61.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global69, false);
        global58.setAttributes(10, (com.google.javascript.rhino.head.Scriptable) global61, (int) (short) 0);
        boolean boolean83 = global2.has("function", (com.google.javascript.rhino.head.Scriptable) global58);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(idFunctionObject54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(scriptable59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(idFunctionObject80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean2 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global0, "");
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        global8.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10, (int) (short) 10);
        java.lang.Object obj13 = global6.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global8);
        java.lang.Object obj14 = global4.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global8);
        int int15 = global8.size();
        boolean boolean17 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global8, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject19 = global0.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global8, false);
        java.lang.Object obj21 = global8.getAssociatedValue((java.lang.Object) (short) 1);
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        global23.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global25, (int) (short) 10);
        global25.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Context context31 = null;
        java.lang.String[] strArray32 = global25.getPrompts(context31);
        java.lang.String str33 = global25.getTypeOf();
        boolean boolean34 = global8.has("JavaImporter", (com.google.javascript.rhino.head.Scriptable) global25);
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        global39.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41, (int) (short) 10);
        java.lang.Object obj44 = global37.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global39);
        java.lang.Object obj45 = global35.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global39);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins46 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction47 = global35.getBuiltinCtor(builtins46);
        java.lang.Object obj49 = global35.getAssociatedValue((java.lang.Object) (short) 0);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global35, "");
        java.lang.Object obj53 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global35, 1);
        java.io.PrintStream printStream54 = global35.getOut();
        global8.setErr(printStream54);
        com.google.javascript.rhino.head.Scriptable scriptable57 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global8, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(idFunctionObject19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "object" + "'", str33, "object");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNull(baseFunction47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(printStream54);
        org.junit.Assert.assertNull(scriptable57);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        boolean boolean12 = global4.avoidObjectDetection();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable15 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global14);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject17 = global4.exportAsJSClass(100, scriptable15, false);
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        global19.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21, (int) (short) 10);
        global21.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        global28.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global30, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        global35.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global37, (int) (short) 10);
        java.lang.Object obj40 = global33.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global35);
        boolean boolean42 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global35, "");
        global30.setParentScope((com.google.javascript.rhino.head.Scriptable) global35);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject45 = global21.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global30, false);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject17, "", (java.lang.Object) (short) 100);
        com.google.javascript.rhino.head.Scriptable scriptable47 = idFunctionObject17.getPrototype();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.redefineProperty(scriptable47, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scriptable15);
        org.junit.Assert.assertNotNull(idFunctionObject17);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(idFunctionObject45);
        org.junit.Assert.assertNull(scriptable47);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean3 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global1, "");
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global7 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        global9.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11, (int) (short) 10);
        java.lang.Object obj14 = global7.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global9);
        java.lang.Object obj15 = global5.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global9);
        int int16 = global9.size();
        boolean boolean18 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global9, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject20 = global1.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global9, false);
        java.lang.Object[] objArray21 = null;
        com.google.javascript.rhino.head.Context context22 = null;
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable24 = global23.getParentScope();
        java.lang.Object[] objArray25 = null;
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        global30.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global32, (int) (short) 10);
        java.lang.Object obj35 = global28.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global30);
        java.lang.Object obj36 = global26.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global30);
        int int37 = global30.size();
        boolean boolean38 = global30.avoidObjectDetection();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable41 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global40);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject43 = global30.exportAsJSClass(100, scriptable41, false);
        com.google.javascript.rhino.head.Scriptable scriptable45 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) idFunctionObject43, "");
        com.google.javascript.rhino.head.tools.shell.Global.quit(context22, scriptable24, objArray25, (com.google.javascript.rhino.head.Function) idFunctionObject43);
        com.google.javascript.rhino.head.tools.shell.Global.gc(context0, (com.google.javascript.rhino.head.Scriptable) global9, objArray21, (com.google.javascript.rhino.head.Function) idFunctionObject43);
        com.google.javascript.rhino.head.Scriptable scriptable48 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global9);
        global9.sealObject();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(idFunctionObject20);
        org.junit.Assert.assertNull(scriptable24);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(scriptable41);
        org.junit.Assert.assertNotNull(idFunctionObject43);
        org.junit.Assert.assertNull(scriptable45);
        org.junit.Assert.assertNull(scriptable48);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins11 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction12 = global0.getBuiltinCtor(builtins11);
        java.lang.Object obj14 = global0.getAssociatedValue((java.lang.Object) (short) 0);
        global0.delete(0);
        boolean boolean17 = global0.isEmpty();
        int int18 = global0.size();
        com.google.javascript.rhino.head.Scriptable scriptable20 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global0, "function");
        int int21 = global0.size();
        com.google.javascript.rhino.head.Context context22 = null;
        java.lang.String[] strArray23 = global0.getPrompts(context22);
        boolean boolean25 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global0, "object");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(baseFunction12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(scriptable20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean1 = global0.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        global10.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global12, (int) (short) 10);
        java.lang.Object obj15 = global8.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10);
        boolean boolean17 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global10, "");
        global5.setParentScope((com.google.javascript.rhino.head.Scriptable) global10);
        com.google.javascript.rhino.head.Context context19 = null;
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int24 = global5.runDoctest(context19, (com.google.javascript.rhino.head.Scriptable) global20, "", "hi!", (int) (short) 10);
        java.lang.Object obj25 = global0.get((int) (byte) 100, (com.google.javascript.rhino.head.Scriptable) global5);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins26 = null;
        com.google.javascript.rhino.head.Scriptable scriptable27 = global0.getBuiltinPrototype(builtins26);
        global0.setSealedStdLib(true);
        java.lang.Object obj31 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global0, 2);
        boolean boolean32 = global0.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        global34.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global36, (int) (short) 10);
        boolean boolean40 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global34, "hi!");
        global34.preventExtensions();
        boolean boolean42 = global34.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        global45.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global47, (int) (short) 10);
        java.lang.Object obj50 = global43.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global45);
        com.google.javascript.rhino.head.Scriptable scriptable51 = global43.getParentScope();
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        global54.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global56, (int) (short) 10);
        java.lang.Object obj59 = global52.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global54);
        java.lang.Object obj60 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global43, obj59);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins61 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction62 = global43.getBuiltinCtor(builtins61);
        boolean boolean63 = global43.hasPrototypeMap();
        java.lang.Object[] objArray64 = global43.getIds();
        java.io.InputStream inputStream65 = global43.getIn();
        global34.setIn(inputStream65);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global0, "function", (java.lang.Object) inputStream65);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(scriptable27);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNull(scriptable51);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(baseFunction62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertNotNull(inputStream65);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global7 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        global7.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global9, (int) (short) 10);
        java.lang.Object obj12 = global5.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global7);
        boolean boolean14 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global7, "");
        global2.setParentScope((com.google.javascript.rhino.head.Scriptable) global7);
        java.lang.Object obj17 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global7, "");
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        global21.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23, (int) (short) 10);
        java.lang.Object obj26 = global19.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21);
        boolean boolean28 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global21, "");
        com.google.javascript.rhino.head.Context context29 = null;
        com.google.javascript.rhino.head.Scriptable scriptable30 = null;
        java.lang.Object[] objArray36 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function37 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context29, scriptable30, objArray36, function37);
        java.lang.Object obj39 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global21, (java.lang.Object) scriptable30);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject41 = global7.exportAsJSClass((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) global21, false);
        boolean boolean43 = global21.isConst("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable45 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global44);
        global21.setParentScope((com.google.javascript.rhino.head.Scriptable) global44);
        com.google.javascript.rhino.head.Context context47 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "JavaImporter", "object", "JavaImporter", "" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        com.google.javascript.rhino.head.commonjs.module.Require require56 = global44.installRequire(context47, (java.util.List<java.lang.String>) strList53, true);
        java.lang.Object[] objArray57 = require56.getIds();
        java.lang.String str58 = require56.getTypeOf();
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) require56, "");
        boolean boolean62 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) require56, "hi!");
        require56.delete("function");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(idFunctionObject41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(scriptable45);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(require56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "function" + "'", str58, "function");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable1 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global0);
        global0.setSealedStdLib(true);
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        global0.setPrototype(scriptable4);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins6 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction7 = global0.getBuiltinCtor(builtins6);
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        java.lang.Object obj16 = global9.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11);
        boolean boolean18 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global11, "");
        boolean boolean19 = global11.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable21 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global20);
        java.lang.Object[] objArray22 = global20.getAllIds();
        java.lang.Object obj23 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global11, (java.lang.Object) global20);
        com.google.javascript.rhino.head.Context context24 = null;
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        global28.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global30, (int) (short) 10);
        java.lang.Object obj33 = global26.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global28);
        com.google.javascript.rhino.head.Scriptable scriptable34 = global28.getPrototype();
        global20.defineOwnProperty(context24, (java.lang.Object) 'a', (com.google.javascript.rhino.head.ScriptableObject) global28);
        global20.activatePrototypeMap((int) ' ');
        boolean boolean38 = global20.avoidObjectDetection();
        java.lang.Object obj40 = null;
        global20.defineProperty("hi!", obj40, 4);
        int int43 = global20.size();
        com.google.javascript.rhino.head.TopLevel.Builtins builtins44 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction45 = global20.getBuiltinCtor(builtins44);
        com.google.javascript.rhino.head.Context context46 = null;
        java.lang.String[] strArray47 = global20.getPrompts(context46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = com.google.javascript.rhino.head.ScriptableObject.callMethod((com.google.javascript.rhino.head.Scriptable) baseFunction7, "hi!", (java.lang.Object[]) strArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scriptable1);
        org.junit.Assert.assertNull(baseFunction7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(scriptable21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNull(scriptable34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNull(baseFunction45);
        org.junit.Assert.assertNotNull(strArray47);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream8 = null;
        global2.setIn(inputStream8);
        com.google.javascript.rhino.head.Scriptable scriptable10 = global2.getParentScope();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global2, "hi!", (java.lang.Object) 1.0d);
        boolean boolean14 = global2.hasPrototypeMap();
        global2.preventExtensions();
        com.google.javascript.rhino.head.Scriptable scriptable17 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global2, "object");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty(scriptable17, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scriptable10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(scriptable17);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins8 = null;
        com.google.javascript.rhino.head.Scriptable scriptable9 = global0.getBuiltinPrototype(builtins8);
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        global10.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global12, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        global17.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19, (int) (short) 10);
        java.lang.Object obj22 = global15.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17);
        boolean boolean24 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global17, "");
        global12.setParentScope((com.google.javascript.rhino.head.Scriptable) global17);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global12, "hi!");
        boolean boolean28 = global0.hasInstance((com.google.javascript.rhino.head.Scriptable) global12);
        global12.delete("hi!");
        boolean boolean32 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global12, 4);
        com.google.javascript.rhino.head.Scriptable scriptable33 = global12.getParentScope();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        global35.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global37, (int) (short) 10);
        global37.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global46 = new com.google.javascript.rhino.head.tools.shell.Global();
        global44.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global46, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        global51.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53, (int) (short) 10);
        java.lang.Object obj56 = global49.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global51);
        boolean boolean58 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global51, "");
        global46.setParentScope((com.google.javascript.rhino.head.Scriptable) global51);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject61 = global37.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global46, false);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) global46, "object", false);
        java.lang.reflect.Method method65 = null;
        java.lang.reflect.Method method66 = null;
        global12.defineProperty("", (java.lang.Object) "object", method65, method66, 8);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins69 = null;
        com.google.javascript.rhino.head.Scriptable scriptable70 = global12.getBuiltinPrototype(builtins69);
        boolean boolean71 = global12.isSealed();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(scriptable33);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(idFunctionObject61);
        org.junit.Assert.assertNull(scriptable70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        global0.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        global13.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream19 = null;
        global13.setIn(inputStream19);
        java.lang.Object obj21 = global0.get(0, (com.google.javascript.rhino.head.Scriptable) global13);
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        global23.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global25, (int) (short) 10);
        global25.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable32 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global25, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins33 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction34 = global25.getBuiltinCtor(builtins33);
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        global38.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global40, (int) (short) 10);
        java.lang.Object obj43 = global36.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global38);
        boolean boolean44 = global25.has("", (com.google.javascript.rhino.head.Scriptable) global38);
        boolean boolean45 = global25.hasPrototypeMap();
        java.io.PrintStream printStream46 = global25.getErr();
        boolean boolean47 = global13.has("hi!", (com.google.javascript.rhino.head.Scriptable) global25);
        global13.sealObject();
        com.google.javascript.rhino.head.tools.shell.Global global50 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable51 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global50);
        boolean boolean53 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global50, "");
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        global54.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global56, (int) (short) 10);
        global56.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream62 = null;
        global56.setIn(inputStream62);
        com.google.javascript.rhino.head.Scriptable scriptable64 = global56.getParentScope();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global56, "hi!", (java.lang.Object) 1.0d);
        java.io.PrintStream printStream68 = global56.getOut();
        global56.sealObject();
        global13.putConst("JavaImporter", (com.google.javascript.rhino.head.Scriptable) global50, (java.lang.Object) global56);
        boolean boolean71 = global50.avoidObjectDetection();
        int int72 = global50.size();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(scriptable32);
        org.junit.Assert.assertNull(baseFunction34);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(printStream46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(scriptable51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(scriptable64);
        org.junit.Assert.assertNotNull(printStream68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable9 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global2, "hi!");
        com.google.javascript.rhino.head.Scriptable scriptable11 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global2, "JavaImporter");
        global2.delete("object");
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNull(scriptable11);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream8 = null;
        global2.setIn(inputStream8);
        com.google.javascript.rhino.head.Scriptable scriptable10 = global2.getParentScope();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global2, "hi!", (java.lang.Object) 1.0d);
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        global14.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16, (int) (short) 10);
        global16.setAttributes("", (int) (short) 0);
        int int22 = global16.size();
        global2.setPrototype((com.google.javascript.rhino.head.Scriptable) global16);
        java.lang.Object[] objArray24 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global16);
        com.google.javascript.rhino.head.tools.shell.QuitAction quitAction25 = null;
        // The following exception was thrown during execution in test generation
        try {
            global16.initQuitAction(quitAction25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quitAction is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scriptable10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean9 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global2, "");
        boolean boolean10 = global2.isSealed();
        java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global2, 0);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global2, "function");
        boolean boolean16 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 1);
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        global22.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global24, (int) (short) 10);
        java.lang.Object obj27 = global20.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global22);
        java.lang.Object obj28 = global18.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global22);
        int int29 = global22.size();
        java.lang.Object[] objArray30 = global22.getAllIds();
        java.lang.Object obj31 = global2.get("", (com.google.javascript.rhino.head.Scriptable) global22);
        java.lang.String str32 = global2.getTypeOf();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1]");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "object" + "'", str32, "object");
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable1 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global0);
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean5 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global3, "");
        com.google.javascript.rhino.head.tools.shell.Global global7 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        java.lang.Object obj16 = global9.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11);
        java.lang.Object obj17 = global7.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global11);
        int int18 = global11.size();
        boolean boolean20 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global11, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject22 = global3.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global11, false);
        global0.setAttributes(10, (com.google.javascript.rhino.head.Scriptable) global3, (int) (short) 0);
        boolean boolean26 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global3, "JavaImporter");
        java.io.PrintStream printStream27 = global3.getErr();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        global31.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global33, (int) (short) 10);
        java.lang.Object obj36 = global29.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global31);
        global29.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        global40.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global42, (int) (short) 10);
        global42.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream48 = null;
        global42.setIn(inputStream48);
        java.lang.Object obj50 = global29.get(0, (com.google.javascript.rhino.head.Scriptable) global42);
        com.google.javascript.rhino.head.Scriptable scriptable51 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global42);
        global42.cacheBuiltins();
        global42.delete((int) (byte) 100);
        boolean boolean56 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global42, "function");
        java.lang.Object[] objArray57 = global42.getIds();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global3, "object", (java.lang.Object) objArray57);
        org.junit.Assert.assertNotNull(scriptable1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(idFunctionObject22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(printStream27);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(scriptable51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable9 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global2, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins10 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction11 = global2.getBuiltinCtor(builtins10);
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        global15.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17, (int) (short) 10);
        java.lang.Object obj20 = global13.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15);
        boolean boolean21 = global2.has("", (com.google.javascript.rhino.head.Scriptable) global15);
        java.io.InputStream inputStream22 = global2.getIn();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        global24.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global26, (int) (short) 10);
        global26.setAttributes("", (int) (short) 0);
        global2.defineProperty("object", (java.lang.Object) (short) 0, (int) (byte) 10);
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        global35.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global37, (int) (short) 10);
        global37.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable44 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global37, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins45 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction46 = global37.getBuiltinCtor(builtins45);
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global50 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        global50.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global52, (int) (short) 10);
        java.lang.Object obj55 = global48.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global50);
        boolean boolean56 = global37.has("", (com.google.javascript.rhino.head.Scriptable) global50);
        java.io.InputStream inputStream57 = global37.getIn();
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable60 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global59);
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        global62.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global64, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global67 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global69 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global71 = new com.google.javascript.rhino.head.tools.shell.Global();
        global69.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global71, (int) (short) 10);
        java.lang.Object obj74 = global67.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global69);
        boolean boolean76 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global69, "");
        global64.setParentScope((com.google.javascript.rhino.head.Scriptable) global69);
        boolean boolean78 = global59.has("", (com.google.javascript.rhino.head.Scriptable) global64);
        com.google.javascript.rhino.head.Context context79 = null;
        com.google.javascript.rhino.head.tools.shell.Global global80 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global82 = new com.google.javascript.rhino.head.tools.shell.Global();
        global80.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global82, (int) (short) 10);
        global59.defineOwnProperties(context79, (com.google.javascript.rhino.head.ScriptableObject) global80);
        com.google.javascript.rhino.head.Scriptable scriptable86 = global59.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable87 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global59);
        java.lang.Object obj88 = global37.get("", scriptable87);
        com.google.javascript.rhino.head.Scriptable scriptable89 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global37);
        com.google.javascript.rhino.head.Scriptable scriptable90 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope(scriptable89);
        global2.setAttributes("JavaImporter", scriptable89, 3);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNull(baseFunction11);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNull(scriptable44);
        org.junit.Assert.assertNull(baseFunction46);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(inputStream57);
        org.junit.Assert.assertNull(scriptable60);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(scriptable86);
        org.junit.Assert.assertNotNull(scriptable87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(scriptable89);
        org.junit.Assert.assertNotNull(scriptable90);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable9 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global2, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins10 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction11 = global2.getBuiltinCtor(builtins10);
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        global15.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17, (int) (short) 10);
        java.lang.Object obj20 = global13.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15);
        boolean boolean21 = global2.has("", (com.google.javascript.rhino.head.Scriptable) global15);
        java.io.InputStream inputStream22 = global2.getIn();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable25 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global24);
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        global34.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global36, (int) (short) 10);
        java.lang.Object obj39 = global32.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global34);
        boolean boolean41 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global34, "");
        global29.setParentScope((com.google.javascript.rhino.head.Scriptable) global34);
        boolean boolean43 = global24.has("", (com.google.javascript.rhino.head.Scriptable) global29);
        com.google.javascript.rhino.head.Context context44 = null;
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        global45.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global47, (int) (short) 10);
        global24.defineOwnProperties(context44, (com.google.javascript.rhino.head.ScriptableObject) global45);
        com.google.javascript.rhino.head.Scriptable scriptable51 = global24.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable52 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global24);
        java.lang.Object obj53 = global2.get("", scriptable52);
        com.google.javascript.rhino.head.Scriptable scriptable54 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global2);
        int int55 = global2.size();
        java.io.PrintStream printStream56 = global2.getOut();
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNull(baseFunction11);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNull(scriptable25);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(scriptable51);
        org.junit.Assert.assertNotNull(scriptable52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(scriptable54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(printStream56);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        java.lang.Object obj8 = global1.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3);
        boolean boolean10 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global3, "");
        com.google.javascript.rhino.head.Scriptable scriptable11 = global3.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable13 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global12);
        java.lang.Object[] objArray14 = global12.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        global19.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21, (int) (short) 10);
        java.lang.Object obj24 = global17.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19);
        java.lang.Object obj25 = global15.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global19);
        int int26 = global19.size();
        boolean boolean28 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global19, "");
        com.google.javascript.rhino.head.Context context29 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        com.google.javascript.rhino.head.commonjs.module.Require require36 = global19.installRequire(context29, (java.util.List<java.lang.String>) strList33, true);
        com.google.javascript.rhino.head.tools.shell.Global.load(context0, scriptable11, objArray14, (com.google.javascript.rhino.head.Function) require36);
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        global39.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global46 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        global46.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global48, (int) (short) 10);
        java.lang.Object obj51 = global44.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global46);
        boolean boolean53 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global46, "");
        global41.setParentScope((com.google.javascript.rhino.head.Scriptable) global46);
        com.google.javascript.rhino.head.Context context55 = null;
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int60 = global41.runDoctest(context55, (com.google.javascript.rhino.head.Scriptable) global56, "", "hi!", (int) (short) 10);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject62 = require36.exportAsJSClass((int) '4', (com.google.javascript.rhino.head.Scriptable) global41, false);
        java.io.PrintStream printStream63 = global41.getErr();
        boolean boolean64 = global41.hasPrototypeMap();
        java.lang.Object obj66 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global41, (int) (byte) 10);
        boolean boolean67 = global41.hasPrototypeMap();
        java.lang.String str68 = global41.getTypeOf();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(scriptable11);
        org.junit.Assert.assertNotNull(scriptable13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(require36);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(idFunctionObject62);
        org.junit.Assert.assertNotNull(printStream63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "object" + "'", str68, "object");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = global0.getParentScope();
        java.lang.Object obj10 = global0.getAssociatedValue((java.lang.Object) 0.0f);
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        global12.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global14, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        global19.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21, (int) (short) 10);
        java.lang.Object obj24 = global17.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19);
        boolean boolean26 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global19, "");
        global14.setParentScope((com.google.javascript.rhino.head.Scriptable) global19);
        java.lang.Object obj29 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global19, "");
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        global33.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global35, (int) (short) 10);
        java.lang.Object obj38 = global31.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global33);
        boolean boolean40 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global33, "");
        com.google.javascript.rhino.head.Context context41 = null;
        com.google.javascript.rhino.head.Scriptable scriptable42 = null;
        java.lang.Object[] objArray48 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function49 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context41, scriptable42, objArray48, function49);
        java.lang.Object obj51 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global33, (java.lang.Object) scriptable42);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject53 = global19.exportAsJSClass((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) global33, false);
        boolean boolean55 = global33.isConst("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable57 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global56);
        global33.setParentScope((com.google.javascript.rhino.head.Scriptable) global56);
        com.google.javascript.rhino.head.Context context59 = null;
        java.lang.String[] strArray64 = new java.lang.String[] { "JavaImporter", "object", "JavaImporter", "" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        com.google.javascript.rhino.head.commonjs.module.Require require68 = global56.installRequire(context59, (java.util.List<java.lang.String>) strList65, true);
        com.google.javascript.rhino.head.Context context69 = null;
        java.lang.String[] strArray70 = global56.getPrompts(context69);
        boolean boolean71 = global0.has("hi!", (com.google.javascript.rhino.head.Scriptable) global56);
        java.io.InputStream inputStream72 = global0.getIn();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(idFunctionObject53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(scriptable57);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(require68);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(inputStream72);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        boolean boolean13 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global4, "");
        com.google.javascript.rhino.head.Context context14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        com.google.javascript.rhino.head.commonjs.module.Require require21 = global4.installRequire(context14, (java.util.List<java.lang.String>) strList18, true);
        com.google.javascript.rhino.head.Scriptable scriptable22 = global4.getParentScope();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        java.lang.Object obj32 = global25.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27);
        java.lang.Object obj33 = global23.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global27);
        java.lang.Object[] objArray34 = global27.getIds();
        java.lang.Object obj35 = global4.get((java.lang.Object) objArray34);
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable37 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global36);
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        global39.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global46 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        global46.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global48, (int) (short) 10);
        java.lang.Object obj51 = global44.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global46);
        boolean boolean53 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global46, "");
        global41.setParentScope((com.google.javascript.rhino.head.Scriptable) global46);
        boolean boolean55 = global36.has("", (com.google.javascript.rhino.head.Scriptable) global41);
        com.google.javascript.rhino.head.Context context56 = null;
        java.lang.String[] strArray57 = global36.getPrompts(context56);
        boolean boolean59 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global36, "hi!");
        java.io.InputStream inputStream60 = global36.getIn();
        java.lang.Object obj61 = global4.getAssociatedValue((java.lang.Object) global36);
        boolean boolean63 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global36, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(require21);
        org.junit.Assert.assertNull(scriptable22);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(scriptable37);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(inputStream60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins8 = null;
        com.google.javascript.rhino.head.Scriptable scriptable9 = global0.getBuiltinPrototype(builtins8);
        java.lang.Object[] objArray10 = global0.getIds();
        boolean boolean12 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global0, "object");
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        global13.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15, (int) (short) 10);
        global13.preventExtensions();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        global23.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global25, (int) (short) 10);
        java.lang.Object obj28 = global21.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23);
        java.lang.Object obj29 = global19.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global23);
        int int30 = global23.size();
        boolean boolean32 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global23, "");
        global23.cacheBuiltins();
        global23.delete("hi!");
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global23, "");
        int int38 = global23.size();
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        global39.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41, (int) (short) 10);
        global41.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable48 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global41, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins49 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction50 = global41.getBuiltinCtor(builtins49);
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        global54.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global56, (int) (short) 10);
        java.lang.Object obj59 = global52.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global54);
        boolean boolean60 = global41.has("", (com.google.javascript.rhino.head.Scriptable) global54);
        java.io.InputStream inputStream61 = global41.getIn();
        global23.setIn(inputStream61);
        global13.setIn(inputStream61);
        global0.setIn(inputStream61);
        com.google.javascript.rhino.head.Context context65 = null;
        java.lang.String[] strArray66 = global0.getPrompts(context65);
        com.google.javascript.rhino.head.Context context67 = null;
        com.google.javascript.rhino.head.Context context68 = null;
        com.google.javascript.rhino.head.tools.shell.Global global69 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global71 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global73 = new com.google.javascript.rhino.head.tools.shell.Global();
        global71.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global73, (int) (short) 10);
        java.lang.Object obj76 = global69.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global71);
        global69.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global80 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global82 = new com.google.javascript.rhino.head.tools.shell.Global();
        global80.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global82, (int) (short) 10);
        global82.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream88 = null;
        global82.setIn(inputStream88);
        java.lang.Object obj90 = global69.get(0, (com.google.javascript.rhino.head.Scriptable) global82);
        com.google.javascript.rhino.head.Scriptable scriptable91 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global82);
        com.google.javascript.rhino.head.ImporterTopLevel.init(context68, (com.google.javascript.rhino.head.Scriptable) global82, false);
        global82.sealObject();
        global82.setSealedStdLib(true);
        com.google.javascript.rhino.head.ScriptableObject scriptableObject97 = null;
        // The following exception was thrown during execution in test generation
        try {
            global0.defineOwnProperty(context67, (java.lang.Object) true, scriptableObject97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNull(scriptable48);
        org.junit.Assert.assertNull(baseFunction50);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(inputStream61);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNotNull(obj90);
        org.junit.Assert.assertNotNull(scriptable91);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        global1.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        global8.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10, (int) (short) 10);
        java.lang.Object obj13 = global6.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global8);
        boolean boolean15 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global8, "");
        global3.setParentScope((com.google.javascript.rhino.head.Scriptable) global8);
        com.google.javascript.rhino.head.Context context17 = null;
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int22 = global3.runDoctest(context17, (com.google.javascript.rhino.head.Scriptable) global18, "", "hi!", (int) (short) 10);
        com.google.javascript.rhino.head.Context context23 = null;
        com.google.javascript.rhino.head.Scriptable scriptable24 = null;
        java.lang.Object[] objArray30 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function31 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context23, scriptable24, objArray30, function31);
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        global33.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global35, (int) (short) 10);
        global35.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        global42.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global44, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        global49.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global51, (int) (short) 10);
        java.lang.Object obj54 = global47.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global49);
        boolean boolean56 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global49, "");
        global44.setParentScope((com.google.javascript.rhino.head.Scriptable) global49);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject59 = global35.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global44, false);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject59, "");
        java.lang.Object obj62 = com.google.javascript.rhino.head.tools.shell.Global.doctest(context0, (com.google.javascript.rhino.head.Scriptable) global18, objArray30, (com.google.javascript.rhino.head.Function) idFunctionObject59);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins63 = null;
        com.google.javascript.rhino.head.Scriptable scriptable64 = global18.getBuiltinPrototype(builtins63);
        java.lang.String str65 = global18.getTypeOf();
        com.google.javascript.rhino.head.Scriptable scriptable66 = global18.getParentScope();
        com.google.javascript.rhino.head.ContextFactory contextFactory67 = null;
        // The following exception was thrown during execution in test generation
        try {
            global18.init(contextFactory67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(idFunctionObject59);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 0 + "'", obj62, 0);
        org.junit.Assert.assertNull(scriptable64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "object" + "'", str65, "object");
        org.junit.Assert.assertNull(scriptable66);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global7 = new com.google.javascript.rhino.head.tools.shell.Global();
        global5.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global7, (int) (short) 10);
        java.lang.Object obj10 = global3.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5);
        java.lang.Object obj11 = global1.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global5);
        int int12 = global5.size();
        boolean boolean14 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global5, "");
        com.google.javascript.rhino.head.Context context15 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        com.google.javascript.rhino.head.commonjs.module.Require require22 = global5.installRequire(context15, (java.util.List<java.lang.String>) strList19, true);
        boolean boolean23 = global5.hasPrototypeMap();
        global5.setAttributes("", (int) (byte) 1);
        com.google.javascript.rhino.head.Context context27 = null;
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        global30.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global32, (int) (short) 10);
        java.lang.Object obj35 = global28.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global30);
        com.google.javascript.rhino.head.Scriptable scriptable36 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global28);
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        global38.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global40, (int) (short) 10);
        global40.setAttributes("", (int) (short) 0);
        boolean boolean46 = global28.has((int) (byte) 0, (com.google.javascript.rhino.head.Scriptable) global40);
        int int50 = global5.runDoctest(context27, (com.google.javascript.rhino.head.Scriptable) global28, "object", "hi!", (int) (byte) 0);
        com.google.javascript.rhino.head.ImporterTopLevel.init(context0, (com.google.javascript.rhino.head.Scriptable) global5, true);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global5, "function");
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable56 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global55);
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global61 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global63 = new com.google.javascript.rhino.head.tools.shell.Global();
        global61.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global63, (int) (short) 10);
        java.lang.Object obj66 = global59.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global61);
        java.lang.Object obj67 = global57.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global61);
        int int68 = global61.size();
        boolean boolean69 = global61.avoidObjectDetection();
        java.lang.Object obj70 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global55, (java.lang.Object) boolean69);
        java.lang.Object[] objArray71 = global55.getIds();
        com.google.javascript.rhino.head.Scriptable scriptable72 = global55.getPrototype();
        global5.setPrototype(scriptable72);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(require22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(scriptable36);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(scriptable56);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[]");
        org.junit.Assert.assertNull(scriptable72);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Context context8 = null;
        java.lang.String[] strArray9 = global2.getPrompts(context8);
        java.lang.String str10 = global2.getTypeOf();
        boolean boolean12 = global2.isConst("hi!");
        global2.setAttributes(0, (int) (short) 1);
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        global17.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19, (int) (short) 10);
        global19.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream25 = null;
        global19.setIn(inputStream25);
        boolean boolean27 = global19.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        global32.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global34, (int) (short) 10);
        java.lang.Object obj37 = global30.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global32);
        java.lang.Object obj38 = global28.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global32);
        int int39 = global32.size();
        java.io.PrintStream printStream40 = global32.getErr();
        global19.setOut(printStream40);
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable43 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global42);
        global42.delete(4);
        boolean boolean46 = global42.hasPrototypeMap();
        com.google.javascript.rhino.head.Context context47 = null;
        java.lang.String[] strArray48 = global42.getPrompts(context47);
        global19.setParentScope((com.google.javascript.rhino.head.Scriptable) global42);
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        global53.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global55, (int) (short) 10);
        java.lang.Object obj58 = global51.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53);
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global61 = new com.google.javascript.rhino.head.tools.shell.Global();
        global59.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global61, (int) (short) 10);
        global61.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable68 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global61, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins69 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction70 = global61.getBuiltinCtor(builtins69);
        com.google.javascript.rhino.head.tools.shell.Global global72 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global74 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global76 = new com.google.javascript.rhino.head.tools.shell.Global();
        global74.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global76, (int) (short) 10);
        java.lang.Object obj79 = global72.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global74);
        boolean boolean80 = global61.has("", (com.google.javascript.rhino.head.Scriptable) global74);
        java.io.PrintStream printStream81 = global61.getErr();
        global51.setErr(printStream81);
        boolean boolean83 = global19.has("", (com.google.javascript.rhino.head.Scriptable) global51);
        java.lang.String str84 = global51.getTypeOf();
        boolean boolean85 = global2.has((int) (byte) 0, (com.google.javascript.rhino.head.Scriptable) global51);
        com.google.javascript.rhino.head.Scriptable scriptable87 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global2, "JavaImporter");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "object" + "'", str10, "object");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(printStream40);
        org.junit.Assert.assertNull(scriptable43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNull(scriptable68);
        org.junit.Assert.assertNull(baseFunction70);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(printStream81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "object" + "'", str84, "object");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNull(scriptable87);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        java.lang.Object obj8 = global1.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3);
        boolean boolean10 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global3, "");
        com.google.javascript.rhino.head.Scriptable scriptable11 = global3.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable13 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global12);
        java.lang.Object[] objArray14 = global12.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        global19.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21, (int) (short) 10);
        java.lang.Object obj24 = global17.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19);
        java.lang.Object obj25 = global15.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global19);
        int int26 = global19.size();
        boolean boolean28 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global19, "");
        com.google.javascript.rhino.head.Context context29 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        com.google.javascript.rhino.head.commonjs.module.Require require36 = global19.installRequire(context29, (java.util.List<java.lang.String>) strList33, true);
        com.google.javascript.rhino.head.tools.shell.Global.load(context0, scriptable11, objArray14, (com.google.javascript.rhino.head.Function) require36);
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        global39.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global46 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        global46.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global48, (int) (short) 10);
        java.lang.Object obj51 = global44.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global46);
        boolean boolean53 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global46, "");
        global41.setParentScope((com.google.javascript.rhino.head.Scriptable) global46);
        com.google.javascript.rhino.head.Context context55 = null;
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int60 = global41.runDoctest(context55, (com.google.javascript.rhino.head.Scriptable) global56, "", "hi!", (int) (short) 10);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject62 = require36.exportAsJSClass((int) '4', (com.google.javascript.rhino.head.Scriptable) global41, false);
        java.io.PrintStream printStream63 = global41.getErr();
        boolean boolean64 = global41.hasPrototypeMap();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) global41, "function", true);
        com.google.javascript.rhino.head.tools.shell.Global global69 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global71 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global73 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global75 = new com.google.javascript.rhino.head.tools.shell.Global();
        global73.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global75, (int) (short) 10);
        java.lang.Object obj78 = global71.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global73);
        java.lang.Object obj79 = global69.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global73);
        int int80 = global73.size();
        boolean boolean82 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global73, "");
        com.google.javascript.rhino.head.Context context83 = null;
        java.lang.String[] strArray86 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        com.google.javascript.rhino.head.commonjs.module.Require require90 = global73.installRequire(context83, (java.util.List<java.lang.String>) strList87, true);
        boolean boolean91 = global73.hasPrototypeMap();
        com.google.javascript.rhino.head.Scriptable scriptable92 = global73.getParentScope();
        java.lang.String str93 = global73.getTypeOf();
        com.google.javascript.rhino.head.Scriptable scriptable95 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global73, "hi!");
        java.io.InputStream inputStream96 = global73.getIn();
        com.google.javascript.rhino.head.Scriptable scriptable97 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global73);
        global41.setAttributes("object", (com.google.javascript.rhino.head.Scriptable) global73, (int) (byte) 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(scriptable11);
        org.junit.Assert.assertNotNull(scriptable13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(require36);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(idFunctionObject62);
        org.junit.Assert.assertNotNull(printStream63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(require90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(scriptable92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "object" + "'", str93, "object");
        org.junit.Assert.assertNull(scriptable95);
        org.junit.Assert.assertNotNull(inputStream96);
        org.junit.Assert.assertNotNull(scriptable97);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        java.lang.Object obj8 = global1.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3);
        com.google.javascript.rhino.head.Scriptable scriptable9 = global3.getPrototype();
        java.io.InputStream inputStream10 = global3.getIn();
        java.lang.Object[] objArray11 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global3);
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean14 = global13.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        global16.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        global23.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global25, (int) (short) 10);
        java.lang.Object obj28 = global21.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23);
        boolean boolean30 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global23, "");
        global18.setParentScope((com.google.javascript.rhino.head.Scriptable) global23);
        com.google.javascript.rhino.head.Context context32 = null;
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int37 = global18.runDoctest(context32, (com.google.javascript.rhino.head.Scriptable) global33, "", "hi!", (int) (short) 10);
        java.lang.Object obj38 = global13.get((int) (byte) 100, (com.google.javascript.rhino.head.Scriptable) global18);
        boolean boolean39 = global18.isEmpty();
        boolean boolean40 = global18.hasPrototypeMap();
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        global42.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global44, (int) (short) 10);
        global44.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        global51.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global58 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        global58.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global60, (int) (short) 10);
        java.lang.Object obj63 = global56.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global58);
        boolean boolean65 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global58, "");
        global53.setParentScope((com.google.javascript.rhino.head.Scriptable) global58);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject68 = global44.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global53, false);
        java.lang.Object[] objArray69 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global53);
        java.lang.Object obj71 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global53, "");
        java.lang.Object obj72 = global18.get("JavaImporter", (com.google.javascript.rhino.head.Scriptable) global53);
        java.lang.Object obj73 = global3.get("", (com.google.javascript.rhino.head.Scriptable) global18);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins74 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function75 = null; // flaky: com.google.javascript.rhino.head.TopLevel.getBuiltinCtor(context0, (com.google.javascript.rhino.head.Scriptable) global18, builtins74);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(idFunctionObject68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(obj73);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = global0.getParentScope();
        boolean boolean9 = global0.isSealed();
        java.io.PrintStream printStream10 = global0.getErr();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        global13.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        global20.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global22, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        java.lang.Object obj32 = global25.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27);
        boolean boolean34 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global27, "");
        global22.setParentScope((com.google.javascript.rhino.head.Scriptable) global27);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject37 = global13.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global22, false);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject37, "");
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        global43.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global45, (int) (short) 10);
        java.lang.Object obj48 = global41.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global43);
        global41.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        global52.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global54, (int) (short) 10);
        global54.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream60 = null;
        global54.setIn(inputStream60);
        java.lang.Object obj62 = global41.get(0, (com.google.javascript.rhino.head.Scriptable) global54);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject37, "", obj62);
        idFunctionObject37.delete(0);
        global0.setParentScope((com.google.javascript.rhino.head.Scriptable) idFunctionObject37);
        java.lang.Object[] objArray67 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) idFunctionObject37);
        boolean boolean68 = idFunctionObject37.hasPrototypeMap();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(printStream10);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(idFunctionObject37);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable9 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global2, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins10 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction11 = global2.getBuiltinCtor(builtins10);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins12 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction13 = global2.getBuiltinCtor(builtins12);
        int int15 = global2.getAttributes("");
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        global19.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21, (int) (short) 10);
        java.lang.Object obj24 = global17.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19);
        boolean boolean26 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global19, "");
        com.google.javascript.rhino.head.Scriptable scriptable27 = global19.getPrototype();
        global19.activatePrototypeMap((int) '4');
        com.google.javascript.rhino.head.Scriptable scriptable30 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global19);
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        global33.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global35, (int) (short) 10);
        java.lang.Object obj38 = global31.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global33);
        com.google.javascript.rhino.head.Scriptable scriptable39 = global31.getParentScope();
        java.lang.Object obj41 = global31.getAssociatedValue((java.lang.Object) 0.0f);
        java.lang.Object[] objArray42 = global31.getAllIds();
        java.io.InputStream inputStream43 = global31.getIn();
        global19.setIn(inputStream43);
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable46 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global45);
        java.lang.Object[] objArray47 = global45.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global50 = new com.google.javascript.rhino.head.tools.shell.Global();
        global48.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global50, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        global55.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global57, (int) (short) 10);
        java.lang.Object obj60 = global53.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global55);
        boolean boolean62 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global55, "");
        global50.setParentScope((com.google.javascript.rhino.head.Scriptable) global55);
        java.lang.Object obj64 = global19.associateValue((java.lang.Object) global45, (java.lang.Object) global55);
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) global2, "", (java.lang.Object) global55, 0);
        boolean boolean67 = global55.isSealed();
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNull(baseFunction11);
        org.junit.Assert.assertNull(baseFunction13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(scriptable27);
        org.junit.Assert.assertNull(scriptable30);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNull(scriptable39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(inputStream43);
        org.junit.Assert.assertNotNull(scriptable46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable9 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global2, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins10 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction11 = global2.getBuiltinCtor(builtins10);
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        global15.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17, (int) (short) 10);
        java.lang.Object obj20 = global13.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15);
        boolean boolean21 = global2.has("", (com.google.javascript.rhino.head.Scriptable) global15);
        java.io.PrintStream printStream22 = global2.getErr();
        boolean boolean24 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global2, (int) (byte) -1);
        global2.delete((int) (byte) -1);
        boolean boolean27 = global2.isSealed();
        com.google.javascript.rhino.head.Scriptable scriptable28 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Scriptable scriptable30 = com.google.javascript.rhino.head.TopLevel.getBuiltinPrototype(scriptable28, builtins29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNull(baseFunction11);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(printStream22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(scriptable28);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global0);
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        global10.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global12, (int) (short) 10);
        global12.setAttributes("", (int) (short) 0);
        boolean boolean18 = global0.has((int) (byte) 0, (com.google.javascript.rhino.head.Scriptable) global12);
        com.google.javascript.rhino.head.Scriptable scriptable19 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global0);
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        global20.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global22, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        java.lang.Object obj32 = global25.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27);
        boolean boolean34 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global27, "");
        global22.setParentScope((com.google.javascript.rhino.head.Scriptable) global27);
        com.google.javascript.rhino.head.Context context36 = null;
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        global41.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global43, (int) (short) 10);
        java.lang.Object obj46 = global39.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41);
        java.lang.Object obj47 = global37.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global41);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins48 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction49 = global37.getBuiltinCtor(builtins48);
        int int53 = global22.runDoctest(context36, (com.google.javascript.rhino.head.Scriptable) global37, "function", "JavaImporter", (int) '#');
        java.io.PrintStream printStream54 = global37.getOut();
        global0.setOut(printStream54);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(scriptable19);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNull(baseFunction49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(printStream54);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean9 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global2, "");
        com.google.javascript.rhino.head.Scriptable scriptable10 = global2.getPrototype();
        global2.activatePrototypeMap((int) '4');
        com.google.javascript.rhino.head.Scriptable scriptable13 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        global16.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18, (int) (short) 10);
        java.lang.Object obj21 = global14.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16);
        com.google.javascript.rhino.head.Scriptable scriptable22 = global14.getParentScope();
        java.lang.Object obj24 = global14.getAssociatedValue((java.lang.Object) 0.0f);
        java.lang.Object[] objArray25 = global14.getAllIds();
        java.io.InputStream inputStream26 = global14.getIn();
        global2.setIn(inputStream26);
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable29 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global28);
        java.lang.Object[] objArray30 = global28.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        global31.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global33, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        global38.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global40, (int) (short) 10);
        java.lang.Object obj43 = global36.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global38);
        boolean boolean45 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global38, "");
        global33.setParentScope((com.google.javascript.rhino.head.Scriptable) global38);
        java.lang.Object obj47 = global2.associateValue((java.lang.Object) global28, (java.lang.Object) global38);
        boolean boolean48 = global28.isExtensible();
        com.google.javascript.rhino.head.Context context49 = null;
        java.lang.String[] strArray50 = global28.getPrompts(context49);
        com.google.javascript.rhino.head.Scriptable scriptable52 = null;
        global28.setAttributes("function", scriptable52, 2);
        boolean boolean55 = global28.avoidObjectDetection();
        com.google.javascript.rhino.head.Scriptable scriptable56 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global28);
        com.google.javascript.rhino.head.Scriptable scriptable57 = null;
        global28.setPrototype(scriptable57);
        java.lang.String str59 = global28.getTypeOf();
        com.google.javascript.rhino.head.Scriptable scriptable61 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global28, "function");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(scriptable10);
        org.junit.Assert.assertNull(scriptable13);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(scriptable22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertNotNull(scriptable29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(scriptable56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "object" + "'", str59, "object");
        org.junit.Assert.assertNull(scriptable61);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean1 = global0.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        global10.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global12, (int) (short) 10);
        java.lang.Object obj15 = global8.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10);
        boolean boolean17 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global10, "");
        global5.setParentScope((com.google.javascript.rhino.head.Scriptable) global10);
        com.google.javascript.rhino.head.Context context19 = null;
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int24 = global5.runDoctest(context19, (com.google.javascript.rhino.head.Scriptable) global20, "", "hi!", (int) (short) 10);
        java.lang.Object obj25 = global0.get((int) (byte) 100, (com.google.javascript.rhino.head.Scriptable) global5);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins26 = null;
        com.google.javascript.rhino.head.Scriptable scriptable27 = global0.getBuiltinPrototype(builtins26);
        global0.setSealedStdLib(true);
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        global33.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global35, (int) (short) 10);
        java.lang.Object obj38 = global31.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global33);
        boolean boolean40 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global33, "");
        com.google.javascript.rhino.head.Scriptable scriptable41 = global33.getPrototype();
        global33.activatePrototypeMap((int) '4');
        com.google.javascript.rhino.head.TopLevel.Builtins builtins44 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction45 = global33.getBuiltinCtor(builtins44);
        java.io.InputStream inputStream46 = global33.getIn();
        global33.setAttributes("hi!", 10);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) global0, "", (java.lang.Object) global33);
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        global52.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global54, (int) (short) 10);
        global54.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable61 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global54, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins62 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction63 = global54.getBuiltinCtor(builtins62);
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global67 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global69 = new com.google.javascript.rhino.head.tools.shell.Global();
        global67.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global69, (int) (short) 10);
        java.lang.Object obj72 = global65.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global67);
        boolean boolean73 = global54.has("", (com.google.javascript.rhino.head.Scriptable) global67);
        boolean boolean74 = global54.hasPrototypeMap();
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject76 = global0.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global54, true);
        java.io.PrintStream printStream77 = global0.getOut();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(scriptable27);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(scriptable41);
        org.junit.Assert.assertNull(baseFunction45);
        org.junit.Assert.assertNotNull(inputStream46);
        org.junit.Assert.assertNull(scriptable61);
        org.junit.Assert.assertNull(baseFunction63);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(idFunctionObject76);
        org.junit.Assert.assertNotNull(printStream77);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        com.google.javascript.rhino.head.Scriptable scriptable11 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) global4);
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        global12.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global14, (int) (short) 10);
        global14.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable21 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global14, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins22 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction23 = global14.getBuiltinCtor(builtins22);
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        java.lang.Object obj32 = global25.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27);
        boolean boolean33 = global14.has("", (com.google.javascript.rhino.head.Scriptable) global27);
        java.io.InputStream inputStream34 = global14.getIn();
        global4.setIn(inputStream34);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins36 = null;
        com.google.javascript.rhino.head.Scriptable scriptable37 = global4.getBuiltinPrototype(builtins36);
        java.lang.String str38 = global4.getClassName();
        global4.delete((int) (short) -1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(scriptable11);
        org.junit.Assert.assertNull(scriptable21);
        org.junit.Assert.assertNull(baseFunction23);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertNull(scriptable37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "JavaImporter" + "'", str38, "JavaImporter");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        boolean boolean13 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global4, "");
        com.google.javascript.rhino.head.Context context14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        com.google.javascript.rhino.head.commonjs.module.Require require21 = global4.installRequire(context14, (java.util.List<java.lang.String>) strList18, true);
        boolean boolean22 = global4.hasPrototypeMap();
        global4.setAttributes("", (int) (byte) 1);
        com.google.javascript.rhino.head.Context context26 = null;
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        global29.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global31, (int) (short) 10);
        java.lang.Object obj34 = global27.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29);
        com.google.javascript.rhino.head.Scriptable scriptable35 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global27);
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        global37.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global39, (int) (short) 10);
        global39.setAttributes("", (int) (short) 0);
        boolean boolean45 = global27.has((int) (byte) 0, (com.google.javascript.rhino.head.Scriptable) global39);
        int int49 = global4.runDoctest(context26, (com.google.javascript.rhino.head.Scriptable) global27, "object", "hi!", (int) (byte) 0);
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        global51.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53, (int) (short) 10);
        global53.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream59 = null;
        global53.setIn(inputStream59);
        com.google.javascript.rhino.head.Scriptable scriptable61 = global53.getParentScope();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global53, "hi!", (java.lang.Object) 1.0d);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins65 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction66 = global53.getBuiltinCtor(builtins65);
        java.lang.String str67 = global53.getClassName();
        java.lang.Object obj68 = global27.get((int) ' ', (com.google.javascript.rhino.head.Scriptable) global53);
        com.google.javascript.rhino.head.tools.shell.Global global70 = new com.google.javascript.rhino.head.tools.shell.Global();
        java.lang.Object obj72 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global70, (int) (byte) 0);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject74 = global53.exportAsJSClass((int) (byte) 100, (com.google.javascript.rhino.head.Scriptable) global70, false);
        global70.setAttributes(100, (int) (short) 0);
        java.lang.String str78 = global70.getClassName();
        com.google.javascript.rhino.head.TopLevel.Builtins builtins79 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Scriptable scriptable80 = com.google.javascript.rhino.head.TopLevel.getBuiltinPrototype((com.google.javascript.rhino.head.Scriptable) global70, builtins79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(require21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNull(scriptable35);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(scriptable61);
        org.junit.Assert.assertNull(baseFunction66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "JavaImporter" + "'", str67, "JavaImporter");
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(idFunctionObject74);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "JavaImporter" + "'", str78, "JavaImporter");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        global9.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        global16.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18, (int) (short) 10);
        java.lang.Object obj21 = global14.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16);
        boolean boolean23 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global16, "");
        global11.setParentScope((com.google.javascript.rhino.head.Scriptable) global16);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject26 = global2.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global11, false);
        java.lang.Object[] objArray27 = global11.getAllIds();
        java.lang.Object[] objArray28 = global11.getIds();
        boolean boolean29 = global11.avoidObjectDetection();
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(idFunctionObject26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean1 = global0.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        global10.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global12, (int) (short) 10);
        java.lang.Object obj15 = global8.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10);
        boolean boolean17 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global10, "");
        global5.setParentScope((com.google.javascript.rhino.head.Scriptable) global10);
        com.google.javascript.rhino.head.Context context19 = null;
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int24 = global5.runDoctest(context19, (com.google.javascript.rhino.head.Scriptable) global20, "", "hi!", (int) (short) 10);
        java.lang.Object obj25 = global0.get((int) (byte) 100, (com.google.javascript.rhino.head.Scriptable) global5);
        boolean boolean26 = global5.isEmpty();
        boolean boolean27 = global5.hasPrototypeMap();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        global29.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global31, (int) (short) 10);
        global31.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        global38.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global40, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        global45.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global47, (int) (short) 10);
        java.lang.Object obj50 = global43.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global45);
        boolean boolean52 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global45, "");
        global40.setParentScope((com.google.javascript.rhino.head.Scriptable) global45);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject55 = global31.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global40, false);
        java.lang.Object[] objArray56 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global40);
        java.lang.Object obj58 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global40, "");
        java.lang.Object obj59 = global5.get("JavaImporter", (com.google.javascript.rhino.head.Scriptable) global40);
        java.io.InputStream inputStream60 = global5.getIn();
        global5.activatePrototypeMap(2);
        global5.setAttributes("function", 13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(idFunctionObject55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(inputStream60);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        global4.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable11 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global4, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins12 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction13 = global4.getBuiltinCtor(builtins12);
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        global17.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19, (int) (short) 10);
        java.lang.Object obj22 = global15.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17);
        boolean boolean23 = global4.has("", (com.google.javascript.rhino.head.Scriptable) global17);
        java.io.PrintStream printStream24 = global4.getErr();
        boolean boolean26 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global4, (int) (byte) -1);
        com.google.javascript.rhino.head.Context context27 = null;
        java.lang.String[] strArray28 = global4.getPrompts(context27);
        boolean boolean29 = global4.isSealed();
        com.google.javascript.rhino.head.Context context30 = null;
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        global31.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global33, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        global38.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global40, (int) (short) 10);
        java.lang.Object obj43 = global36.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global38);
        boolean boolean45 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global38, "");
        global33.setParentScope((com.google.javascript.rhino.head.Scriptable) global38);
        com.google.javascript.rhino.head.Context context47 = null;
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int52 = global33.runDoctest(context47, (com.google.javascript.rhino.head.Scriptable) global48, "", "hi!", (int) (short) 10);
        int int56 = global4.runDoctest(context30, (com.google.javascript.rhino.head.Scriptable) global33, "hi!", "JavaImporter", (int) 'a');
        boolean boolean58 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global4, "JavaImporter");
        com.google.javascript.rhino.head.ImporterTopLevel.init(context1, (com.google.javascript.rhino.head.Scriptable) global4, false);
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global66 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global68 = new com.google.javascript.rhino.head.tools.shell.Global();
        global66.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global68, (int) (short) 10);
        java.lang.Object obj71 = global64.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global66);
        java.lang.Object obj72 = global62.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global66);
        int int73 = global66.size();
        boolean boolean74 = global66.avoidObjectDetection();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global66, "JavaImporter", (java.lang.Object) (short) 1);
        com.google.javascript.rhino.head.tools.shell.Global global79 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global81 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global83 = new com.google.javascript.rhino.head.tools.shell.Global();
        global81.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global83, (int) (short) 10);
        java.lang.Object obj86 = global79.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global81);
        com.google.javascript.rhino.head.Scriptable scriptable87 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global79);
        boolean boolean88 = global66.has((int) (short) -1, scriptable87);
        java.lang.Object[] objArray89 = global66.getIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj90 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, (com.google.javascript.rhino.head.Scriptable) global4, "JavaImporter", objArray89);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: \"JavaImporter\" is neither a class nor a package.");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scriptable11);
        org.junit.Assert.assertNull(baseFunction13);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(printStream24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertNull(scriptable87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[JavaImporter]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[JavaImporter]");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Context context8 = null;
        java.lang.String[] strArray9 = global2.getPrompts(context8);
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        global13.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        global20.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global22, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        java.lang.Object obj32 = global25.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27);
        boolean boolean34 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global27, "");
        global22.setParentScope((com.google.javascript.rhino.head.Scriptable) global27);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject37 = global13.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global22, false);
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        global41.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global43, (int) (short) 10);
        java.lang.Object obj46 = global39.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41);
        com.google.javascript.rhino.head.Scriptable scriptable47 = global41.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        global51.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53, (int) (short) 10);
        java.lang.Object obj56 = global49.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global51);
        boolean boolean58 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global51, "");
        boolean boolean59 = global51.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable61 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global60);
        java.lang.Object[] objArray62 = global60.getAllIds();
        java.lang.Object obj63 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global51, (java.lang.Object) global60);
        global41.setAttributes((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) global60, 1);
        global13.defineConst("object", (com.google.javascript.rhino.head.Scriptable) global41);
        com.google.javascript.rhino.head.Scriptable scriptable67 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global41);
        global2.setAttributes(10, scriptable67, 13);
        global2.delete("");
        boolean boolean72 = global2.isEmpty();
        java.lang.Object[] objArray73 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(idFunctionObject37);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNull(scriptable47);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(scriptable61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(scriptable67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[10]");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        global0.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        global13.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream19 = null;
        global13.setIn(inputStream19);
        java.lang.Object obj21 = global0.get(0, (com.google.javascript.rhino.head.Scriptable) global13);
        boolean boolean23 = global13.isConst("");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins24 = null;
        com.google.javascript.rhino.head.Scriptable scriptable25 = global13.getBuiltinPrototype(builtins24);
        global13.setAttributes("object", (int) (byte) 10);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global13, "JavaImporter");
        com.google.javascript.rhino.head.Context context31 = null;
        // The following exception was thrown during execution in test generation
        try {
            global13.initStandardObjects(context31, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(scriptable25);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable9 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global2, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins10 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction11 = global2.getBuiltinCtor(builtins10);
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        global15.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17, (int) (short) 10);
        java.lang.Object obj20 = global13.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15);
        boolean boolean21 = global2.has("", (com.google.javascript.rhino.head.Scriptable) global15);
        java.io.PrintStream printStream22 = global2.getErr();
        global2.setSealedStdLib(true);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNull(baseFunction11);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(printStream22);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean9 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global2, "");
        boolean boolean10 = global2.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable12 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global11);
        java.lang.Object[] objArray13 = global11.getAllIds();
        java.lang.Object obj14 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global2, (java.lang.Object) global11);
        com.google.javascript.rhino.head.Context context15 = null;
        com.google.javascript.rhino.head.Context context16 = null;
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        global21.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23, (int) (short) 10);
        java.lang.Object obj26 = global19.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21);
        java.lang.Object obj27 = global17.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global21);
        int int28 = global21.size();
        boolean boolean30 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global21, "");
        com.google.javascript.rhino.head.Context context31 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        com.google.javascript.rhino.head.commonjs.module.Require require38 = global21.installRequire(context31, (java.util.List<java.lang.String>) strList35, true);
        boolean boolean39 = global21.hasPrototypeMap();
        global21.setAttributes("", (int) (byte) 1);
        com.google.javascript.rhino.head.Context context43 = null;
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global46 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        global46.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global48, (int) (short) 10);
        java.lang.Object obj51 = global44.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global46);
        com.google.javascript.rhino.head.Scriptable scriptable52 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global44);
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        global54.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global56, (int) (short) 10);
        global56.setAttributes("", (int) (short) 0);
        boolean boolean62 = global44.has((int) (byte) 0, (com.google.javascript.rhino.head.Scriptable) global56);
        int int66 = global21.runDoctest(context43, (com.google.javascript.rhino.head.Scriptable) global44, "object", "hi!", (int) (byte) 0);
        com.google.javascript.rhino.head.ImporterTopLevel.init(context16, (com.google.javascript.rhino.head.Scriptable) global21, true);
        global21.preventExtensions();
        int int73 = global2.runDoctest(context15, (com.google.javascript.rhino.head.Scriptable) global21, "JavaImporter", "object", (int) '4');
        global21.activatePrototypeMap((int) '4');
        com.google.javascript.rhino.head.Scriptable scriptable76 = global21.getParentScope();
        com.google.javascript.rhino.head.TopLevel.Builtins builtins77 = null;
        com.google.javascript.rhino.head.Scriptable scriptable78 = global21.getBuiltinPrototype(builtins77);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(scriptable12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(require38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNull(scriptable52);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNull(scriptable76);
        org.junit.Assert.assertNull(scriptable78);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = global2.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        global12.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global14, (int) (short) 10);
        java.lang.Object obj17 = global10.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global12);
        boolean boolean19 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global12, "");
        boolean boolean20 = global12.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable22 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global21);
        java.lang.Object[] objArray23 = global21.getAllIds();
        java.lang.Object obj24 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global12, (java.lang.Object) global21);
        global2.setAttributes((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) global21, 1);
        com.google.javascript.rhino.head.Context context28 = null;
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        global29.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global31, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        global36.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global38, (int) (short) 10);
        java.lang.Object obj41 = global34.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global36);
        boolean boolean43 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global36, "");
        global31.setParentScope((com.google.javascript.rhino.head.Scriptable) global36);
        java.lang.Object obj46 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global36, "");
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable48 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global47);
        java.lang.Object[] objArray49 = global47.getAllIds();
        com.google.javascript.rhino.head.Context context50 = null;
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        global53.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global55, (int) (short) 10);
        java.lang.Object obj58 = global51.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53);
        boolean boolean60 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global53, "");
        com.google.javascript.rhino.head.Scriptable scriptable61 = global53.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable63 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global62);
        java.lang.Object[] objArray64 = global62.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global67 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global69 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global71 = new com.google.javascript.rhino.head.tools.shell.Global();
        global69.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global71, (int) (short) 10);
        java.lang.Object obj74 = global67.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global69);
        java.lang.Object obj75 = global65.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global69);
        int int76 = global69.size();
        boolean boolean78 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global69, "");
        com.google.javascript.rhino.head.Context context79 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        com.google.javascript.rhino.head.commonjs.module.Require require86 = global69.installRequire(context79, (java.util.List<java.lang.String>) strList83, true);
        com.google.javascript.rhino.head.tools.shell.Global.load(context50, scriptable61, objArray64, (com.google.javascript.rhino.head.Function) require86);
        java.lang.Object obj88 = com.google.javascript.rhino.head.tools.shell.Global.doctest(context28, (com.google.javascript.rhino.head.Scriptable) global36, objArray49, (com.google.javascript.rhino.head.Function) require86);
        java.lang.Object obj89 = global2.get(1, (com.google.javascript.rhino.head.Scriptable) global36);
        global2.setAttributes((int) ' ', (int) (short) 1);
        boolean boolean94 = global2.isConst("");
        boolean boolean96 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global2, "hi!");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(scriptable22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(scriptable48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(scriptable61);
        org.junit.Assert.assertNotNull(scriptable63);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(require86);
        org.junit.Assert.assertEquals("'" + obj88 + "' != '" + false + "'", obj88, false);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        java.lang.Object obj2 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global0, (int) (byte) 0);
        com.google.javascript.rhino.head.Context context3 = null;
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        global8.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10, (int) (short) 10);
        java.lang.Object obj13 = global6.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global8);
        java.lang.Object obj14 = global4.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global8);
        com.google.javascript.rhino.head.ImporterTopLevel.init(context3, (com.google.javascript.rhino.head.Scriptable) global8, true);
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        global22.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global24, (int) (short) 10);
        java.lang.Object obj27 = global20.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global22);
        java.lang.Object obj28 = global18.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global22);
        int int29 = global22.size();
        boolean boolean30 = global22.avoidObjectDetection();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable33 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global32);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject35 = global22.exportAsJSClass(100, scriptable33, false);
        com.google.javascript.rhino.head.Scriptable scriptable37 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) idFunctionObject35, "");
        idFunctionObject35.sealObject();
        boolean boolean39 = idFunctionObject35.isSealed();
        java.lang.Object obj40 = global8.get((int) '#', (com.google.javascript.rhino.head.Scriptable) idFunctionObject35);
        com.google.javascript.rhino.head.Scriptable scriptable41 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global8);
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global46 = new com.google.javascript.rhino.head.tools.shell.Global();
        global44.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global46, (int) (short) 10);
        java.lang.Object obj49 = global42.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global44);
        com.google.javascript.rhino.head.Scriptable scriptable50 = global42.getParentScope();
        java.lang.Object obj52 = global42.getAssociatedValue((java.lang.Object) 0.0f);
        java.lang.Object[] objArray53 = global42.getAllIds();
        java.io.InputStream inputStream54 = global42.getIn();
        com.google.javascript.rhino.head.Scriptable scriptable55 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) global42);
        java.lang.Object obj56 = global8.get((java.lang.Object) global42);
        boolean boolean57 = global0.hasInstance((com.google.javascript.rhino.head.Scriptable) global8);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(scriptable33);
        org.junit.Assert.assertNotNull(idFunctionObject35);
        org.junit.Assert.assertNull(scriptable37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNull(scriptable41);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNull(scriptable50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(inputStream54);
        org.junit.Assert.assertNull(scriptable55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = global2.getPrototype();
        boolean boolean10 = global2.isConst("JavaImporter");
        boolean boolean11 = global2.isInitialized();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean8 = global0.isExtensible();
        boolean boolean10 = global0.isConst("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        global13.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15, (int) (short) 10);
        java.lang.Object obj18 = global11.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13);
        boolean boolean19 = global11.isExtensible();
        global0.setParentScope((com.google.javascript.rhino.head.Scriptable) global11);
        boolean boolean21 = global11.hasPrototypeMap();
        java.lang.String str22 = global11.getClassName();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "JavaImporter" + "'", str22, "JavaImporter");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = global0.getParentScope();
        java.lang.Object obj10 = global0.getAssociatedValue((java.lang.Object) 0.0f);
        com.google.javascript.rhino.head.Context context11 = null;
        java.lang.String[] strArray12 = global0.getPrompts(context11);
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean16 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global14, "");
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        global22.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global24, (int) (short) 10);
        java.lang.Object obj27 = global20.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global22);
        java.lang.Object obj28 = global18.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global22);
        int int29 = global22.size();
        boolean boolean31 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global22, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject33 = global14.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global22, false);
        boolean boolean34 = global0.has("object", (com.google.javascript.rhino.head.Scriptable) global22);
        com.google.javascript.rhino.head.Scriptable scriptable35 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global22);
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        global41.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global43, (int) (short) 10);
        java.lang.Object obj46 = global39.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41);
        java.lang.Object obj47 = global37.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global41);
        int int48 = global41.size();
        global22.setAttributes("object", (com.google.javascript.rhino.head.Scriptable) global41, (int) (short) 1);
        global41.setSealedStdLib(false);
        java.io.InputStream inputStream53 = global41.getIn();
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global61 = new com.google.javascript.rhino.head.tools.shell.Global();
        global59.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global61, (int) (short) 10);
        java.lang.Object obj64 = global57.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global59);
        java.lang.Object obj65 = global55.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global59);
        int int66 = global59.size();
        java.io.PrintStream printStream67 = global59.getErr();
        boolean boolean69 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global59, "hi!");
        com.google.javascript.rhino.head.tools.shell.Global global71 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global73 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable74 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global73);
        java.lang.Object[] objArray75 = global73.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global76 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean78 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global76, "");
        global71.put("", (com.google.javascript.rhino.head.Scriptable) global73, (java.lang.Object) boolean78);
        global59.defineConst("object", (com.google.javascript.rhino.head.Scriptable) global73);
        java.lang.Object[] objArray81 = global59.getAllIds();
        java.lang.Object obj83 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global59, (int) (byte) 0);
        boolean boolean84 = global41.has(1, (com.google.javascript.rhino.head.Scriptable) global59);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(idFunctionObject33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(scriptable35);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(inputStream53);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(printStream67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(scriptable74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[1]");
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        global9.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        global16.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18, (int) (short) 10);
        java.lang.Object obj21 = global14.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16);
        boolean boolean23 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global16, "");
        global11.setParentScope((com.google.javascript.rhino.head.Scriptable) global16);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject26 = global2.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global11, false);
        java.lang.Object[] objArray27 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global11);
        com.google.javascript.rhino.head.Context context28 = null;
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        global31.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global33, (int) (short) 10);
        java.lang.Object obj36 = global29.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global31);
        global29.delete("hi!");
        com.google.javascript.rhino.head.Context context39 = null;
        com.google.javascript.rhino.head.Scriptable scriptable40 = null;
        java.lang.Object[] objArray46 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function47 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context39, scriptable40, objArray46, function47);
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean51 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global49, "");
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        global57.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global59, (int) (short) 10);
        java.lang.Object obj62 = global55.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global57);
        java.lang.Object obj63 = global53.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global57);
        int int64 = global57.size();
        boolean boolean66 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global57, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject68 = global49.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global57, false);
        java.lang.Object obj69 = com.google.javascript.rhino.head.tools.shell.Global.toint32(context28, (com.google.javascript.rhino.head.Scriptable) global29, objArray46, (com.google.javascript.rhino.head.Function) idFunctionObject68);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global29, "");
        java.lang.Object obj72 = global11.get((java.lang.Object) "");
        com.google.javascript.rhino.head.tools.shell.Global global73 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable74 = global73.getParentScope();
        java.lang.Object obj75 = global11.get((java.lang.Object) global73);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins76 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction77 = global73.getBuiltinCtor(builtins76);
        com.google.javascript.rhino.head.Scriptable scriptable78 = global73.getParentScope();
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(idFunctionObject26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(idFunctionObject68);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 0 + "'", obj69, 0);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(scriptable74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(baseFunction77);
        org.junit.Assert.assertNull(scriptable78);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global0);
        com.google.javascript.rhino.head.Scriptable scriptable9 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global0);
        java.lang.String str10 = global0.getClassName();
        boolean boolean12 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global0, "JavaImporter");
        java.lang.Class<?> wildcardClass13 = global0.getClass();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JavaImporter" + "'", str10, "JavaImporter");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        global9.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        global16.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18, (int) (short) 10);
        java.lang.Object obj21 = global14.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16);
        boolean boolean23 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global16, "");
        global11.setParentScope((com.google.javascript.rhino.head.Scriptable) global16);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject26 = global2.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global11, false);
        java.lang.Object[] objArray27 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global11);
        java.lang.Object obj29 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global11, "");
        global11.delete(4);
        com.google.javascript.rhino.head.Scriptable scriptable32 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global11);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(idFunctionObject26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(scriptable32);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable9 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global2, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins10 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction11 = global2.getBuiltinCtor(builtins10);
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        global15.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17, (int) (short) 10);
        java.lang.Object obj20 = global13.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15);
        boolean boolean21 = global2.has("", (com.google.javascript.rhino.head.Scriptable) global15);
        java.io.PrintStream printStream22 = global2.getErr();
        global2.cacheBuiltins();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        global25.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27, (int) (short) 10);
        global27.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable34 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global27, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins35 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction36 = global27.getBuiltinCtor(builtins35);
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        global40.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global42, (int) (short) 10);
        java.lang.Object obj45 = global38.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global40);
        boolean boolean46 = global27.has("", (com.google.javascript.rhino.head.Scriptable) global40);
        boolean boolean47 = global27.hasPrototypeMap();
        java.io.PrintStream printStream48 = global27.getErr();
        global2.defineConst("object", (com.google.javascript.rhino.head.Scriptable) global27);
        boolean boolean51 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global27, "");
        com.google.javascript.rhino.head.ContextFactory contextFactory52 = null;
        // The following exception was thrown during execution in test generation
        try {
            global27.init(contextFactory52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNull(baseFunction11);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(printStream22);
        org.junit.Assert.assertNull(scriptable34);
        org.junit.Assert.assertNull(baseFunction36);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(printStream48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean9 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global2, "");
        com.google.javascript.rhino.head.Scriptable scriptable10 = global2.getPrototype();
        global2.activatePrototypeMap((int) '4');
        com.google.javascript.rhino.head.TopLevel.Builtins builtins13 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction14 = global2.getBuiltinCtor(builtins13);
        java.io.InputStream inputStream15 = global2.getIn();
        global2.setAttributes("hi!", 10);
        com.google.javascript.rhino.head.Context context19 = null;
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean22 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global20, "");
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        global28.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global30, (int) (short) 10);
        java.lang.Object obj33 = global26.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global28);
        java.lang.Object obj34 = global24.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global28);
        int int35 = global28.size();
        boolean boolean37 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global28, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject39 = global20.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global28, false);
        int int40 = global28.size();
        global28.delete((int) 'a');
        global2.defineOwnProperties(context19, (com.google.javascript.rhino.head.ScriptableObject) global28);
        global2.setSealedStdLib(true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(scriptable10);
        org.junit.Assert.assertNull(baseFunction14);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(idFunctionObject39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
    }
}
