import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        java.io.PrintStream printStream45 = global25.getErr();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global4, 8, (java.lang.Object) global25);
        com.google.javascript.rhino.head.Scriptable scriptable47 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global25);
        java.lang.Object obj49 = com.google.javascript.rhino.head.ScriptableObject.getProperty(scriptable47, "hi!");
        java.lang.Object[] objArray50 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable47);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(require21);
        org.junit.Assert.assertNull(scriptable32);
        org.junit.Assert.assertNull(baseFunction34);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(printStream45);
        org.junit.Assert.assertNotNull(scriptable47);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject26, "");
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        global32.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global34, (int) (short) 10);
        java.lang.Object obj37 = global30.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global32);
        global30.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        global41.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global43, (int) (short) 10);
        global43.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream49 = null;
        global43.setIn(inputStream49);
        java.lang.Object obj51 = global30.get(0, (com.google.javascript.rhino.head.Scriptable) global43);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject26, "", obj51);
        idFunctionObject26.delete(0);
        java.lang.Object obj56 = null;
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject26, "JavaImporter", obj56);
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
        boolean boolean79 = idFunctionObject26.has((int) 'a', (com.google.javascript.rhino.head.Scriptable) global64);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins80 = null;
        com.google.javascript.rhino.head.Scriptable scriptable81 = global64.getBuiltinPrototype(builtins80);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global64, "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(idFunctionObject26);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNull(scriptable60);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(scriptable81);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        java.io.InputStream inputStream27 = global16.getIn();
        java.lang.Object[] objArray28 = global16.getAllIds();
        com.google.javascript.rhino.head.TopLevel.Builtins builtins29 = null;
        com.google.javascript.rhino.head.Scriptable scriptable30 = global16.getBuiltinPrototype(builtins29);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "object" + "'", str10, "object");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1]");
        org.junit.Assert.assertNull(scriptable30);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        global36.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global38, (int) (short) 10);
        global38.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream44 = null;
        global38.setIn(inputStream44);
        global38.delete("");
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global13, 0, (java.lang.Object) global38);
        java.io.PrintStream printStream49 = global13.getErr();
        com.google.javascript.rhino.head.Scriptable scriptable51 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global13, "JavaImporter");
        com.google.javascript.rhino.head.Context context52 = null;
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        global55.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global57, (int) (short) 10);
        java.lang.Object obj60 = global53.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global55);
        com.google.javascript.rhino.head.Scriptable scriptable61 = global53.getParentScope();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global66 = new com.google.javascript.rhino.head.tools.shell.Global();
        global64.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global66, (int) (short) 10);
        java.lang.Object obj69 = global62.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global64);
        java.lang.Object obj70 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global53, obj69);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins71 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction72 = global53.getBuiltinCtor(builtins71);
        boolean boolean73 = global53.hasPrototypeMap();
        global53.delete("function");
        int int79 = global13.runDoctest(context52, (com.google.javascript.rhino.head.Scriptable) global53, "hi!", "", 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj83 = global13.getGetterOrSetter("hi!", 3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(printStream49);
        org.junit.Assert.assertNull(scriptable51);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNull(scriptable61);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(baseFunction72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        com.google.javascript.rhino.head.Scriptable scriptable74 = global21.getParentScope();
        global21.cacheBuiltins();
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
        org.junit.Assert.assertNull(scriptable74);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = global0.getParentScope();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        global12.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global14, (int) (short) 10);
        java.lang.Object obj17 = global10.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global12);
        com.google.javascript.rhino.head.Scriptable scriptable18 = global10.getParentScope();
        java.lang.Object obj20 = global10.getAssociatedValue((java.lang.Object) 0.0f);
        java.lang.Object[] objArray21 = global10.getAllIds();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        global0.defineProperty("hi!", (java.lang.Object) objArray21, method22, method23, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = global0.getGetterOrSetter("JavaImporter", (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: JavaImporter");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(scriptable18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        com.google.javascript.rhino.head.Context context31 = null;
        // The following exception was thrown during execution in test generation
        try {
            global12.initStandardObjects(context31, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        global22.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global24, (int) (short) 10);
        java.lang.Object obj27 = global20.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global22);
        boolean boolean29 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global22, "");
        com.google.javascript.rhino.head.Context context30 = null;
        com.google.javascript.rhino.head.Scriptable scriptable31 = null;
        java.lang.Object[] objArray37 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function38 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context30, scriptable31, objArray37, function38);
        java.lang.Object obj40 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global22, (java.lang.Object) scriptable31);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject42 = global8.exportAsJSClass((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) global22, false);
        com.google.javascript.rhino.head.Scriptable scriptable43 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) idFunctionObject42);
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global46 = new com.google.javascript.rhino.head.tools.shell.Global();
        global44.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global46, (int) (short) 10);
        global46.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Context context52 = null;
        java.lang.String[] strArray53 = global46.getPrompts(context52);
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
        java.lang.Object[] objArray81 = idFunctionObject80.getAllIds();
        java.lang.Object obj82 = com.google.javascript.rhino.head.tools.shell.Global.toint32(context0, (com.google.javascript.rhino.head.Scriptable) idFunctionObject42, (java.lang.Object[]) strArray53, (com.google.javascript.rhino.head.Function) idFunctionObject80);
        boolean boolean83 = idFunctionObject80.avoidObjectDetection();
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(idFunctionObject42);
        org.junit.Assert.assertNotNull(scriptable43);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(idFunctionObject80);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[arguments, prototype, name, arity, length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[arguments, prototype, name, arity, length]");
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + 0 + "'", obj82, 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        java.lang.Object[] objArray39 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        global43.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global45, (int) (short) 10);
        java.lang.Object obj48 = global41.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global43);
        com.google.javascript.rhino.head.Scriptable scriptable49 = global43.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        global53.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global55, (int) (short) 10);
        java.lang.Object obj58 = global51.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53);
        boolean boolean60 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global53, "");
        boolean boolean61 = global53.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable63 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global62);
        java.lang.Object[] objArray64 = global62.getAllIds();
        java.lang.Object obj65 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global53, (java.lang.Object) global62);
        global43.setAttributes((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) global62, 1);
        boolean boolean68 = global2.has("object", (com.google.javascript.rhino.head.Scriptable) global43);
        com.google.javascript.rhino.head.Scriptable scriptable70 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global2, "");
        java.lang.Object[] objArray71 = global2.getAllIds();
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
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNull(scriptable49);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(scriptable63);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(scriptable70);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[]");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        java.io.PrintStream printStream12 = global4.getErr();
        boolean boolean14 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global4, "hi!");
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable19 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global18);
        java.lang.Object[] objArray20 = global18.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean23 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global21, "");
        global16.put("", (com.google.javascript.rhino.head.Scriptable) global18, (java.lang.Object) boolean23);
        global4.defineConst("object", (com.google.javascript.rhino.head.Scriptable) global18);
        java.lang.Object[] objArray26 = global4.getAllIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = global4.getGetterOrSetter("function", (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: function");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(printStream12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(scriptable19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1]");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = global0.getParentScope();
        java.lang.Object obj10 = global0.getAssociatedValue((java.lang.Object) 0.0f);
        int int11 = global0.size();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object[] objArray11 = global4.getIds();
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global4, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins14 = null;
        com.google.javascript.rhino.head.Scriptable scriptable15 = global4.getBuiltinPrototype(builtins14);
        boolean boolean17 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global4, "function");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(scriptable15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        com.google.javascript.rhino.head.TopLevel.Builtins builtins16 = null;
        com.google.javascript.rhino.head.Scriptable scriptable17 = global0.getBuiltinPrototype(builtins16);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(baseFunction12);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNull(scriptable15);
        org.junit.Assert.assertNull(scriptable17);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        int int8 = global2.size();
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        java.lang.Object obj16 = global9.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11);
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        global17.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19, (int) (short) 10);
        global19.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable26 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global19, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins27 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction28 = global19.getBuiltinCtor(builtins27);
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        global32.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global34, (int) (short) 10);
        java.lang.Object obj37 = global30.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global32);
        boolean boolean38 = global19.has("", (com.google.javascript.rhino.head.Scriptable) global32);
        java.io.PrintStream printStream39 = global19.getErr();
        global9.setErr(printStream39);
        global2.setOut(printStream39);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(scriptable26);
        org.junit.Assert.assertNull(baseFunction28);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(printStream39);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean39 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global37, "");
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        global45.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global47, (int) (short) 10);
        java.lang.Object obj50 = global43.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global45);
        java.lang.Object obj51 = global41.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global45);
        int int52 = global45.size();
        boolean boolean54 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global45, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject56 = global37.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global45, false);
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        global57.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global59, (int) (short) 10);
        global59.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream65 = null;
        global59.setIn(inputStream65);
        com.google.javascript.rhino.head.Scriptable scriptable67 = global59.getParentScope();
        com.google.javascript.rhino.head.tools.shell.Global global68 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global70 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global72 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global74 = new com.google.javascript.rhino.head.tools.shell.Global();
        global72.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global74, (int) (short) 10);
        java.lang.Object obj77 = global70.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global72);
        java.lang.Object obj78 = global68.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global72);
        global59.setParentScope((com.google.javascript.rhino.head.Scriptable) global68);
        global37.setParentScope((com.google.javascript.rhino.head.Scriptable) global68);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins81 = null;
        com.google.javascript.rhino.head.Scriptable scriptable82 = global68.getBuiltinPrototype(builtins81);
        boolean boolean84 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global68, "hi!");
        java.lang.Object obj85 = global4.get((java.lang.Object) global68);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(idFunctionObject56);
        org.junit.Assert.assertNull(scriptable67);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertNull(scriptable82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNull(obj85);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        java.io.PrintStream printStream12 = global4.getErr();
        boolean boolean14 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global4, "hi!");
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable19 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global18);
        java.lang.Object[] objArray20 = global18.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean23 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global21, "");
        global16.put("", (com.google.javascript.rhino.head.Scriptable) global18, (java.lang.Object) boolean23);
        global4.defineConst("object", (com.google.javascript.rhino.head.Scriptable) global18);
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        global28.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global30, (int) (short) 10);
        java.lang.Object obj33 = global26.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global28);
        global26.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        global37.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global39, (int) (short) 10);
        global39.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream45 = null;
        global39.setIn(inputStream45);
        java.lang.Object obj47 = global26.get(0, (com.google.javascript.rhino.head.Scriptable) global39);
        boolean boolean49 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global39, (int) (byte) -1);
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        global51.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53, (int) (short) 10);
        global53.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable60 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global53, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins61 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction62 = global53.getBuiltinCtor(builtins61);
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global66 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global68 = new com.google.javascript.rhino.head.tools.shell.Global();
        global66.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global68, (int) (short) 10);
        java.lang.Object obj71 = global64.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global66);
        boolean boolean72 = global53.has("", (com.google.javascript.rhino.head.Scriptable) global66);
        java.io.PrintStream printStream73 = global53.getErr();
        boolean boolean75 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global53, (int) (byte) -1);
        global53.delete((int) (byte) -1);
        java.io.PrintStream printStream78 = global53.getErr();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global39, "", (java.lang.Object) printStream78);
        global18.setOut(printStream78);
        global18.activatePrototypeMap(2);
        com.google.javascript.rhino.head.Context context83 = null;
        com.google.javascript.rhino.head.tools.shell.Global global84 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global86 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global88 = new com.google.javascript.rhino.head.tools.shell.Global();
        global86.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global88, (int) (short) 10);
        java.lang.Object obj91 = global84.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global86);
        boolean boolean93 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global86, "");
        com.google.javascript.rhino.head.Scriptable scriptable94 = global86.getPrototype();
        global18.defineOwnProperties(context83, (com.google.javascript.rhino.head.ScriptableObject) global86);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(printStream12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(scriptable19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(scriptable60);
        org.junit.Assert.assertNull(baseFunction62);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(printStream73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(printStream78);
        org.junit.Assert.assertNotNull(obj91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNull(scriptable94);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        com.google.javascript.rhino.head.Scriptable scriptable56 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global30);
        boolean boolean58 = global30.isConst("JavaImporter");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins59 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction60 = global30.getBuiltinCtor(builtins59);
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
        org.junit.Assert.assertNotNull(scriptable56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(baseFunction60);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        global21.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23, (int) (short) 10);
        java.lang.Object obj26 = global19.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21);
        java.lang.Object obj27 = global17.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global21);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins28 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction29 = global17.getBuiltinCtor(builtins28);
        int int33 = global2.runDoctest(context16, (com.google.javascript.rhino.head.Scriptable) global17, "function", "JavaImporter", (int) '#');
        java.io.InputStream inputStream34 = global17.getIn();
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        global36.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global38, (int) (short) 10);
        global38.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        global45.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global47, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global50 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        global52.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global54, (int) (short) 10);
        java.lang.Object obj57 = global50.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global52);
        boolean boolean59 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global52, "");
        global47.setParentScope((com.google.javascript.rhino.head.Scriptable) global52);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject62 = global38.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global47, false);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject62, "");
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) global17, "function", (java.lang.Object) "", (int) (byte) 10);
        com.google.javascript.rhino.head.tools.shell.Global global67 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global69 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global71 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global73 = new com.google.javascript.rhino.head.tools.shell.Global();
        global71.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global73, (int) (short) 10);
        java.lang.Object obj76 = global69.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global71);
        java.lang.Object obj77 = global67.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global71);
        com.google.javascript.rhino.head.Scriptable scriptable78 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) global71);
        java.io.InputStream inputStream79 = global71.getIn();
        com.google.javascript.rhino.head.tools.shell.Global global80 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global82 = new com.google.javascript.rhino.head.tools.shell.Global();
        global80.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global82, (int) (short) 10);
        global82.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Context context88 = null;
        java.lang.String[] strArray89 = global82.getPrompts(context88);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins90 = null;
        com.google.javascript.rhino.head.Scriptable scriptable91 = global82.getBuiltinPrototype(builtins90);
        java.lang.Object[] objArray92 = global82.getAllIds();
        java.io.PrintStream printStream93 = global82.getOut();
        java.lang.Object obj94 = global17.associateValue((java.lang.Object) inputStream79, (java.lang.Object) global82);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNull(baseFunction29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(idFunctionObject62);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertNull(scriptable78);
        org.junit.Assert.assertNotNull(inputStream79);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNull(scriptable91);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[]");
        org.junit.Assert.assertNotNull(printStream93);
        org.junit.Assert.assertNotNull(obj94);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        java.lang.Object obj8 = global1.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3);
        global1.delete("hi!");
        com.google.javascript.rhino.head.ImporterTopLevel.init(context0, (com.google.javascript.rhino.head.Scriptable) global1, false);
        java.lang.String str13 = global1.getTypeOf();
        java.lang.String str14 = global1.getClassName();
        com.google.javascript.rhino.head.TopLevel.Builtins builtins15 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction16 = global1.getBuiltinCtor(builtins15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Scriptable scriptable17 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) baseFunction16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "object" + "'", str13, "object");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JavaImporter" + "'", str14, "JavaImporter");
        org.junit.Assert.assertNull(baseFunction16);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        com.google.javascript.rhino.head.Context context50 = null;
        // The following exception was thrown during execution in test generation
        try {
            global27.initStandardObjects(context50, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(idFunctionObject49);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        com.google.javascript.rhino.head.TopLevel.Builtins builtins84 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction85 = global3.getBuiltinCtor(builtins84);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str86 = baseFunction85.getTypeOf();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(baseFunction85);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        global57.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global59, (int) (short) 10);
        java.lang.Object obj62 = global55.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global57);
        com.google.javascript.rhino.head.Scriptable scriptable63 = global55.getParentScope();
        java.lang.Object obj65 = global55.getAssociatedValue((java.lang.Object) 0.0f);
        com.google.javascript.rhino.head.Context context66 = null;
        java.lang.String[] strArray67 = global55.getPrompts(context66);
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
        boolean boolean89 = global55.has("object", (com.google.javascript.rhino.head.Scriptable) global77);
        global44.defineProperty("hi!", (java.lang.Object) global77, (int) (byte) 10);
        com.google.javascript.rhino.head.Context context92 = null;
        // The following exception was thrown during execution in test generation
        try {
            global44.initStandardObjects(context92, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNull(scriptable63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(idFunctionObject88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Context context8 = null;
        java.lang.String[] strArray9 = global2.getPrompts(context8);
        java.io.PrintStream printStream10 = null;
        global2.setErr(printStream10);
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        global16.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18, (int) (short) 10);
        java.lang.Object obj21 = global14.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16);
        java.lang.Object obj22 = global12.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global16);
        int int23 = global16.size();
        boolean boolean25 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global16, "");
        com.google.javascript.rhino.head.Context context26 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        com.google.javascript.rhino.head.commonjs.module.Require require33 = global16.installRequire(context26, (java.util.List<java.lang.String>) strList30, true);
        boolean boolean34 = global16.hasPrototypeMap();
        com.google.javascript.rhino.head.Scriptable scriptable35 = global16.getParentScope();
        java.lang.String str36 = global16.getTypeOf();
        com.google.javascript.rhino.head.Scriptable scriptable38 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global16, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            global2.initPrototypeMethod((java.lang.Object) global16, 100, "JavaImporter", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(require33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(scriptable35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "object" + "'", str36, "object");
        org.junit.Assert.assertNull(scriptable38);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        com.google.javascript.rhino.head.Scriptable scriptable22 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) global8);
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean26 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global24, "");
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        global32.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global34, (int) (short) 10);
        java.lang.Object obj37 = global30.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global32);
        java.lang.Object obj38 = global28.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global32);
        int int39 = global32.size();
        boolean boolean41 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global32, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject43 = global24.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global32, false);
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        global49.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global51, (int) (short) 10);
        java.lang.Object obj54 = global47.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global49);
        java.lang.Object obj55 = global45.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global49);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins56 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction57 = global45.getBuiltinCtor(builtins56);
        java.lang.Object obj59 = global45.getAssociatedValue((java.lang.Object) (short) 0);
        global45.delete(0);
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global66 = new com.google.javascript.rhino.head.tools.shell.Global();
        global64.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global66, (int) (short) 10);
        java.lang.Object obj69 = global62.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global64);
        com.google.javascript.rhino.head.Scriptable scriptable70 = global62.getParentScope();
        boolean boolean71 = global62.isSealed();
        java.io.PrintStream printStream72 = global62.getErr();
        global45.setOut(printStream72);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global32, "JavaImporter", (java.lang.Object) global45);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global8, 10, (java.lang.Object) global45);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) global8, "", false);
        boolean boolean79 = global8.isInitialized();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(idFunctionObject19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(scriptable22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(idFunctionObject43);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNull(baseFunction57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertNull(scriptable70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(printStream72);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global8 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        global8.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global10, (int) (short) 10);
        java.lang.Object obj13 = global6.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global8);
        boolean boolean14 = global6.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        global20.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global22, (int) (short) 10);
        java.lang.Object obj25 = global18.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global20);
        java.lang.Object obj26 = global16.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global20);
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) global6, "", obj26, (int) (byte) 10);
        boolean boolean29 = global6.isInitialized();
        com.google.javascript.rhino.head.TopLevel.Builtins builtins30 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction31 = global6.getBuiltinCtor(builtins30);
        // The following exception was thrown during execution in test generation
        try {
            global0.setAttributes("JavaImporter", (com.google.javascript.rhino.head.Scriptable) baseFunction31, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(baseFunction31);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        java.io.PrintStream printStream27 = global2.getErr();
        boolean boolean29 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global2, "object");
        boolean boolean30 = global2.isEmpty();
        com.google.javascript.rhino.head.Context context31 = null;
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
        java.lang.Object obj49 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global39, "");
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        global53.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global55, (int) (short) 10);
        java.lang.Object obj58 = global51.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53);
        boolean boolean60 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global53, "");
        com.google.javascript.rhino.head.Context context61 = null;
        com.google.javascript.rhino.head.Scriptable scriptable62 = null;
        java.lang.Object[] objArray68 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function69 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context61, scriptable62, objArray68, function69);
        java.lang.Object obj71 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global53, (java.lang.Object) scriptable62);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject73 = global39.exportAsJSClass((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) global53, false);
        boolean boolean75 = global53.isConst("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global76 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable77 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global76);
        global53.setParentScope((com.google.javascript.rhino.head.Scriptable) global76);
        com.google.javascript.rhino.head.Context context79 = null;
        java.lang.String[] strArray84 = new java.lang.String[] { "JavaImporter", "object", "JavaImporter", "" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        com.google.javascript.rhino.head.commonjs.module.Require require88 = global76.installRequire(context79, (java.util.List<java.lang.String>) strList85, true);
        com.google.javascript.rhino.head.commonjs.module.Require require90 = global2.installRequire(context31, (java.util.List<java.lang.String>) strList85, true);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNull(baseFunction11);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(printStream22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(printStream27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(idFunctionObject73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(scriptable77);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(require88);
        org.junit.Assert.assertNotNull(require90);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global21, "hi!");
        boolean boolean29 = global21.hasPrototypeMap();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        global21.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23, (int) (short) 10);
        global0.defineOwnProperties(context20, (com.google.javascript.rhino.head.ScriptableObject) global21);
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        global31.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global33, (int) (short) 10);
        java.lang.Object obj36 = global29.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global31);
        java.lang.Object obj37 = global27.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global31);
        int int38 = global31.size();
        boolean boolean40 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global31, "");
        global31.cacheBuiltins();
        global31.delete("hi!");
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global31, "");
        int int46 = global31.size();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        global47.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global49, (int) (short) 10);
        global49.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable56 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global49, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins57 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction58 = global49.getBuiltinCtor(builtins57);
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        global62.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global64, (int) (short) 10);
        java.lang.Object obj67 = global60.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global62);
        boolean boolean68 = global49.has("", (com.google.javascript.rhino.head.Scriptable) global62);
        java.io.InputStream inputStream69 = global49.getIn();
        global31.setIn(inputStream69);
        global0.setIn(inputStream69);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global0, "JavaImporter");
        com.google.javascript.rhino.head.tools.shell.Global global75 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global77 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global79 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global81 = new com.google.javascript.rhino.head.tools.shell.Global();
        global79.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global81, (int) (short) 10);
        java.lang.Object obj84 = global77.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global79);
        java.lang.Object obj85 = global75.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global79);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins86 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction87 = global75.getBuiltinCtor(builtins86);
        java.lang.Object obj89 = global75.getAssociatedValue((java.lang.Object) (short) 0);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global75, "");
        java.lang.Object obj93 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global75, 1);
        java.io.PrintStream printStream94 = global75.getOut();
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) global0, "", (java.lang.Object) printStream94, (int) (short) 10);
        org.junit.Assert.assertNull(scriptable1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNull(scriptable56);
        org.junit.Assert.assertNull(baseFunction58);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(inputStream69);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertNull(baseFunction87);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(obj93);
        org.junit.Assert.assertNotNull(printStream94);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        global21.setSealedStdLib(true);
        global21.sealObject();
        com.google.javascript.rhino.head.Context context45 = null;
        com.google.javascript.rhino.head.tools.shell.Global global46 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global48 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global50 = new com.google.javascript.rhino.head.tools.shell.Global();
        global48.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global50, (int) (short) 10);
        java.lang.Object obj53 = global46.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global48);
        boolean boolean54 = global46.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global58 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        global60.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global62, (int) (short) 10);
        java.lang.Object obj65 = global58.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global60);
        java.lang.Object obj66 = global56.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global60);
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) global46, "", obj66, (int) (byte) 10);
        boolean boolean69 = global46.isInitialized();
        com.google.javascript.rhino.head.TopLevel.Builtins builtins70 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction71 = global46.getBuiltinCtor(builtins70);
        com.google.javascript.rhino.head.Context context72 = null;
        java.lang.String[] strArray73 = global46.getPrompts(context72);
        int int77 = global21.runDoctest(context45, (com.google.javascript.rhino.head.Scriptable) global46, "hi!", "JavaImporter", 1);
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
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(baseFunction71);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Context context8 = null;
        java.lang.String[] strArray9 = global2.getPrompts(context8);
        java.lang.String str10 = global2.getTypeOf();
        com.google.javascript.rhino.head.Context context11 = null;
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        global16.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18, (int) (short) 10);
        java.lang.Object obj21 = global14.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global16);
        java.lang.Object obj22 = global12.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global16);
        int int23 = global16.size();
        boolean boolean25 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global16, "");
        com.google.javascript.rhino.head.Context context26 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        com.google.javascript.rhino.head.commonjs.module.Require require33 = global16.installRequire(context26, (java.util.List<java.lang.String>) strList30, true);
        com.google.javascript.rhino.head.commonjs.module.Require require35 = global2.installRequire(context11, (java.util.List<java.lang.String>) strList30, true);
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        global36.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global38, (int) (short) 10);
        global38.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream44 = null;
        global38.setIn(inputStream44);
        global38.delete("");
        java.lang.Object obj48 = global2.get((java.lang.Object) "");
        com.google.javascript.rhino.head.Scriptable scriptable49 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "object" + "'", str10, "object");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(require33);
        org.junit.Assert.assertNotNull(require35);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(scriptable49);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        java.lang.Object obj20 = null;
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        global21.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23, (int) (short) 10);
        global23.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable30 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global23, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins31 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction32 = global23.getBuiltinCtor(builtins31);
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        global36.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global38, (int) (short) 10);
        java.lang.Object obj41 = global34.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global36);
        boolean boolean42 = global23.has("", (com.google.javascript.rhino.head.Scriptable) global36);
        boolean boolean43 = global23.hasPrototypeMap();
        java.io.PrintStream printStream44 = global23.getErr();
        com.google.javascript.rhino.head.Context context46 = null;
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        global49.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global51, (int) (short) 10);
        java.lang.Object obj54 = global47.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global49);
        global47.delete("hi!");
        com.google.javascript.rhino.head.Context context57 = null;
        com.google.javascript.rhino.head.Scriptable scriptable58 = null;
        java.lang.Object[] objArray64 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function65 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context57, scriptable58, objArray64, function65);
        com.google.javascript.rhino.head.tools.shell.Global global67 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean69 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global67, "");
        com.google.javascript.rhino.head.tools.shell.Global global71 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global73 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global75 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global77 = new com.google.javascript.rhino.head.tools.shell.Global();
        global75.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global77, (int) (short) 10);
        java.lang.Object obj80 = global73.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global75);
        java.lang.Object obj81 = global71.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global75);
        int int82 = global75.size();
        boolean boolean84 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global75, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject86 = global67.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global75, false);
        java.lang.Object obj87 = com.google.javascript.rhino.head.tools.shell.Global.toint32(context46, (com.google.javascript.rhino.head.Scriptable) global47, objArray64, (com.google.javascript.rhino.head.Function) idFunctionObject86);
        idFunctionObject86.delete((int) (short) 0);
        boolean boolean90 = global23.has("JavaImporter", (com.google.javascript.rhino.head.Scriptable) idFunctionObject86);
        java.lang.Object obj91 = global5.associateValue(obj20, (java.lang.Object) boolean90);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins92 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction93 = global5.getBuiltinCtor(builtins92);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins94 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction95 = global5.getBuiltinCtor(builtins94);
        java.io.PrintStream printStream96 = global5.getErr();
        org.junit.Assert.assertNull(scriptable1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(scriptable30);
        org.junit.Assert.assertNull(baseFunction32);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(printStream44);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(idFunctionObject86);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + 0 + "'", obj87, 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + obj91 + "' != '" + false + "'", obj91, false);
        org.junit.Assert.assertNull(baseFunction93);
        org.junit.Assert.assertNull(baseFunction95);
        org.junit.Assert.assertNotNull(printStream96);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        com.google.javascript.rhino.head.TopLevel.Builtins builtins23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Scriptable scriptable24 = com.google.javascript.rhino.head.TopLevel.getBuiltinPrototype((com.google.javascript.rhino.head.Scriptable) global2, builtins23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNull(baseFunction11);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(inputStream22);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        global2.delete(8);
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        global32.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global34, (int) (short) 10);
        java.lang.Object obj37 = global30.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global32);
        java.lang.Object obj38 = global28.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global32);
        com.google.javascript.rhino.head.Scriptable scriptable39 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) global32);
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        global40.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global42, (int) (short) 10);
        global42.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable49 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global42, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins50 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction51 = global42.getBuiltinCtor(builtins50);
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        global55.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global57, (int) (short) 10);
        java.lang.Object obj60 = global53.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global55);
        boolean boolean61 = global42.has("", (com.google.javascript.rhino.head.Scriptable) global55);
        java.io.InputStream inputStream62 = global42.getIn();
        global32.setIn(inputStream62);
        java.lang.Object[] objArray64 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global32);
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) global2, "hi!", (java.lang.Object) global32, 13);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNull(baseFunction11);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(printStream22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNull(scriptable39);
        org.junit.Assert.assertNull(scriptable49);
        org.junit.Assert.assertNull(baseFunction51);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(inputStream62);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        global21.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23, (int) (short) 10);
        global0.defineOwnProperties(context20, (com.google.javascript.rhino.head.ScriptableObject) global21);
        boolean boolean28 = global21.isConst("");
        org.junit.Assert.assertNull(scriptable1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        com.google.javascript.rhino.head.Scriptable scriptable56 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global30);
        boolean boolean58 = global30.isConst("JavaImporter");
        com.google.javascript.rhino.head.tools.shell.QuitAction quitAction59 = null;
        // The following exception was thrown during execution in test generation
        try {
            global30.initQuitAction(quitAction59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quitAction is null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(scriptable56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        global12.setAttributes("", 13);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        global2.sealObject();
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        global9.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11, (int) (short) 10);
        global11.setAttributes("", (int) (short) 0);
        int int17 = global11.size();
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
        java.lang.Object obj35 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global25, "");
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        global39.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41, (int) (short) 10);
        java.lang.Object obj44 = global37.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global39);
        boolean boolean46 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global39, "");
        com.google.javascript.rhino.head.Context context47 = null;
        com.google.javascript.rhino.head.Scriptable scriptable48 = null;
        java.lang.Object[] objArray54 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function55 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context47, scriptable48, objArray54, function55);
        java.lang.Object obj57 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global39, (java.lang.Object) scriptable48);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject59 = global25.exportAsJSClass((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) global39, false);
        boolean boolean61 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global25, (int) (short) 100);
        com.google.javascript.rhino.head.tools.shell.Global global63 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global67 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global69 = new com.google.javascript.rhino.head.tools.shell.Global();
        global67.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global69, (int) (short) 10);
        java.lang.Object obj72 = global65.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global67);
        java.lang.Object obj73 = global63.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global67);
        int int74 = global67.size();
        boolean boolean75 = global67.avoidObjectDetection();
        com.google.javascript.rhino.head.tools.shell.Global global77 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable78 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global77);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject80 = global67.exportAsJSClass(100, scriptable78, false);
        boolean boolean81 = global25.has((int) (short) 10, (com.google.javascript.rhino.head.Scriptable) idFunctionObject80);
        boolean boolean82 = idFunctionObject80.isSealed();
        boolean boolean84 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject80, (int) (byte) 100);
        java.lang.Object obj85 = global2.associateValue((java.lang.Object) global11, (java.lang.Object) boolean84);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(idFunctionObject59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(scriptable78);
        org.junit.Assert.assertNotNull(idFunctionObject80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + false + "'", obj85, false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        java.lang.Object obj56 = null;
        java.lang.Object obj57 = global2.getAssociatedValue(obj56);
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
        java.lang.Object obj79 = global2.get("", (com.google.javascript.rhino.head.Scriptable) global64);
        com.google.javascript.rhino.head.tools.shell.Global global81 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global83 = new com.google.javascript.rhino.head.tools.shell.Global();
        global81.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global83, (int) (short) 10);
        global83.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable90 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global83, "hi!");
        java.lang.Object obj91 = global2.get("JavaImporter", scriptable90);
        boolean boolean93 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global2, 3);
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
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(scriptable60);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(scriptable90);
        org.junit.Assert.assertNotNull(obj91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        java.lang.Object obj8 = global1.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3);
        boolean boolean10 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global3, "");
        com.google.javascript.rhino.head.Scriptable scriptable11 = global3.getPrototype();
        global3.activatePrototypeMap((int) '4');
        com.google.javascript.rhino.head.TopLevel.Builtins builtins14 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction15 = global3.getBuiltinCtor(builtins14);
        boolean boolean16 = global3.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        global19.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21, (int) (short) 10);
        java.lang.Object obj24 = global17.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19);
        com.google.javascript.rhino.head.Scriptable scriptable25 = global17.getParentScope();
        java.lang.Object obj27 = global17.getAssociatedValue((java.lang.Object) 0.0f);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global17, "object");
        java.lang.Object[] objArray30 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global17);
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        global31.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global33, (int) (short) 10);
        global33.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        global40.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global42, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        global47.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global49, (int) (short) 10);
        java.lang.Object obj52 = global45.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global47);
        boolean boolean54 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global47, "");
        global42.setParentScope((com.google.javascript.rhino.head.Scriptable) global47);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject57 = global33.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global42, false);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject57, "");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.shell.Global.serialize(context0, (com.google.javascript.rhino.head.Scriptable) global3, objArray30, (com.google.javascript.rhino.head.Function) idFunctionObject57);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: Expected an object to serialize and a filename to write the serialization to");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(scriptable11);
        org.junit.Assert.assertNull(baseFunction15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNull(scriptable25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[object]");
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(idFunctionObject57);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        boolean boolean69 = global9.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = global0.getParentScope();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        global12.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global14, (int) (short) 10);
        java.lang.Object obj17 = global10.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global12);
        com.google.javascript.rhino.head.Scriptable scriptable18 = global10.getParentScope();
        java.lang.Object obj20 = global10.getAssociatedValue((java.lang.Object) 0.0f);
        java.lang.Object[] objArray21 = global10.getAllIds();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        global0.defineProperty("hi!", (java.lang.Object) objArray21, method22, method23, 4);
        java.lang.String str26 = global0.getClassName();
        boolean boolean27 = global0.hasPrototypeMap();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(scriptable18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "JavaImporter" + "'", str26, "JavaImporter");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        boolean boolean42 = global21.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        global43.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global45, (int) (short) 10);
        global45.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream51 = null;
        global45.setIn(inputStream51);
        com.google.javascript.rhino.head.Scriptable scriptable53 = global45.getParentScope();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global45, "hi!", (java.lang.Object) 1.0d);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins57 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction58 = global45.getBuiltinCtor(builtins57);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = global21.hasInstance((com.google.javascript.rhino.head.Scriptable) baseFunction58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(scriptable53);
        org.junit.Assert.assertNull(baseFunction58);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        global23.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global25, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        global30.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global32, (int) (short) 10);
        java.lang.Object obj35 = global28.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global30);
        boolean boolean37 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global30, "");
        global25.setParentScope((com.google.javascript.rhino.head.Scriptable) global30);
        java.io.InputStream inputStream39 = global25.getIn();
        com.google.javascript.rhino.head.Scriptable scriptable41 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global25, "hi!");
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable43 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global42);
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        global45.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global47, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global50 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        global52.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global54, (int) (short) 10);
        java.lang.Object obj57 = global50.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global52);
        boolean boolean59 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global52, "");
        global47.setParentScope((com.google.javascript.rhino.head.Scriptable) global52);
        boolean boolean61 = global42.has("", (com.google.javascript.rhino.head.Scriptable) global47);
        java.io.InputStream inputStream62 = global42.getIn();
        global25.setIn(inputStream62);
        global2.setIn(inputStream62);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNull(baseFunction11);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(inputStream39);
        org.junit.Assert.assertNull(scriptable41);
        org.junit.Assert.assertNull(scriptable43);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(inputStream62);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        boolean boolean24 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global4, "");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(printStream19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean57 = global56.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global58 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        global60.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global62, (int) (short) 10);
        java.lang.Object obj65 = global58.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global60);
        com.google.javascript.rhino.head.Scriptable scriptable66 = global58.getParentScope();
        java.lang.Object obj68 = global58.getAssociatedValue((java.lang.Object) 0.0f);
        java.lang.Object[] objArray69 = global58.getAllIds();
        java.io.InputStream inputStream70 = global58.getIn();
        java.lang.Object obj71 = global2.associateValue((java.lang.Object) global56, (java.lang.Object) inputStream70);
        java.io.InputStream inputStream72 = global56.getIn();
        com.google.javascript.rhino.head.Scriptable scriptable73 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global56);
        boolean boolean75 = global56.isConst("");
        java.lang.Object obj77 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global56, 11);
        com.google.javascript.rhino.head.tools.shell.Global global79 = new com.google.javascript.rhino.head.tools.shell.Global();
        java.lang.Object[] objArray80 = global79.getAllIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj81 = com.google.javascript.rhino.head.ScriptableObject.callMethod((com.google.javascript.rhino.head.Scriptable) global56, "hi!", objArray80);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EcmaError; message: TypeError: hi! is not a function, it is object.");
        } catch (com.google.javascript.rhino.head.EcmaError e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNull(scriptable66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertNotNull(inputStream70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(inputStream72);
        org.junit.Assert.assertNull(scriptable73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[]");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(baseFunction12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global41, "object");
        com.google.javascript.rhino.head.Context context65 = null;
        com.google.javascript.rhino.head.Context context66 = null;
        com.google.javascript.rhino.head.tools.shell.Global global67 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global69 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global71 = new com.google.javascript.rhino.head.tools.shell.Global();
        global69.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global71, (int) (short) 10);
        java.lang.Object obj74 = global67.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global69);
        global67.delete("hi!");
        com.google.javascript.rhino.head.ImporterTopLevel.init(context66, (com.google.javascript.rhino.head.Scriptable) global67, false);
        java.lang.String str79 = global67.getTypeOf();
        java.lang.String str80 = global67.getClassName();
        java.io.InputStream inputStream81 = global67.getIn();
        global41.defineOwnProperties(context65, (com.google.javascript.rhino.head.ScriptableObject) global67);
        java.lang.Object obj84 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global67, "hi!");
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
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "object" + "'", str79, "object");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "JavaImporter" + "'", str80, "JavaImporter");
        org.junit.Assert.assertNotNull(inputStream81);
        org.junit.Assert.assertNotNull(obj84);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) require62, "JavaImporter");
        java.lang.String str65 = require62.getTypeOf();
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "function" + "'", str65, "function");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean8 = global0.isExtensible();
        java.lang.String str9 = global0.getTypeOf();
        boolean boolean11 = global0.isConst("JavaImporter");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "object" + "'", str9, "object");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        java.io.PrintStream printStream12 = global4.getErr();
        boolean boolean14 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global4, "hi!");
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable19 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global18);
        java.lang.Object[] objArray20 = global18.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean23 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global21, "");
        global16.put("", (com.google.javascript.rhino.head.Scriptable) global18, (java.lang.Object) boolean23);
        global4.defineConst("object", (com.google.javascript.rhino.head.Scriptable) global18);
        java.lang.Object[] objArray26 = global4.getAllIds();
        java.lang.Object obj28 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global4, "hi!");
        boolean boolean30 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global4, 4);
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        global34.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global36, (int) (short) 10);
        java.lang.Object obj39 = global32.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global34);
        global32.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        global43.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global45, (int) (short) 10);
        global45.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream51 = null;
        global45.setIn(inputStream51);
        java.lang.Object obj53 = global32.get(0, (com.google.javascript.rhino.head.Scriptable) global45);
        boolean boolean55 = global45.isConst("");
        com.google.javascript.rhino.head.Scriptable scriptable56 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global45);
        global45.preventExtensions();
        java.lang.Object obj58 = global4.get(0, (com.google.javascript.rhino.head.Scriptable) global45);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(printStream12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(scriptable19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1]");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(scriptable56);
        org.junit.Assert.assertNotNull(obj58);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        java.lang.String str85 = global12.getClassName();
        com.google.javascript.rhino.head.Context context86 = null;
        // The following exception was thrown during execution in test generation
        try {
            global12.init(context86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "JavaImporter" + "'", str85, "JavaImporter");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        global51.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53, (int) (short) 10);
        global53.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Context context59 = null;
        java.lang.String[] strArray60 = global53.getPrompts(context59);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins61 = null;
        com.google.javascript.rhino.head.Scriptable scriptable62 = global53.getBuiltinPrototype(builtins61);
        com.google.javascript.rhino.head.tools.shell.Global global63 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable66 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global65);
        java.lang.Object[] objArray67 = global65.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global68 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean70 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global68, "");
        global63.put("", (com.google.javascript.rhino.head.Scriptable) global65, (java.lang.Object) boolean70);
        java.io.InputStream inputStream72 = global65.getIn();
        global53.setIn(inputStream72);
        global22.setIn(inputStream72);
        com.google.javascript.rhino.head.Scriptable scriptable75 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global22);
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
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNull(scriptable62);
        org.junit.Assert.assertNotNull(scriptable66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(inputStream72);
        org.junit.Assert.assertNotNull(scriptable75);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        global3.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global5, (int) (short) 10);
        java.lang.Object obj8 = global1.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3);
        boolean boolean10 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global3, "");
        com.google.javascript.rhino.head.Context context11 = null;
        com.google.javascript.rhino.head.Scriptable scriptable12 = null;
        java.lang.Object[] objArray18 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function19 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context11, scriptable12, objArray18, function19);
        java.lang.Object obj21 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global3, (java.lang.Object) scriptable12);
        com.google.javascript.rhino.head.ImporterTopLevel.init(context0, (com.google.javascript.rhino.head.Scriptable) global3, true);
        global3.activatePrototypeMap(2);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        java.lang.Object obj41 = global28.getAssociatedValue((java.lang.Object) (short) 1);
        com.google.javascript.rhino.head.Scriptable scriptable42 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) global28);
        global0.setParentScope(scriptable42);
        org.junit.Assert.assertNull(scriptable1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(idFunctionObject39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(scriptable42);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        global21.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23, (int) (short) 10);
        global0.defineOwnProperties(context20, (com.google.javascript.rhino.head.ScriptableObject) global21);
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        global29.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable36 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global29, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins37 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction38 = global29.getBuiltinCtor(builtins37);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins39 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction40 = global29.getBuiltinCtor(builtins39);
        java.lang.Object obj41 = global21.get((java.lang.Object) baseFunction40);
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        global45.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global47, (int) (short) 10);
        java.lang.Object obj50 = global43.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global45);
        com.google.javascript.rhino.head.Scriptable scriptable51 = global43.getParentScope();
        java.lang.Object obj53 = global43.getAssociatedValue((java.lang.Object) 0.0f);
        com.google.javascript.rhino.head.Context context54 = null;
        java.lang.String[] strArray55 = global43.getPrompts(context54);
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) global21, "", (java.lang.Object) strArray55, 0);
        global21.preventExtensions();
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        global62.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global64, (int) (short) 10);
        java.lang.Object obj67 = global60.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global62);
        com.google.javascript.rhino.head.Scriptable scriptable68 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global60);
        com.google.javascript.rhino.head.tools.shell.Global global70 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global72 = new com.google.javascript.rhino.head.tools.shell.Global();
        global70.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global72, (int) (short) 10);
        global72.setAttributes("", (int) (short) 0);
        boolean boolean78 = global60.has((int) (byte) 0, (com.google.javascript.rhino.head.Scriptable) global72);
        boolean boolean79 = global21.has(100, (com.google.javascript.rhino.head.Scriptable) global60);
        boolean boolean80 = global21.avoidObjectDetection();
        global21.sealObject();
        org.junit.Assert.assertNull(scriptable1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(scriptable36);
        org.junit.Assert.assertNull(baseFunction38);
        org.junit.Assert.assertNull(baseFunction40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNull(scriptable51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNull(scriptable68);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        global26.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global28, (int) (short) 10);
        java.lang.Object obj31 = global24.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global26);
        boolean boolean32 = global24.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        global38.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global40, (int) (short) 10);
        java.lang.Object obj43 = global36.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global38);
        java.lang.Object obj44 = global34.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global38);
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) global24, "", obj44, (int) (byte) 10);
        boolean boolean47 = global24.isInitialized();
        boolean boolean49 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global24, "JavaImporter");
        java.lang.Object obj50 = global4.get(8, (com.google.javascript.rhino.head.Scriptable) global24);
        java.lang.Object[] objArray51 = global24.getAllIds();
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(require21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable1 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global0);
        global0.delete(4);
        boolean boolean4 = global0.hasPrototypeMap();
        com.google.javascript.rhino.head.Context context5 = null;
        java.lang.String[] strArray6 = global0.getPrompts(context5);
        boolean boolean7 = global0.avoidObjectDetection();
        boolean boolean8 = global0.isExtensible();
        com.google.javascript.rhino.head.Scriptable scriptable10 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global0, "function");
        org.junit.Assert.assertNull(scriptable1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(scriptable10);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Context context8 = null;
        java.lang.String[] strArray9 = global2.getPrompts(context8);
        java.io.PrintStream printStream10 = null;
        global2.setErr(printStream10);
        global2.cacheBuiltins();
        global2.setAttributes((int) (byte) 0, 13);
        com.google.javascript.rhino.head.Scriptable scriptable16 = global2.getParentScope();
        java.io.PrintStream printStream17 = global2.getErr();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(scriptable16);
        org.junit.Assert.assertNotNull(printStream17);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable8 = global2.getPrototype();
        java.io.InputStream inputStream9 = global2.getIn();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        global13.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15, (int) (short) 10);
        java.lang.Object obj18 = global11.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13);
        boolean boolean20 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global13, "");
        boolean boolean21 = global13.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable23 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global22);
        java.lang.Object[] objArray24 = global22.getAllIds();
        java.lang.Object obj25 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global13, (java.lang.Object) global22);
        com.google.javascript.rhino.head.Context context26 = null;
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        global30.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global32, (int) (short) 10);
        java.lang.Object obj35 = global28.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global30);
        com.google.javascript.rhino.head.Scriptable scriptable36 = global30.getPrototype();
        global22.defineOwnProperty(context26, (java.lang.Object) 'a', (com.google.javascript.rhino.head.ScriptableObject) global30);
        global22.activatePrototypeMap((int) ' ');
        boolean boolean40 = global22.avoidObjectDetection();
        java.lang.Object obj42 = null;
        global22.defineProperty("hi!", obj42, 4);
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        global47.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global49, (int) (short) 10);
        java.lang.Object obj52 = global45.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global47);
        global45.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global58 = new com.google.javascript.rhino.head.tools.shell.Global();
        global56.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global58, (int) (short) 10);
        global58.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream64 = null;
        global58.setIn(inputStream64);
        java.lang.Object obj66 = global45.get(0, (com.google.javascript.rhino.head.Scriptable) global58);
        com.google.javascript.rhino.head.tools.shell.Global global68 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global70 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global72 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global74 = new com.google.javascript.rhino.head.tools.shell.Global();
        global72.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global74, (int) (short) 10);
        java.lang.Object obj77 = global70.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global72);
        java.lang.Object obj78 = global68.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global72);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) global58, 10, (java.lang.Object) global72);
        boolean boolean80 = global72.isEmpty();
        java.lang.Object obj81 = global22.get((java.lang.Object) global72);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) global2, "object", (java.lang.Object) global72);
        com.google.javascript.rhino.head.Context context83 = null;
        com.google.javascript.rhino.head.Scriptable scriptable84 = null;
        java.lang.Object[] objArray90 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function91 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context83, scriptable84, objArray90, function91);
        java.lang.Object obj93 = global2.getAssociatedValue((java.lang.Object) context83);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(scriptable23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(scriptable36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray90), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray90), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj93);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable1 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global0);
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global7 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        global7.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global9, (int) (short) 10);
        java.lang.Object obj12 = global5.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global7);
        java.lang.Object obj13 = global3.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global7);
        int int14 = global7.size();
        java.io.PrintStream printStream15 = global7.getErr();
        boolean boolean17 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global7, "hi!");
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable22 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global21);
        java.lang.Object[] objArray23 = global21.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean26 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global24, "");
        global19.put("", (com.google.javascript.rhino.head.Scriptable) global21, (java.lang.Object) boolean26);
        global7.defineConst("object", (com.google.javascript.rhino.head.Scriptable) global21);
        java.lang.Object[] objArray29 = global7.getAllIds();
        java.lang.Object obj31 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global7, (int) (byte) 0);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject33 = global0.exportAsJSClass(3, (com.google.javascript.rhino.head.Scriptable) global7, true);
        org.junit.Assert.assertNull(scriptable1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(printStream15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(scriptable22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1]");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(idFunctionObject33);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable2 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global1);
        global1.setSealedStdLib(true);
        global1.cacheBuiltins();
        com.google.javascript.rhino.head.TopLevel.Builtins builtins6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function7 = com.google.javascript.rhino.head.TopLevel.getBuiltinCtor(context0, (com.google.javascript.rhino.head.Scriptable) global1, builtins6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scriptable2);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        global1.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3, (int) (short) 10);
        global3.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream9 = null;
        global3.setIn(inputStream9);
        boolean boolean11 = global3.isExtensible();
        com.google.javascript.rhino.head.TopLevel.Builtins builtins12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function13 = com.google.javascript.rhino.head.TopLevel.getBuiltinCtor(context0, (com.google.javascript.rhino.head.Scriptable) global3, builtins12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        java.lang.Object obj20 = null;
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        global21.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23, (int) (short) 10);
        global23.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable30 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global23, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins31 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction32 = global23.getBuiltinCtor(builtins31);
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global36 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global38 = new com.google.javascript.rhino.head.tools.shell.Global();
        global36.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global38, (int) (short) 10);
        java.lang.Object obj41 = global34.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global36);
        boolean boolean42 = global23.has("", (com.google.javascript.rhino.head.Scriptable) global36);
        boolean boolean43 = global23.hasPrototypeMap();
        java.io.PrintStream printStream44 = global23.getErr();
        com.google.javascript.rhino.head.Context context46 = null;
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        global49.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global51, (int) (short) 10);
        java.lang.Object obj54 = global47.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global49);
        global47.delete("hi!");
        com.google.javascript.rhino.head.Context context57 = null;
        com.google.javascript.rhino.head.Scriptable scriptable58 = null;
        java.lang.Object[] objArray64 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function65 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context57, scriptable58, objArray64, function65);
        com.google.javascript.rhino.head.tools.shell.Global global67 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean69 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global67, "");
        com.google.javascript.rhino.head.tools.shell.Global global71 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global73 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global75 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global77 = new com.google.javascript.rhino.head.tools.shell.Global();
        global75.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global77, (int) (short) 10);
        java.lang.Object obj80 = global73.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global75);
        java.lang.Object obj81 = global71.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global75);
        int int82 = global75.size();
        boolean boolean84 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global75, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject86 = global67.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global75, false);
        java.lang.Object obj87 = com.google.javascript.rhino.head.tools.shell.Global.toint32(context46, (com.google.javascript.rhino.head.Scriptable) global47, objArray64, (com.google.javascript.rhino.head.Function) idFunctionObject86);
        idFunctionObject86.delete((int) (short) 0);
        boolean boolean90 = global23.has("JavaImporter", (com.google.javascript.rhino.head.Scriptable) idFunctionObject86);
        java.lang.Object obj91 = global5.associateValue(obj20, (java.lang.Object) boolean90);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins92 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction93 = global5.getBuiltinCtor(builtins92);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins94 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction95 = global5.getBuiltinCtor(builtins94);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global5, "");
        org.junit.Assert.assertNull(scriptable1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(scriptable30);
        org.junit.Assert.assertNull(baseFunction32);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(printStream44);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(idFunctionObject86);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + 0 + "'", obj87, 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + obj91 + "' != '" + false + "'", obj91, false);
        org.junit.Assert.assertNull(baseFunction93);
        org.junit.Assert.assertNull(baseFunction95);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        com.google.javascript.rhino.head.tools.shell.Global global56 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean57 = global56.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global58 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        global60.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global62, (int) (short) 10);
        java.lang.Object obj65 = global58.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global60);
        com.google.javascript.rhino.head.Scriptable scriptable66 = global58.getParentScope();
        java.lang.Object obj68 = global58.getAssociatedValue((java.lang.Object) 0.0f);
        java.lang.Object[] objArray69 = global58.getAllIds();
        java.io.InputStream inputStream70 = global58.getIn();
        java.lang.Object obj71 = global2.associateValue((java.lang.Object) global56, (java.lang.Object) inputStream70);
        java.io.InputStream inputStream72 = global56.getIn();
        java.lang.String str73 = global56.getClassName();
        boolean boolean75 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global56, "JavaImporter");
        global56.sealObject();
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNull(scriptable66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertNotNull(inputStream70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(inputStream72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "JavaImporter" + "'", str73, "JavaImporter");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global20 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global22 = new com.google.javascript.rhino.head.tools.shell.Global();
        global20.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global22, (int) (short) 10);
        java.lang.Object obj25 = global18.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global20);
        boolean boolean26 = global18.isInitialized();
        java.lang.Object obj27 = global0.get((int) (byte) 100, (com.google.javascript.rhino.head.Scriptable) global18);
        global0.setAttributes(4, (int) (byte) 10);
        boolean boolean31 = global0.isEmpty();
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(baseFunction12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2, (int) (short) 10);
        global2.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream8 = null;
        global2.setIn(inputStream8);
        boolean boolean10 = global2.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        global15.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17, (int) (short) 10);
        java.lang.Object obj20 = global13.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15);
        java.lang.Object obj21 = global11.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global15);
        int int22 = global15.size();
        java.io.PrintStream printStream23 = global15.getErr();
        global2.setOut(printStream23);
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable26 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global25);
        global25.delete(4);
        boolean boolean29 = global25.hasPrototypeMap();
        com.google.javascript.rhino.head.Context context30 = null;
        java.lang.String[] strArray31 = global25.getPrompts(context30);
        global2.setParentScope((com.google.javascript.rhino.head.Scriptable) global25);
        java.lang.Object[] objArray33 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global25);
        java.lang.Object[] objArray34 = global25.getIds();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(printStream23);
        org.junit.Assert.assertNull(scriptable26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        boolean boolean20 = global0.avoidObjectDetection();
        com.google.javascript.rhino.head.Context context21 = null;
        // The following exception was thrown during execution in test generation
        try {
            global0.initStandardObjects(context21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scriptable1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        com.google.javascript.rhino.head.Scriptable scriptable24 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global13);
        global13.setSealedStdLib(false);
        int int27 = global13.size();
        boolean boolean28 = global13.isExtensible();
        global13.setSealedStdLib(true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(scriptable24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        java.lang.Object[] objArray39 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.Scriptable scriptable41 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global2, "hi!");
        com.google.javascript.rhino.head.Context context42 = null;
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        global45.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global47, (int) (short) 10);
        java.lang.Object obj50 = global43.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global45);
        boolean boolean52 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global45, "");
        boolean boolean53 = global45.isExtensible();
        java.lang.Object obj55 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global45, (int) (short) 1);
        java.io.PrintStream printStream56 = global45.getOut();
        com.google.javascript.rhino.head.ImporterTopLevel.init(context42, (com.google.javascript.rhino.head.Scriptable) global45, true);
        java.lang.Object[] objArray59 = global45.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        global62.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global64, (int) (short) 10);
        global64.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global71 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global73 = new com.google.javascript.rhino.head.tools.shell.Global();
        global71.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global73, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global76 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global78 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global80 = new com.google.javascript.rhino.head.tools.shell.Global();
        global78.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global80, (int) (short) 10);
        java.lang.Object obj83 = global76.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global78);
        boolean boolean85 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global78, "");
        global73.setParentScope((com.google.javascript.rhino.head.Scriptable) global78);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject88 = global64.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global73, false);
        com.google.javascript.rhino.head.Scriptable scriptable89 = idFunctionObject88.getPrototype();
        global45.setGetterOrSetter("", 0, (com.google.javascript.rhino.head.Callable) idFunctionObject88, false);
        global2.setPrototype((com.google.javascript.rhino.head.Scriptable) global45);
        java.lang.String str93 = global2.getTypeOf();
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
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNull(scriptable41);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(printStream56);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[1, JavaImporter]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[1, JavaImporter]");
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(idFunctionObject88);
        org.junit.Assert.assertNull(scriptable89);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "object" + "'", str93, "object");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        com.google.javascript.rhino.head.Context context24 = null;
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        global27.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29, (int) (short) 10);
        java.lang.Object obj32 = global25.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27);
        boolean boolean34 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global27, "");
        java.lang.Object obj36 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global27, "hi!");
        java.lang.String str37 = global27.getTypeOf();
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global27, obj38);
        global13.defineOwnProperties(context24, (com.google.javascript.rhino.head.ScriptableObject) global27);
        com.google.javascript.rhino.head.Scriptable scriptable42 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global13, "hi!");
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean46 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global44, "");
        java.io.InputStream inputStream47 = global44.getIn();
        // The following exception was thrown during execution in test generation
        try {
            global13.defineProperty("JavaImporter", (java.lang.Object) inputStream47, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "object" + "'", str37, "object");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(scriptable42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(inputStream47);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        boolean boolean13 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global4, "");
        boolean boolean15 = global4.isConst("object");
        com.google.javascript.rhino.head.Scriptable scriptable16 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global4);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) global4, "function", true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(scriptable16);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object[] objArray11 = global4.getIds();
        java.io.PrintStream printStream12 = global4.getErr();
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(printStream12);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Scriptable scriptable14 = com.google.javascript.rhino.head.TopLevel.getBuiltinPrototype((com.google.javascript.rhino.head.Scriptable) global2, builtins13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(scriptable10);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        global19.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21, (int) (short) 10);
        java.lang.Object obj24 = global17.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19);
        com.google.javascript.rhino.head.Scriptable scriptable25 = global19.getPrototype();
        global11.defineOwnProperty(context15, (java.lang.Object) 'a', (com.google.javascript.rhino.head.ScriptableObject) global19);
        java.lang.Object obj28 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global19, 0);
        java.lang.Object[] objArray29 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global19);
        java.lang.Object[] objArray30 = global19.getIds();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(scriptable12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNull(scriptable25);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        global2.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4, (int) (short) 10);
        java.lang.Object obj7 = global0.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global2);
        boolean boolean9 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global2, "");
        com.google.javascript.rhino.head.Scriptable scriptable10 = global2.getPrototype();
        java.io.PrintStream printStream11 = null;
        global2.setOut(printStream11);
        java.lang.Object obj14 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global2, "JavaImporter");
        boolean boolean15 = global2.avoidObjectDetection();
        boolean boolean16 = global2.isExtensible();
        global2.setSealedStdLib(false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(scriptable10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        global21.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        global28.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global30, (int) (short) 10);
        java.lang.Object obj33 = global26.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global28);
        boolean boolean35 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global28, "");
        global23.setParentScope((com.google.javascript.rhino.head.Scriptable) global28);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global23, "hi!");
        boolean boolean39 = global23.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global40 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global46 = new com.google.javascript.rhino.head.tools.shell.Global();
        global44.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global46, (int) (short) 10);
        java.lang.Object obj49 = global42.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global44);
        java.lang.Object obj50 = global40.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global44);
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean53 = global52.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        global55.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global57, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        global62.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global64, (int) (short) 10);
        java.lang.Object obj67 = global60.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global62);
        boolean boolean69 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global62, "");
        global57.setParentScope((com.google.javascript.rhino.head.Scriptable) global62);
        com.google.javascript.rhino.head.Context context71 = null;
        com.google.javascript.rhino.head.tools.shell.Global global72 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int76 = global57.runDoctest(context71, (com.google.javascript.rhino.head.Scriptable) global72, "", "hi!", (int) (short) 10);
        java.lang.Object obj77 = global52.get((int) (byte) 100, (com.google.javascript.rhino.head.Scriptable) global57);
        boolean boolean78 = global40.has((int) (short) 0, (com.google.javascript.rhino.head.Scriptable) global52);
        java.lang.Object obj79 = global23.getAssociatedValue((java.lang.Object) (short) 0);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins80 = null;
        com.google.javascript.rhino.head.Scriptable scriptable81 = global23.getBuiltinPrototype(builtins80);
        global0.setPrototype(scriptable81);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.redefineProperty(scriptable81, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(baseFunction19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(scriptable81);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        com.google.javascript.rhino.head.tools.shell.Global global16 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global18 = new com.google.javascript.rhino.head.tools.shell.Global();
        global16.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global18, (int) (short) 10);
        global18.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream24 = null;
        global18.setIn(inputStream24);
        global18.delete("");
        java.lang.Object obj28 = global2.get((int) (short) 0, (com.google.javascript.rhino.head.Scriptable) global18);
        boolean boolean29 = global2.isExtensible();
        global2.preventExtensions();
        // The following exception was thrown during execution in test generation
        try {
            global2.setAttributes("", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(scriptable10);
        org.junit.Assert.assertNull(baseFunction14);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        global25.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global27, (int) (short) 10);
        java.lang.Object obj30 = global23.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global25);
        com.google.javascript.rhino.head.Scriptable scriptable31 = global23.getParentScope();
        java.lang.Object obj33 = global23.getAssociatedValue((java.lang.Object) 0.0f);
        global23.delete(1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) global2, "object", (java.lang.Object) 1);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNull(baseFunction11);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(scriptable31);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        global31.setAttributes("", 0);
        int int50 = global31.getAttributes("");
        java.io.PrintStream printStream51 = global31.getOut();
        com.google.javascript.rhino.head.Context context52 = null;
        // The following exception was thrown during execution in test generation
        try {
            global31.init(context52);
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
        org.junit.Assert.assertNull(scriptable30);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNull(scriptable45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(printStream51);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        java.lang.Object obj2 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global0, (int) (byte) 0);
        boolean boolean4 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global0, 4);
        com.google.javascript.rhino.head.Scriptable scriptable5 = global0.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global7 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        java.lang.Object obj16 = global9.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11);
        java.lang.Object obj17 = global7.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global11);
        int int18 = global11.size();
        boolean boolean20 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global11, "");
        global11.cacheBuiltins();
        com.google.javascript.rhino.head.Scriptable scriptable22 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global11);
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        global11.defineProperty("", (java.lang.Object) "hi!", method25, method26, (int) (byte) 1);
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable31 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global30);
        com.google.javascript.rhino.head.tools.shell.Global global33 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean35 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global33, "");
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        global41.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global43, (int) (short) 10);
        java.lang.Object obj46 = global39.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global41);
        java.lang.Object obj47 = global37.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global41);
        int int48 = global41.size();
        boolean boolean50 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global41, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject52 = global33.exportAsJSClass((int) 'a', (com.google.javascript.rhino.head.Scriptable) global41, false);
        global30.setAttributes(10, (com.google.javascript.rhino.head.Scriptable) global33, (int) (short) 0);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject56 = global11.exportAsJSClass((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) global30, false);
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global61 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global63 = new com.google.javascript.rhino.head.tools.shell.Global();
        global61.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global63, (int) (short) 10);
        java.lang.Object obj66 = global59.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global61);
        java.lang.Object obj67 = global57.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global61);
        int int68 = global61.size();
        boolean boolean70 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global61, "");
        global61.cacheBuiltins();
        global61.delete("hi!");
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global61, "");
        java.io.PrintStream printStream76 = global61.getErr();
        global61.delete((int) (byte) 10);
        global0.put("function", (com.google.javascript.rhino.head.Scriptable) idFunctionObject56, (java.lang.Object) global61);
        boolean boolean80 = global61.isInitialized();
        com.google.javascript.rhino.head.tools.shell.Global global82 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global84 = new com.google.javascript.rhino.head.tools.shell.Global();
        global82.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global84, (int) (short) 10);
        global84.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Context context90 = null;
        java.lang.String[] strArray91 = global84.getPrompts(context90);
        com.google.javascript.rhino.head.Scriptable scriptable92 = global84.getPrototype();
        com.google.javascript.rhino.head.Scriptable scriptable93 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) global84);
        boolean boolean95 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global84, (int) (byte) -1);
        global61.setAttributes(10, (com.google.javascript.rhino.head.Scriptable) global84, 2);
        com.google.javascript.rhino.head.Scriptable scriptable98 = global84.getPrototype();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(scriptable5);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(scriptable22);
        org.junit.Assert.assertNotNull(scriptable31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(idFunctionObject52);
        org.junit.Assert.assertNotNull(idFunctionObject56);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(printStream76);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNull(scriptable92);
        org.junit.Assert.assertNull(scriptable93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNull(scriptable98);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        boolean boolean17 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global12, "JavaImporter");
        com.google.javascript.rhino.head.ImporterTopLevel.init(context0, (com.google.javascript.rhino.head.Scriptable) global12, false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scriptable13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.tools.shell.Global global1 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        global1.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global3, (int) (short) 10);
        global3.setAttributes("", (int) (short) 0);
        int int9 = global3.size();
        com.google.javascript.rhino.head.tools.shell.Global global10 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global12 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global14 = new com.google.javascript.rhino.head.tools.shell.Global();
        global12.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global14, (int) (short) 10);
        java.lang.Object obj17 = global10.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global12);
        com.google.javascript.rhino.head.Scriptable scriptable18 = global12.getPrototype();
        java.io.InputStream inputStream19 = global12.getIn();
        java.lang.Object[] objArray20 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global12);
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
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean43 = global42.isEmpty();
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        global45.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global47, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global50 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global52 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global54 = new com.google.javascript.rhino.head.tools.shell.Global();
        global52.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global54, (int) (short) 10);
        java.lang.Object obj57 = global50.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global52);
        boolean boolean59 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global52, "");
        global47.setParentScope((com.google.javascript.rhino.head.Scriptable) global52);
        com.google.javascript.rhino.head.Context context61 = null;
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        int int66 = global47.runDoctest(context61, (com.google.javascript.rhino.head.Scriptable) global62, "", "hi!", (int) (short) 10);
        java.lang.Object obj67 = global42.get((int) (byte) 100, (com.google.javascript.rhino.head.Scriptable) global47);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins68 = null;
        com.google.javascript.rhino.head.Scriptable scriptable69 = global42.getBuiltinPrototype(builtins68);
        int int70 = global29.getAttributes("JavaImporter", (com.google.javascript.rhino.head.Scriptable) global42);
        com.google.javascript.rhino.head.Context context71 = null;
        com.google.javascript.rhino.head.tools.shell.Global global72 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global74 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global76 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global78 = new com.google.javascript.rhino.head.tools.shell.Global();
        global76.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global78, (int) (short) 10);
        java.lang.Object obj81 = global74.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global76);
        java.lang.Object obj82 = global72.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global76);
        int int83 = global76.size();
        boolean boolean85 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global76, "");
        com.google.javascript.rhino.head.Context context86 = null;
        java.lang.String[] strArray89 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        com.google.javascript.rhino.head.commonjs.module.Require require93 = global76.installRequire(context86, (java.util.List<java.lang.String>) strList90, true);
        com.google.javascript.rhino.head.commonjs.module.Require require95 = global29.installRequire(context71, (java.util.List<java.lang.String>) strList90, true);
        // The following exception was thrown during execution in test generation
        try {
            double double96 = com.google.javascript.rhino.head.tools.shell.Global.version(context0, (com.google.javascript.rhino.head.Scriptable) global3, objArray20, (com.google.javascript.rhino.head.Function) require95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(scriptable18);
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(idFunctionObject40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNull(scriptable69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(require93);
        org.junit.Assert.assertNotNull(require95);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        boolean boolean23 = global15.isSealed();
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNull(baseFunction11);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        java.lang.Object obj56 = null;
        java.lang.Object obj57 = global2.getAssociatedValue(obj56);
        boolean boolean58 = global2.isExtensible();
        boolean boolean59 = global2.isSealed();
        com.google.javascript.rhino.head.tools.shell.Global global61 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global63 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        global63.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global65, (int) (short) 10);
        java.lang.Object obj68 = global61.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global63);
        com.google.javascript.rhino.head.Scriptable scriptable69 = global63.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global71 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global73 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global75 = new com.google.javascript.rhino.head.tools.shell.Global();
        global73.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global75, (int) (short) 10);
        java.lang.Object obj78 = global71.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global73);
        boolean boolean80 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global73, "");
        boolean boolean81 = global73.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global82 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable83 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global82);
        java.lang.Object[] objArray84 = global82.getAllIds();
        java.lang.Object obj85 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global73, (java.lang.Object) global82);
        global63.setAttributes((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) global82, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) global2, "", (java.lang.Object) global82, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNull(scriptable69);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(scriptable83);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[]");
        org.junit.Assert.assertNull(obj85);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        global19.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21, (int) (short) 10);
        java.lang.Object obj24 = global17.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19);
        com.google.javascript.rhino.head.Scriptable scriptable25 = global19.getPrototype();
        global11.defineOwnProperty(context15, (java.lang.Object) 'a', (com.google.javascript.rhino.head.ScriptableObject) global19);
        global11.activatePrototypeMap((int) ' ');
        boolean boolean29 = global11.avoidObjectDetection();
        boolean boolean30 = global11.avoidObjectDetection();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(scriptable12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNull(scriptable25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        global50.delete((int) ' ');
        boolean boolean77 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global50, 0);
        java.lang.Object[] objArray78 = global50.getIds();
        boolean boolean79 = global50.hasPrototypeMap();
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
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        boolean boolean39 = global0.isExtensible();
        java.lang.Object obj41 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global0, "function");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        java.lang.Object obj47 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) global27, 0);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins48 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction49 = global27.getBuiltinCtor(builtins48);
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
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNull(baseFunction49);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        global62.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global64, (int) (short) 10);
        java.lang.Object obj67 = global60.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global62);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins68 = null;
        com.google.javascript.rhino.head.Scriptable scriptable69 = global60.getBuiltinPrototype(builtins68);
        com.google.javascript.rhino.head.tools.shell.Global global70 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global72 = new com.google.javascript.rhino.head.tools.shell.Global();
        global70.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global72, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global75 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global77 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global79 = new com.google.javascript.rhino.head.tools.shell.Global();
        global77.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global79, (int) (short) 10);
        java.lang.Object obj82 = global75.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global77);
        boolean boolean84 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global77, "");
        global72.setParentScope((com.google.javascript.rhino.head.Scriptable) global77);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) global72, "hi!");
        boolean boolean88 = global60.hasInstance((com.google.javascript.rhino.head.Scriptable) global72);
        com.google.javascript.rhino.head.Context context89 = null;
        java.lang.String[] strArray90 = global72.getPrompts(context89);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj91 = com.google.javascript.rhino.head.ScriptableObject.callMethod((com.google.javascript.rhino.head.Scriptable) global2, "", (java.lang.Object[]) strArray90);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EcmaError; message: TypeError:  is not a function, it is object.");
        } catch (com.google.javascript.rhino.head.EcmaError e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNull(scriptable58);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNull(scriptable69);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(strArray90);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        global19.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21, (int) (short) 10);
        java.lang.Object obj24 = global17.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19);
        com.google.javascript.rhino.head.Scriptable scriptable25 = global19.getPrototype();
        global11.defineOwnProperty(context15, (java.lang.Object) 'a', (com.google.javascript.rhino.head.ScriptableObject) global19);
        java.lang.Object obj28 = global11.get((java.lang.Object) 100L);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Scriptable scriptable30 = com.google.javascript.rhino.head.TopLevel.getBuiltinPrototype((com.google.javascript.rhino.head.Scriptable) global11, builtins29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(scriptable12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNull(scriptable25);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        global0.setAttributes((int) (byte) -1, (int) (short) 10);
        com.google.javascript.rhino.head.Scriptable scriptable4 = global0.getParentScope();
        org.junit.Assert.assertNull(scriptable4);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        java.lang.Object[] objArray48 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global13);
        com.google.javascript.rhino.head.TopLevel.Builtins builtins49 = null;
        com.google.javascript.rhino.head.Scriptable scriptable50 = global13.getBuiltinPrototype(builtins49);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(scriptable32);
        org.junit.Assert.assertNull(baseFunction34);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(printStream46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNull(scriptable50);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        com.google.javascript.rhino.head.tools.shell.Global global23 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global25 = new com.google.javascript.rhino.head.tools.shell.Global();
        global23.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global25, (int) (short) 10);
        java.lang.Object obj28 = global21.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global23);
        java.lang.Object obj29 = global19.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global23);
        int int30 = global23.size();
        boolean boolean32 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global23, "");
        com.google.javascript.rhino.head.Context context33 = null;
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        com.google.javascript.rhino.head.commonjs.module.Require require40 = global23.installRequire(context33, (java.util.List<java.lang.String>) strList37, true);
        boolean boolean41 = global23.hasPrototypeMap();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        global45.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global47, (int) (short) 10);
        java.lang.Object obj50 = global43.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global45);
        boolean boolean51 = global43.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global57 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global59 = new com.google.javascript.rhino.head.tools.shell.Global();
        global57.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global59, (int) (short) 10);
        java.lang.Object obj62 = global55.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global57);
        java.lang.Object obj63 = global53.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global57);
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) global43, "", obj63, (int) (byte) 10);
        boolean boolean66 = global43.isInitialized();
        boolean boolean68 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global43, "JavaImporter");
        java.lang.Object obj69 = global23.get(8, (com.google.javascript.rhino.head.Scriptable) global43);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) global23, "object", false);
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) global4, "object", (java.lang.Object) "object", (int) (short) 10);
        com.google.javascript.rhino.head.Context context75 = null;
        // The following exception was thrown during execution in test generation
        try {
            global4.initStandardObjects(context75, true);
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
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(require40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(obj69);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable1 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global0);
        com.google.javascript.rhino.head.Scriptable scriptable2 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype(scriptable1);
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global9 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        global11.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global13, (int) (short) 10);
        java.lang.Object obj16 = global9.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global11);
        boolean boolean18 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global11, "");
        global6.setParentScope((com.google.javascript.rhino.head.Scriptable) global11);
        java.io.InputStream inputStream20 = global6.getIn();
        com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable1, (int) (byte) 0, (java.lang.Object) inputStream20);
        org.junit.Assert.assertNotNull(scriptable1);
        org.junit.Assert.assertNull(scriptable2);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(inputStream20);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable3 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global2);
        java.lang.Object[] objArray4 = global2.getAllIds();
        com.google.javascript.rhino.head.tools.shell.Global global5 = new com.google.javascript.rhino.head.tools.shell.Global();
        boolean boolean7 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global5, "");
        global0.put("", (com.google.javascript.rhino.head.Scriptable) global2, (java.lang.Object) boolean7);
        java.io.InputStream inputStream9 = global2.getIn();
        com.google.javascript.rhino.head.tools.shell.Global global11 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global13 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global15 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        global15.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global17, (int) (short) 10);
        java.lang.Object obj20 = global13.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global15);
        java.lang.Object obj21 = global11.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global15);
        int int22 = global15.size();
        boolean boolean24 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global15, "");
        com.google.javascript.rhino.head.Context context25 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        com.google.javascript.rhino.head.commonjs.module.Require require32 = global15.installRequire(context25, (java.util.List<java.lang.String>) strList29, true);
        boolean boolean33 = global15.avoidObjectDetection();
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
        boolean boolean56 = global38.hasPrototypeMap();
        global38.setAttributes("", (int) (byte) 1);
        com.google.javascript.rhino.head.Context context60 = null;
        com.google.javascript.rhino.head.tools.shell.Global global61 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global63 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global65 = new com.google.javascript.rhino.head.tools.shell.Global();
        global63.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global65, (int) (short) 10);
        java.lang.Object obj68 = global61.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global63);
        com.google.javascript.rhino.head.Scriptable scriptable69 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global61);
        com.google.javascript.rhino.head.tools.shell.Global global71 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global73 = new com.google.javascript.rhino.head.tools.shell.Global();
        global71.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global73, (int) (short) 10);
        global73.setAttributes("", (int) (short) 0);
        boolean boolean79 = global61.has((int) (byte) 0, (com.google.javascript.rhino.head.Scriptable) global73);
        int int83 = global38.runDoctest(context60, (com.google.javascript.rhino.head.Scriptable) global61, "object", "hi!", (int) (byte) 0);
        global15.setPrototype((com.google.javascript.rhino.head.Scriptable) global61);
        boolean boolean85 = global61.isEmpty();
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject87 = global2.exportAsJSClass((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) global61, true);
        boolean boolean88 = global61.isSealed();
        org.junit.Assert.assertNotNull(scriptable3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(require32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(require55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNull(scriptable69);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(idFunctionObject87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        com.google.javascript.rhino.head.TopLevel.Builtins builtins21 = null;
        com.google.javascript.rhino.head.Scriptable scriptable22 = global13.getBuiltinPrototype(builtins21);
        boolean boolean23 = global2.has((int) (byte) 0, scriptable22);
        com.google.javascript.rhino.head.tools.shell.Global global24 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global26 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        global26.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global28, (int) (short) 10);
        java.lang.Object obj31 = global24.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global26);
        global24.delete("hi!");
        com.google.javascript.rhino.head.tools.shell.Global global35 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        global35.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global37, (int) (short) 10);
        global37.setAttributes("", (int) (short) 0);
        java.io.InputStream inputStream43 = null;
        global37.setIn(inputStream43);
        java.lang.Object obj45 = global24.get(0, (com.google.javascript.rhino.head.Scriptable) global37);
        com.google.javascript.rhino.head.tools.shell.Global global47 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global49 = new com.google.javascript.rhino.head.tools.shell.Global();
        global47.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global49, (int) (short) 10);
        global49.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable56 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) global49, "hi!");
        com.google.javascript.rhino.head.TopLevel.Builtins builtins57 = null;
        com.google.javascript.rhino.head.BaseFunction baseFunction58 = global49.getBuiltinCtor(builtins57);
        com.google.javascript.rhino.head.tools.shell.Global global60 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global64 = new com.google.javascript.rhino.head.tools.shell.Global();
        global62.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global64, (int) (short) 10);
        java.lang.Object obj67 = global60.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global62);
        boolean boolean68 = global49.has("", (com.google.javascript.rhino.head.Scriptable) global62);
        boolean boolean69 = global49.hasPrototypeMap();
        java.io.PrintStream printStream70 = global49.getErr();
        boolean boolean71 = global37.has("hi!", (com.google.javascript.rhino.head.Scriptable) global49);
        global37.sealObject();
        com.google.javascript.rhino.head.tools.shell.Global global73 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global75 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global77 = new com.google.javascript.rhino.head.tools.shell.Global();
        global75.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global77, (int) (short) 10);
        java.lang.Object obj80 = global73.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global75);
        boolean boolean82 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global75, "");
        com.google.javascript.rhino.head.Context context83 = null;
        com.google.javascript.rhino.head.Scriptable scriptable84 = null;
        java.lang.Object[] objArray90 = new java.lang.Object[] { "hi!", 1L, (-1L), '4', 10.0f };
        com.google.javascript.rhino.head.Function function91 = null;
        com.google.javascript.rhino.head.tools.shell.Global.gc(context83, scriptable84, objArray90, function91);
        java.lang.Object obj93 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global75, (java.lang.Object) scriptable84);
        java.lang.Object obj94 = global2.associateValue((java.lang.Object) global37, (java.lang.Object) global75);
        java.lang.Object[] objArray95 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global75);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertNull(baseFunction11);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(scriptable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNull(scriptable56);
        org.junit.Assert.assertNull(baseFunction58);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(printStream70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray90), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray90), "[hi!, 1, -1, 4, 10.0]");
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(obj94);
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray95), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray95), "[]");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        java.lang.Object[] objArray39 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) global2);
        com.google.javascript.rhino.head.tools.shell.Global global41 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global43 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global45 = new com.google.javascript.rhino.head.tools.shell.Global();
        global43.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global45, (int) (short) 10);
        java.lang.Object obj48 = global41.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global43);
        com.google.javascript.rhino.head.Scriptable scriptable49 = global43.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global51 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global53 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global55 = new com.google.javascript.rhino.head.tools.shell.Global();
        global53.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global55, (int) (short) 10);
        java.lang.Object obj58 = global51.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global53);
        boolean boolean60 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global53, "");
        boolean boolean61 = global53.isExtensible();
        com.google.javascript.rhino.head.tools.shell.Global global62 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable63 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global62);
        java.lang.Object[] objArray64 = global62.getAllIds();
        java.lang.Object obj65 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) global53, (java.lang.Object) global62);
        global43.setAttributes((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) global62, 1);
        boolean boolean68 = global2.has("object", (com.google.javascript.rhino.head.Scriptable) global43);
        java.lang.Object[] objArray69 = global2.getIds();
        com.google.javascript.rhino.head.tools.shell.Global global71 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global73 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global75 = new com.google.javascript.rhino.head.tools.shell.Global();
        global73.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global75, (int) (short) 10);
        java.lang.Object obj78 = global71.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global73);
        com.google.javascript.rhino.head.Scriptable scriptable79 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global71);
        com.google.javascript.rhino.head.Scriptable scriptable80 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global71);
        java.lang.String str81 = global71.getClassName();
        boolean boolean83 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) global71, "JavaImporter");
        java.lang.reflect.Method method84 = null;
        java.lang.reflect.Method method85 = null;
        global2.defineProperty("object", (java.lang.Object) global71, method84, method85, 11);
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
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNull(scriptable49);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(scriptable63);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertNull(scriptable79);
        org.junit.Assert.assertNull(scriptable80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "JavaImporter" + "'", str81, "JavaImporter");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }
}

