/*

 * Tue Mar 03 18:44:50 GMT 2020
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
import com.google.javascript.rhino.head.JavaAdapter;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeDate;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.ScriptRuntime;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Class<NativeDate> class0 = NativeDate.class;
      // Undeclared exception!
      try { 
        baseFunction0.defineProperty("", class0, 413);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptable("DOTDOT");
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type string
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber(2988.7166018);
      NativeNumber nativeNumber1 = (NativeNumber)ScriptableObject.ensureScriptable(nativeNumber0);
      assertTrue(nativeNumber1.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = Context.getCurrentContext();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Scriptable scriptable0 = context0.initStandardObjects((ScriptableObject) nativeIterator_StopIteration0);
      Object object0 = ScriptableObject.getTopScopeValue(scriptable0, baseFunction0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject.putConstProperty(nativeIterator_StopIteration0, "", nativeIterator_StopIteration0);
      assertFalse(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.checkPropertyDefinition(importerTopLevel0);
      assertEquals("object", importerTopLevel0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) scriptableObject0, 79);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        baseFunction0.associateValue((Object) null, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null).when(scriptable0).toString();
      Callable callable0 = mock(Callable.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.NoSuchMethodShim scriptRuntime_NoSuchMethodShim0 = new ScriptRuntime.NoSuchMethodShim(callable0, (String) null);
      BoundFunction boundFunction0 = new BoundFunction(context0, scriptable0, scriptRuntime_NoSuchMethodShim0, scriptable0, (Object[]) null);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Scriptable scriptable0 = JavaAdapter.createAdapterWrapper(scriptableObject0, "error reporter");
      assertEquals("JavaObject", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Method[] methodArray0 = new Method[7];
      NativeArray nativeArray0 = new NativeArray(methodArray0);
      int int0 = nativeArray0.indexOf("QK]");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Class<Object> class0 = Object.class;
      Object object0 = ScriptableObject.getTypedProperty((Scriptable) baseFunction0, 2, class0);
      assertNull(object0);
      assertTrue(baseFunction0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn("", (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      BaseFunction baseFunction0 = new BaseFunction(scriptable0, scriptable0);
      NativeBoolean.init(baseFunction0, true);
      assertFalse(baseFunction0.isSealed());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = Context.getCurrentContext();
      NativeError nativeError0 = new NativeError();
      baseFunction0.defineOwnProperty(context0, context0, nativeError0);
      assertEquals("function", baseFunction0.getTypeOf());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.String;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      // Undeclared exception!
      try { 
        baseFunction0.delete("error reporter");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: error reporter.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) nativeIterator_StopIteration0, "language version", (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: language version is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Class<String> class0 = String.class;
      String string0 = ScriptableObject.getTypedProperty((Scriptable) nativeError0, "did not initialize id=", class0);
      assertNull(string0);
      assertTrue(nativeError0.isEmpty());
      assertTrue(nativeError0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Context context0 = Context.getCurrentContext();
      boolean boolean0 = nativeContinuation0.sameValue("", context0);
      assertTrue(nativeContinuation0.isExtensible());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      importerTopLevel0.put("nxsYw?DfB3M&>", (Scriptable) baseFunction0, (Object) null);
      // Undeclared exception!
      try { 
        importerTopLevel0.defineOwnProperties((Context) null, baseFunction0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type object
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ScriptableObject scriptableObject0 = ScriptableObject.ensureScriptableObject(nativeError0);
      assertTrue(scriptableObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeNumber nativeNumber0 = new NativeNumber((-3151.5911695921554));
      IdFunctionObject idFunctionObject0 = baseFunction0.exportAsJSClass(79, nativeNumber0, true);
      baseFunction0.initPrototypeConstructor(idFunctionObject0);
      assertTrue(baseFunction0.isSealed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      importerTopLevel0.getOwnPropertyDescriptor(context0, importerTopLevel0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Class<String> class0 = String.class;
      nativeContinuation0.defineProperty("|[\"|ra", class0, 1);
      assertTrue(nativeContinuation0.isExtensible());
  }
}
