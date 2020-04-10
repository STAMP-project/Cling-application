/*

 * Tue Mar 03 18:55:45 GMT 2020
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
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.LazilyLoadedCtor;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaConstructor;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.UniqueTag;
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
      Class<NativeContinuation> class0 = NativeContinuation.class;
      ScriptableObject.defineClass((Scriptable) nativeObject0, class0, true);
      assertFalse(nativeObject0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      UniqueTag uniqueTag0 = (UniqueTag)Scriptable.NOT_FOUND;
      boolean boolean0 = nativeIterator_StopIteration0.sameValue("Ojt[8;)t@B", uniqueTag0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(0).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeObject0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
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
  public void test03()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Context context0 = Context.getContext();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage(false, "", classLoader0);
      // Undeclared exception!
      try { 
        importerTopLevel0.checkPropertyChange("", nativeJavaPackage0, nativeJavaPackage0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<NativeJavaTopPackage> class0 = NativeJavaTopPackage.class;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.defineProperty("constructor", class0, 2960);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2961
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeArray> class0 = NativeArray.class;
      // Undeclared exception!
      try { 
        ScriptableObject.buildClassCtor((Scriptable) nativeObject0, class0, true, false);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot load class \"com.google.javascript.rhino.head.NativeArray\" which has no zero-parameter constructor.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = Context.getCurrentContext();
      Byte byte0 = new Byte((byte) (-105));
      boolean boolean0 = nativeObject0.sameValue(context0, byte0);
      assertFalse(boolean0);
      assertTrue(nativeObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Byte byte0 = new Byte((byte)99);
      boolean boolean0 = nativeIterator_StopIteration0.sameValue(byte0, byte0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(4, nativeIterator_StopIteration0, false);
      Context context0 = Context.getContext();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.execIdCall(idFunctionObject0, context0, nativeIterator_StopIteration0, nativeIterator_StopIteration0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = new Context();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Delegator delegator0 = new Delegator(nativeObject0);
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("LQIg.");
      NativeJavaPackage nativeJavaPackage1 = nativeJavaPackage0.forcePackage("%=BpwX=k+W<v+)(',*L", delegator0);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.defineOwnProperty(context0, delegator0, nativeJavaPackage1);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: [JavaPackage LQIg..%=BpwX=k+W<v+)(',*L.get] is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "error reporter";
      Class<NativeJavaConstructor> class0 = NativeJavaConstructor.class;
      // Undeclared exception!
      try { 
        nativeObject0.defineFunctionProperties(stringArray0, class0, 55);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Method \"error reporter\" not found in \"com.google.javascript.rhino.head.NativeJavaConstructor\".
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Long long0 = new Long((-6967307053960650171L));
      Long long1 = new Long(0L);
      boolean boolean0 = nativeIterator_StopIteration0.sameValue(long0, long1);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) nativeIterator_StopIteration0, (Class<?>) class0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      boolean boolean0 = ScriptableObject.isFalse(nativeObject0);
      assertTrue(nativeObject0.isExtensible());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isFalse((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<NativeJavaClass> class0 = NativeJavaClass.class;
      // Undeclared exception!
      try { 
        ScriptableObject.buildClassCtor((Scriptable) nativeIterator_StopIteration0, class0, false, false);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unsupported parameter type \"java.lang.Class\" in method \"com.google.javascript.rhino.head.NativeJavaClass\".
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeString nativeString0 = new NativeString("language version");
      IdFunctionObject idFunctionObject0 = nativeObject0.exportAsJSClass(12, nativeString0, true);
      nativeObject0.initPrototypeConstructor(idFunctionObject0);
      assertTrue(nativeObject0.isSealed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<BaseFunction> class0 = BaseFunction.class;
      BaseFunction baseFunction0 = ScriptableObject.buildClassCtor((Scriptable) nativeIterator_StopIteration0, class0, false, false);
      assertTrue(baseFunction0.isExtensible());
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeObject nativeObject0 = new NativeObject();
      assertFalse(nativeObject0.isSealed());
      
      NativeString nativeString0 = new NativeString("language version");
      IdFunctionObject idFunctionObject0 = nativeObject0.exportAsJSClass(12, nativeString0, true);
      nativeObject0.defineOwnProperties(context0, idFunctionObject0);
      assertEquals("Object", nativeObject0.getClassName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<Short> class0 = Short.class;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.getDefaultValue(class0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeJavaPackage nativeJavaPackage0 = (NativeJavaPackage)context0.scratchScriptable;
      NativeObject nativeObject0 = new NativeObject();
      nativeObject0.equivalentValues(nativeJavaPackage0);
      assertTrue(nativeObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeObject0, (String) null, "]", false, false);
      // Undeclared exception!
      try { 
        nativeObject0.addLazilyInitializedValue("]", 5, lazilyLoadedCtor0, 5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ]
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Context context0 = Context.enter();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage((ClassLoader) null);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      ScriptableObject scriptableObject0 = nativeJavaTopPackage0.getOwnPropertyDescriptor(context0, importerTopLevel0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("&3mPSYh", classLoader0);
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      nativeJavaPackage0.defineOwnProperty((Context) null, classLoader0, nativeBoolean0);
      // Undeclared exception!
      try { 
        nativeJavaPackage0.defineOwnProperty((Context) null, classLoader0, nativeBoolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<IdFunctionObject> class0 = IdFunctionObject.class;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.IdFunctionObject
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeObject> class0 = NativeObject.class;
      BaseFunction baseFunction0 = ScriptableObject.buildClassCtor((Scriptable) nativeObject0, class0, true, true);
      assertTrue(baseFunction0.isSealed());
      assertTrue(baseFunction0.isEmpty());
      assertTrue(nativeObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      nativeObject0.exportAsJSClass(100, importerTopLevel0, true);
      // Undeclared exception!
      try { 
        nativeObject0.defineOwnProperties(context0, nativeObject0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.enter();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeIterator_StopIteration0, (Callable) null, nativeIterator_StopIteration0, context0.emptyArgs);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        NativeObject.init((Scriptable) null, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: Object.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }
}
