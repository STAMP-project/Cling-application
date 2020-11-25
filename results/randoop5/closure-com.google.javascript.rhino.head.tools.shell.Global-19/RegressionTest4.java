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
        com.google.javascript.rhino.head.Context context25 = null;
        java.lang.String[] strArray26 = global2.getPrompts(context25);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global2, "object");
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNull(baseFunction11);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(printStream22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        global70.setAttributes(8, (int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global70, "hi!");
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
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        com.google.javascript.rhino.head.Context context12 = null;
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
        com.google.javascript.rhino.head.TopLevel.Builtins builtins39 = null;
        com.google.javascript.rhino.head.Scriptable scriptable40 = global13.getBuiltinPrototype(builtins39);
        global13.setSealedStdLib(true);
        global4.defineOwnProperties(context12, (com.google.javascript.rhino.head.ScriptableObject) global13);
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
        java.lang.Object obj71 = global13.get((int) (byte) -1, (com.google.javascript.rhino.head.Scriptable) global50);
        boolean boolean73 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global13, 2);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNull(scriptable40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        global1.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3, (int) (short) 10);
        global3.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable10 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global3, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins11 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction12 = global3.getBuiltinCtor(builtins11);
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        global16.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18, (int) (short) 10);
        java.lang.Object obj21 = global14.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16);
        boolean boolean22 = global3.has("", (com.google.javascript.rhino.head.Scriptable) global16);
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        global26.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global28, (int) (short) 10);
        java.lang.Object obj31 = global24.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global26);
        com.google.javascript.rhino.head.Scriptable scriptable32 = global24.getParentScope();
        java.lang.Object obj34 = global24.getAssociatedValue((java.lang.Object) 0.0f);
        global24.delete(1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) global3, "object", (java.lang.Object) 1);
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
        java.lang.Object obj65 = global3.get((int) (short) -1, (com.google.javascript.rhino.head.Scriptable) global44);
        java.lang.Object[] objArray66 = null;
        com.google.javascript.rhino.head.tools.shell.Global global67 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global69 = new com.google.javascript.rhino.head.tools.shell.Global();
        global67.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global69, (int) (short) 10);
        global69.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global76 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global78 = new com.google.javascript.rhino.head.tools.shell.Global();
        global76.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global78, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global81 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global83 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global85 = new com.google.javascript.rhino.head.tools.shell.Global();
        global83.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global85, (int) (short) 10);
        java.lang.Object obj88 = global81.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global83);
        boolean boolean90 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global83, "");
        global78.setParentScope((com.google.javascript.rhino.head.Scriptable) global83);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject93 = global69.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global78, false);
        java.lang.Object[] objArray94 = idFunctionObject93.getAllIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.shell.Global.seal(context0, (com.google.javascript.rhino.head.Scriptable) global44, objArray66, (com.google.javascript.rhino.head.Function) idFunctionObject93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scriptable10);
        org.junit.Assert.assertNull(baseFunction12);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNull(scriptable32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(idFunctionObject93);
        org.junit.Assert.assertNotNull(objArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray94), "[arguments, prototype, name, arity, length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray94), "[arguments, prototype, name, arity, length]");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        com.google.javascript.rhino.head.Scriptable scriptable51 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global41);
        com.google.javascript.rhino.head.Scriptable scriptable52 = global41.getParentScope();
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
        org.junit.Assert.assertNull(scriptable51);
        org.junit.Assert.assertNull(scriptable52);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        global8.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10, (int) (short) 10);
        java.lang.Object obj13 = global6.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global8);
        global0.setAttributes("", (com.google.javascript.rhino.head.Scriptable) global8, (int) (short) 1);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins16 = null;
        com.google.javascript.rhino.head.Scriptable scriptable17 = global0.getBuiltinPrototype(builtins16);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(scriptable17);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        boolean boolean61 = global41.hasPrototypeMap();
        java.io.PrintStream printStream62 = global41.getErr();
        global20.setErr(printStream62);
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global66 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global68 = new com.google.javascript.rhino.head.tools.shell.Global();
        global66.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global68, (int) (short) 10);
        java.lang.Object obj71 = global64.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global66);
        global64.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global75 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global77 = new com.google.javascript.rhino.head.tools.shell.Global();
        global75.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global77, (int) (short) 10);
        global77.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream83 = null;
        global77.setIn(inputStream83);
        java.lang.Object obj85 = global64.get(0, (com.google.javascript.rhino.head.Scriptable) global77);
        boolean boolean87 = global77.isConst("");
        global20.setParentScope((com.google.javascript.rhino.head.Scriptable) global77);
        boolean boolean90 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global20, 8);
        com.google.javascript.rhino.head.Scriptable scriptable91 = global20.getParentScope();
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
        org.junit.Assert.assertNull(scriptable48);
        org.junit.Assert.assertNull(baseFunction50);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(printStream62);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(scriptable91);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        boolean boolean21 = global9.isSealed();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        global22.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global24, (int) (short) 10);
        global24.setAttributes("", (int) (short) 0);
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
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject48 = global24.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global33, false);
        java.lang.Object[] objArray49 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global33);
        com.google.javascript.rhino.head.tools.shell.Global global50 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        global54.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global56, (int) (short) 10);
        java.lang.Object obj59 = global52.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global54);
        java.lang.Object obj60 = global50.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global54);
        int int61 = global54.size();
        boolean boolean62 = global54.avoidObjectDetection();
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable65 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global64);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject67 = global54.exportAsJSClass(100, scriptable65, false);
        java.lang.Object obj68 = com.google.javascript.rhino.head.tools.shell.Global.print(context0, (com.google.javascript.rhino.head.Scriptable) global9, objArray49, (com.google.javascript.rhino.head.Function) idFunctionObject67);
        com.google.javascript.rhino.head.Scriptable scriptable69 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) global9);
        com.google.javascript.rhino.head.Scriptable scriptable70 = global9.getParentScope();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(idFunctionObject20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(idFunctionObject48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(scriptable65);
        org.junit.Assert.assertNotNull(idFunctionObject67);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNull(scriptable69);
        org.junit.Assert.assertNull(scriptable70);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream8 = null;
        global2.setIn(inputStream8);
        com.google.javascript.rhino.head.Scriptable scriptable10 = global2.getParentScope();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        global15.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17, (int) (short) 10);
        java.lang.Object obj20 = global13.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15);
        java.lang.Object obj21 = global11.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global15);
        global2.setParentScope((com.google.javascript.rhino.head.Scriptable) global11);
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean25 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global23, "");
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        global31.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global33, (int) (short) 10);
        java.lang.Object obj36 = global29.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global31);
        java.lang.Object obj37 = global27.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global31);
        int int38 = global31.size();
        boolean boolean40 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global31, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject42 = global23.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global31, false);
        java.lang.Object obj44 = global31.getAssociatedValue((java.lang.Object) (short) 1);
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        global47.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global49, (int) (short) 10);
        java.lang.Object obj52 = global45.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global47);
        boolean boolean53 = global45.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global61 = new com.google.javascript.rhino.head.tools.shell.Global();
        global59.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global61, (int) (short) 10);
        java.lang.Object obj64 = global57.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global59);
        java.lang.Object obj65 = global55.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global59);
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) global45, "", obj65, (int) (byte) 10);
        boolean boolean68 = global45.isInitialized();
        boolean boolean70 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global45, "JavaImporter");
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global45, "JavaImporter");
        java.lang.Object obj73 = global2.associateValue((java.lang.Object) global31, (java.lang.Object) global45);
        com.google.javascript.rhino.head.tools.shell.Global global75 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global77 = new com.google.javascript.rhino.head.tools.shell.Global();
        global75.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global77, (int) (short) 10);
        global77.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable84 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global77, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins85 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction86 = global77.getBuiltinCtor(builtins85);
        com.google.javascript.rhino.head.tools.shell.Global global88 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global90 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global92 = new com.google.javascript.rhino.head.tools.shell.Global();
        global90.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global92, (int) (short) 10);
        java.lang.Object obj95 = global88.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global90);
        boolean boolean96 = global77.has("", (com.google.javascript.rhino.head.Scriptable) global90);
        java.io.InputStream inputStream97 = global77.getIn();
        // The following exception was thrown during execution in test generation
        try {
            int int98 = global2.getAttributes((int) '#', (com.google.javascript.rhino.head.Scriptable) global77);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: Property 35 not found.");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scriptable10);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(idFunctionObject42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNull(scriptable84);
        org.junit.Assert.assertNull(baseFunction86);
        org.junit.Assert.assertNotNull(obj95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(inputStream97);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable1 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global0);
        global0.setSealedStdLib(true);
        boolean boolean5 = global0.isConst("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        global8.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10, (int) (short) 10);
        java.lang.Object obj13 = global6.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global8);
        boolean boolean14 = global6.isExtensible();
        boolean boolean16 = global6.isConst("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        global19.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21, (int) (short) 10);
        java.lang.Object obj24 = global17.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19);
        boolean boolean25 = global17.isExtensible();
        global6.setParentScope((com.google.javascript.rhino.head.Scriptable) global17);
        java.lang.Object obj27 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global0, (java.lang.Object) global17);
        org.junit.Assert.assertNull(scriptable1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        boolean boolean36 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global25, "");
        com.google.javascript.rhino.head.Scriptable scriptable37 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global25);
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
        java.lang.Object obj56 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global46, "");
        com.google.javascript.rhino.head.tools.shell.Global global58 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        global60.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global62, (int) (short) 10);
        java.lang.Object obj65 = global58.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global60);
        boolean boolean67 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global60, "");
        com.google.javascript.rhino.head.Context context68 = null;
        com.google.javascript.rhino.head.Scriptable scriptable69 = null;
        java.lang.Object[] objArray75 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function76 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context68, scriptable69, objArray75, function76);
        java.lang.Object obj78 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global60, (java.lang.Object) scriptable69);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject80 = global46.exportAsJSClass((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) global60, false);
        boolean boolean82 = global60.isConst("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global83 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable84 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global83);
        global60.setParentScope((com.google.javascript.rhino.head.Scriptable) global83);
        java.lang.Object obj86 = global25.get((-1), (com.google.javascript.rhino.head.Scriptable) global83);
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(scriptable37);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(idFunctionObject80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(scriptable84);
        org.junit.Assert.assertNotNull(obj86);
    }
}

