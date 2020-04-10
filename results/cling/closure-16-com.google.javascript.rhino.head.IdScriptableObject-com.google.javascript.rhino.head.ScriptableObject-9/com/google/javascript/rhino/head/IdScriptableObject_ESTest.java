/*

 * Tue Mar 03 18:43:59 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.JavaAdapter;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeDate;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeFunction;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        baseFunction0.defineProperty("", class0, 1);
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
        ScriptableObject.ensureScriptable("booleanValue");
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
      NativeObject nativeObject0 = new NativeObject();
      NativeObject nativeObject1 = (NativeObject)ScriptableObject.ensureScriptable(nativeObject0);
      assertTrue(nativeObject1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeError0, 12);
      boolean boolean0 = nativeError0.sameValue(object0, object0);
      assertTrue(nativeError0.isEmpty());
      assertTrue(boolean0);
      assertTrue(nativeError0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Context context1 = new Context();
      BoundFunction boundFunction0 = new BoundFunction(context1, nativeIterator_StopIteration0, nativeContinuation0, nativeIterator_StopIteration0, context0.emptyArgs);
      assertFalse(boundFunction0.isSealed());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeError nativeError0 = new NativeError();
      boolean boolean0 = nativeError0.sameValue("Lw]rMZ{", nativeIterator_StopIteration0);
      assertFalse(boolean0);
      assertTrue(nativeError0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ScriptableObject.defineConstProperty(nativeError0, "");
      assertFalse(nativeError0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ScriptableObject.putConstProperty(nativeContinuation0, "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;", nativeContinuation0);
      assertFalse(nativeContinuation0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      nativeObject0.defineOwnProperty(context0, context0, importerTopLevel0);
      assertEquals(Integer.MAX_VALUE, context0.getMaximumInterpreterStackDepth());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      ScriptableObject.putProperty((Scriptable) baseFunction0, 0, (Object) "PI");
      assertFalse(baseFunction0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) baseFunction0, 32767);
      assertTrue(baseFunction0.isExtensible());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext((Context) null);
      Scriptable scriptable0 = context0.initStandardObjects((ScriptableObject) baseFunction0);
      boolean boolean0 = ScriptableObject.deleteProperty(scriptable0, 3562);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      // Undeclared exception!
      try { 
        topLevel0.associateValue("{}", (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) baseFunction0, "");
      assertTrue(boolean0);
      assertTrue(baseFunction0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        nativeContinuation0.defineFunctionProperties(stringArray0, class0, 101);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Method \"\" not found in \"java.lang.Object\".
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isFalse("jsGet_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Class<Integer> class0 = Integer.class;
      ScriptableObject.getTypedProperty((Scriptable) baseFunction0, (-2), class0);
      assertTrue(baseFunction0.isEmpty());
      assertTrue(baseFunction0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      NativeString nativeString0 = new NativeString("language version");
      Class<Object> class0 = Object.class;
      Object object0 = ScriptableObject.getTypedProperty((Scriptable) nativeString0, 8, class0);
      assertEquals(" ", object0);
      assertNotNull(object0);
      assertTrue(nativeString0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(baseFunction0, baseFunction0, 4);
      Context context0 = Context.getCurrentContext();
      baseFunction0.defineOwnProperty(context0, "bRZZpTs", scriptableObject0);
      assertFalse(baseFunction0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        JavaAdapter.createAdapterWrapper(baseFunction0, baseFunction0);
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
  public void test20()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeIterator.getStopIterationObject(importerTopLevel0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn((String) null, (String) null).when(scriptable0).toString();
      NativeFunction nativeFunction0 = mock(NativeFunction.class, CALLS_REAL_METHODS);
      NativeGenerator nativeGenerator0 = new NativeGenerator(scriptable0, nativeFunction0, "");
      assertTrue(nativeGenerator0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      ScriptableObject.putProperty((Scriptable) nativeJavaTopPackage0, "com.google.javascript.rhino.head.NativeCall", (Object) "com.google.javascript.rhino.head.NativeCall");
      assertTrue(nativeJavaTopPackage0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      ScriptableObject.redefineProperty(importerTopLevel0, "}zv:1+b", false);
      assertTrue(importerTopLevel0.isEmpty());
      assertTrue(importerTopLevel0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeObject nativeObject0 = (NativeObject)ScriptableObject.buildDataDescriptor(baseFunction0, baseFunction0, 4);
      boolean boolean0 = nativeObject0.isGenericDescriptor(baseFunction0);
      assertTrue(boolean0);
      assertTrue(baseFunction0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(baseFunction0, baseFunction0, 4);
      boolean boolean0 = baseFunction0.isGenericDescriptor(scriptableObject0);
      assertTrue(baseFunction0.isEmpty());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeDate.init(scriptable0, false);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = Context.getCurrentContext();
      BaseFunction baseFunction0 = new BaseFunction();
      nativeObject0.defineOwnProperty(context0, context0, baseFunction0);
      nativeObject0.defineOwnProperty(context0, context0, baseFunction0);
      assertTrue(baseFunction0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        NativeDate.init((Scriptable) null, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: Date.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeString nativeString0 = new NativeString("=FX");
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) nativeString0, "", objectArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError:  is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      // Undeclared exception!
      try { 
        ScriptableObject.getTypedProperty((Scriptable) nativeError0, "", (Class<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeJavaObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Context context0 = new Context();
      BaseFunction baseFunction0 = new BaseFunction();
      Object object0 = ScriptableObject.getProperty((Scriptable) baseFunction0, 12);
      NativeError nativeError0 = new NativeError();
      boolean boolean0 = nativeError0.sameValue(context0, object0);
      assertTrue(baseFunction0.isEmpty());
      assertFalse(boolean0);
      assertTrue(nativeError0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      assertFalse(nativeJavaTopPackage0.isSealed());
      
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeJavaTopPackage0, "bold");
      assertFalse(boolean0);
      assertTrue(nativeJavaTopPackage0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Context context0 = null;
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptableObject(context0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type object
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject scriptableObject0 = ScriptableObject.ensureScriptableObject(nativeIterator_StopIteration0);
      assertTrue(scriptableObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeString nativeString0 = new NativeString("=FX");
      Object[] objectArray0 = ScriptableObject.getPropertyIds(nativeString0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Object;
      IdFunctionObject idFunctionObject0 = (IdFunctionObject)importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      idFunctionObject0.getOwnPropertyDescriptor(context0, importerTopLevel0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        topLevel0.defineProperty("?S$H", class0, 100000000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 100000001
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("Continuation");
      // Undeclared exception!
      try { 
        ScriptableObject.redefineProperty(nativeJavaPackage0, "Continuation", true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // TypeError: redeclaration of var Continuation.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }
}
