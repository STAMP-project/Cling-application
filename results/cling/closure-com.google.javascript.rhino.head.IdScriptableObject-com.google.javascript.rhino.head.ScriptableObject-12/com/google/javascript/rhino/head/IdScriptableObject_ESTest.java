/*

 * Tue Mar 03 18:45:46 GMT 2020
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
import com.google.javascript.rhino.head.JavaScriptException;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import java.util.Comparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber(0.0);
      NativeNumber nativeNumber1 = (NativeNumber)ScriptableObject.ensureScriptable(nativeNumber0);
      assertTrue(nativeNumber1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1250L);
      Context context0 = Context.enter();
      NativeArray nativeArray1 = (NativeArray)context0.initStandardObjects((ScriptableObject) nativeArray0, true);
      // Undeclared exception!
      try { 
        nativeArray1.sort((Comparator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ComparableTimSort", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("error reporter");
      ScriptableObject.defineConstProperty(nativeJavaPackage0, "|TY)VtftjmxH,bQ>");
      assertFalse(nativeJavaPackage0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.defineConstProperty((Scriptable) null, "language version");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeCall nativeCall0 = new NativeCall();
      context0.initStandardObjects((ScriptableObject) nativeCall0, true);
      Object object0 = ScriptableObject.getTopScopeValue(nativeCall0, ")lpJ!9X14:V=54F$t8");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putConstProperty(nativeArray0, "", nativeArray0);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1250L);
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) nativeArray0, true);
      // Undeclared exception!
      try { 
        nativeArray0.exportAsJSClass(1967, scriptableObject0, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: Array.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(414L);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeArray0, "__default_namespace__");
      assertTrue(boolean0);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeError0, (Object) null, 32, 1);
      String[] stringArray0 = new String[12];
      stringArray0[0] = "msg.const.redecl";
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        idFunctionObject0.defineFunctionProperties(stringArray0, class0, 0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Method \"msg.const.redecl\" not found in \"java.lang.String\".
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1250L);
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      nativeArray0.checkPropertyChange("UGGof?x2QY1_m8-U^", importerTopLevel0, importerTopLevel0);
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      Context context0 = Context.getContext();
      boolean boolean0 = ScriptableObject.isFalse(context0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<Object> class0 = Object.class;
      Object object0 = ScriptableObject.getTypedProperty((Scriptable) nativeIterator_StopIteration0, 13, class0);
      assertNull(object0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeError0, (Callable) null, (Scriptable) null, (Object[]) null);
      assertFalse(boundFunction0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.toArray();
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(3427L);
      ScriptableObject.redefineProperty(nativeArray0, "", false);
      assertTrue(nativeArray0.isExtensible());
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeError0, (-521));
      assertFalse(boolean0);
      assertTrue(nativeError0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeError0.defineOwnProperty(context0, (Object) null, nativeIterator_StopIteration0);
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) nativeArray0, "/a", objectArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: /a is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Class<Integer> class0 = Integer.class;
      ScriptableObject.getTypedProperty((Scriptable) nativeError0, "", class0);
      assertTrue(nativeError0.isEmpty());
      assertTrue(nativeError0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      BaseFunction baseFunction0 = new BaseFunction(nativeIterator_StopIteration0, nativeIterator_StopIteration0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      nativeIterator_StopIteration0.defineOwnProperties(context0, baseFunction0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeString nativeString0 = new NativeString("");
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = nativeIterator_StopIteration0.sameValue(nativeString0, (Object) null);
      assertFalse(boolean0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptableObject("k&#p:1^|2H]r|SBW+7(");
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type string
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject scriptableObject0 = ScriptableObject.ensureScriptableObject(nativeIterator_StopIteration0);
      assertTrue(scriptableObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject.getPropertyIds(nativeIterator_StopIteration0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(scriptableObject0, true);
      nativeGenerator0.getOwnPropertyDescriptor(context0, scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      JavaScriptException javaScriptException0 = new JavaScriptException((Object) null);
      nativeError0.setStackProvider(javaScriptException0);
      assertEquals("object", nativeError0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.defineProperty("6O/1SpXY[", class0, 679);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 679
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }
}
