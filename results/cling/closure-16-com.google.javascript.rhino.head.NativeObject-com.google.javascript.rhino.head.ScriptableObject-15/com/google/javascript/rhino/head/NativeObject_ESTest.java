/*

 * Tue Mar 03 18:54:33 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.LazilyLoadedCtor;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeObject_ESTest extends NativeObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeContinuation> class0 = NativeContinuation.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) nativeObject0, class0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(0).when(idFunctionObject0).methodId();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
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
  public void test02()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<Byte> class0 = Byte.class;
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
  public void test03()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.defineProperty("", (Object) "", (Method) null, (Method) null, 69);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 69
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeJavaMethod> class0 = NativeJavaMethod.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) nativeObject0, class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot load class \"com.google.javascript.rhino.head.NativeJavaMethod\" which has no zero-parameter constructor.
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        nativeObject0.getDefaultValue(class0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Short short0 = new Short((short)2019);
      boolean boolean0 = nativeObject0.sameValue(short0, short0);
      assertTrue(nativeObject0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = nativeIterator_StopIteration0.sameValue(nativeIterator_StopIteration0, nativeIterator_StopIteration0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "undefined";
      Class<NativeJavaMethod> class0 = NativeJavaMethod.class;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.defineFunctionProperties(stringArray0, class0, 1458);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Method \"undefined\" not found in \"com.google.javascript.rhino.head.NativeJavaMethod\".
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        ScriptableObject.isTrue(nativeObject0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isTrue((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<TopLevel> class0 = TopLevel.class;
      ScriptableObject.defineClass((Scriptable) nativeIterator_StopIteration0, class0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeObject0.initPrototypeId(9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.initPrototypeId(8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Context context0 = new Context();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArray nativeArray0 = new NativeArray(5);
      nativeIterator_StopIteration0.defineOwnProperties(context0, nativeArray0);
      assertTrue(nativeArray0.isExtensible());
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<Double> class0 = Double.class;
      // Undeclared exception!
      try { 
        nativeObject0.getDefaultValue(class0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = new Context();
      Delegator delegator0 = new Delegator();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeObject0, delegator0, nativeObject0, context0.emptyArgs);
      nativeObject0.equivalentValues(boundFunction0);
      assertTrue(nativeObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(importerTopLevel0, "oSmBa\"", " 9-A[(]]jWI1O0C", false, true);
      // Undeclared exception!
      try { 
        importerTopLevel0.addLazilyInitializedValue(";Er9G!", 13, lazilyLoadedCtor0, 3303);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ;Er9G!
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeWith> class0 = NativeWith.class;
      // Undeclared exception!
      try { 
        nativeObject0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeWith
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<BaseFunction> class0 = BaseFunction.class;
      BaseFunction baseFunction0 = ScriptableObject.buildClassCtor((Scriptable) nativeObject0, class0, true, true);
      assertTrue(nativeObject0.isEmpty());
      assertTrue(baseFunction0.isSealed());
      assertTrue(baseFunction0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeObject0.exportAsJSClass(4, (Scriptable) null, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: Object.
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeCall nativeCall0 = new NativeCall();
      nativeIterator_StopIteration0.checkPropertyChange("\"^#Nb1<q\"", nativeCall0, nativeCall0);
      assertTrue(nativeCall0.isEmpty());
      assertTrue(nativeCall0.isExtensible());
  }
}
