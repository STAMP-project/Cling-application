/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 07:56:16 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.UniqueTag;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      Delegator delegator0 = new Delegator();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeWith0, delegator0, delegator0, context0.emptyArgs);
      nativeArray0.put("0;yS", (Scriptable) nativeWith0, (Object) boundFunction0);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeArray0, false);
      nativeArray0.put("", (Scriptable) nativeWith0, (Object) nativeGenerator0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      nativeArray0.put("+Z] F", (Scriptable) nativeWith0, (Object) "+Z] F");
      assertEquals(1L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      nativeArray0.put(" of class ", (Scriptable) nativeWith0, (Object) nativeWith0);
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.defaultPut("-PNZy]@AG(8'8{xgJj", "-PNZy]@AG(8'8{xgJj");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(2, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.activatePrototypeMap(4);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      nativeArray0.put("(", (Scriptable) nativeWith0, (Object) nativeWith0);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2434L));
      int int0 = nativeArray0.findPrototypeId("JavaException");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      TopLevel topLevel0 = new TopLevel();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(2, topLevel0, true);
      idFunctionObject0.applyDescriptorToAttributeBitset(1076, nativeArray0);
      assertEquals("Array", idFunctionObject0.getFunctionName());
      assertEquals(1, idFunctionObject0.getArity());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Scriptable scriptable0 = ScriptableObject.getArrayPrototype(importerTopLevel0);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, scriptable0, "n0yUb1)&B", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: n0yUb1)&B is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(11);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(160);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 160 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.defaultPut("-1", context0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-381));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -381 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeArray nativeArray0 = new NativeArray((-407L));
      nativeArray0.defineOwnProperty(context0, (Object) importerTopLevel0, (ScriptableObject) importerTopLevel0, true);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context1 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor(context1, importerTopLevel0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.getAttributes(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(66L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(16);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 16 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      TopLevel topLevel0 = new TopLevel();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(2, topLevel0, true);
      Context context0 = Context.getCurrentContext();
      nativeArray0.execIdCall(idFunctionObject0, context0, topLevel0, topLevel0, objectArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = new Context();
      Double double0 = new Double(5);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, double0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      UniqueTag uniqueTag0 = (UniqueTag)Scriptable.NOT_FOUND;
      objectArray0[0] = (Object) uniqueTag0;
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(1, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-5798663540173640085L));
      NativeArray.init(nativeArray0, false);
      nativeArray0.getIndexIds();
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1021L));
      NativeObject nativeObject0 = new NativeObject();
      nativeArray0.exportAsJSClass(2, nativeObject0, true);
      Class<Integer> class0 = Integer.class;
      Object object0 = nativeArray0.getDefaultValue(class0);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeString nativeString0 = new NativeString("language version");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(16L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      Byte byte0 = new Byte((byte)62);
      nativeArray0.put((-20), (Scriptable) nativeArray0, (Object) byte0);
      assertEquals(1L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(150L);
      nativeArray0.get((-1), (Scriptable) nativeArray0);
      assertEquals(150L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4503599627370496L);
      Object object0 = nativeArray0.get(0);
      assertEquals(4503599627370496L, nativeArray0.jsGet_length());
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      NativeNumber nativeNumber0 = new NativeNumber(8);
      nativeArray0.defineOwnProperty(context0, (Object) null, (ScriptableObject) nativeNumber0, false);
      assertEquals(1L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      nativeArray0.put("0", (Scriptable) nativeWith0, (Object) "0");
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Byte byte0 = new Byte((byte)1);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, byte0, 2, 160);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=2 MASTER=com.google.javascript.rhino.head.NativeArray@128385a9
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeError nativeError0 = new NativeError();
      nativeArray0.defineOwnProperty((Context) null, (Object) "6njq|,y9Z]8UJ,|Z8", (ScriptableObject) nativeError0, false);
      assertEquals(1L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Byte byte0 = new Byte((byte) (-33));
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, byte0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray.setMaximumInitialCapacity((-1200));
      NativeArray nativeArray0 = new NativeArray(130);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = (NativeIterator.StopIteration)context0.topCallScope;
      nativeArray0.has(170, (Scriptable) nativeIterator_StopIteration0);
      assertEquals(130L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      UniqueTag uniqueTag0 = (UniqueTag)Scriptable.NOT_FOUND;
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 2, (Object) uniqueTag0);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(3L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-5798663540173640085L));
      nativeArray0.get(0, (Scriptable) nativeArray0);
      assertEquals((-5798663540173640085L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(110);
      nativeArray0.delete((-710));
      assertEquals(110L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-5798663540173640085L));
      nativeArray0.delete((int) (byte)62);
      assertEquals((-5798663540173640085L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1350L));
      NativeCall nativeCall0 = new NativeCall();
      nativeArray0.has((-33), (Scriptable) nativeCall0);
      assertEquals((-1350L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10000);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(0).when(idFunctionObject0).methodId();
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(150L);
      nativeArray0.delete(130);
      assertEquals(150L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-5798663540173640085L));
      NativeArray.init(nativeArray0, false);
      nativeArray0.get(31, (Scriptable) nativeArray0);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-5798663540173640085L));
      Byte byte0 = new Byte((byte)62);
      nativeArray0.put(5, (Scriptable) nativeArray0, (Object) byte0);
      assertEquals(6L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      UniqueTag uniqueTag0 = (UniqueTag)Scriptable.NOT_FOUND;
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 2, (Object) uniqueTag0);
      assertTrue(nativeArray0.isEmpty());
      assertEquals(3L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-5798663540173640085L));
      boolean boolean0 = nativeArray0.has(0, (Scriptable) nativeArray0);
      assertEquals((-5798663540173640085L), nativeArray0.jsGet_length());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeString nativeString0 = new NativeString("error reporter");
      nativeArray0.put(11, (Scriptable) nativeString0, (Object) context0);
      assertTrue(nativeString0.isEmpty());
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10000);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn((-1883)).when(idFunctionObject0).methodId();
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1883
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-572L));
      nativeArray0.exportAsJSClass(3134, nativeArray0, false);
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
  public void test45()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      UniqueTag uniqueTag0 = (UniqueTag)Scriptable.NOT_FOUND;
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 2, (Object) uniqueTag0);
      assertEquals(3L, nativeArray0.getLength());
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Class<NativeCall> class0 = NativeCall.class;
      Scriptable scriptable0 = Context.toObject((Object) context0, (Scriptable) importerTopLevel0, (Class<?>) class0);
      assertEquals("JavaObject", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(2, nativeArray0, false);
      nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
      assertEquals(0L, nativeArray0.getLength());
      assertEquals(1, idFunctionObject0.getArity());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test48()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2207L);
      Context context0 = Context.getCurrentContext();
      Float float0 = new Float((double) 130);
      nativeArray0.getOwnPropertyDescriptor(context0, float0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test49()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
  }
}
