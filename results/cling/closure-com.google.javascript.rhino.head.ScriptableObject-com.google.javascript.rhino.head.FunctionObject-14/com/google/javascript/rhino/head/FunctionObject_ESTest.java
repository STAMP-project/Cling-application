/*

 * Tue Mar 03 18:54:09 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
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
import com.google.javascript.rhino.head.FunctionObject;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.InterpretedFunction;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeMath;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FunctionObject_ESTest extends FunctionObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.defineConst("JtK6x_,3]>;4J*`", (Scriptable) null);
      assertFalse(nativeIterator_StopIteration0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      // Undeclared exception!
      try { 
        topLevel0.defineProperty("getClassNam", (Object) "getClassNam", (-986));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -986
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeIterator_StopIteration0, (-1618601797));
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      boolean boolean0 = nativeBoolean0.isConst("eT}!x:35KU~");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.setGetterOrSetter("-_'x4<`]Fh;f'", 4, nativeJavaClass0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -_'x4<`]Fh;f'
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Set<Map.Entry<Object, Object>> set0 = (Set<Map.Entry<Object, Object>>)nativeIterator_StopIteration0.entrySet();
      IdFunctionObject idFunctionObject0 = null;
      try {
        idFunctionObject0 = new IdFunctionObject(nativeIterator_StopIteration0, set0, 2250, "", (-691), (Scriptable) null);
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
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeContinuation0, nativeContinuation0, nativeContinuation0, (Object[]) null);
      assertEquals("function", boundFunction0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeBoolean0, nativeBoolean0, 84);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      importerTopLevel0.put("sGR($ ", (Scriptable) nativeContinuation0, (Object) null);
      assertFalse(nativeContinuation0.isSealed());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<NativeMath> class0 = NativeMath.class;
      NativeString nativeString0 = new NativeString("getFunction");
      ScriptableObject.putProperty((Scriptable) nativeString0, 13, (Object) class0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) importerTopLevel0, "Xk,I.CXn:LU07D.wnyN", objectArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Xk,I.CXn:LU07D.wnyN is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-240L));
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Boolean boolean0 = new Boolean("constructor");
      importerTopLevel0.putConst("jsGet_getAllIds", nativeArray0, boolean0);
      assertFalse(importerTopLevel0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = new Context();
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
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
  public void test14()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      BaseFunction baseFunction0 = new BaseFunction();
      nativeCall0.defineConst("|]h+1g{>#", baseFunction0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      topLevel0.setGetterOrSetter((String) null, (-971), (Callable) null, true);
      assertFalse(topLevel0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeWith nativeWith0 = new NativeWith(nativeJavaClass0, nativeJavaClass0);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.put(2007, (Scriptable) nativeJavaClass0, (Object) nativeWith0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeJavaObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Class<InterpretedFunction> class0 = InterpretedFunction.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) nativeContinuation0, (Class<?>) class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.InterpretedFunction
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        ScriptableObject.isFalse(nativeObject0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        FunctionObject.convertArg(context1, (Scriptable) importerTopLevel0, (Object) importerTopLevel0, 1);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }
}
