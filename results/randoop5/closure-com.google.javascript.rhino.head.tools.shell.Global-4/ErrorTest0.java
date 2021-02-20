import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global2 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global4 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global6 = new com.google.javascript.rhino.head.tools.shell.Global();
        global4.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global6, (int) (short) 10);
        java.lang.Object obj9 = global2.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global4);
        java.lang.Object obj10 = global0.get((int) '#', (com.google.javascript.rhino.head.Scriptable) global4);
        int int11 = global4.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        global4.initPrototypeValue((int) (short) 100, "", (java.lang.Object) 1, 0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.google.javascript.rhino.head.tools.shell.Global global0 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global3 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.Scriptable scriptable4 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) global3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        global0.initPrototypeValue((int) (short) 1, "hi!", (java.lang.Object) global3, 0);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        global2.initPrototypeMethod((java.lang.Object) 100L, (int) (short) 0, "hi!", 100);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
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
        com.google.javascript.rhino.head.tools.shell.Global global27 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global29 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global31 = new com.google.javascript.rhino.head.tools.shell.Global();
        global29.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global31, (int) (short) 10);
        java.lang.Object obj34 = global27.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global29);
        com.google.javascript.rhino.head.Scriptable scriptable35 = global27.getParentScope();
        boolean boolean36 = global27.isSealed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        global11.initPrototypeMethod((java.lang.Object) global27, 2, "hi!", (int) 'a');
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
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
        boolean boolean27 = idFunctionObject26.isSealed();
        com.google.javascript.rhino.head.tools.shell.Global global28 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        global28.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global30, (int) (short) 10);
        global30.setAttributes("", (int) (short) 0);
        com.google.javascript.rhino.head.tools.shell.Global global37 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global39 = new com.google.javascript.rhino.head.tools.shell.Global();
        global37.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global39, (int) (short) 10);
        com.google.javascript.rhino.head.tools.shell.Global global42 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global44 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global46 = new com.google.javascript.rhino.head.tools.shell.Global();
        global44.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global46, (int) (short) 10);
        java.lang.Object obj49 = global42.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global44);
        boolean boolean51 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global44, "");
        global39.setParentScope((com.google.javascript.rhino.head.Scriptable) global44);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject54 = global30.exportAsJSClass((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) global39, false);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) idFunctionObject54, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        idFunctionObject26.initPrototypeConstructor(idFunctionObject54);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
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
        global2.sealObject();
        com.google.javascript.rhino.head.tools.shell.Global global17 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global19 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global21 = new com.google.javascript.rhino.head.tools.shell.Global();
        global19.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global21, (int) (short) 10);
        java.lang.Object obj24 = global17.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global19);
        com.google.javascript.rhino.head.Scriptable scriptable25 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) global17);
        com.google.javascript.rhino.head.Scriptable scriptable26 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) global17);
        java.lang.String str27 = global17.getClassName();
        global17.setAttributes("hi!", 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        global2.initPrototypeMethod((java.lang.Object) 4, 4, "JavaImporter", (int) (byte) 100);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
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
        com.google.javascript.rhino.head.Scriptable scriptable27 = idFunctionObject26.getPrototype();
        com.google.javascript.rhino.head.tools.shell.Global global30 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global32 = new com.google.javascript.rhino.head.tools.shell.Global();
        com.google.javascript.rhino.head.tools.shell.Global global34 = new com.google.javascript.rhino.head.tools.shell.Global();
        global32.setAttributes((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global34, (int) (short) 10);
        java.lang.Object obj37 = global30.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) global32);
        boolean boolean39 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) global32, "");
        boolean boolean40 = global32.isExtensible();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        idFunctionObject26.initPrototypeValue(0, "", (java.lang.Object) global32, (int) (short) -1);
    }
}

