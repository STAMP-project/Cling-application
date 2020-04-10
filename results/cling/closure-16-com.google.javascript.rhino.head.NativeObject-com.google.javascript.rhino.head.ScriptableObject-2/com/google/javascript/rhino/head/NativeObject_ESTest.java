/*

 * Tue Mar 03 18:52:40 GMT 2020
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
import com.google.javascript.rhino.head.FunctionObject;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.LazilyLoadedCtor;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.RhinoException;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeObject_ESTest extends NativeObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(7).when(idFunctionObject0).methodId();
      // Undeclared exception!
      try { 
        nativeObject0.execIdCall(idFunctionObject0, context0, nativeObject0, nativeObject0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeObject0.initPrototypeId(12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<NativeJavaMethod> class0 = NativeJavaMethod.class;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.defineProperty("YZz`#&)Z>i*", class0, 17);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 17
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<IdFunctionObject> class0 = IdFunctionObject.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) nativeObject0, class0, true, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot load class \"com.google.javascript.rhino.head.IdFunctionObject\" which has no zero-parameter constructor.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.initPrototypeId(7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(0).when(idFunctionObject0).methodId();
      // Undeclared exception!
      try { 
        nativeObject0.execIdCall(idFunctionObject0, context0, nativeObject0, nativeObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("AlXRCR^{-J;:-AV3/");
      NativeJavaPackage nativeJavaPackage1 = nativeJavaPackage0.forcePackage("StopIteration", nativeObject0);
      // Undeclared exception!
      try { 
        nativeObject0.checkPropertyDefinition(nativeJavaPackage1);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: [JavaPackage AlXRCR^{-J;:-AV3/.StopIteration.get] is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      importerTopLevel0.setPrototype(nativeObject0);
      nativeObject0.checkPropertyDefinition(importerTopLevel0);
      assertFalse(importerTopLevel0.isSealed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      boolean boolean0 = ScriptableObject.isFalse(importerTopLevel0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isFalse((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeContinuation> class0 = NativeContinuation.class;
      ScriptableObject.defineClass((Scriptable) nativeObject0, class0, true);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Class<BaseFunction> class0 = BaseFunction.class;
      ScriptableObject.defineClass((Scriptable) importerTopLevel0, class0, true);
      assertEquals("JavaImporter", importerTopLevel0.getClassName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.checkPropertyChange("preventExtensions", (ScriptableObject) null, (ScriptableObject) null);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeObject0.initPrototypeId(8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      importerTopLevel0.defineOwnProperties(context0, importerTopLevel0);
      assertTrue(importerTopLevel0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      IdFunctionObject idFunctionObject0 = nativeObject0.exportAsJSClass(1517, nativeObject0, false);
      // Undeclared exception!
      try { 
        nativeObject0.execIdCall(idFunctionObject0, context0, nativeObject0, nativeObject0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        nativeObject0.getOwnPropertyDescriptor(context0, nativeObject0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<BaseFunction> class0 = BaseFunction.class;
      String string0 = ScriptableObject.defineClass((Scriptable) nativeObject0, class0, true, true);
      assertEquals("Function", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      nativeObject0.equivalentValues((Object) null);
      assertTrue(nativeObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeIterator_StopIteration0, "/OZmVSZrB<ByV", "/OZmVSZrB<ByV", true);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.addLazilyInitializedValue("/OZmVSZrB<ByV", 65533, lazilyLoadedCtor0, 65533);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // /OZmVSZrB<ByV
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      nativeError0.setStackProvider((RhinoException) null);
      assertTrue(nativeError0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<FunctionObject> class0 = FunctionObject.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) nativeObject0, (Class<?>) class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.FunctionObject
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<NativeJavaClass> class0 = NativeJavaClass.class;
      // Undeclared exception!
      try { 
        ScriptableObject.buildClassCtor((Scriptable) nativeIterator_StopIteration0, class0, true, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Can't define constructor or class com.google.javascript.rhino.head.NativeJavaObject since more than one constructor has multiple parameters.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = new Context();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeIterator_StopIteration0, nativeJavaClass0, nativeIterator_StopIteration0, context0.emptyArgs);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeObject0.exportAsJSClass(111, nativeObject0, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: Object.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeError nativeError0 = new NativeError();
      nativeObject0.checkPropertyChange("G#c+uPC/g!d6:I@", nativeError0, nativeError0);
      assertTrue(nativeError0.isExtensible());
      assertTrue(nativeError0.isEmpty());
  }
}
