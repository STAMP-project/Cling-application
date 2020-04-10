/*

 * Tue Mar 03 20:22:45 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaConstructor;
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
      NativeArray nativeArray0 = new NativeArray((-667L));
      int int0 = nativeArray0.findPrototypeId("cLIHN3$bS,");
      assertEquals((-667L), nativeArray0.jsGet_length());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeArray0, (-1531));
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity((-549));
      NativeArray nativeArray0 = new NativeArray(8);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(130);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 130 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn("").when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      long long0 = NativeArray.getLengthProperty(context0, scriptable0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      nativeArray0.put("language version", (Scriptable) nativeBoolean0, (Object) nativeBoolean0);
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-1608));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -1608 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1978L));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(2748);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 2748 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeArray0, (-478));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(93L);
      nativeArray0.delete((-1865));
      assertEquals(93L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeArray0.exportAsJSClass(180, nativeIterator_StopIteration0, false);
      Object object0 = nativeArray0.get("_i", (Scriptable) nativeIterator_StopIteration0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = Context.enter();
      NativeObject nativeObject0 = new NativeObject();
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) nativeObject0, true);
      Scriptable scriptable0 = Context.toObject((Object) context0, (Scriptable) scriptableObject0);
      assertEquals("JavaObject", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.findPrototypeId("5~gQ+!]5%eW\"]");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1320L);
      Class<NativeJavaConstructor> class0 = NativeJavaConstructor.class;
      Scriptable scriptable0 = Context.toObject((Object) 0, (Scriptable) nativeArray0, (Class<?>) class0);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      nativeWith0.has(0, scriptable0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, context0, 180, "valueOf", 3, nativeArray0);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=180 MASTER=com.google.javascript.rhino.head.NativeArray@58fe2b30
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9221120237041090560L);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor(context0, nativeArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      ScriptableObject.defineConstProperty(nativeArray0, "-1");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(3312L);
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
  public void test18()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      ScriptableObject.defineConstProperty(nativeArray0, " of class ");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.getOwnPropertyDescriptor(context0, "b]dYsy!]rFGtr");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483640L);
      BaseFunction baseFunction0 = new BaseFunction();
      nativeArray0.has(10003, (Scriptable) baseFunction0);
      assertEquals(2147483640L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeArray nativeArray1 = (NativeArray)context0.initStandardObjects((ScriptableObject) nativeArray0, true);
      assertEquals(0L, nativeArray1.getLength());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.delete(10);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = new Context();
      Long long0 = new Long(9);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, long0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1320L);
      nativeArray0.getIndexIds();
      assertEquals(1320L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 0, objectArray0[4]);
      assertTrue(nativeArray0.isEmpty());
      assertEquals(9L, nativeArray0.getLength());
      assertEquals(9L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      nativeArray0.contains(delegator0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1053L));
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(3, importerTopLevel0, false);
      ScriptableObject.callMethod((Scriptable) idFunctionObject0, "reverse", context0.emptyArgs);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeString nativeString0 = new NativeString("error reporter");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(14L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      int int0 = nativeArray0.findPrototypeId("ENUM_NEXT");
      assertEquals(0L, nativeArray0.jsGet_length());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(8, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1340L);
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray1 = (NativeArray)context0.topCallScope;
      // Undeclared exception!
      try { 
        nativeArray0.exportAsJSClass(1, nativeArray1, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: Array.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeArray nativeArray0 = new NativeArray(8);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(256, importerTopLevel0, false);
      Object[] objectArray0 = new Object[4];
      nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, objectArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Number;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      nativeArray0.put(0, (Scriptable) importerTopLevel0, (Object) baseFunction0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object[] objectArray1 = nativeArray0.toArray(objectArray0);
      assertSame(objectArray1, objectArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      ScriptableObject.getProperty((Scriptable) nativeArray0, 13);
      assertEquals(1L, nativeArray0.jsGet_length());
      assertEquals(1L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Context context0 = new Context();
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn("-q)!fnS$f2<(UH").when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      long long0 = NativeArray.getLengthProperty(context0, scriptable0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test37()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1053L));
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeArray0.exportAsJSClass(3, importerTopLevel0, false);
      Context.toString((Object) nativeArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 140, (Object) nativeArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeArray0.exportAsJSClass(180, nativeIterator_StopIteration0, false);
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
  public void test40()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10000L);
      nativeArray0.delete(3834);
      assertEquals(10000L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483640L);
      nativeArray0.delete(8);
      assertEquals(2147483640L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-667L));
      Context context0 = Context.getCurrentContext();
      nativeArray0.defineOwnProperty(context0, (Object) "cLIHN3$bS,", (ScriptableObject) nativeArray0, false);
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483640L);
      BaseFunction baseFunction0 = new BaseFunction();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      nativeArray0.defineOwnProperty(context0, (Object) "Array", (ScriptableObject) baseFunction0, true);
      assertEquals(2147483640L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1036L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      nativeArray0.getOwnPropertyDescriptor(context0, nativeArray0.CONST);
      assertEquals(1036L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1053L));
      Context context0 = new Context();
      nativeArray0.defineProperty("language version", (Object) context0, 4);
      nativeArray0.getIndexIds();
  }
}
