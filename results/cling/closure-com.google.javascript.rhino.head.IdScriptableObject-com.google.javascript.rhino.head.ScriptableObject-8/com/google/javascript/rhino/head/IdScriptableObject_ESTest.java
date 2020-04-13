/*

 * Tue Mar 03 18:46:44 GMT 2020
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
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeFunction;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeGlobal;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.TopLevel;
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
        ScriptableObject.ensureScriptable("+");
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
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeIterator.StopIteration nativeIterator_StopIteration1 = (NativeIterator.StopIteration)ScriptableObject.ensureScriptable(nativeIterator_StopIteration0);
      assertTrue(nativeIterator_StopIteration1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[14];
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      Synchronizer synchronizer0 = new Synchronizer(nativeIterator_StopIteration0, "");
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeIterator_StopIteration0, synchronizer0, nativeIterator_StopIteration0, objectArray0);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Class<Object> class0 = Object.class;
      ScriptableObject.putConstProperty(importerTopLevel0, "msg.change.property.accessor.to.data.with.configurable.false", class0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      importerTopLevel0.sealObject();
      assertTrue(importerTopLevel0.isSealed());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeIterator_StopIteration0, "");
      assertTrue(boolean0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isFalse("+");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn("+", "+").when(context0).toString();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      ScriptableObject.defineConstProperty(importerTopLevel0, "+");
      // Undeclared exception!
      try { 
        importerTopLevel0.defineOwnProperty(context0, context0, importerTopLevel0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot change the enumerable attribute of \"+\" because configurable is false.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeIterator_StopIteration0, "')e\"XtkmZ(q", 0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      nativeIterator_StopIteration0.defineOwnProperty(context0, "error reporter", scriptableObject0);
      assertEquals(0, context0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      ScriptableObject.getTopScopeValue(importerTopLevel0, "+");
      assertTrue(importerTopLevel0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = (NativeIterator.StopIteration)NativeIterator.getStopIterationObject(importerTopLevel0);
      assertTrue(nativeIterator_StopIteration0.isSealed());
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn((String) null, (String) null).when(scriptable0).toString();
      NativeFunction nativeFunction0 = mock(NativeFunction.class, CALLS_REAL_METHODS);
      NativeGenerator nativeGenerator0 = new NativeGenerator(scriptable0, nativeFunction0, scriptable0);
      assertTrue(nativeGenerator0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.get(1);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<Integer> class0 = Integer.class;
      ScriptableObject.getTypedProperty((Scriptable) nativeIterator_StopIteration0, 13, class0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ScriptableObject.redefineProperty(nativeContinuation0, "BLm5%|3;<;BCe]@F", false);
      assertTrue(nativeContinuation0.isEmpty());
      assertTrue(nativeContinuation0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) importerTopLevel0, (-1588406278));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeNumber nativeNumber0 = new NativeNumber(3073.85973413);
      boolean boolean0 = importerTopLevel0.isGenericDescriptor(nativeNumber0);
      assertTrue(boolean0);
      assertTrue(nativeNumber0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(110, nativeArray0, true);
      IdFunctionObject idFunctionObject1 = new IdFunctionObject(nativeIterator_StopIteration0, idFunctionObject0, 68, 8);
      // Undeclared exception!
      try { 
        idFunctionObject1.exportAsScopeProperty();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(importerTopLevel0, true);
      // Undeclared exception!
      try { 
        nativeGenerator0.delete("language version");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: language version.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      importerTopLevel0.sealObject();
      // Undeclared exception!
      try { 
        importerTopLevel0.delete((String) null);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: 0.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) importerTopLevel0, "2n", (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: 2n is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      Class<NativeGenerator> class0 = NativeGenerator.class;
      ScriptableObject.getTypedProperty((Scriptable) nativeCall0, "error reporter", class0);
      assertTrue(nativeCall0.isExtensible());
      assertTrue(nativeCall0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptableObject(topLevel0.PERMANENT);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type number
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      ScriptableObject scriptableObject0 = ScriptableObject.ensureScriptableObject(importerTopLevel0);
      assertTrue(scriptableObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeError nativeError0 = new NativeError();
      assertFalse(nativeError0.isSealed());
      
      IdFunctionObject idFunctionObject0 = importerTopLevel0.exportAsJSClass(1, nativeError0, true);
      importerTopLevel0.initPrototypeConstructor(idFunctionObject0);
      assertTrue(importerTopLevel0.isSealed());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(importerTopLevel0, true);
      importerTopLevel0.defineOwnProperty(context0, nativeGenerator0, importerTopLevel0);
      assertTrue(nativeGenerator0.isEmpty());
      assertTrue(nativeGenerator0.isSealed());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      EcmaError ecmaError0 = NativeGlobal.constructError((Context) null, "NOT_FOUND", "", (Scriptable) nativeError0);
      nativeError0.setStackProvider(ecmaError0);
      assertTrue(nativeError0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        importerTopLevel0.defineProperty("error reporter", class0, 98689);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 98689
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }
}
