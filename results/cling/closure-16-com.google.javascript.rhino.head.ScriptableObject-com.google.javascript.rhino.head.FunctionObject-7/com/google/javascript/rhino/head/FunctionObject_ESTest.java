/*

 * Tue Mar 03 18:53:42 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.FunctionObject;
import com.google.javascript.rhino.head.IdFunctionCall;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeDate;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaObject;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FunctionObject_ESTest extends FunctionObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(5);
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeArray0, (Object) null, (-25));
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Context context0 = new Context();
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        FunctionObject.convertArg(context0, (Scriptable) baseFunction0, (Object) baseFunction0, 2);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Synchronizer synchronizer0 = new Synchronizer(nativeContinuation0);
      nativeContinuation0.defineConst("error reporter", synchronizer0);
      assertFalse(nativeContinuation0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.checkValidAttributes(2223);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2223
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeString nativeString0 = new NativeString("JavaPackage");
      Object object0 = nativeString0.get(13, (Scriptable) null);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      assertFalse(importerTopLevel0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      boolean boolean0 = nativeError0.isConst("Error");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Context context0 = Context.getContext();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage(false, "M^6", classLoader0);
      NativeArray nativeArray0 = new NativeArray(0L);
      boolean boolean0 = nativeArray0.has(1073741824, (Scriptable) nativeJavaPackage0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      // Undeclared exception!
      try { 
        nativeBoolean0.setGetterOrSetter("SK5F;)vO}six.Xd0X3)", 759, nativeJavaTopPackage0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // SK5F;)vO}six.Xd0X3)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      IdFunctionObject idFunctionObject0 = null;
      try {
        idFunctionObject0 = new IdFunctionObject((IdFunctionCall) null, context0, 120, "]6'!0]}(=^m", 4, (Scriptable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      Context context0 = Context.getContext();
      BaseFunction baseFunction0 = new BaseFunction();
      BoundFunction boundFunction0 = new BoundFunction(context0, baseFunction0, delegator0, delegator0, context0.emptyArgs);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeString nativeString0 = new NativeString("^h0:7>}i1rPE#");
      nativeString0.putConst("get", nativeString0, nativeString0);
      assertEquals("^h0:7>}i1rPE#", nativeString0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<String> class0 = String.class;
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeIterator_StopIteration0, class0, 10000);
      assertEquals("Object", scriptableObject0.getClassName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.put("StopIteration", (Scriptable) nativeJavaObject0, (Object) nativeJavaObject0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeJavaObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeString nativeString0 = new NativeString("^h0:7>}i)!PE#");
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) nativeString0, "//LLXs`EXe", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: //LLXs`EXe is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) nativeError0, (Class<?>) null);
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
      Class<NativeDate> class0 = NativeDate.class;
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        nativeContinuation0.putConst("execIdCall", (Scriptable) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      nativeBoolean0.defineConst("msg.default.value", nativeIterator_StopIteration0);
      assertFalse(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Set<Map.Entry<Object, Object>> set0 = (Set<Map.Entry<Object, Object>>)nativeIterator_StopIteration0.entrySet();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeIterator_StopIteration0, nativeIterator_StopIteration0, 13);
      nativeIterator_StopIteration0.put(4, (Scriptable) scriptableObject0, (Object) set0);
      assertFalse(nativeIterator_StopIteration0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      Class<Boolean> class0 = Boolean.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<String> class0 = String.class;
      NativeArray nativeArray0 = new NativeArray(97L);
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
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
  public void test22()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      // Undeclared exception!
      try { 
        nativeBoolean0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type interface java.lang.annotation.Annotation
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }
}
