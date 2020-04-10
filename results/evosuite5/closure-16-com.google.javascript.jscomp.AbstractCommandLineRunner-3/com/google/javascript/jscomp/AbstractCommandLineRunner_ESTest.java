/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 07:01:03 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.AbstractCommandLineRunner;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CommandLineRunner;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.FunctionInformationMap;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.JSModuleGraph;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.PhaseOptimizer;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.Result;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.jscomp.VariableMap;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Stack;
import java.util.Vector;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractCommandLineRunner_ESTest extends AbstractCommandLineRunner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
      List<String> list0 = PhaseOptimizer.OPTIMAL_ORDER;
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setOutputManifest(list0);
      assertNotNull(abstractCommandLineRunner_CommandLineConfig1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      JSModule[] jSModuleArray0 = new JSModule[1];
      JSModule jSModule0 = new JSModule("1d");
      jSModuleArray0[0] = jSModule0;
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph(jSModuleArray0);
      CharBuffer charBuffer0 = CharBuffer.allocate(1639);
      commandLineRunner0.printModuleGraphManifestOrBundleTo(jSModuleGraph0, charBuffer0, true);
      assertEquals(1634, charBuffer0.length());
      assertEquals(1634, charBuffer0.remaining());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      JSModule jSModule0 = new JSModule("A{|ng=F");
      List<String> list0 = jSModule0.getProvides();
      // Undeclared exception!
      try { 
        AbstractCommandLineRunner.createDefineOrTweakReplacements(list0, compilerOptions0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // --define flag syntax invalid: A{|ng=F
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      AbstractCommandLineRunner.createDefineOrTweakReplacements(list0, compilerOptions0, false);
      assertFalse(compilerOptions0.aliasAllStrings);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      JSModule jSModule0 = new JSModule("np=4i");
      List<String> list0 = jSModule0.getProvides();
      // Undeclared exception!
      try { 
        AbstractCommandLineRunner.createDefineOrTweakReplacements(list0, compilerOptions0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // --tweak flag syntax invalid: np=4i
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      JSModule jSModule0 = new JSModule("");
      List<String> list0 = jSModule0.getProvides();
      // Undeclared exception!
      try { 
        AbstractCommandLineRunner.createDefineOrTweakReplacements(list0, compilerOptions0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // --define flag syntax invalid: 
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSModule jSModule0 = new JSModule("]l%Hmf!LH*,D(XQ|");
      List<String> list0 = jSModule0.getProvides();
      // Undeclared exception!
      try { 
        AbstractCommandLineRunner.createDefineOrTweakReplacements(list0, (CompilerOptions) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      OutputStream outputStream0 = commandLineRunner0.filenameToOutputStream((String) null);
      assertNull(outputStream0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      OutputStream outputStream0 = commandLineRunner0.filenameToOutputStream("_vars_map.out");
      assertNotNull(outputStream0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      Logger logger0 = Logger.getAnonymousLogger((String) null);
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Result result0 = compiler0.getResult();
      // Undeclared exception!
      try { 
        commandLineRunner0.processResults(result0, (List<JSModule>) null, (CompilerOptions) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      ArrayList<SourceFile> arrayList0 = new ArrayList<SourceFile>();
      Stack<JSModule> stack0 = new Stack<JSModule>();
      Compiler compiler0 = commandLineRunner0.createCompiler();
      CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
      Result result0 = compiler0.compileModules((List<SourceFile>) arrayList0, (List<JSModule>) stack0, compilerOptions0);
      int int0 = commandLineRunner0.processResults(result0, stack0, compilerOptions0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("SIMLE_)OPTIIZATIONS");
      AbstractCommandLineRunner.writeOutput(mockPrintStream0, (Compiler) null, "Duplicate extern input: {0}", "Duplicate extern input: {0}", "Duplicate extern input: {0}");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("SIMLE_)OPTIIZATIONS");
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(mockPrintStream0);
      Compiler compiler0 = new Compiler(printStreamErrorManager0);
      AbstractCommandLineRunner.writeOutput(mockPrintStream0, compiler0, "P", "SIMLE_)OPTIIZATIONS", "P");
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("SIMLE_)OPTIIZATIONS");
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(mockPrintStream0);
      Compiler compiler0 = new Compiler(printStreamErrorManager0);
      AbstractCommandLineRunner.writeOutput(mockPrintStream0, compiler0, ">P", "SIMLE_)OPTIIZATIONS", ">P");
      assertEquals(0.0, compiler0.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      StringBuilder stringBuilder0 = new StringBuilder();
      JSModule jSModule0 = new JSModule("tDy:5B@t'A`");
      // Undeclared exception!
      try { 
        commandLineRunner0.writeModuleOutput(stringBuilder0, jSModule0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Stack<String> stack0 = new Stack<String>();
      stack0.add("BOst tixe: ");
      LinkedList<JSModule> linkedList0 = new LinkedList<JSModule>();
      try { 
        AbstractCommandLineRunner.parseModuleWrappers(stack0, linkedList0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown module: 'BOst tixe'
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      List<String> list0 = PhaseOptimizer.OPTIMAL_ORDER;
      ArrayList<JSModule> arrayList0 = new ArrayList<JSModule>();
      try { 
        AbstractCommandLineRunner.parseModuleWrappers(list0, arrayList0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected module wrapper to have <name>:<wrapper> format: deadAssignmentsElimination
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      List<String> list0 = PhaseOptimizer.OPTIMAL_ORDER;
      ArrayList<JSModule> arrayList0 = new ArrayList<JSModule>();
      arrayList0.add((JSModule) null);
      // Undeclared exception!
      try { 
        AbstractCommandLineRunner.parseModuleWrappers(list0, arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Stack<JSModule> stack0 = new Stack<JSModule>();
      // Undeclared exception!
      try { 
        AbstractCommandLineRunner.parseModuleWrappers((List<String>) null, stack0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Stack<String> stack0 = new Stack<String>();
      stack0.add("MQlczgZv*'ZwY?6w1");
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      try { 
        commandLineRunner0.createJsModules(stack0, stack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected 2-4 colon-delimited parts in module spec: MQlczgZv*'ZwY?6w1
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Stack<String> stack0 = new Stack<String>();
      stack0.add("BOst tixe: ");
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      // Undeclared exception!
      try { 
        commandLineRunner0.createJsModules(stack0, (List<String>) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Stack<String> stack0 = new Stack<String>();
      stack0.add("BstDTixe:T");
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      try { 
        commandLineRunner0.createJsModules(stack0, stack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid JS file count 'T' for module: BstDTixe
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Stack<String> stack0 = new Stack<String>();
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      // Undeclared exception!
      try { 
        commandLineRunner0.createJsModules(stack0, stack0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      // Undeclared exception!
      try { 
        commandLineRunner0.createJsModules((List<String>) null, (List<String>) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[0];
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      List<SourceFile> list1 = commandLineRunner0.createInputs(list0, false);
      assertEquals(1, list1.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      CompilerOptions compilerOptions0 = commandLineRunner0.createOptions();
      commandLineRunner0.setRunOptions(compilerOptions0);
      assertTrue(compilerOptions0.checkSuspiciousCode);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-=";
      stringArray0[1] = "com.google.javascript.rhino.head.TopLevel";
      stringArray0[2] = "w3c_geolocation.js";
      stringArray0[3] = "com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException";
      stringArray0[4] = "5%Xc";
      stringArray0[5] = "4%KS3iB/Rmdk9";
      stringArray0[6] = "nsWJ[gzszJ{CtN4+Y";
      stringArray0[7] = "``dHmsDlWzdM1FB";
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      CompilerOptions compilerOptions0 = commandLineRunner0.createOptions();
      commandLineRunner0.setRunOptions(compilerOptions0);
      assertNull(compilerOptions0.getLanguageOut());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      Supplier<List<SourceFile>> supplier0 = (Supplier<List<SourceFile>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      Function<Integer, Boolean> function0 = (Function<Integer, Boolean>) mock(Function.class, new ViolatedAssumptionAnswer());
      commandLineRunner0.enableTestMode(supplier0, supplier0, (Supplier<List<JSModule>>) null, function0);
      assertTrue(commandLineRunner0.shouldRunCompiler());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[0];
      MockFile mockFile0 = new MockFile("/Z\"b]4C)A7!|LV.");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0, mockPrintStream0, mockPrintStream0);
      Supplier<List<JSModule>> supplier0 = (Supplier<List<JSModule>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      Function<Integer, Boolean> function0 = (Function<Integer, Boolean>) mock(Function.class, new ViolatedAssumptionAnswer());
      commandLineRunner0.enableTestMode((Supplier<List<SourceFile>>) null, (Supplier<List<SourceFile>>) null, supplier0, function0);
      assertTrue(commandLineRunner0.shouldRunCompiler());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AbstractCommandLineRunner.WarningGuardSpec abstractCommandLineRunner_WarningGuardSpec0 = new AbstractCommandLineRunner.WarningGuardSpec();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      abstractCommandLineRunner_WarningGuardSpec0.add(checkLevel0, "No %s placeholder in module wrapper: '");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        CommandLineRunner.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "{8~1sHiYh~Z)YRPh";
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      Compiler compiler0 = commandLineRunner0.getCompiler();
      assertNull(compiler0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      commandLineRunner0.initOptionsFromFlags((CompilerOptions) null);
      assertTrue(commandLineRunner0.shouldRunCompiler());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      ArrayList<SourceFile> arrayList0 = new ArrayList<SourceFile>();
      Stack<JSModule> stack0 = new Stack<JSModule>();
      Compiler compiler0 = commandLineRunner0.createCompiler();
      CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
      Result result0 = compiler0.compileModules((List<SourceFile>) arrayList0, (List<JSModule>) stack0, compilerOptions0);
      Result result1 = new Result(result0.warnings, result0.errors, (String) null, (VariableMap) null, (VariableMap) null, (VariableMap) null, (FunctionInformationMap) null, (SourceMap) null, "");
      commandLineRunner0.processResults(result1, stack0, compilerOptions0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(bufferedOutputStream0);
      Charset charset0 = Charset.defaultCharset();
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(mockPrintStream0, charset0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(outputStreamWriter0);
      // Undeclared exception!
      try { 
        commandLineRunner0.writeModuleOutput(mockPrintWriter0, (JSModule) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.ALL;
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setSourceMapDetailLevel(sourceMap_DetailLevel0);
      assertNotNull(abstractCommandLineRunner_CommandLineConfig1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setComputePhaseOrdering(false);
      assertNotNull(abstractCommandLineRunner_CommandLineConfig1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      CodedInputStream codedInputStream0 = CodedInputStream.newInstance(byteArray0, 0, (int) (byte)0);
      ExtensionRegistryLite extensionRegistryLite0 = ExtensionRegistryLite.getEmptyRegistry();
      DescriptorProtos.FileDescriptorProto descriptorProtos_FileDescriptorProto0 = DescriptorProtos.FileDescriptorProto.parseFrom(codedInputStream0, extensionRegistryLite0);
      List<String> list0 = descriptorProtos_FileDescriptorProto0.getDependencyList();
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setTweak(list0);
      assertNotNull(abstractCommandLineRunner_CommandLineConfig1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
      CompilerOptions.TweakProcessing compilerOptions_TweakProcessing0 = CompilerOptions.TweakProcessing.CHECK;
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setTweakProcessing(compilerOptions_TweakProcessing0);
      assertNotNull(abstractCommandLineRunner_CommandLineConfig1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
      Vector<String> vector0 = new Vector<String>();
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setManifestMaps(vector0);
      assertNotNull(abstractCommandLineRunner_CommandLineConfig1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setOutputBundle(list0);
      assertNotNull(abstractCommandLineRunner_CommandLineConfig1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setSkipNormalOutputs(false);
      assertNotNull(abstractCommandLineRunner_CommandLineConfig1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "{8~1sHiYh~Z)YRPh";
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      try { 
        commandLineRunner0.checkModuleName("{8~1sHiYh~Z)YRPh");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid module name: '{8~1sHiYh~Z)YRPh'
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }
}
