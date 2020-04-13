/*

 * Tue Mar 03 20:47:07 GMT 2020
 */

package com.google.javascript.rhino.head.tools.shell;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Function;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.tools.shell.Global;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Global_ESTest extends Global_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      TopLevel topLevel0 = new TopLevel();
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        Global.sync(context0, topLevel0, objectArray0, (Function) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global(context0);
      PrintStream printStream0 = global0.getOut();
      global0.setOut(printStream0);
      PrintStream printStream1 = global0.getOut();
      assertSame(printStream1, printStream0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        Global.doctest((Context) null, (Scriptable) null, objectArray0, nativeContinuation0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.String;
      IdFunctionObject idFunctionObject0 = (IdFunctionObject)TopLevel.getBuiltinCtor((Context) null, (Scriptable) global0, topLevel_Builtins0);
      Global.quit(context0, global0, objectArray0, idFunctionObject0);
      assertFalse(idFunctionObject0.isSealed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage((String) null);
      Object[] objectArray0 = new Object[0];
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        Global.spawn((Context) null, nativeJavaPackage0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Delegator delegator0 = new Delegator();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) baseFunction0;
      // Undeclared exception!
      try { 
        Global.seal((Context) null, delegator0, objectArray0, delegator0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function can only be applied to objects
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        Global.pipe(false, pipedInputStream0, pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        Global.runCommand((Context) null, nativeContinuation0, objectArray0, nativeContinuation0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // The first argument to runCommand must be a command name.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global(context0);
      InputStream inputStream0 = global0.getIn();
      assertNotNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage((String) null);
      Object[] objectArray0 = new Object[1];
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        Global.spawn((Context) null, nativeJavaPackage0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) delegator0;
      // Undeclared exception!
      try { 
        Global.seal((Context) null, delegator0, objectArray0, delegator0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function supports only sealing of ScriptableObject instances
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) nativeContinuation0;
      // Undeclared exception!
      try { 
        Global.spawn((Context) null, nativeJavaClass0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) nativeContinuation0;
      // Undeclared exception!
      try { 
        Global.spawn((Context) null, nativeJavaClass0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object[] objectArray0 = new Object[0];
      Global.seal((Context) null, nativeContinuation0, objectArray0, nativeContinuation0);
      assertEquals("object", nativeContinuation0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      Object[] objectArray0 = new Object[7];
      // Undeclared exception!
      try { 
        Global.sync((Context) null, delegator0, objectArray0, delegator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        Global.pipe(true, inputStream0, pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        Global.sync((Context) null, baseFunction0, objectArray0, baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Global.pipe(false, inputStream0, pipedOutputStream0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage((String) null);
      Object[] objectArray0 = new Object[0];
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      Global.toint32((Context) null, nativeJavaPackage0, objectArray0, function0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      try { 
        Global.readFile((Context) null, nativeJavaClass0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File not found: null
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      int int0 = global0.runDoctest(context0, nativeJavaClass0, "&g1C(9TrzE", "&g1C(9TrzE", (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Object[] objectArray0 = new Object[8];
      objectArray0[7] = (Object) importerTopLevel0;
      Class<Delegator> class0 = Delegator.class;
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass(importerTopLevel0, class0);
      // Undeclared exception!
      try { 
        Global.runCommand(context0, importerTopLevel0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Delegator delegator0 = new Delegator();
      try { 
        Global.readUrl((Context) null, delegator0, objectArray0, delegator0);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: null
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage((String) null);
      Global global0 = new Global();
      Delegator delegator0 = new Delegator(nativeJavaPackage0);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        global0.runDoctest(context0, delegator0, "js>.#{9fZh/K^", "error reporter", 160);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // doctest failure running:
         // .#{9fZh/K^
         // expected: actual: js: \"doctest input\", line 1: syntax error
         // js: .#{9fZh/K^
         // js: .^
         // js: \"doctest input\", line 1: illegal character
         // js: .#{9fZh/K^
         // js: .^
         // js: \"doctest input\", line 1: missing ; before statement
         // js: .#{9fZh/K^
         // js: .......^
         // js: \"doctest input\", line 1: missing } in compound statement
         // js: .#{9fZh/K^
         // js: .........^
         // js: \"doctest input\", line 1: Compilation produced 4 syntax errors.
         // 
         // 
         //  (error reporter#160)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Global.runCommand((Context) null, (Scriptable) null, objectArray0, nativeJavaClass0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }
}
