/*

 * Tue Mar 03 18:44:47 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Callable;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeFunction;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaArray;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptable("uJ");
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type string
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeError nativeError1 = (NativeError)ScriptableObject.ensureScriptable(nativeError0);
      assertTrue(nativeError1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ScriptableObject.defineConstProperty(nativeError0, "");
      assertFalse(nativeError0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ScriptableObject.putConstProperty(nativeError0, "t`C';iMq(<s%3f6>Yn]", nativeError0);
      assertFalse(nativeError0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getCurrentContext();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(8, nativeArray0, true);
      NativeError.make(context0, nativeIterator_StopIteration0, idFunctionObject0, objectArray0);
      assertTrue(nativeIterator_StopIteration0.isSealed());
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeError0, false);
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeGenerator0, (-1243020381));
      assertTrue(nativeError0.isEmpty());
      assertTrue(nativeGenerator0.isExtensible());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      // Undeclared exception!
      try { 
        importerTopLevel0.associateValue(nativeArray0, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeString nativeString0 = new NativeString((CharSequence) null);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeString0, "0HSTuZo");
      assertTrue(nativeString0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn("", "", "").when(context0).toString();
      Context context1 = Context.enter();
      nativeArray0.defineOwnProperty(context1, context0, nativeArray0);
      assertFalse(nativeArray0.isSealed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      String[] stringArray0 = new String[6];
      stringArray0[0] = ">08;{hp";
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        nativeError0.defineFunctionProperties(stringArray0, class0, 1013);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Method \">08;{hp\" not found in \"java.lang.Integer\".
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn("", "", "lgpgG#fnQje").when(context0).toString();
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      nativeArray0.defineOwnProperty(context1, context0, nativeArray0);
      Context context2 = Context.getCurrentContext();
      nativeArray0.defineOwnProperty(context2, "lgpgG#fnQje", nativeArray0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null).when(scriptable0).toString();
      Callable callable0 = mock(Callable.class, new ViolatedAssumptionAnswer());
      BoundFunction boundFunction0 = new BoundFunction(context0, scriptable0, callable0, scriptable0, context0.emptyArgs);
      assertFalse(boundFunction0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeError nativeError0 = new NativeError();
      // Undeclared exception!
      try { 
        NativeJavaArray.wrap((Scriptable) nativeObject0, (Object) nativeError0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("com.google.javascript.rhino.head.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      ContextFactory contextFactory0 = mock(ContextFactory.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(contextFactory0).hasFeature(any(com.google.javascript.rhino.head.Context.class) , anyInt());
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeFunction nativeFunction0 = mock(NativeFunction.class, CALLS_REAL_METHODS);
      NativeGenerator nativeGenerator0 = new NativeGenerator(importerTopLevel0, nativeFunction0, nativeFunction0);
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn((String) null, (String) null).when(scriptable0).toString();
      NativeFunction nativeFunction0 = mock(NativeFunction.class, CALLS_REAL_METHODS);
      NativeGenerator nativeGenerator0 = new NativeGenerator(scriptable0, nativeFunction0, scriptable0);
      assertTrue(nativeGenerator0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[12];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.get(0L);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Class<Integer> class0 = Integer.class;
      ScriptableObject.getTypedProperty((Scriptable) nativeContinuation0, 0, class0);
      assertTrue(nativeContinuation0.isEmpty());
      assertTrue(nativeContinuation0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ScriptableObject.redefineProperty(nativeError0, (String) null, false);
      assertTrue(nativeError0.isEmpty());
      assertTrue(nativeError0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeArray0, 3);
      assertTrue(nativeArray0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.isGenericDescriptor(nativeError0);
      assertTrue(nativeArray0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      BaseFunction.init(scriptable0, false);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      // Undeclared exception!
      try { 
        nativeError0.exportAsJSClass(2, nativeError0, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: Error.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getCurrentContext();
      nativeArray0.sealObject();
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, context0, nativeArray0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: 0.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) nativeArray0, "msg.access.prohibited", objectArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: msg.access.prohibited is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Class<String> class0 = String.class;
      String string0 = ScriptableObject.getTypedProperty((Scriptable) nativeError0, "", class0);
      assertTrue(nativeError0.isEmpty());
      assertNull(string0);
      assertTrue(nativeError0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Context context0 = new Context();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeError0, false);
      nativeError0.defineOwnProperties(context0, nativeGenerator0);
      assertTrue(nativeError0.isEmpty());
      assertTrue(nativeGenerator0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptableObject((Object) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type object
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ScriptableObject scriptableObject0 = ScriptableObject.ensureScriptableObject(nativeContinuation0);
      assertTrue(scriptableObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber(0.0);
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(1970, nativeNumber0, true);
      nativeArray0.initPrototypeConstructor(idFunctionObject0);
      assertTrue(nativeArray0.isSealed());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ScriptableObject.getPropertyIds(nativeError0);
      assertTrue(nativeError0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeError0, nativeError0, 8);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      importerTopLevel0.defineOwnProperty((Context) null, importerTopLevel0, scriptableObject0);
      assertFalse(importerTopLevel0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        nativeArray0.defineProperty("~bb9jc;uA)", class0, 1071);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1071
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }
}
