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
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean2 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation0, "hi!");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation4 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean6 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation4, "hi!");
        boolean boolean7 = nativeContinuation0.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeContinuation4);
        boolean boolean9 = nativeContinuation0.isConst("");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation12 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean14 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation12, "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeContinuation0.initPrototypeValue((-1), "", (java.lang.Object) nativeContinuation12, (int) (short) -1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean2 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation0, "hi!");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation3 = new com.google.javascript.rhino.head.NativeContinuation();
        nativeContinuation0.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeContinuation3);
        com.google.javascript.rhino.head.Scriptable scriptable5 = nativeContinuation3.getParentScope();
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation6 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean8 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation6, "hi!");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation10 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean12 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation10, "hi!");
        boolean boolean13 = nativeContinuation6.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeContinuation10);
        java.lang.Object[] objArray14 = nativeContinuation6.getIds();
        com.google.javascript.rhino.head.Scriptable scriptable15 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeContinuation6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeContinuation3.initPrototypeMethod((java.lang.Object) nativeContinuation6, 4, "Continuation", 13);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean2 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation0, "hi!");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation4 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean6 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation4, "hi!");
        boolean boolean7 = nativeContinuation0.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeContinuation4);
        java.lang.Object obj9 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation4, "", obj9);
        boolean boolean12 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation4, "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeContinuation4.initPrototypeValue(0, "", (java.lang.Object) 100.0d, (int) (short) -1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean2 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation0, "hi!");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation3 = new com.google.javascript.rhino.head.NativeContinuation();
        nativeContinuation0.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeContinuation3);
        boolean boolean5 = nativeContinuation0.isEmpty();
        boolean boolean6 = nativeContinuation0.isEmpty();
        nativeContinuation0.delete("Continuation");
        com.google.javascript.rhino.head.Scriptable scriptable9 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeContinuation0);
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation10 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean12 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation10, "hi!");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation14 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean16 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation14, "hi!");
        boolean boolean17 = nativeContinuation10.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeContinuation14);
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation19 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean21 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation19, "hi!");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation23 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean25 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation23, "hi!");
        boolean boolean26 = nativeContinuation19.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeContinuation23);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation23, "Continuation", true);
        boolean boolean30 = nativeContinuation14.has("Continuation", (com.google.javascript.rhino.head.Scriptable) nativeContinuation23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeContinuation0.initPrototypeMethod((java.lang.Object) nativeContinuation23, (int) (byte) 10, "", (int) '#');
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean2 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation0, "hi!");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation4 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean6 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation4, "hi!");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation7 = new com.google.javascript.rhino.head.NativeContinuation();
        nativeContinuation4.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeContinuation7);
        boolean boolean9 = nativeContinuation0.has("", (com.google.javascript.rhino.head.Scriptable) nativeContinuation4);
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation10 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean12 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation10, "hi!");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation13 = new com.google.javascript.rhino.head.NativeContinuation();
        nativeContinuation10.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeContinuation13);
        com.google.javascript.rhino.head.Scriptable scriptable15 = nativeContinuation13.getParentScope();
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation16 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean18 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation16, "hi!");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation20 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean22 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation20, "hi!");
        boolean boolean23 = nativeContinuation16.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeContinuation20);
        java.lang.Object obj24 = nativeContinuation13.get((java.lang.Object) boolean23);
        com.google.javascript.rhino.head.Scriptable scriptable25 = nativeContinuation13.getPrototype();
        java.lang.String str26 = nativeContinuation13.getTypeOf();
        nativeContinuation4.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeContinuation13);
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation30 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean32 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation30, "hi!");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation33 = new com.google.javascript.rhino.head.NativeContinuation();
        nativeContinuation30.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeContinuation33);
        com.google.javascript.rhino.head.Scriptable scriptable35 = nativeContinuation33.getParentScope();
        java.lang.Object obj37 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation33, "Continuation");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation39 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean41 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation39, "hi!");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation43 = new com.google.javascript.rhino.head.NativeContinuation();
        boolean boolean45 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeContinuation43, "hi!");
        boolean boolean46 = nativeContinuation39.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeContinuation43);
        boolean boolean48 = nativeContinuation39.isConst("");
        boolean boolean49 = nativeContinuation39.isEmpty();
        java.lang.Object obj50 = nativeContinuation33.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) nativeContinuation39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeContinuation4.initPrototypeValue(0, "hi!", obj50, 10);
    }
}

