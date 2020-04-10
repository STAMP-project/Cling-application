/*

 * Tue Mar 03 20:21:02 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeArray0, (-348));
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(18);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 18 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[35];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putConstProperty(nativeArray0, "", "");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(35, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      nativeArray0.put("error reporter", (Scriptable) nativeWith0, (Object) "toString");
      assertFalse(nativeArray0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2028178999));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-2028178999));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -2028178999 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2520L);
      Class<NativeCall> class0 = NativeCall.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeCall
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(138);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 138 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.delete((-233));
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2);
      int int0 = nativeArray0.findPrototypeId("language version");
      assertEquals(0, int0);
      assertEquals(2L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.getAttributes(2);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(13);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(2);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 2 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-51L));
      int int0 = nativeArray0.findPrototypeId("ConstantValue");
      assertEquals(0, int0);
      assertEquals((-51L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      boolean boolean0 = nativeArray0.has(2, (Scriptable) nativeArray0);
      assertFalse(boolean0);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(766L);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(importerTopLevel0, context0, 747, 4);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, importerTopLevel0, importerTopLevel0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=747 MASTER=com.google.javascript.rhino.head.ImporterTopLevel@1fc15a5b
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(5);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      // Undeclared exception!
      try { 
        NativeArray.getLengthProperty(context0, scriptable0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getCurrentContext();
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, "error reporter");
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4890909195324358655L);
      ScriptableObject.deleteProperty((Scriptable) nativeArray0, 4);
      assertEquals(4890909195324358655L, nativeArray0.getLength());
      assertEquals(4890909195324358655L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Context) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      long long0 = NativeArray.getLengthProperty((Context) null, scriptable0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1955L);
      nativeArray0.setInstanceIdValue(1, (Object) null);
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(14L);
      nativeArray0.delete(8);
      assertEquals(14L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1969L);
      nativeArray0.getIndexIds();
      assertEquals(1969L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 2, (Object) nativeArray0);
      assertTrue(nativeArray0.isEmpty());
      assertEquals(4L, nativeArray0.jsGet_length());
      assertEquals(4L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(12);
      nativeArray0.defineOwnProperty(context0, context0, importerTopLevel0);
      Object object0 = nativeArray0.get(11);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(1011L);
      nativeArray0.getOwnPropertyDescriptor(context0, context0.FEATURE_ENHANCED_JAVA_ACCESS);
      assertEquals(1011L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-4339L));
      NativeArray.init(nativeArray0, false);
      assertEquals(0L, nativeArray0.getLength());
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeArray nativeArray1 = (NativeArray)context0.initStandardObjects((ScriptableObject) nativeArray0, true);
      assertEquals(0L, nativeArray1.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      NativeObject nativeObject0 = new NativeObject();
      ScriptableObject.putProperty((Scriptable) nativeArray0, 13, (Object) nativeObject0);
      assertEquals(14L, nativeArray0.getLength());
      assertEquals(14L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeString nativeString0 = new NativeString("error reporter");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(14L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4993L);
      int int0 = nativeArray0.findPrototypeId("|}#v!Ag#R");
      assertEquals(0, int0);
      assertEquals(4993L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.defineConst(" - ", nativeArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(6, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2183L);
      Context context0 = Context.getContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(1024, scriptableObject0, true);
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, scriptableObject0, scriptableObject0, context0.emptyArgs);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      NativeArray nativeArray0 = new NativeArray(170);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(10, scriptable0, true);
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, objectArray0);
      assertEquals("Array", nativeArray1.getClassName());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray((-177973607073265138L));
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeArray0, context0, 9);
      nativeArray0.put(515, (Scriptable) scriptableObject0, (Object) scriptableObject0);
      assertEquals((-177973607073265138L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Scriptable scriptable0 = Context.toObject((Object) context0, (Scriptable) importerTopLevel0);
      assertEquals("JavaObject", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(170);
      nativeArray0.get(5);
      assertEquals(170L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Object object0 = nativeArray0.get(120, (Scriptable) nativeArray0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(5);
      ScriptableObject.putProperty((Scriptable) nativeArray0, (-1133), (Object) nativeArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
      assertEquals(5L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArray nativeArray0 = new NativeArray(1L);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(2395, nativeIterator_StopIteration0, false);
      idFunctionObject0.checkPropertyChange("enumerable", nativeArray0, nativeArray0);
      assertFalse(idFunctionObject0.isSealed());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      NativeObject nativeObject0 = new NativeObject();
      nativeObject0.put("-_.!~*'()", (Scriptable) nativeArray0, (Object) nativeArray0);
      assertEquals(0L, nativeArray0.getLength());
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Array;
      Scriptable scriptable0 = importerTopLevel0.getBuiltinPrototype(topLevel_Builtins0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      ScriptableObject.callMethod(scriptable0, "toString", (Object[]) integerArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test40()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.put(130, (Scriptable) nativeArray0, (Object) nativeArray0);
      nativeArray0.put(65279, (Scriptable) nativeArray0, (Object) null);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.activatePrototypeMap(180);
      // Undeclared exception!
      try { 
        nativeArray0.getIndexIds();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 24
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1);
      nativeArray0.delete(857);
      assertEquals(1L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity((-3993));
      NativeArray nativeArray0 = new NativeArray(0L);
      nativeArray0.delete(0);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Float float0 = new Float((float) 13);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty((Context) null, (Object) float0, (ScriptableObject) nativeIterator_StopIteration0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test45()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage((ClassLoader) null);
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) null, (ScriptableObject) nativeJavaTopPackage0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = new Context();
      Short short0 = new Short((short)170);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, short0);
      assertNull(scriptableObject0);
  }
}
