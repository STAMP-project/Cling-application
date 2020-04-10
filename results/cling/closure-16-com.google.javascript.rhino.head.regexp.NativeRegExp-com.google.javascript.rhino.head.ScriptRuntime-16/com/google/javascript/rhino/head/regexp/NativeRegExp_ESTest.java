/*

 * Tue Mar 03 20:39:26 GMT 2020
 */

package com.google.javascript.rhino.head.regexp;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaObject;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.regexp.NativeRegExp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeRegExp_ESTest extends NativeRegExp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = NativeRegExp.compileRE((Context) null, "", "", true);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      // Undeclared exception!
      try { 
        nativeRegExp0.setInstanceIdValue(6, context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 6
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeRegExp.init(context0, importerTopLevel0, true);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(0).when(idFunctionObject0).methodId();
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, context1, idFunctionObject0, idFunctionObject0, (Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = Context.enter((Context) null);
      NativeArray nativeArray0 = new NativeArray(2);
      NativeRegExp.init(context0, nativeArray0, true);
      assertFalse(nativeArray0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        NativeRegExp.compileRE((Context) null, "WPDuO((", "$*", false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeRegExp.init(context0, importerTopLevel0, true);
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(idFunctionObject0).getFunctionName();
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(1).when(idFunctionObject0).methodId();
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeRegExp0.execIdCall(idFunctionObject0, context1, idFunctionObject0, idFunctionObject0, (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Method \"null\" called on incompatible object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = Context.enter((Context) null);
      NativeObject nativeObject0 = (NativeObject)context0.initStandardObjects();
      assertFalse(nativeObject0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Context context0 = new Context();
      NativeRegExp.compileRE(context0, "msg.format3", (String) null, false);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      Synchronizer synchronizer0 = new Synchronizer(importerTopLevel0, "msg.format3");
      BoundFunction boundFunction0 = new BoundFunction(context0, synchronizer0, synchronizer0, synchronizer0, (Object[]) null);
      boundFunction0.hasInstance(synchronizer0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      NativeRegExp nativeRegExp0 = new NativeRegExp();
      Context context0 = Context.getCurrentContext();
      Delegator delegator0 = new Delegator();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) context0;
      // Undeclared exception!
      try { 
        nativeRegExp0.construct(context0, delegator0, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.regexp.NativeRegExp", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) importerTopLevel0, "error reporter", (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: error reporter is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeContinuation> class0 = NativeContinuation.class;
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject(importerTopLevel0, nativeObject0, class0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(importerTopLevel0, nativeJavaObject0, 7, 7);
      // Undeclared exception!
      try { 
        context0.getElements(idFunctionObject0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }
}
