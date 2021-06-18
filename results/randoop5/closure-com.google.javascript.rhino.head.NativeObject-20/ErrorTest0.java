import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        boolean boolean4 = nativeObject0.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection5 = nativeObject0.values();
        com.google.javascript.rhino.head.Scriptable scriptable6 = nativeObject0.getPrototype();
        java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject0, (java.lang.Object) (byte) 10);
        java.lang.Object[] objArray9 = nativeObject0.getIds();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject0.initPrototypeMethod((java.lang.Object) '4', (int) 'a', "Object", 100);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        boolean boolean4 = nativeObject0.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection5 = nativeObject0.values();
        com.google.javascript.rhino.head.Scriptable scriptable6 = nativeObject0.getPrototype();
        com.google.javascript.rhino.head.NativeObject nativeObject8 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean9 = nativeObject8.isExtensible();
        nativeObject8.delete("hi!");
        boolean boolean12 = nativeObject0.has((int) (short) -1, (com.google.javascript.rhino.head.Scriptable) nativeObject8);
        com.google.javascript.rhino.head.Scriptable scriptable13 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject8);
        com.google.javascript.rhino.head.Scriptable scriptable14 = nativeObject8.getParentScope();
        com.google.javascript.rhino.head.NativeObject nativeObject15 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Context context16 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject17 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject18 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject17.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject18);
        boolean boolean21 = nativeObject17.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection22 = nativeObject17.values();
        nativeObject17.sealObject();
        nativeObject15.defineOwnProperties(context16, (com.google.javascript.rhino.head.ScriptableObject) nativeObject17);
        com.google.javascript.rhino.head.NativeObject nativeObject26 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject27 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject26.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject27);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject30 = nativeObject15.exportAsJSClass((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeObject26, true);
        com.google.javascript.rhino.head.NativeObject nativeObject32 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject33 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject32.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject33);
        boolean boolean36 = nativeObject32.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection37 = nativeObject32.values();
        nativeObject32.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject40 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject41 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject40.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject41);
        nativeObject32.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject41, (java.lang.Object) 10.0d);
        boolean boolean46 = nativeObject32.isConst("");
        com.google.javascript.rhino.head.NativeObject nativeObject48 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject49 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject48.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject49);
        boolean boolean52 = nativeObject48.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection53 = nativeObject48.values();
        nativeObject48.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject56 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject57 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject56.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject57);
        nativeObject48.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject57, (java.lang.Object) 10.0d);
        nativeObject32.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject57);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject63 = nativeObject26.exportAsJSClass((int) '4', (com.google.javascript.rhino.head.Scriptable) nativeObject57, false);
        boolean boolean65 = nativeObject57.containsKey((java.lang.Object) (byte) 0);
        com.google.javascript.rhino.head.NativeObject nativeObject67 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable68 = nativeObject67.getPrototype();
        nativeObject67.delete("hi!");
        com.google.javascript.rhino.head.Context context71 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject72 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject73 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject72.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject73);
        com.google.javascript.rhino.head.NativeObject nativeObject76 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject77 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject76.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject77);
        boolean boolean80 = nativeObject76.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection81 = nativeObject76.values();
        com.google.javascript.rhino.head.Scriptable scriptable82 = nativeObject76.getPrototype();
        java.lang.Object obj84 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject76, (java.lang.Object) (byte) 10);
        boolean boolean85 = nativeObject72.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject76);
        nativeObject67.defineOwnProperties(context71, (com.google.javascript.rhino.head.ScriptableObject) nativeObject72);
        java.lang.Object obj87 = nativeObject57.get(8, (com.google.javascript.rhino.head.Scriptable) nativeObject72);
        java.lang.Object obj88 = nativeObject8.getAssociatedValue((java.lang.Object) nativeObject57);
        java.lang.Object obj90 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeObject57, (int) (byte) 0);
        java.util.Collection<java.lang.Object> objCollection91 = nativeObject57.values();
        org.junit.Assert.assertEquals("Contract failed: objCollection91.toArray().length == objCollection91.size()", objCollection91.toArray().length, objCollection91.size());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        com.google.javascript.rhino.head.NativeObject nativeObject6 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject7 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject6.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject7);
        boolean boolean10 = nativeObject6.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection11 = nativeObject6.values();
        com.google.javascript.rhino.head.Scriptable scriptable12 = nativeObject6.getPrototype();
        java.lang.Object obj14 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject6, (java.lang.Object) (byte) 10);
        java.lang.Object[] objArray15 = nativeObject6.getIds();
        boolean boolean16 = nativeObject6.avoidObjectDetection();
        boolean boolean18 = nativeObject6.isConst("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject1.initPrototypeValue((int) '#', "Object", (java.lang.Object) "", (int) (byte) 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        boolean boolean4 = nativeObject0.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection5 = nativeObject0.values();
        com.google.javascript.rhino.head.Scriptable scriptable6 = nativeObject0.getPrototype();
        com.google.javascript.rhino.head.NativeObject nativeObject8 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean9 = nativeObject8.isExtensible();
        nativeObject8.delete("hi!");
        boolean boolean12 = nativeObject0.has((int) (short) -1, (com.google.javascript.rhino.head.Scriptable) nativeObject8);
        com.google.javascript.rhino.head.Scriptable scriptable13 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject8);
        com.google.javascript.rhino.head.Scriptable scriptable14 = nativeObject8.getParentScope();
        com.google.javascript.rhino.head.NativeObject nativeObject15 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Context context16 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject17 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject18 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject17.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject18);
        boolean boolean21 = nativeObject17.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection22 = nativeObject17.values();
        nativeObject17.sealObject();
        nativeObject15.defineOwnProperties(context16, (com.google.javascript.rhino.head.ScriptableObject) nativeObject17);
        com.google.javascript.rhino.head.NativeObject nativeObject26 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject27 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject26.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject27);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject30 = nativeObject15.exportAsJSClass((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeObject26, true);
        com.google.javascript.rhino.head.NativeObject nativeObject32 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject33 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject32.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject33);
        boolean boolean36 = nativeObject32.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection37 = nativeObject32.values();
        nativeObject32.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject40 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject41 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject40.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject41);
        nativeObject32.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject41, (java.lang.Object) 10.0d);
        boolean boolean46 = nativeObject32.isConst("");
        com.google.javascript.rhino.head.NativeObject nativeObject48 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject49 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject48.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject49);
        boolean boolean52 = nativeObject48.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection53 = nativeObject48.values();
        nativeObject48.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject56 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject57 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject56.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject57);
        nativeObject48.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject57, (java.lang.Object) 10.0d);
        nativeObject32.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject57);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject63 = nativeObject26.exportAsJSClass((int) '4', (com.google.javascript.rhino.head.Scriptable) nativeObject57, false);
        boolean boolean65 = nativeObject57.containsKey((java.lang.Object) (byte) 0);
        com.google.javascript.rhino.head.NativeObject nativeObject67 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable68 = nativeObject67.getPrototype();
        nativeObject67.delete("hi!");
        com.google.javascript.rhino.head.Context context71 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject72 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject73 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject72.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject73);
        com.google.javascript.rhino.head.NativeObject nativeObject76 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject77 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject76.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject77);
        boolean boolean80 = nativeObject76.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection81 = nativeObject76.values();
        com.google.javascript.rhino.head.Scriptable scriptable82 = nativeObject76.getPrototype();
        java.lang.Object obj84 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject76, (java.lang.Object) (byte) 10);
        boolean boolean85 = nativeObject72.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject76);
        nativeObject67.defineOwnProperties(context71, (com.google.javascript.rhino.head.ScriptableObject) nativeObject72);
        java.lang.Object obj87 = nativeObject57.get(8, (com.google.javascript.rhino.head.Scriptable) nativeObject72);
        java.lang.Object obj88 = nativeObject8.getAssociatedValue((java.lang.Object) nativeObject57);
        java.lang.Object obj90 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeObject57, (int) (byte) 0);
        java.util.Set<java.lang.Object> objSet91 = nativeObject57.keySet();
        org.junit.Assert.assertEquals("Contract failed: objSet91.toArray().length == objSet91.size()", objSet91.toArray().length, objSet91.size());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        boolean boolean4 = nativeObject0.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection5 = nativeObject0.values();
        com.google.javascript.rhino.head.Scriptable scriptable6 = nativeObject0.getPrototype();
        com.google.javascript.rhino.head.NativeObject nativeObject8 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean9 = nativeObject8.isExtensible();
        nativeObject8.delete("hi!");
        boolean boolean12 = nativeObject0.has((int) (short) -1, (com.google.javascript.rhino.head.Scriptable) nativeObject8);
        com.google.javascript.rhino.head.Scriptable scriptable13 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject8);
        com.google.javascript.rhino.head.Scriptable scriptable14 = nativeObject8.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable15 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject8);
        com.google.javascript.rhino.head.NativeObject nativeObject18 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable19 = nativeObject18.getPrototype();
        nativeObject18.delete("hi!");
        com.google.javascript.rhino.head.NativeObject nativeObject23 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject24 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject23.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject24);
        boolean boolean27 = nativeObject23.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection28 = nativeObject23.values();
        nativeObject23.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject31 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject32 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject31.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject32);
        nativeObject23.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject32, (java.lang.Object) 10.0d);
        com.google.javascript.rhino.head.NativeObject nativeObject36 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable37 = nativeObject36.getPrototype();
        java.lang.Object obj38 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject32, (java.lang.Object) nativeObject36);
        boolean boolean40 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeObject32, 1);
        com.google.javascript.rhino.head.NativeObject nativeObject42 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable43 = nativeObject42.getPrototype();
        com.google.javascript.rhino.head.NativeObject nativeObject44 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject45 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject44.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject45);
        boolean boolean48 = nativeObject44.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection49 = nativeObject44.values();
        com.google.javascript.rhino.head.Scriptable scriptable50 = nativeObject44.getPrototype();
        nativeObject42.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject44);
        boolean boolean52 = nativeObject32.has((int) (short) 10, (com.google.javascript.rhino.head.Scriptable) nativeObject42);
        com.google.javascript.rhino.head.NativeObject nativeObject54 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject55 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject54.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject55);
        boolean boolean58 = nativeObject54.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection59 = nativeObject54.values();
        com.google.javascript.rhino.head.Scriptable scriptable60 = nativeObject54.getPrototype();
        com.google.javascript.rhino.head.NativeObject nativeObject62 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean63 = nativeObject62.isExtensible();
        nativeObject62.delete("hi!");
        boolean boolean66 = nativeObject54.has((int) (short) -1, (com.google.javascript.rhino.head.Scriptable) nativeObject62);
        com.google.javascript.rhino.head.Scriptable scriptable67 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject62);
        java.lang.Object obj68 = nativeObject32.get("Object", (com.google.javascript.rhino.head.Scriptable) nativeObject62);
        com.google.javascript.rhino.head.NativeObject nativeObject69 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject70 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject69.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject70);
        nativeObject18.putConst("Object", (com.google.javascript.rhino.head.Scriptable) nativeObject32, (java.lang.Object) nativeObject70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject8.initPrototypeValue((int) 'a', "", (java.lang.Object) nativeObject32, (-1));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        boolean boolean4 = nativeObject0.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection5 = nativeObject0.values();
        nativeObject0.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject8 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject9 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject8.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject9);
        nativeObject0.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject9, (java.lang.Object) 10.0d);
        boolean boolean14 = nativeObject0.isConst("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject0.initPrototypeMethod((java.lang.Object) 1, (int) '4', "Object", (int) (byte) 10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        boolean boolean4 = nativeObject0.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection5 = nativeObject0.values();
        nativeObject0.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject8 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject9 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject8.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject9);
        nativeObject0.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject9, (java.lang.Object) 10.0d);
        com.google.javascript.rhino.head.NativeObject nativeObject13 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable14 = nativeObject13.getPrototype();
        java.lang.Object obj15 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject9, (java.lang.Object) nativeObject13);
        boolean boolean17 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeObject9, 1);
        com.google.javascript.rhino.head.NativeObject nativeObject19 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable20 = nativeObject19.getPrototype();
        com.google.javascript.rhino.head.NativeObject nativeObject21 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject22 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject21.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject22);
        boolean boolean25 = nativeObject21.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection26 = nativeObject21.values();
        com.google.javascript.rhino.head.Scriptable scriptable27 = nativeObject21.getPrototype();
        nativeObject19.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject21);
        boolean boolean29 = nativeObject9.has((int) (short) 10, (com.google.javascript.rhino.head.Scriptable) nativeObject19);
        com.google.javascript.rhino.head.NativeObject nativeObject31 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable32 = nativeObject31.getPrototype();
        nativeObject31.delete("hi!");
        java.lang.Object[] objArray35 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeObject31);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeObject19, "hi!", (java.lang.Object) objArray35);
        boolean boolean37 = nativeObject19.avoidObjectDetection();
        com.google.javascript.rhino.head.NativeObject nativeObject40 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean41 = nativeObject40.isExtensible();
        nativeObject40.delete("hi!");
        com.google.javascript.rhino.head.NativeObject nativeObject45 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject46 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject45.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject46);
        boolean boolean49 = nativeObject45.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection50 = nativeObject45.values();
        com.google.javascript.rhino.head.Scriptable scriptable51 = nativeObject45.getPrototype();
        java.lang.Object obj53 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject45, (java.lang.Object) (byte) 10);
        com.google.javascript.rhino.head.NativeObject nativeObject54 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject55 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject54.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject55);
        boolean boolean58 = nativeObject54.containsValue((java.lang.Object) 100);
        nativeObject40.put(8, (com.google.javascript.rhino.head.Scriptable) nativeObject45, (java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection60 = nativeObject40.values();
        com.google.javascript.rhino.head.NativeObject nativeObject62 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean63 = nativeObject62.isExtensible();
        nativeObject62.delete("hi!");
        nativeObject40.setAttributes((int) (byte) 0, (com.google.javascript.rhino.head.Scriptable) nativeObject62, 13);
        nativeObject40.sealObject();
        boolean boolean70 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeObject40, 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject19.initPrototypeValue(0, "object", (java.lang.Object) 8, 4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        boolean boolean4 = nativeObject0.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection5 = nativeObject0.values();
        com.google.javascript.rhino.head.Scriptable scriptable6 = nativeObject0.getPrototype();
        com.google.javascript.rhino.head.Scriptable scriptable7 = nativeObject0.getParentScope();
        com.google.javascript.rhino.head.NativeObject nativeObject8 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject9 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject8.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject9);
        boolean boolean12 = nativeObject8.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection13 = nativeObject8.values();
        nativeObject8.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject16 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject17 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject16.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject17);
        nativeObject8.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject17, (java.lang.Object) 10.0d);
        boolean boolean22 = nativeObject8.isConst("");
        com.google.javascript.rhino.head.NativeObject nativeObject24 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject25 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject24.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject25);
        boolean boolean28 = nativeObject24.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection29 = nativeObject24.values();
        nativeObject24.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject32 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject33 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject32.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject33);
        nativeObject24.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject33, (java.lang.Object) 10.0d);
        nativeObject8.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject33);
        boolean boolean38 = nativeObject33.isEmpty();
        boolean boolean40 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeObject33, "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject0.initPrototypeMethod((java.lang.Object) "hi!", 0, "object", 4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject2 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject3 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject2.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject3);
        boolean boolean6 = nativeObject2.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection7 = nativeObject2.values();
        nativeObject2.sealObject();
        nativeObject0.defineOwnProperties(context1, (com.google.javascript.rhino.head.ScriptableObject) nativeObject2);
        com.google.javascript.rhino.head.NativeObject nativeObject11 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject12 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject11.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject12);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject15 = nativeObject0.exportAsJSClass((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeObject11, true);
        com.google.javascript.rhino.head.NativeObject nativeObject17 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject18 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject17.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject18);
        boolean boolean21 = nativeObject17.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection22 = nativeObject17.values();
        nativeObject17.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject25 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject26 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject25.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject26);
        nativeObject17.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject26, (java.lang.Object) 10.0d);
        boolean boolean31 = nativeObject17.isConst("");
        com.google.javascript.rhino.head.NativeObject nativeObject33 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject34 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject33.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject34);
        boolean boolean37 = nativeObject33.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection38 = nativeObject33.values();
        nativeObject33.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject41 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject42 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject41.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject42);
        nativeObject33.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject42, (java.lang.Object) 10.0d);
        nativeObject17.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject42);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject48 = nativeObject11.exportAsJSClass((int) '4', (com.google.javascript.rhino.head.Scriptable) nativeObject42, false);
        boolean boolean50 = nativeObject42.containsKey((java.lang.Object) (byte) 0);
        boolean boolean51 = nativeObject42.isExtensible();
        java.util.Collection<java.lang.Object> objCollection52 = nativeObject42.values();
        org.junit.Assert.assertEquals("Contract failed: objCollection52.toArray().length == objCollection52.size()", objCollection52.toArray().length, objCollection52.size());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        com.google.javascript.rhino.head.NativeObject nativeObject4 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject5 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject4.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject5);
        boolean boolean8 = nativeObject4.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection9 = nativeObject4.values();
        com.google.javascript.rhino.head.Scriptable scriptable10 = nativeObject4.getPrototype();
        java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject4, (java.lang.Object) (byte) 10);
        boolean boolean13 = nativeObject0.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject4);
        boolean boolean14 = nativeObject0.hasPrototypeMap();
        boolean boolean15 = nativeObject0.isEmpty();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeObject0, "hi!", true);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeObject0, "object");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject0.initPrototypeMethod((java.lang.Object) "hi!", 1, "object", (int) (byte) 1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        boolean boolean4 = nativeObject0.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection5 = nativeObject0.values();
        com.google.javascript.rhino.head.Scriptable scriptable6 = nativeObject0.getPrototype();
        java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject0, (java.lang.Object) (byte) 10);
        java.lang.Object[] objArray9 = nativeObject0.getIds();
        com.google.javascript.rhino.head.Scriptable scriptable10 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject0);
        com.google.javascript.rhino.head.NativeObject nativeObject13 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject14 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject13.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject14);
        boolean boolean17 = nativeObject13.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection18 = nativeObject13.values();
        nativeObject13.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject21 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject22 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject21.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject22);
        nativeObject13.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject22, (java.lang.Object) 10.0d);
        com.google.javascript.rhino.head.NativeObject nativeObject26 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable27 = nativeObject26.getPrototype();
        java.lang.Object obj28 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject22, (java.lang.Object) nativeObject26);
        boolean boolean30 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeObject22, 1);
        java.lang.Object[] objArray31 = nativeObject22.getAllIds();
        com.google.javascript.rhino.head.NativeObject nativeObject33 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeObject33, "hi!", (java.lang.Object) 1.0d);
        com.google.javascript.rhino.head.Scriptable scriptable38 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject33, "hi!");
        java.lang.Object obj40 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject33, (java.lang.Object) false);
        boolean boolean41 = nativeObject33.isSealed();
        com.google.javascript.rhino.head.NativeObject nativeObject43 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject44 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject43.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject44);
        boolean boolean47 = nativeObject43.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection48 = nativeObject43.values();
        nativeObject43.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject51 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject52 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject51.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject52);
        nativeObject43.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject52, (java.lang.Object) 10.0d);
        com.google.javascript.rhino.head.NativeObject nativeObject56 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable57 = nativeObject56.getPrototype();
        java.lang.Object obj58 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject52, (java.lang.Object) nativeObject56);
        boolean boolean60 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeObject52, 1);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeObject33, "hi!", (java.lang.Object) nativeObject52);
        nativeObject52.delete((int) (short) 1);
        com.google.javascript.rhino.head.NativeObject nativeObject65 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject66 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject65.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject66);
        boolean boolean69 = nativeObject65.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection70 = nativeObject65.values();
        nativeObject65.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject73 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject74 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject73.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject74);
        nativeObject65.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject74, (java.lang.Object) 10.0d);
        com.google.javascript.rhino.head.NativeObject nativeObject78 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable79 = nativeObject78.getPrototype();
        java.lang.Object obj80 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject74, (java.lang.Object) nativeObject78);
        com.google.javascript.rhino.head.NativeObject nativeObject81 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeObject81, "hi!", (java.lang.Object) 1.0d);
        boolean boolean85 = nativeObject74.hasInstance((com.google.javascript.rhino.head.Scriptable) nativeObject81);
        java.lang.String str86 = nativeObject81.getTypeOf();
        boolean boolean87 = nativeObject52.has((int) (short) -1, (com.google.javascript.rhino.head.Scriptable) nativeObject81);
        boolean boolean88 = nativeObject22.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject0.initPrototypeValue((-1), "Object", (java.lang.Object) "hi!", (int) (byte) -1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeObject0, "hi!", (java.lang.Object) 1.0d);
        com.google.javascript.rhino.head.Scriptable scriptable5 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject0, "hi!");
        java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject0, (java.lang.Object) false);
        com.google.javascript.rhino.head.NativeObject nativeObject9 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject10 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject9.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject10);
        java.lang.Object[] objArray12 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeObject10);
        com.google.javascript.rhino.head.NativeObject nativeObject14 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject15 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject14.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject15);
        com.google.javascript.rhino.head.NativeObject nativeObject18 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject19 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject18.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject19);
        boolean boolean22 = nativeObject18.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection23 = nativeObject18.values();
        com.google.javascript.rhino.head.Scriptable scriptable24 = nativeObject18.getPrototype();
        java.lang.Object obj26 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject18, (java.lang.Object) (byte) 10);
        boolean boolean27 = nativeObject14.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject18);
        com.google.javascript.rhino.head.Scriptable scriptable29 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject18, "hi!");
        nativeObject10.setAttributes("object", (com.google.javascript.rhino.head.Scriptable) nativeObject18, (int) (short) 10);
        nativeObject0.setAttributes("", (com.google.javascript.rhino.head.Scriptable) nativeObject18, 0);
        com.google.javascript.rhino.head.NativeObject nativeObject34 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject35 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject34.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject35);
        boolean boolean38 = nativeObject34.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection39 = nativeObject34.values();
        nativeObject34.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject42 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject43 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject42.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject43);
        nativeObject34.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject43, (java.lang.Object) 10.0d);
        boolean boolean48 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeObject43, 13);
        java.util.Collection<java.lang.Object> objCollection49 = nativeObject43.values();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject0.initPrototypeMethod((java.lang.Object) objCollection49, (int) (short) 0, "object", (int) 'a');
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        boolean boolean4 = nativeObject0.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection5 = nativeObject0.values();
        nativeObject0.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject8 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject9 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject8.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject9);
        nativeObject0.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject9, (java.lang.Object) 10.0d);
        boolean boolean14 = nativeObject0.isConst("");
        com.google.javascript.rhino.head.NativeObject nativeObject16 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject17 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject16.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject17);
        boolean boolean20 = nativeObject16.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection21 = nativeObject16.values();
        nativeObject16.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject24 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject25 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject24.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject25);
        nativeObject16.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject25, (java.lang.Object) 10.0d);
        nativeObject0.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject25);
        com.google.javascript.rhino.head.NativeObject nativeObject32 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean33 = nativeObject32.isExtensible();
        nativeObject32.delete("hi!");
        com.google.javascript.rhino.head.NativeObject nativeObject37 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject38 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject37.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject38);
        boolean boolean41 = nativeObject37.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection42 = nativeObject37.values();
        com.google.javascript.rhino.head.Scriptable scriptable43 = nativeObject37.getPrototype();
        java.lang.Object obj45 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject37, (java.lang.Object) (byte) 10);
        com.google.javascript.rhino.head.NativeObject nativeObject46 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject47 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject46.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject47);
        boolean boolean50 = nativeObject46.containsValue((java.lang.Object) 100);
        nativeObject32.put(8, (com.google.javascript.rhino.head.Scriptable) nativeObject37, (java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection52 = nativeObject32.values();
        com.google.javascript.rhino.head.NativeObject nativeObject54 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean55 = nativeObject54.isExtensible();
        nativeObject54.delete("hi!");
        nativeObject32.setAttributes((int) (byte) 0, (com.google.javascript.rhino.head.Scriptable) nativeObject54, 13);
        com.google.javascript.rhino.head.NativeObject nativeObject61 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject62 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject61.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject62);
        boolean boolean65 = nativeObject61.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection66 = nativeObject61.values();
        com.google.javascript.rhino.head.Scriptable scriptable67 = nativeObject61.getPrototype();
        java.lang.Object obj69 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject61, (java.lang.Object) (byte) 10);
        com.google.javascript.rhino.head.NativeObject nativeObject70 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject71 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject70.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject71);
        java.util.Set<java.lang.Object> objSet73 = nativeObject71.keySet();
        nativeObject71.setAttributes("hi!", 5);
        boolean boolean78 = nativeObject71.containsValue((java.lang.Object) 100.0d);
        nativeObject54.putConst("Object", (com.google.javascript.rhino.head.Scriptable) nativeObject61, (java.lang.Object) nativeObject71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject25.initPrototypeValue(2, "", (java.lang.Object) nativeObject54, (int) (short) 100);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        com.google.javascript.rhino.head.NativeObject nativeObject4 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject5 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject4.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject5);
        boolean boolean8 = nativeObject4.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection9 = nativeObject4.values();
        com.google.javascript.rhino.head.Scriptable scriptable10 = nativeObject4.getPrototype();
        java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject4, (java.lang.Object) (byte) 10);
        boolean boolean13 = nativeObject0.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject4);
        com.google.javascript.rhino.head.Scriptable scriptable14 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject4);
        com.google.javascript.rhino.head.NativeObject nativeObject15 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject16 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject15.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject16);
        boolean boolean19 = nativeObject15.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection20 = nativeObject15.values();
        com.google.javascript.rhino.head.Scriptable scriptable21 = nativeObject15.getPrototype();
        com.google.javascript.rhino.head.NativeObject nativeObject23 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean24 = nativeObject23.isExtensible();
        nativeObject23.delete("hi!");
        boolean boolean27 = nativeObject15.has((int) (short) -1, (com.google.javascript.rhino.head.Scriptable) nativeObject23);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeObject15, "[object Object]", true);
        boolean boolean31 = nativeObject15.isSealed();
        nativeObject4.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeObject15);
        com.google.javascript.rhino.head.Scriptable scriptable33 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject4);
        nativeObject4.preventExtensions();
        com.google.javascript.rhino.head.NativeObject nativeObject35 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject36 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject35.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject36);
        com.google.javascript.rhino.head.NativeObject nativeObject39 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject40 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject39.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject40);
        boolean boolean43 = nativeObject39.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection44 = nativeObject39.values();
        com.google.javascript.rhino.head.Scriptable scriptable45 = nativeObject39.getPrototype();
        java.lang.Object obj47 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject39, (java.lang.Object) (byte) 10);
        boolean boolean48 = nativeObject35.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject39);
        com.google.javascript.rhino.head.Scriptable scriptable50 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject39, "hi!");
        nativeObject39.setAttributes("object", (int) (byte) 10);
        java.lang.Object obj54 = nativeObject4.remove((java.lang.Object) nativeObject39);
        java.util.Set<java.lang.Object> objSet55 = nativeObject39.keySet();
        org.junit.Assert.assertEquals("Contract failed: objSet55.toArray().length == objSet55.size()", objSet55.toArray().length, objSet55.size());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeObject0, "hi!", (java.lang.Object) 1.0d);
        com.google.javascript.rhino.head.Scriptable scriptable5 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject0, "hi!");
        java.lang.Object[] objArray6 = nativeObject0.getAllIds();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet7 = nativeObject0.entrySet();
        com.google.javascript.rhino.head.NativeObject nativeObject8 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject9 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject8.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject9);
        java.lang.Object[] objArray11 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeObject9);
        com.google.javascript.rhino.head.NativeObject nativeObject13 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject14 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject13.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject14);
        com.google.javascript.rhino.head.NativeObject nativeObject17 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject18 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject17.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject18);
        boolean boolean21 = nativeObject17.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection22 = nativeObject17.values();
        com.google.javascript.rhino.head.Scriptable scriptable23 = nativeObject17.getPrototype();
        java.lang.Object obj25 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject17, (java.lang.Object) (byte) 10);
        boolean boolean26 = nativeObject13.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject17);
        com.google.javascript.rhino.head.Scriptable scriptable28 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject17, "hi!");
        nativeObject9.setAttributes("object", (com.google.javascript.rhino.head.Scriptable) nativeObject17, (int) (short) 10);
        com.google.javascript.rhino.head.Scriptable scriptable31 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeObject9);
        nativeObject9.activatePrototypeMap(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject0.initPrototypeMethod((java.lang.Object) nativeObject9, (int) (short) 10, "object", 100);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        com.google.javascript.rhino.head.Scriptable scriptable3 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject0);
        com.google.javascript.rhino.head.NativeObject nativeObject5 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.defineProperty("", (java.lang.Object) nativeObject5, (int) (short) 0);
        com.google.javascript.rhino.head.NativeObject nativeObject8 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject9 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject8.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject9);
        boolean boolean12 = nativeObject8.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection13 = nativeObject8.values();
        com.google.javascript.rhino.head.Scriptable scriptable14 = nativeObject8.getPrototype();
        java.lang.Object obj16 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject8, (java.lang.Object) (byte) 10);
        java.lang.Object[] objArray17 = nativeObject8.getIds();
        boolean boolean18 = nativeObject8.avoidObjectDetection();
        java.lang.Object obj19 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject5, (java.lang.Object) boolean18);
        com.google.javascript.rhino.head.Scriptable scriptable20 = nativeObject5.getPrototype();
        com.google.javascript.rhino.head.NativeObject nativeObject23 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject24 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject23.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject24);
        boolean boolean27 = nativeObject23.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection28 = nativeObject23.values();
        nativeObject23.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject31 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject32 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject31.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject32);
        nativeObject23.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject32, (java.lang.Object) 10.0d);
        boolean boolean37 = nativeObject23.isConst("");
        com.google.javascript.rhino.head.NativeObject nativeObject39 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject40 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject39.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject40);
        boolean boolean43 = nativeObject39.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection44 = nativeObject39.values();
        nativeObject39.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject47 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject48 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject47.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject48);
        nativeObject39.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject48, (java.lang.Object) 10.0d);
        nativeObject23.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject5.initPrototypeValue((int) (byte) 10, "Object", (java.lang.Object) nativeObject23, 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        boolean boolean4 = nativeObject0.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection5 = nativeObject0.values();
        nativeObject0.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject8 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject9 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject8.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject9);
        nativeObject0.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject9, (java.lang.Object) 10.0d);
        boolean boolean14 = nativeObject0.isConst("");
        com.google.javascript.rhino.head.NativeObject nativeObject16 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject17 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject16.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject17);
        boolean boolean20 = nativeObject16.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection21 = nativeObject16.values();
        nativeObject16.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject24 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject25 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject24.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject25);
        nativeObject16.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject25, (java.lang.Object) 10.0d);
        nativeObject0.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject25);
        com.google.javascript.rhino.head.NativeObject nativeObject32 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject33 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject32.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject33);
        boolean boolean36 = nativeObject32.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection37 = nativeObject32.values();
        com.google.javascript.rhino.head.Scriptable scriptable38 = nativeObject32.getPrototype();
        java.lang.Object obj40 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject32, (java.lang.Object) (byte) 10);
        java.lang.Object[] objArray41 = nativeObject32.getIds();
        boolean boolean42 = nativeObject32.avoidObjectDetection();
        boolean boolean44 = nativeObject32.isConst("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject0.initPrototypeValue((int) (byte) 1, "Object", (java.lang.Object) "", (int) ' ');
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeObject1, "object");
        java.lang.String str5 = nativeObject1.getClassName();
        com.google.javascript.rhino.head.Context context6 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject7 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject8 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject7.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject8);
        boolean boolean11 = nativeObject7.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection12 = nativeObject7.values();
        com.google.javascript.rhino.head.Scriptable scriptable13 = nativeObject7.getPrototype();
        com.google.javascript.rhino.head.NativeObject nativeObject15 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean16 = nativeObject15.isExtensible();
        nativeObject15.delete("hi!");
        boolean boolean19 = nativeObject7.has((int) (short) -1, (com.google.javascript.rhino.head.Scriptable) nativeObject15);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeObject15, "hi!", false);
        com.google.javascript.rhino.head.Context context23 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject24 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean25 = nativeObject24.isExtensible();
        nativeObject24.delete("hi!");
        com.google.javascript.rhino.head.NativeObject nativeObject29 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject30 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject29.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject30);
        boolean boolean33 = nativeObject29.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection34 = nativeObject29.values();
        com.google.javascript.rhino.head.Scriptable scriptable35 = nativeObject29.getPrototype();
        java.lang.Object obj37 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject29, (java.lang.Object) (byte) 10);
        com.google.javascript.rhino.head.NativeObject nativeObject38 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject39 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject38.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject39);
        boolean boolean42 = nativeObject38.containsValue((java.lang.Object) 100);
        nativeObject24.put(8, (com.google.javascript.rhino.head.Scriptable) nativeObject29, (java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection44 = nativeObject24.values();
        nativeObject15.defineOwnProperties(context23, (com.google.javascript.rhino.head.ScriptableObject) nativeObject24);
        com.google.javascript.rhino.head.NativeObject nativeObject46 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject47 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject46.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject47);
        boolean boolean50 = nativeObject46.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection51 = nativeObject46.values();
        nativeObject46.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject54 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject55 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject54.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject55);
        nativeObject46.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject55, (java.lang.Object) 10.0d);
        com.google.javascript.rhino.head.Scriptable scriptable59 = nativeObject46.getPrototype();
        nativeObject1.defineOwnProperty(context6, (java.lang.Object) context23, (com.google.javascript.rhino.head.ScriptableObject) nativeObject46);
        java.util.Set<java.lang.Object> objSet61 = nativeObject1.keySet();
        org.junit.Assert.assertEquals("Contract failed: objSet61.toArray().length == objSet61.size()", objSet61.toArray().length, objSet61.size());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        com.google.javascript.rhino.head.NativeObject nativeObject4 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject5 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject4.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject5);
        boolean boolean8 = nativeObject4.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection9 = nativeObject4.values();
        com.google.javascript.rhino.head.Scriptable scriptable10 = nativeObject4.getPrototype();
        java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject4, (java.lang.Object) (byte) 10);
        boolean boolean13 = nativeObject0.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject4);
        com.google.javascript.rhino.head.Scriptable scriptable14 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject4);
        nativeObject4.sealObject();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeObject4, "hi!", true);
        boolean boolean20 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeObject4, "object");
        com.google.javascript.rhino.head.NativeObject nativeObject21 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject22 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject21.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject22);
        boolean boolean25 = nativeObject21.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection26 = nativeObject21.values();
        com.google.javascript.rhino.head.Scriptable scriptable27 = nativeObject21.getPrototype();
        com.google.javascript.rhino.head.NativeObject nativeObject29 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean30 = nativeObject29.isExtensible();
        nativeObject29.delete("hi!");
        boolean boolean33 = nativeObject21.has((int) (short) -1, (com.google.javascript.rhino.head.Scriptable) nativeObject29);
        com.google.javascript.rhino.head.Scriptable scriptable34 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject29);
        com.google.javascript.rhino.head.Scriptable scriptable35 = nativeObject29.getParentScope();
        java.lang.Object[] objArray36 = nativeObject29.getIds();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject4.initPrototypeMethod((java.lang.Object) objArray36, 10, "hi!", (int) '#');
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        com.google.javascript.rhino.head.NativeObject nativeObject4 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject5 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject4.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject5);
        boolean boolean8 = nativeObject4.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection9 = nativeObject4.values();
        com.google.javascript.rhino.head.Scriptable scriptable10 = nativeObject4.getPrototype();
        java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject4, (java.lang.Object) (byte) 10);
        boolean boolean13 = nativeObject0.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject4);
        com.google.javascript.rhino.head.Scriptable scriptable15 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject4, "hi!");
        nativeObject4.setAttributes("object", (int) (byte) 10);
        com.google.javascript.rhino.head.Scriptable scriptable19 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject4);
        boolean boolean20 = nativeObject4.isExtensible();
        java.lang.Object[] objArray21 = nativeObject4.getAllIds();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet22 = nativeObject4.entrySet();
        org.junit.Assert.assertEquals("Contract failed: objEntrySet22.toArray().length == objEntrySet22.size()", objEntrySet22.toArray().length, objEntrySet22.size());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        boolean boolean4 = nativeObject0.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection5 = nativeObject0.values();
        com.google.javascript.rhino.head.Scriptable scriptable6 = nativeObject0.getPrototype();
        com.google.javascript.rhino.head.NativeObject nativeObject8 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean9 = nativeObject8.isExtensible();
        nativeObject8.delete("hi!");
        boolean boolean12 = nativeObject0.has((int) (short) -1, (com.google.javascript.rhino.head.Scriptable) nativeObject8);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeObject0, "Object", false);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeObject0, "[object Object]");
        com.google.javascript.rhino.head.NativeObject nativeObject18 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject19 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject18.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject19);
        java.lang.String str21 = nativeObject18.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject0.initPrototypeMethod((java.lang.Object) str21, 8, "", 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean1 = nativeObject0.isExtensible();
        nativeObject0.delete("hi!");
        com.google.javascript.rhino.head.NativeObject nativeObject5 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject6 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject5.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject6);
        boolean boolean9 = nativeObject5.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection10 = nativeObject5.values();
        com.google.javascript.rhino.head.Scriptable scriptable11 = nativeObject5.getPrototype();
        java.lang.Object obj13 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject5, (java.lang.Object) (byte) 10);
        com.google.javascript.rhino.head.NativeObject nativeObject14 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject15 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject14.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject15);
        boolean boolean18 = nativeObject14.containsValue((java.lang.Object) 100);
        nativeObject0.put(8, (com.google.javascript.rhino.head.Scriptable) nativeObject5, (java.lang.Object) 100);
        com.google.javascript.rhino.head.NativeObject nativeObject21 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject22 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject21.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject22);
        boolean boolean25 = nativeObject21.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection26 = nativeObject21.values();
        com.google.javascript.rhino.head.Scriptable scriptable27 = nativeObject21.getPrototype();
        com.google.javascript.rhino.head.NativeObject nativeObject29 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean30 = nativeObject29.isExtensible();
        nativeObject29.delete("hi!");
        boolean boolean33 = nativeObject21.has((int) (short) -1, (com.google.javascript.rhino.head.Scriptable) nativeObject29);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeObject21, "[object Object]", true);
        boolean boolean38 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeObject21, "Object");
        nativeObject5.defineProperty("hi!", (java.lang.Object) boolean38, 5);
        com.google.javascript.rhino.head.NativeObject nativeObject42 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject5.defineProperty("object", (java.lang.Object) nativeObject42, (int) (short) 10);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet45 = nativeObject5.entrySet();
        org.junit.Assert.assertEquals("Contract failed: objEntrySet45.toArray().length == objEntrySet45.size()", objEntrySet45.toArray().length, objEntrySet45.size());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject2 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject3 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject2.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject3);
        boolean boolean6 = nativeObject2.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection7 = nativeObject2.values();
        nativeObject2.sealObject();
        nativeObject0.defineOwnProperties(context1, (com.google.javascript.rhino.head.ScriptableObject) nativeObject2);
        com.google.javascript.rhino.head.NativeObject nativeObject11 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject12 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject11.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject12);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject15 = nativeObject0.exportAsJSClass((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeObject11, true);
        java.lang.Object[] objArray16 = nativeObject11.getIds();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet17 = nativeObject11.entrySet();
        org.junit.Assert.assertEquals("Contract failed: objEntrySet17.toArray().length == objEntrySet17.size()", objEntrySet17.toArray().length, objEntrySet17.size());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable1 = nativeObject0.getPrototype();
        nativeObject0.delete("hi!");
        com.google.javascript.rhino.head.Context context4 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject5 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject6 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject5.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject6);
        com.google.javascript.rhino.head.NativeObject nativeObject9 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject10 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject9.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject10);
        boolean boolean13 = nativeObject9.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection14 = nativeObject9.values();
        com.google.javascript.rhino.head.Scriptable scriptable15 = nativeObject9.getPrototype();
        java.lang.Object obj17 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject9, (java.lang.Object) (byte) 10);
        boolean boolean18 = nativeObject5.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject9);
        nativeObject0.defineOwnProperties(context4, (com.google.javascript.rhino.head.ScriptableObject) nativeObject5);
        com.google.javascript.rhino.head.NativeObject nativeObject20 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Context context21 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject22 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject23 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject22.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject23);
        boolean boolean26 = nativeObject22.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection27 = nativeObject22.values();
        nativeObject22.sealObject();
        nativeObject20.defineOwnProperties(context21, (com.google.javascript.rhino.head.ScriptableObject) nativeObject22);
        com.google.javascript.rhino.head.NativeObject nativeObject31 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject32 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject31.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject32);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject35 = nativeObject20.exportAsJSClass((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeObject31, true);
        nativeObject0.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeObject31);
        com.google.javascript.rhino.head.NativeObject nativeObject37 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable38 = nativeObject37.getPrototype();
        nativeObject37.delete("hi!");
        com.google.javascript.rhino.head.Context context41 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject42 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject43 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject42.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject43);
        com.google.javascript.rhino.head.NativeObject nativeObject46 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject47 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject46.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject47);
        boolean boolean50 = nativeObject46.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection51 = nativeObject46.values();
        com.google.javascript.rhino.head.Scriptable scriptable52 = nativeObject46.getPrototype();
        java.lang.Object obj54 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject46, (java.lang.Object) (byte) 10);
        boolean boolean55 = nativeObject42.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject46);
        nativeObject37.defineOwnProperties(context41, (com.google.javascript.rhino.head.ScriptableObject) nativeObject42);
        com.google.javascript.rhino.head.NativeObject nativeObject57 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Context context58 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject59 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject60 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject59.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject60);
        boolean boolean63 = nativeObject59.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection64 = nativeObject59.values();
        nativeObject59.sealObject();
        nativeObject57.defineOwnProperties(context58, (com.google.javascript.rhino.head.ScriptableObject) nativeObject59);
        com.google.javascript.rhino.head.NativeObject nativeObject68 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject69 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject68.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject69);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject72 = nativeObject57.exportAsJSClass((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeObject68, true);
        nativeObject37.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeObject68);
        java.lang.Object obj74 = nativeObject31.get((java.lang.Object) nativeObject37);
        boolean boolean75 = nativeObject31.isEmpty();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet76 = nativeObject31.entrySet();
        org.junit.Assert.assertEquals("Contract failed: objEntrySet76.toArray().length == objEntrySet76.size()", objEntrySet76.toArray().length, objEntrySet76.size());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject2 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject3 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject2.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject3);
        boolean boolean6 = nativeObject2.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection7 = nativeObject2.values();
        nativeObject2.sealObject();
        nativeObject0.defineOwnProperties(context1, (com.google.javascript.rhino.head.ScriptableObject) nativeObject2);
        com.google.javascript.rhino.head.NativeObject nativeObject11 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject12 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject11.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject12);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject15 = nativeObject0.exportAsJSClass((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeObject11, true);
        com.google.javascript.rhino.head.NativeObject nativeObject17 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject18 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject17.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject18);
        boolean boolean21 = nativeObject17.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection22 = nativeObject17.values();
        nativeObject17.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject25 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject26 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject25.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject26);
        nativeObject17.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject26, (java.lang.Object) 10.0d);
        boolean boolean31 = nativeObject17.isConst("");
        com.google.javascript.rhino.head.NativeObject nativeObject33 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject34 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject33.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject34);
        boolean boolean37 = nativeObject33.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection38 = nativeObject33.values();
        nativeObject33.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject41 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject42 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject41.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject42);
        nativeObject33.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject42, (java.lang.Object) 10.0d);
        nativeObject17.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject42);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject48 = nativeObject11.exportAsJSClass((int) '4', (com.google.javascript.rhino.head.Scriptable) nativeObject42, false);
        boolean boolean50 = nativeObject42.containsKey((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray51 = nativeObject42.getIds();
        java.util.Set<java.lang.Object> objSet52 = nativeObject42.keySet();
        org.junit.Assert.assertEquals("Contract failed: objSet52.toArray().length == objSet52.size()", objSet52.toArray().length, objSet52.size());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject2 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject3 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject2.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject3);
        boolean boolean6 = nativeObject2.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection7 = nativeObject2.values();
        nativeObject2.sealObject();
        nativeObject0.defineOwnProperties(context1, (com.google.javascript.rhino.head.ScriptableObject) nativeObject2);
        com.google.javascript.rhino.head.NativeObject nativeObject11 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject12 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject11.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject12);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject15 = nativeObject0.exportAsJSClass((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeObject11, true);
        com.google.javascript.rhino.head.NativeObject nativeObject17 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject18 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject17.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject18);
        boolean boolean21 = nativeObject17.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection22 = nativeObject17.values();
        nativeObject17.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject25 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject26 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject25.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject26);
        nativeObject17.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject26, (java.lang.Object) 10.0d);
        boolean boolean31 = nativeObject17.isConst("");
        com.google.javascript.rhino.head.NativeObject nativeObject33 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject34 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject33.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject34);
        boolean boolean37 = nativeObject33.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection38 = nativeObject33.values();
        nativeObject33.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject41 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject42 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject41.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject42);
        nativeObject33.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject42, (java.lang.Object) 10.0d);
        nativeObject17.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject42);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject48 = nativeObject11.exportAsJSClass((int) '4', (com.google.javascript.rhino.head.Scriptable) nativeObject42, false);
        java.lang.String str49 = nativeObject42.getTypeOf();
        java.util.Set<java.lang.Object> objSet50 = nativeObject42.keySet();
        org.junit.Assert.assertEquals("Contract failed: objSet50.toArray().length == objSet50.size()", objSet50.toArray().length, objSet50.size());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject2 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject3 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject2.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject3);
        boolean boolean6 = nativeObject2.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection7 = nativeObject2.values();
        nativeObject2.sealObject();
        nativeObject0.defineOwnProperties(context1, (com.google.javascript.rhino.head.ScriptableObject) nativeObject2);
        com.google.javascript.rhino.head.NativeObject nativeObject11 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject12 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject11.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject12);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject15 = nativeObject0.exportAsJSClass((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeObject11, true);
        java.lang.Object[] objArray16 = nativeObject11.getIds();
        java.util.Collection<java.lang.Object> objCollection17 = nativeObject11.values();
        org.junit.Assert.assertEquals("Contract failed: objCollection17.toArray().length == objCollection17.size()", objCollection17.toArray().length, objCollection17.size());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        com.google.javascript.rhino.head.NativeObject nativeObject4 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject5 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject4.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject5);
        boolean boolean8 = nativeObject4.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection9 = nativeObject4.values();
        com.google.javascript.rhino.head.Scriptable scriptable10 = nativeObject4.getPrototype();
        java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject4, (java.lang.Object) (byte) 10);
        boolean boolean13 = nativeObject0.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject4);
        com.google.javascript.rhino.head.Scriptable scriptable15 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject4, "hi!");
        nativeObject4.setAttributes("object", (int) (byte) 10);
        com.google.javascript.rhino.head.Scriptable scriptable19 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject4);
        boolean boolean20 = nativeObject4.isExtensible();
        java.lang.Object obj22 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeObject4, (int) (short) 0);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet23 = nativeObject4.entrySet();
        org.junit.Assert.assertEquals("Contract failed: objEntrySet23.toArray().length == objEntrySet23.size()", objEntrySet23.toArray().length, objEntrySet23.size());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        com.google.javascript.rhino.head.NativeObject nativeObject4 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject5 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject4.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject5);
        boolean boolean8 = nativeObject4.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection9 = nativeObject4.values();
        com.google.javascript.rhino.head.Scriptable scriptable10 = nativeObject4.getPrototype();
        com.google.javascript.rhino.head.NativeObject nativeObject12 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean13 = nativeObject12.isExtensible();
        nativeObject12.delete("hi!");
        boolean boolean16 = nativeObject4.has((int) (short) -1, (com.google.javascript.rhino.head.Scriptable) nativeObject12);
        com.google.javascript.rhino.head.Scriptable scriptable17 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject12);
        com.google.javascript.rhino.head.Scriptable scriptable18 = nativeObject12.getParentScope();
        com.google.javascript.rhino.head.NativeObject nativeObject19 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Context context20 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject21 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject22 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject21.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject22);
        boolean boolean25 = nativeObject21.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection26 = nativeObject21.values();
        nativeObject21.sealObject();
        nativeObject19.defineOwnProperties(context20, (com.google.javascript.rhino.head.ScriptableObject) nativeObject21);
        com.google.javascript.rhino.head.NativeObject nativeObject30 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject31 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject30.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject31);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject34 = nativeObject19.exportAsJSClass((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeObject30, true);
        com.google.javascript.rhino.head.NativeObject nativeObject36 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject37 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject36.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject37);
        boolean boolean40 = nativeObject36.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection41 = nativeObject36.values();
        nativeObject36.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject44 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject45 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject44.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject45);
        nativeObject36.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject45, (java.lang.Object) 10.0d);
        boolean boolean50 = nativeObject36.isConst("");
        com.google.javascript.rhino.head.NativeObject nativeObject52 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject53 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject52.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject53);
        boolean boolean56 = nativeObject52.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection57 = nativeObject52.values();
        nativeObject52.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject60 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject61 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject60.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject61);
        nativeObject52.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject61, (java.lang.Object) 10.0d);
        nativeObject36.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject61);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject67 = nativeObject30.exportAsJSClass((int) '4', (com.google.javascript.rhino.head.Scriptable) nativeObject61, false);
        boolean boolean69 = nativeObject61.containsKey((java.lang.Object) (byte) 0);
        com.google.javascript.rhino.head.NativeObject nativeObject71 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable72 = nativeObject71.getPrototype();
        nativeObject71.delete("hi!");
        com.google.javascript.rhino.head.Context context75 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject76 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject77 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject76.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject77);
        com.google.javascript.rhino.head.NativeObject nativeObject80 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject81 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject80.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject81);
        boolean boolean84 = nativeObject80.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection85 = nativeObject80.values();
        com.google.javascript.rhino.head.Scriptable scriptable86 = nativeObject80.getPrototype();
        java.lang.Object obj88 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject80, (java.lang.Object) (byte) 10);
        boolean boolean89 = nativeObject76.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject80);
        nativeObject71.defineOwnProperties(context75, (com.google.javascript.rhino.head.ScriptableObject) nativeObject76);
        java.lang.Object obj91 = nativeObject61.get(8, (com.google.javascript.rhino.head.Scriptable) nativeObject76);
        java.lang.Object obj92 = nativeObject12.getAssociatedValue((java.lang.Object) nativeObject61);
        java.lang.Object obj94 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeObject61, "hi!");
        boolean boolean95 = nativeObject1.has((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) nativeObject61);
        java.util.Set<java.lang.Object> objSet96 = nativeObject61.keySet();
        org.junit.Assert.assertEquals("Contract failed: objSet96.toArray().length == objSet96.size()", objSet96.toArray().length, objSet96.size());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        java.lang.String str1 = nativeObject0.toString();
        boolean boolean3 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeObject0, "hi!");
        com.google.javascript.rhino.head.NativeObject nativeObject4 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject5 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject4.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject5);
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeObject5);
        java.lang.Object obj8 = nativeObject0.remove((java.lang.Object) objArray7);
        com.google.javascript.rhino.head.NativeObject nativeObject11 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeObject11, "hi!", (java.lang.Object) 1.0d);
        java.lang.String str15 = nativeObject11.toString();
        int int16 = nativeObject11.size();
        com.google.javascript.rhino.head.NativeObject nativeObject18 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject19 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject18.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject19);
        int int21 = nativeObject18.size();
        com.google.javascript.rhino.head.Scriptable scriptable22 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject18);
        int int23 = nativeObject18.size();
        boolean boolean24 = nativeObject18.isEmpty();
        com.google.javascript.rhino.head.NativeObject nativeObject25 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject26 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject25.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject26);
        boolean boolean29 = nativeObject25.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection30 = nativeObject25.values();
        com.google.javascript.rhino.head.Scriptable scriptable31 = nativeObject25.getPrototype();
        java.lang.Object obj33 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject25, (java.lang.Object) (byte) 10);
        boolean boolean34 = nativeObject25.isSealed();
        java.lang.Object[] objArray35 = nativeObject25.getAllIds();
        nativeObject25.delete("[object Object]");
        nativeObject25.activatePrototypeMap((int) (byte) 100);
        nativeObject11.put("[object Object]", (com.google.javascript.rhino.head.Scriptable) nativeObject18, (java.lang.Object) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject0.initPrototypeValue(8, "Object", (java.lang.Object) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean1 = nativeObject0.isExtensible();
        com.google.javascript.rhino.head.NativeObject nativeObject4 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject5 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject4.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject5);
        boolean boolean8 = nativeObject4.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection9 = nativeObject4.values();
        nativeObject4.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject12 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject13 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject12.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject13);
        nativeObject4.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject13, (java.lang.Object) 10.0d);
        com.google.javascript.rhino.head.NativeObject nativeObject17 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable18 = nativeObject17.getPrototype();
        java.lang.Object obj19 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject13, (java.lang.Object) nativeObject17);
        boolean boolean21 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeObject13, 1);
        boolean boolean22 = nativeObject13.isSealed();
        boolean boolean23 = nativeObject13.isEmpty();
        nativeObject13.delete((int) (byte) 10);
        nativeObject13.delete("[object Object]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject0.initPrototypeValue((int) (short) -1, "hi!", (java.lang.Object) "[object Object]", (-1));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        boolean boolean4 = nativeObject0.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection5 = nativeObject0.values();
        nativeObject0.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject8 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject9 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject8.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject9);
        nativeObject0.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject9, (java.lang.Object) 10.0d);
        com.google.javascript.rhino.head.NativeObject nativeObject13 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable14 = nativeObject13.getPrototype();
        java.lang.Object obj15 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject9, (java.lang.Object) nativeObject13);
        boolean boolean16 = nativeObject9.isEmpty();
        com.google.javascript.rhino.head.NativeObject nativeObject17 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject18 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject17.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject18);
        boolean boolean21 = nativeObject17.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection22 = nativeObject17.values();
        nativeObject17.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject25 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject26 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject25.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject26);
        nativeObject17.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject26, (java.lang.Object) 10.0d);
        com.google.javascript.rhino.head.NativeObject nativeObject30 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable31 = nativeObject30.getPrototype();
        java.lang.Object obj32 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject26, (java.lang.Object) nativeObject30);
        boolean boolean34 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeObject26, 1);
        com.google.javascript.rhino.head.NativeObject nativeObject36 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable37 = nativeObject36.getPrototype();
        com.google.javascript.rhino.head.NativeObject nativeObject38 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject39 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject38.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject39);
        boolean boolean42 = nativeObject38.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection43 = nativeObject38.values();
        com.google.javascript.rhino.head.Scriptable scriptable44 = nativeObject38.getPrototype();
        nativeObject36.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject38);
        boolean boolean46 = nativeObject26.has((int) (short) 10, (com.google.javascript.rhino.head.Scriptable) nativeObject36);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeObject26, "hi!");
        com.google.javascript.rhino.head.NativeObject nativeObject50 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable51 = nativeObject50.getPrototype();
        nativeObject50.delete("hi!");
        java.lang.Object[] objArray54 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeObject50);
        java.lang.Object obj56 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeObject50, "hi!");
        java.lang.Object obj57 = nativeObject26.get("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject50);
        nativeObject26.setAttributes("object", (int) (short) 1);
        nativeObject26.preventExtensions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject9.initPrototypeMethod((java.lang.Object) nativeObject26, (-1), "[object Object]", (int) (byte) 10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        boolean boolean4 = nativeObject0.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection5 = nativeObject0.values();
        nativeObject0.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject8 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject9 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject8.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject9);
        nativeObject0.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject9, (java.lang.Object) 10.0d);
        boolean boolean14 = nativeObject0.isConst("");
        boolean boolean15 = nativeObject0.isSealed();
        com.google.javascript.rhino.head.NativeObject nativeObject16 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable17 = nativeObject16.getPrototype();
        nativeObject16.delete("hi!");
        java.lang.Object[] objArray20 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeObject16);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeObject16, 10, (java.lang.Object) '4');
        com.google.javascript.rhino.head.NativeObject nativeObject25 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeObject25, "hi!", (java.lang.Object) 1.0d);
        boolean boolean29 = nativeObject25.isEmpty();
        java.lang.Object obj31 = nativeObject25.get((java.lang.Object) 10.0d);
        java.lang.Object obj32 = nativeObject16.get((int) '#', (com.google.javascript.rhino.head.Scriptable) nativeObject25);
        com.google.javascript.rhino.head.NativeObject nativeObject34 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject35 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject34.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject35);
        int int37 = nativeObject34.size();
        com.google.javascript.rhino.head.Scriptable scriptable38 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject34);
        com.google.javascript.rhino.head.Scriptable scriptable39 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeObject34);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty(scriptable39, "");
        java.lang.Object obj42 = nativeObject16.get("", scriptable39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject0.initPrototypeMethod((java.lang.Object) nativeObject16, (int) 'a', "", (int) 'a');
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean1 = nativeObject0.isExtensible();
        nativeObject0.delete("hi!");
        com.google.javascript.rhino.head.NativeObject nativeObject5 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject6 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject5.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject6);
        boolean boolean9 = nativeObject5.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection10 = nativeObject5.values();
        com.google.javascript.rhino.head.Scriptable scriptable11 = nativeObject5.getPrototype();
        java.lang.Object obj13 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject5, (java.lang.Object) (byte) 10);
        com.google.javascript.rhino.head.NativeObject nativeObject14 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject15 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject14.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject15);
        boolean boolean18 = nativeObject14.containsValue((java.lang.Object) 100);
        nativeObject0.put(8, (com.google.javascript.rhino.head.Scriptable) nativeObject5, (java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection20 = nativeObject0.values();
        com.google.javascript.rhino.head.NativeObject nativeObject22 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean23 = nativeObject22.isExtensible();
        nativeObject22.delete("hi!");
        nativeObject0.setAttributes((int) (byte) 0, (com.google.javascript.rhino.head.Scriptable) nativeObject22, 13);
        com.google.javascript.rhino.head.NativeObject nativeObject29 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject30 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject29.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject30);
        boolean boolean33 = nativeObject29.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection34 = nativeObject29.values();
        com.google.javascript.rhino.head.Scriptable scriptable35 = nativeObject29.getPrototype();
        java.lang.Object obj37 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject29, (java.lang.Object) (byte) 10);
        com.google.javascript.rhino.head.NativeObject nativeObject38 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject39 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject38.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject39);
        java.util.Set<java.lang.Object> objSet41 = nativeObject39.keySet();
        nativeObject39.setAttributes("hi!", 5);
        boolean boolean46 = nativeObject39.containsValue((java.lang.Object) 100.0d);
        nativeObject22.putConst("Object", (com.google.javascript.rhino.head.Scriptable) nativeObject29, (java.lang.Object) nativeObject39);
        com.google.javascript.rhino.head.NativeObject nativeObject48 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean49 = nativeObject48.isExtensible();
        nativeObject48.delete("hi!");
        com.google.javascript.rhino.head.NativeObject nativeObject53 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject54 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject53.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject54);
        boolean boolean57 = nativeObject53.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection58 = nativeObject53.values();
        com.google.javascript.rhino.head.Scriptable scriptable59 = nativeObject53.getPrototype();
        java.lang.Object obj61 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject53, (java.lang.Object) (byte) 10);
        com.google.javascript.rhino.head.NativeObject nativeObject62 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject63 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject62.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject63);
        boolean boolean66 = nativeObject62.containsValue((java.lang.Object) 100);
        nativeObject48.put(8, (com.google.javascript.rhino.head.Scriptable) nativeObject53, (java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection68 = nativeObject48.values();
        com.google.javascript.rhino.head.NativeObject nativeObject70 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeObject70, "hi!", (java.lang.Object) 1.0d);
        boolean boolean74 = nativeObject70.isEmpty();
        boolean boolean75 = nativeObject48.has(0, (com.google.javascript.rhino.head.Scriptable) nativeObject70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject39.initPrototypeMethod((java.lang.Object) nativeObject48, (int) (short) 10, "Object", (int) (byte) 10);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        boolean boolean4 = nativeObject0.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection5 = nativeObject0.values();
        com.google.javascript.rhino.head.Scriptable scriptable6 = nativeObject0.getPrototype();
        java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject0, (java.lang.Object) (byte) 10);
        boolean boolean9 = nativeObject0.isSealed();
        com.google.javascript.rhino.head.NativeObject nativeObject11 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject12 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject11.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject12);
        boolean boolean15 = nativeObject11.containsValue((java.lang.Object) 100);
        com.google.javascript.rhino.head.NativeObject nativeObject17 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject18 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject17.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject18);
        boolean boolean21 = nativeObject17.containsValue((java.lang.Object) 100);
        nativeObject11.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject17);
        com.google.javascript.rhino.head.Scriptable scriptable24 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject11, "hi!");
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet25 = nativeObject11.entrySet();
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        nativeObject0.defineProperty("", (java.lang.Object) objEntrySet25, method26, method27, 0);
        com.google.javascript.rhino.head.Scriptable scriptable31 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject0, "hi!");
        com.google.javascript.rhino.head.Context context32 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject33 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject34 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject33.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject34);
        boolean boolean37 = nativeObject33.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection38 = nativeObject33.values();
        nativeObject33.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject41 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject42 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject41.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject42);
        nativeObject33.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject42, (java.lang.Object) 10.0d);
        com.google.javascript.rhino.head.NativeObject nativeObject46 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable47 = nativeObject46.getPrototype();
        java.lang.Object obj48 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject42, (java.lang.Object) nativeObject46);
        com.google.javascript.rhino.head.Scriptable scriptable49 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject46);
        com.google.javascript.rhino.head.NativeObject nativeObject50 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Context context51 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject52 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject53 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject52.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject53);
        boolean boolean56 = nativeObject52.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection57 = nativeObject52.values();
        nativeObject52.sealObject();
        nativeObject50.defineOwnProperties(context51, (com.google.javascript.rhino.head.ScriptableObject) nativeObject52);
        com.google.javascript.rhino.head.NativeObject nativeObject61 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject62 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject61.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject62);
        com.google.javascript.rhino.head.NativeObject nativeObject65 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject66 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject65.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject66);
        boolean boolean69 = nativeObject65.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection70 = nativeObject65.values();
        com.google.javascript.rhino.head.Scriptable scriptable71 = nativeObject65.getPrototype();
        java.lang.Object obj73 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject65, (java.lang.Object) (byte) 10);
        boolean boolean74 = nativeObject61.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject65);
        com.google.javascript.rhino.head.NativeObject nativeObject75 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject76 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject75.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject76);
        com.google.javascript.rhino.head.NativeObject nativeObject79 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject80 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject79.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject80);
        boolean boolean83 = nativeObject79.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection84 = nativeObject79.values();
        com.google.javascript.rhino.head.Scriptable scriptable85 = nativeObject79.getPrototype();
        java.lang.Object obj87 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject79, (java.lang.Object) (byte) 10);
        boolean boolean88 = nativeObject75.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject79);
        nativeObject50.putConst("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject65, (java.lang.Object) boolean88);
        nativeObject0.defineOwnProperty(context32, (java.lang.Object) scriptable49, (com.google.javascript.rhino.head.ScriptableObject) nativeObject50);
        boolean boolean92 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeObject0, (int) (short) 100);
        nativeObject0.delete((int) (short) 0);
        java.util.Set<java.lang.Object> objSet95 = nativeObject0.keySet();
        org.junit.Assert.assertEquals("Contract failed: objSet95.toArray().length == objSet95.size()", objSet95.toArray().length, objSet95.size());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject2 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject3 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject2.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject3);
        boolean boolean6 = nativeObject2.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection7 = nativeObject2.values();
        nativeObject2.sealObject();
        nativeObject0.defineOwnProperties(context1, (com.google.javascript.rhino.head.ScriptableObject) nativeObject2);
        com.google.javascript.rhino.head.NativeObject nativeObject11 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject12 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject11.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject12);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject15 = nativeObject0.exportAsJSClass((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeObject11, true);
        com.google.javascript.rhino.head.NativeObject nativeObject17 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject18 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject17.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject18);
        boolean boolean21 = nativeObject17.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection22 = nativeObject17.values();
        nativeObject17.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject25 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject26 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject25.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject26);
        nativeObject17.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject26, (java.lang.Object) 10.0d);
        boolean boolean31 = nativeObject17.isConst("");
        com.google.javascript.rhino.head.NativeObject nativeObject33 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject34 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject33.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject34);
        boolean boolean37 = nativeObject33.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection38 = nativeObject33.values();
        nativeObject33.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject41 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject42 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject41.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject42);
        nativeObject33.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject42, (java.lang.Object) 10.0d);
        nativeObject17.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject42);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject48 = nativeObject11.exportAsJSClass((int) '4', (com.google.javascript.rhino.head.Scriptable) nativeObject42, false);
        boolean boolean50 = nativeObject42.containsKey((java.lang.Object) (byte) 0);
        boolean boolean51 = nativeObject42.isExtensible();
        com.google.javascript.rhino.head.Scriptable scriptable52 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject42);
        java.lang.Object[] objArray53 = nativeObject42.getAllIds();
        nativeObject42.delete("");
        java.util.Set<java.lang.Object> objSet56 = nativeObject42.keySet();
        org.junit.Assert.assertEquals("Contract failed: objSet56.toArray().length == objSet56.size()", objSet56.toArray().length, objSet56.size());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject2 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject3 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject2.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject3);
        boolean boolean6 = nativeObject2.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection7 = nativeObject2.values();
        nativeObject2.sealObject();
        nativeObject0.defineOwnProperties(context1, (com.google.javascript.rhino.head.ScriptableObject) nativeObject2);
        com.google.javascript.rhino.head.NativeObject nativeObject11 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject12 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject11.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject12);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject15 = nativeObject0.exportAsJSClass((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeObject11, true);
        com.google.javascript.rhino.head.NativeObject nativeObject17 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject18 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject17.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject18);
        boolean boolean21 = nativeObject17.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection22 = nativeObject17.values();
        nativeObject17.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject25 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject26 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject25.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject26);
        nativeObject17.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject26, (java.lang.Object) 10.0d);
        boolean boolean31 = nativeObject17.isConst("");
        com.google.javascript.rhino.head.NativeObject nativeObject33 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject34 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject33.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject34);
        boolean boolean37 = nativeObject33.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection38 = nativeObject33.values();
        nativeObject33.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject41 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject42 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject41.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject42);
        nativeObject33.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject42, (java.lang.Object) 10.0d);
        nativeObject17.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject42);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject48 = nativeObject11.exportAsJSClass((int) '4', (com.google.javascript.rhino.head.Scriptable) nativeObject42, false);
        boolean boolean50 = nativeObject42.containsKey((java.lang.Object) (byte) 0);
        com.google.javascript.rhino.head.NativeObject nativeObject52 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable53 = nativeObject52.getPrototype();
        nativeObject52.delete("hi!");
        com.google.javascript.rhino.head.Context context56 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject57 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject58 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject57.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject58);
        com.google.javascript.rhino.head.NativeObject nativeObject61 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject62 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject61.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject62);
        boolean boolean65 = nativeObject61.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection66 = nativeObject61.values();
        com.google.javascript.rhino.head.Scriptable scriptable67 = nativeObject61.getPrototype();
        java.lang.Object obj69 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject61, (java.lang.Object) (byte) 10);
        boolean boolean70 = nativeObject57.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject61);
        nativeObject52.defineOwnProperties(context56, (com.google.javascript.rhino.head.ScriptableObject) nativeObject57);
        java.lang.Object obj72 = nativeObject42.get(8, (com.google.javascript.rhino.head.Scriptable) nativeObject57);
        java.lang.String str73 = nativeObject42.toString();
        boolean boolean74 = nativeObject42.isEmpty();
        java.util.Set<java.lang.Object> objSet75 = nativeObject42.keySet();
        org.junit.Assert.assertEquals("Contract failed: objSet75.toArray().length == objSet75.size()", objSet75.toArray().length, objSet75.size());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean1 = nativeObject0.isExtensible();
        nativeObject0.delete("hi!");
        com.google.javascript.rhino.head.NativeObject nativeObject5 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject6 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject5.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject6);
        boolean boolean9 = nativeObject5.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection10 = nativeObject5.values();
        com.google.javascript.rhino.head.Scriptable scriptable11 = nativeObject5.getPrototype();
        java.lang.Object obj13 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject5, (java.lang.Object) (byte) 10);
        com.google.javascript.rhino.head.NativeObject nativeObject14 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject15 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject14.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject15);
        boolean boolean18 = nativeObject14.containsValue((java.lang.Object) 100);
        nativeObject0.put(8, (com.google.javascript.rhino.head.Scriptable) nativeObject5, (java.lang.Object) 100);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeObject5, "hi!");
        com.google.javascript.rhino.head.NativeObject nativeObject22 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeObject22, "hi!", (java.lang.Object) 1.0d);
        com.google.javascript.rhino.head.Scriptable scriptable27 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject22, "hi!");
        java.lang.Object obj29 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject22, (java.lang.Object) false);
        boolean boolean30 = nativeObject22.isSealed();
        com.google.javascript.rhino.head.NativeObject nativeObject32 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject33 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject32.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject33);
        boolean boolean36 = nativeObject32.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection37 = nativeObject32.values();
        nativeObject32.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject40 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject41 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject40.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject41);
        nativeObject32.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject41, (java.lang.Object) 10.0d);
        com.google.javascript.rhino.head.NativeObject nativeObject45 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable46 = nativeObject45.getPrototype();
        java.lang.Object obj47 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject41, (java.lang.Object) nativeObject45);
        boolean boolean49 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeObject41, 1);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeObject22, "hi!", (java.lang.Object) nativeObject41);
        nativeObject41.delete((int) (short) 1);
        com.google.javascript.rhino.head.NativeObject nativeObject54 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject55 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject54.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject55);
        boolean boolean58 = nativeObject54.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection59 = nativeObject54.values();
        nativeObject54.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject62 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject63 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject62.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject63);
        nativeObject54.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject63, (java.lang.Object) 10.0d);
        com.google.javascript.rhino.head.NativeObject nativeObject67 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable68 = nativeObject67.getPrototype();
        java.lang.Object obj69 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject63, (java.lang.Object) nativeObject67);
        com.google.javascript.rhino.head.NativeObject nativeObject70 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeObject70, "hi!", (java.lang.Object) 1.0d);
        boolean boolean74 = nativeObject63.hasInstance((com.google.javascript.rhino.head.Scriptable) nativeObject70);
        java.lang.String str75 = nativeObject70.getTypeOf();
        boolean boolean76 = nativeObject41.has((int) (short) -1, (com.google.javascript.rhino.head.Scriptable) nativeObject70);
        java.lang.Object[] objArray77 = nativeObject70.getIds();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject5.initPrototypeMethod((java.lang.Object) nativeObject70, (int) (byte) -1, "function", 5);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        com.google.javascript.rhino.head.NativeObject nativeObject4 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject5 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject4.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject5);
        boolean boolean8 = nativeObject4.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection9 = nativeObject4.values();
        com.google.javascript.rhino.head.Scriptable scriptable10 = nativeObject4.getPrototype();
        java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject4, (java.lang.Object) (byte) 10);
        boolean boolean13 = nativeObject0.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject4);
        boolean boolean14 = nativeObject0.hasPrototypeMap();
        boolean boolean15 = nativeObject0.isEmpty();
        com.google.javascript.rhino.head.Scriptable scriptable16 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject0);
        com.google.javascript.rhino.head.NativeObject nativeObject17 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject18 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject17.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject18);
        int int20 = nativeObject17.size();
        com.google.javascript.rhino.head.Scriptable scriptable21 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject17);
        int int22 = nativeObject17.size();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeObject17, "object", true);
        com.google.javascript.rhino.head.NativeObject nativeObject27 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean28 = nativeObject27.isExtensible();
        com.google.javascript.rhino.head.NativeObject nativeObject30 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable31 = nativeObject30.getPrototype();
        nativeObject30.delete("hi!");
        com.google.javascript.rhino.head.NativeObject nativeObject35 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject36 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject35.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject36);
        boolean boolean39 = nativeObject35.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection40 = nativeObject35.values();
        nativeObject35.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject43 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject44 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject43.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject44);
        nativeObject35.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject44, (java.lang.Object) 10.0d);
        com.google.javascript.rhino.head.NativeObject nativeObject48 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable49 = nativeObject48.getPrototype();
        java.lang.Object obj50 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject44, (java.lang.Object) nativeObject48);
        boolean boolean52 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeObject44, 1);
        com.google.javascript.rhino.head.NativeObject nativeObject54 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable55 = nativeObject54.getPrototype();
        com.google.javascript.rhino.head.NativeObject nativeObject56 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject57 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject56.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject57);
        boolean boolean60 = nativeObject56.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection61 = nativeObject56.values();
        com.google.javascript.rhino.head.Scriptable scriptable62 = nativeObject56.getPrototype();
        nativeObject54.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject56);
        boolean boolean64 = nativeObject44.has((int) (short) 10, (com.google.javascript.rhino.head.Scriptable) nativeObject54);
        com.google.javascript.rhino.head.NativeObject nativeObject66 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject67 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject66.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject67);
        boolean boolean70 = nativeObject66.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection71 = nativeObject66.values();
        com.google.javascript.rhino.head.Scriptable scriptable72 = nativeObject66.getPrototype();
        com.google.javascript.rhino.head.NativeObject nativeObject74 = new com.google.javascript.rhino.head.NativeObject();
        boolean boolean75 = nativeObject74.isExtensible();
        nativeObject74.delete("hi!");
        boolean boolean78 = nativeObject66.has((int) (short) -1, (com.google.javascript.rhino.head.Scriptable) nativeObject74);
        com.google.javascript.rhino.head.Scriptable scriptable79 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject74);
        java.lang.Object obj80 = nativeObject44.get("Object", (com.google.javascript.rhino.head.Scriptable) nativeObject74);
        com.google.javascript.rhino.head.NativeObject nativeObject81 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject82 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject81.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject82);
        nativeObject30.putConst("Object", (com.google.javascript.rhino.head.Scriptable) nativeObject44, (java.lang.Object) nativeObject82);
        int int86 = nativeObject44.getAttributes("Object");
        java.lang.Object obj87 = nativeObject27.get("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject44);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject89 = nativeObject17.exportAsJSClass(2, (com.google.javascript.rhino.head.Scriptable) nativeObject44, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject0.initPrototypeConstructor(idFunctionObject89);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable1 = nativeObject0.getPrototype();
        nativeObject0.delete("hi!");
        com.google.javascript.rhino.head.NativeObject nativeObject5 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject6 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject5.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject6);
        com.google.javascript.rhino.head.NativeObject nativeObject9 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject10 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject9.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject10);
        boolean boolean13 = nativeObject9.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection14 = nativeObject9.values();
        com.google.javascript.rhino.head.Scriptable scriptable15 = nativeObject9.getPrototype();
        java.lang.Object obj17 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject9, (java.lang.Object) (byte) 10);
        boolean boolean18 = nativeObject5.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject9);
        boolean boolean19 = nativeObject5.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeObject nativeObject20 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject21 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject20.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject21);
        boolean boolean24 = nativeObject20.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection25 = nativeObject20.values();
        nativeObject20.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject28 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject29 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject28.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject29);
        nativeObject20.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject29, (java.lang.Object) 10.0d);
        boolean boolean34 = nativeObject20.isConst("");
        com.google.javascript.rhino.head.NativeObject nativeObject36 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject37 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject36.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject37);
        boolean boolean40 = nativeObject36.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection41 = nativeObject36.values();
        nativeObject36.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject44 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject45 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject44.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject45);
        nativeObject36.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject45, (java.lang.Object) 10.0d);
        nativeObject20.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject45);
        boolean boolean50 = nativeObject5.containsKey((java.lang.Object) "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject52 = nativeObject0.exportAsJSClass(8, (com.google.javascript.rhino.head.Scriptable) nativeObject5, true);
        java.util.Set<java.lang.Object> objSet53 = nativeObject5.keySet();
        org.junit.Assert.assertEquals("Contract failed: objSet53.toArray().length == objSet53.size()", objSet53.toArray().length, objSet53.size());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        boolean boolean4 = nativeObject0.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection5 = nativeObject0.values();
        nativeObject0.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject8 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject9 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject8.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject9);
        nativeObject0.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject9, (java.lang.Object) 10.0d);
        boolean boolean14 = nativeObject0.isConst("");
        com.google.javascript.rhino.head.NativeObject nativeObject16 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject17 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject16.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject17);
        boolean boolean20 = nativeObject16.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection21 = nativeObject16.values();
        nativeObject16.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject24 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject25 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject24.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject25);
        nativeObject16.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject25, (java.lang.Object) 10.0d);
        nativeObject0.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject25);
        com.google.javascript.rhino.head.Scriptable scriptable30 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject25);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeObject25, "hi!", true);
        nativeObject25.delete((int) (short) 1);
        com.google.javascript.rhino.head.NativeObject nativeObject36 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject37 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject36.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject37);
        boolean boolean40 = nativeObject36.containsValue((java.lang.Object) 100);
        com.google.javascript.rhino.head.NativeObject nativeObject42 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject43 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject42.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject43);
        boolean boolean46 = nativeObject42.containsValue((java.lang.Object) 100);
        nativeObject36.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject42);
        com.google.javascript.rhino.head.Scriptable scriptable49 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject36, "hi!");
        boolean boolean51 = nativeObject36.isConst("");
        com.google.javascript.rhino.head.NativeObject nativeObject53 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject54 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject53.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject54);
        boolean boolean57 = nativeObject53.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection58 = nativeObject53.values();
        int int59 = nativeObject53.size();
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeObject36, "[object Object]", (java.lang.Object) nativeObject53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeObject25.initPrototypeMethod((java.lang.Object) "[object Object]", (int) (short) 100, "", (int) (short) 100);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject2 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject3 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject2.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject3);
        boolean boolean6 = nativeObject2.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection7 = nativeObject2.values();
        nativeObject2.sealObject();
        nativeObject0.defineOwnProperties(context1, (com.google.javascript.rhino.head.ScriptableObject) nativeObject2);
        com.google.javascript.rhino.head.NativeObject nativeObject11 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject12 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject11.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject12);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject15 = nativeObject0.exportAsJSClass((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeObject11, true);
        com.google.javascript.rhino.head.NativeObject nativeObject17 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject18 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject17.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject18);
        boolean boolean21 = nativeObject17.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection22 = nativeObject17.values();
        nativeObject17.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject25 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject26 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject25.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject26);
        nativeObject17.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject26, (java.lang.Object) 10.0d);
        boolean boolean31 = nativeObject17.isConst("");
        com.google.javascript.rhino.head.NativeObject nativeObject33 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject34 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject33.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject34);
        boolean boolean37 = nativeObject33.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection38 = nativeObject33.values();
        nativeObject33.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject41 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject42 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject41.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject42);
        nativeObject33.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject42, (java.lang.Object) 10.0d);
        nativeObject17.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject42);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject48 = nativeObject11.exportAsJSClass((int) '4', (com.google.javascript.rhino.head.Scriptable) nativeObject42, false);
        boolean boolean50 = nativeObject42.containsKey((java.lang.Object) (byte) 0);
        boolean boolean51 = nativeObject42.isExtensible();
        com.google.javascript.rhino.head.Scriptable scriptable52 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject42);
        java.lang.Object[] objArray53 = nativeObject42.getAllIds();
        com.google.javascript.rhino.head.Scriptable scriptable54 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeObject42);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet55 = nativeObject42.entrySet();
        org.junit.Assert.assertEquals("Contract failed: objEntrySet55.toArray().length == objEntrySet55.size()", objEntrySet55.toArray().length, objEntrySet55.size());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        com.google.javascript.rhino.head.NativeObject nativeObject0 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject1 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject0.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject1);
        boolean boolean4 = nativeObject0.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection5 = nativeObject0.values();
        com.google.javascript.rhino.head.Scriptable scriptable6 = nativeObject0.getPrototype();
        java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject0, (java.lang.Object) (byte) 10);
        boolean boolean9 = nativeObject0.isSealed();
        com.google.javascript.rhino.head.NativeObject nativeObject11 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject12 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject11.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject12);
        boolean boolean15 = nativeObject11.containsValue((java.lang.Object) 100);
        com.google.javascript.rhino.head.NativeObject nativeObject17 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject18 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject17.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject18);
        boolean boolean21 = nativeObject17.containsValue((java.lang.Object) 100);
        nativeObject11.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject17);
        com.google.javascript.rhino.head.Scriptable scriptable24 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject11, "hi!");
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet25 = nativeObject11.entrySet();
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        nativeObject0.defineProperty("", (java.lang.Object) objEntrySet25, method26, method27, 0);
        com.google.javascript.rhino.head.Scriptable scriptable31 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject0, "hi!");
        com.google.javascript.rhino.head.Context context32 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject33 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject34 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject33.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject34);
        boolean boolean37 = nativeObject33.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection38 = nativeObject33.values();
        nativeObject33.sealObject();
        com.google.javascript.rhino.head.NativeObject nativeObject41 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject42 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject41.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject42);
        nativeObject33.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeObject42, (java.lang.Object) 10.0d);
        com.google.javascript.rhino.head.NativeObject nativeObject46 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Scriptable scriptable47 = nativeObject46.getPrototype();
        java.lang.Object obj48 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject42, (java.lang.Object) nativeObject46);
        com.google.javascript.rhino.head.Scriptable scriptable49 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject46);
        com.google.javascript.rhino.head.NativeObject nativeObject50 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.Context context51 = null;
        com.google.javascript.rhino.head.NativeObject nativeObject52 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject53 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject52.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject53);
        boolean boolean56 = nativeObject52.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection57 = nativeObject52.values();
        nativeObject52.sealObject();
        nativeObject50.defineOwnProperties(context51, (com.google.javascript.rhino.head.ScriptableObject) nativeObject52);
        com.google.javascript.rhino.head.NativeObject nativeObject61 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject62 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject61.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject62);
        com.google.javascript.rhino.head.NativeObject nativeObject65 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject66 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject65.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject66);
        boolean boolean69 = nativeObject65.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection70 = nativeObject65.values();
        com.google.javascript.rhino.head.Scriptable scriptable71 = nativeObject65.getPrototype();
        java.lang.Object obj73 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject65, (java.lang.Object) (byte) 10);
        boolean boolean74 = nativeObject61.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject65);
        com.google.javascript.rhino.head.NativeObject nativeObject75 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject76 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject75.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject76);
        com.google.javascript.rhino.head.NativeObject nativeObject79 = new com.google.javascript.rhino.head.NativeObject();
        com.google.javascript.rhino.head.NativeObject nativeObject80 = new com.google.javascript.rhino.head.NativeObject();
        nativeObject79.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeObject80);
        boolean boolean83 = nativeObject79.containsValue((java.lang.Object) 100);
        java.util.Collection<java.lang.Object> objCollection84 = nativeObject79.values();
        com.google.javascript.rhino.head.Scriptable scriptable85 = nativeObject79.getPrototype();
        java.lang.Object obj87 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeObject79, (java.lang.Object) (byte) 10);
        boolean boolean88 = nativeObject75.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject79);
        nativeObject50.putConst("hi!", (com.google.javascript.rhino.head.Scriptable) nativeObject65, (java.lang.Object) boolean88);
        nativeObject0.defineOwnProperty(context32, (java.lang.Object) scriptable49, (com.google.javascript.rhino.head.ScriptableObject) nativeObject50);
        boolean boolean92 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeObject0, (int) (short) 100);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet93 = nativeObject0.entrySet();
        org.junit.Assert.assertEquals("Contract failed: objEntrySet93.toArray().length == objEntrySet93.size()", objEntrySet93.toArray().length, objEntrySet93.size());
    }
}

