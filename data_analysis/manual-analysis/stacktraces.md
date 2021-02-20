# Closure

## closure-16-com.google.javascript.rhino.head.NativeArray-com.google.javascript.rhino.head.ScriptRuntime-18
### ST50-F27
test18
```
java.lang.NullPointerException
com.google.javascript.rhino.head.ScriptRuntime.storeIndexResult(ScriptRuntime.java:3943)
com.google.javascript.rhino.head.ScriptRuntime.toStringIdOrIndex(ScriptRuntime.java:1439)
com.google.javascript.rhino.head.ScriptableObject.getSlot(ScriptableObject.java:3100)
com.google.javascript.rhino.head.ScriptableObject.getOwnPropertyDescriptor(ScriptableObject.java:3093)
com.google.javascript.rhino.head.IdScriptableObject.getOwnPropertyDescriptor(IdScriptableObject.java:778)
com.google.javascript.rhino.head.NativeArray.getOwnPropertyDescriptor(NativeArray.java:584)
```



## closure-16-com.google.javascript.rhino.head.ScriptRuntime-com.google.javascript.rhino.head.ScriptableObject-13
### ST49-F26
test00
```
java.lang.NullPointerException
com.google.javascript.rhino.head.NativeJavaObject.get(NativeJavaObject.java:116)
com.google.javascript.rhino.head.ScriptableObject.getProperty(ScriptableObject.java:2268)
com.google.javascript.rhino.head.ScriptRuntime.getObjectIndex(ScriptRuntime.java:1585)
com.google.javascript.rhino.head.ScriptRuntime.getObjectIndex(ScriptRuntime.java:1574)
```

## closure-16-com.google.javascript.rhino.head.ScriptRuntime-com.google.javascript.rhino.head.ScriptableObject-7
### ST48-F25
test03
```
java.lang.NullPointerException
com.google.javascript.rhino.head.ScriptableObject.getBase(ScriptableObject.java:2560)
com.google.javascript.rhino.head.ScriptableObject.putProperty(ScriptableObject.java:2373)
com.google.javascript.rhino.head.ScriptRuntime.setObjectElem(ScriptRuntime.java:1617)
```



## closure-16-com.google.javascript.rhino.head.ScriptRuntime-com.google.javascript.rhino.head.ScriptableObject-2
### ST47-NF23
test00
```
java.lang.NullPointerException
com.google.javascript.rhino.head.Delegator.has(Delegator.java:136)
com.google.javascript.rhino.head.ScriptableObject.getBase(ScriptableObject.java:2560)
com.google.javascript.rhino.head.ScriptableObject.putProperty(ScriptableObject.java:2373)
com.google.javascript.rhino.head.ScriptRuntime.setObjectProp(ScriptRuntime.java:1640)
com.google.javascript.rhino.head.ScriptRuntime.setObjectProp(ScriptRuntime.java:1634)
```


## closure-16-com.google.javascript.rhino.head.ScriptRuntime-com.google.javascript.rhino.head.ScriptableObject-1

### ST46-F24
test06
```
java.lang.NullPointerException
com.google.javascript.rhino.head.NativeJavaObject.has(NativeJavaObject.java:96)
com.google.javascript.rhino.head.ScriptableObject.getBase(ScriptableObject.java:2560)
com.google.javascript.rhino.head.ScriptableObject.putProperty(ScriptableObject.java:2373)
com.google.javascript.rhino.head.ScriptRuntime.setObjectProp(ScriptRuntime.java:1640)
com.google.javascript.rhino.head.ScriptRuntime.setObjectIndex(ScriptRuntime.java:1661)
```
### ST45-F23

test05
```
java.lang.NullPointerException
com.google.javascript.rhino.head.NativeJavaObject.put(NativeJavaObject.java:130)
com.google.javascript.rhino.head.ScriptableObject.putProperty(ScriptableObject.java:2423)
com.google.javascript.rhino.head.ScriptRuntime.setObjectIndex(ScriptRuntime.java:1668)
com.google.javascript.rhino.head.ScriptRuntime.setObjectIndex(ScriptRuntime.java:1658)
```

## closure-16-com.google.javascript.jscomp.NodeUtil-com.google.javascript.rhino.Node-14
### ST44-F22
test65
```
java.lang.NullPointerException
com.google.javascript.rhino.Node.addChildToBack(Node.java:609)
com.google.javascript.jscomp.NodeUtil.newCallNode(NodeUtil.java:2883)
```
## closure-16-com.google.javascript.jscomp.NodeUtil-com.google.javascript.rhino.Node-10
### ST43-F21
test083
```
java.lang.ClassCastException: java.lang.String cannot be cast to com.google.javascript.rhino.jstype.StaticSourceFile
com.google.javascript.rhino.Node.getStaticSourceFile(Node.java:1110)
com.google.javascript.rhino.Node.getSourceFileName(Node.java:1104)
com.google.javascript.rhino.Node.getProp(Node.java:811)
com.google.javascript.rhino.Node.copyInformationFrom(Node.java:1739)
com.google.javascript.rhino.Node.copyInformationFromForTree(Node.java:1754)
com.google.javascript.jscomp.NodeUtil.setDebugInformation(NodeUtil.java:2345)
```

## closure-16-com.google.javascript.jscomp.NodeUtil-com.google.javascript.rhino.Node-12
### ST42-NF22
test78
```
java.lang.NullPointerException
com.google.javascript.rhino.Node.copyInformationFrom(Node.java:1733)
com.google.javascript.rhino.Node.copyInformationFromForTree(Node.java:1754)
com.google.javascript.jscomp.NodeUtil.setDebugInformation(NodeUtil.java:2345)
com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(NodeUtil.java:2318)
```


## closure-16-com.google.javascript.rhino.head.IRFactory-com.google.javascript.rhino.head.Decompiler-2
### ST41-F20
test01
```
java.lang.NullPointerException
com.google.javascript.rhino.head.Decompiler.appendString(Decompiler.java:226)
com.google.javascript.rhino.head.Decompiler.addName(Decompiler.java:156)
com.google.javascript.rhino.head.IRFactory.transformName(IRFactory.java:833)
com.google.javascript.rhino.head.IRFactory.transform(IRFactory.java:157)
```

## closure-16-com.google.javascript.rhino.head.NativeArray-com.google.javascript.rhino.head.IdScriptableObject-2
### ST40-F19
test03
```
java.lang.NullPointerException
com.google.javascript.rhino.head.IdScriptableObject.initPrototypeMethod(IdScriptableObject.java:646)
com.google.javascript.rhino.head.NativeArray.initPrototypeId(NativeArray.java:243)
```

## closure-16-com.google.javascript.rhino.head.NativeArray-com.google.javascript.rhino.head.IdScriptableObject-4
### ST39-NF21
test18
```
java.lang.IllegalArgumentException: 24
com.google.javascript.rhino.head.NativeArray.initPrototypeId(NativeArray.java:241)
com.google.javascript.rhino.head.IdScriptableObject$PrototypeValues.ensureId(IdScriptableObject.java:303)
com.google.javascript.rhino.head.IdScriptableObject$PrototypeValues.getNames(IdScriptableObject.java:252)
com.google.javascript.rhino.head.IdScriptableObject.getIds(IdScriptableObject.java:489)
com.google.javascript.rhino.head.ScriptableObject.getIds(ScriptableObject.java:899)
com.google.javascript.rhino.head.NativeArray.getIds(NativeArray.java:493)
com.google.javascript.rhino.head.NativeArray.getIndexIds(NativeArray.java:532)
```

## closure-16-com.google.javascript.rhino.head.NativeArray-com.google.javascript.rhino.head.IdScriptableObject-13
### ST38-F18
test14
```
com.google.javascript.rhino.head.EcmaError: TypeError: Cannot find default value for object.
com.google.javascript.rhino.head.ScriptRuntime.constructError(ScriptRuntime.java:3728)
com.google.javascript.rhino.head.ScriptRuntime.constructError(ScriptRuntime.java:3706)
com.google.javascript.rhino.head.ScriptRuntime.typeError(ScriptRuntime.java:3734)
com.google.javascript.rhino.head.ScriptRuntime.typeError1(ScriptRuntime.java:3746)
com.google.javascript.rhino.head.ScriptableObject.getDefaultValue(ScriptableObject.java:1014)
com.google.javascript.rhino.head.ScriptableObject.getDefaultValue(ScriptableObject.java:933)
com.google.javascript.rhino.head.ScriptRuntime.toString(ScriptRuntime.java:803)
com.google.javascript.rhino.head.ScriptRuntime.toStringIdOrIndex(ScriptRuntime.java:1448)
com.google.javascript.rhino.head.ScriptableObject.getSlot(ScriptableObject.java:3100)
com.google.javascript.rhino.head.ScriptableObject.getOwnPropertyDescriptor(ScriptableObject.java:3093)
com.google.javascript.rhino.head.IdScriptableObject.getOwnPropertyDescriptor(IdScriptableObject.java:778)
com.google.javascript.rhino.head.NativeArray.getOwnPropertyDescriptor(NativeArray.java:584)
```

## closure-16-com.google.javascript.rhino.head.NativeArray-com.google.javascript.rhino.head.IdScriptableObject-11
### ST37-F17
test12
```
java.lang.NullPointerException
com.google.javascript.rhino.head.NativeJavaClass.toString(NativeJavaClass.java:305)
com.google.javascript.rhino.head.NativeJavaClass.getDefaultValue(NativeJavaClass.java:155)
com.google.javascript.rhino.head.ScriptRuntime.toString(ScriptRuntime.java:803)
com.google.javascript.rhino.head.ScriptRuntime.toStringIdOrIndex(ScriptRuntime.java:1448)
com.google.javascript.rhino.head.ScriptableObject.getSlot(ScriptableObject.java:3100)
com.google.javascript.rhino.head.ScriptableObject.getOwnPropertyDescriptor(ScriptableObject.java:3093)
com.google.javascript.rhino.head.IdScriptableObject.getOwnPropertyDescriptor(IdScriptableObject.java:778)
com.google.javascript.rhino.head.NativeArray.getOwnPropertyDescriptor(NativeArray.java:584)
```

## closure-16-com.google.javascript.rhino.head.NativeArray-com.google.javascript.rhino.head.IdScriptableObject-12
### ST36-F16
test15
```
java.lang.NullPointerException
com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope(ScriptableObject.java:2131)
com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype(ScriptableObject.java:2075)
com.google.javascript.rhino.head.IdFunctionObject.getPrototype(IdFunctionObject.java:119)
com.google.javascript.rhino.head.ScriptableObject.getProperty(ScriptableObject.java:2216)
com.google.javascript.rhino.head.ScriptableObject.getDefaultValue(ScriptableObject.java:987)
com.google.javascript.rhino.head.ScriptableObject.getDefaultValue(ScriptableObject.java:933)
com.google.javascript.rhino.head.ScriptRuntime.toString(ScriptRuntime.java:803)
com.google.javascript.rhino.head.ScriptRuntime.toStringIdOrIndex(ScriptRuntime.java:1448)
com.google.javascript.rhino.head.ScriptableObject.getSlot(ScriptableObject.java:3100)
com.google.javascript.rhino.head.ScriptableObject.getOwnPropertyDescriptor(ScriptableObject.java:3093)
com.google.javascript.rhino.head.IdScriptableObject.getOwnPropertyDescriptor(IdScriptableObject.java:778)
com.google.javascript.rhino.head.NativeArray.getOwnPropertyDescriptor(NativeArray.java:584)
```

## closure-16-com.google.javascript.rhino.head.ScriptableObject-com.google.javascript.rhino.head.FunctionObject-18
### ST35-F15
test01
```
com.google.javascript.rhino.head.EcmaError: TypeError: Cannot find default value for object.
com.google.javascript.rhino.head.ScriptRuntime.constructError(ScriptRuntime.java:3728)
com.google.javascript.rhino.head.ScriptRuntime.constructError(ScriptRuntime.java:3706)
com.google.javascript.rhino.head.ScriptRuntime.typeError(ScriptRuntime.java:3734)
com.google.javascript.rhino.head.ScriptRuntime.typeError1(ScriptRuntime.java:3746)
com.google.javascript.rhino.head.ScriptableObject.getDefaultValue(ScriptableObject.java:1014)
com.google.javascript.rhino.head.ScriptableObject.getDefaultValue(ScriptableObject.java:933)
com.google.javascript.rhino.head.ScriptRuntime.toNumber(ScriptRuntime.java:410)
com.google.javascript.rhino.head.FunctionObject.convertArg(FunctionObject.java:236)
```

## closure-16-com.google.javascript.rhino.JSDocInfoBuilder-com.google.javascript.rhino.JSDocInfo-1
### ST34-F14
test071
```
java.lang.NullPointerException
com.google.javascript.rhino.JSTypeExpression.hashCode(JSTypeExpression.java:113)
java.util.HashMap.hash(HashMap.java:339)
java.util.HashMap.containsKey(HashMap.java:596)
com.google.javascript.rhino.JSDocInfo.documentThrows(JSDocInfo.java:792)
com.google.javascript.rhino.JSDocInfoBuilder.recordThrowDescription(JSDocInfoBuilder.java:327)
```
### ST33-F13

test159
```
java.lang.NullPointerException
com.google.common.collect.ImmutableList.copyFromCollection(ImmutableList.java:291)
com.google.common.collect.ImmutableList.copyOf(ImmutableList.java:260)
com.google.javascript.rhino.JSDocInfo.declareTemplateTypeNames(JSDocInfo.java:915)
com.google.javascript.rhino.JSDocInfoBuilder.recordTemplateTypeNames(JSDocInfoBuilder.java:299)
```
### ST32-F12
test170
```
java.lang.NullPointerException
com.google.javascript.rhino.JSTypeExpression.equals(JSTypeExpression.java:107)
java.util.ArrayList.indexOf(ArrayList.java:321)
java.util.ArrayList.contains(ArrayList.java:304)
com.google.javascript.rhino.JSDocInfo.addImplementedInterface(JSDocInfo.java:1233)
com.google.javascript.rhino.JSDocInfoBuilder.recordImplementedInterface(JSDocInfoBuilder.java:925)
```
## closure-16-com.google.javascript.rhino.JSDocInfoBuilder-com.google.javascript.rhino.JSDocInfo-5
### ST31-F11
test255
```
java.lang.NullPointerException
com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition.setItem(JSDocInfo.java:136)
com.google.javascript.rhino.JSDocInfoBuilder.markName(JSDocInfoBuilder.java:217)
```
## closure-16-com.google.javascript.rhino.JSDocInfoBuilder-com.google.javascript.rhino.JSDocInfo-12
### ST30-NF20
test293
```
java.lang.StringIndexOutOfBoundsException: String index out of range: 0
java.lang.String.charAt(String.java:658)
com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition.setItem(JSDocInfo.java:136)
com.google.javascript.rhino.JSDocInfoBuilder.markName(JSDocInfoBuilder.java:217)
com.google.javascript.rhino.JSDocInfoBuilder.markName(JSDocInfoBuilder.java:199)
```
 

## closure-16-com.google.javascript.rhino.jstype.JSType-com.google.javascript.rhino.jstype.UnionType-1

### ST29-F10
test22
```
java.lang.NullPointerException
com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeUnionType(ProxyObjectType.java:203)
com.google.javascript.rhino.jstype.ParameterizedType.toMaybeUnionType(ParameterizedType.java:50)
com.google.javascript.rhino.jstype.JSType.isUnionType(JSType.java:248)
com.google.javascript.rhino.jstype.UnionType.isEquivalentTo(UnionType.java:318)
com.google.javascript.rhino.jstype.JSType.equals(JSType.java:478)
```
## closure-16-com.google.javascript.rhino.jstype.JSType-com.google.javascript.rhino.jstype.UnionType-3
### ST28-F9
test04
```
java.lang.NullPointerException
com.google.javascript.rhino.jstype.JSType.isEmptyType(JSType.java:159)
com.google.javascript.rhino.jstype.JSType.testForEqualityHelper(JSType.java:666)
com.google.javascript.rhino.jstype.JSType.testForEquality(JSType.java:655)
com.google.javascript.rhino.jstype.NumberType.testForEquality(NumberType.java:63)
com.google.javascript.rhino.jstype.JSType.getTypesUnderInequality(JSType.java:962)
com.google.javascript.rhino.jstype.UnionType.getTypesUnderInequality(UnionType.java:486)
com.google.javascript.rhino.jstype.JSType.getTypesUnderInequality(JSType.java:957)
com.google.javascript.rhino.jstype.UnionType.getTypesUnderInequality(UnionType.java:486)
```

## closure-16-com.google.javascript.rhino.jstype.JSType-com.google.javascript.rhino.jstype.UnionType-7
### ST27-NF19
test10
```
java.lang.NullPointerException
com.google.javascript.rhino.jstype.JSType.autobox(JSType.java:617)
com.google.javascript.rhino.jstype.UnionType.autobox(UnionType.java:213)
```

## closure-16-com.google.javascript.rhino.jstype.PrototypeObjectType-com.google.javascript.rhino.jstype.JSType-1
### ST26-NF18
test05
```
java.lang.NullPointerException
com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1078)
com.google.javascript.rhino.jstype.PrototypeObjectType.isSubtype(PrototypeObjectType.java:445)
com.google.javascript.rhino.jstype.ObjectType.testForEquality(ObjectType.java:244)
com.google.javascript.rhino.jstype.JSType.getTypesUnderInequality(JSType.java:962)
```

# Lang

## lang-22-org.apache.commons.lang3.text.StrSubstitutor-org.apache.commons.lang3.text.StrBuilder-1
### ST25-NF17
 test36
 ```
java.lang.ClassCastException: org.apache.commons.lang3.text.StrBuilder cannot be cast to java.lang.String
java.util.Properties.enumerate(Properties.java:1097)
java.util.Properties.propertyNames(Properties.java:1008)
org.apache.commons.lang3.text.StrSubstitutor.replace(StrSubstitutor.java:183)
```

# MATH

## math-100-org.apache.commons.math.ode.GraggBulirschStoerIntegrator-org.apache.commons.math.ode.AdaptiveStepsizeIntegrator-2
### ST24-F8
test01
```
java.lang.NullPointerException
org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.sanityChecks(AdaptiveStepsizeIntegrator.java:184)
org.apache.commons.math.ode.GraggBulirschStoerIntegrator.integrate(GraggBulirschStoerIntegrator.java:527)
```

## math-100-org.apache.commons.math.ode.GraggBulirschStoerIntegrator-org.apache.commons.math.ode.SwitchingFunctionsHandler-4
### ST23-F7
test03
```
java.lang.NullPointerException
org.apache.commons.math.ode.SwitchState.reinitializeBegin(SwitchState.java:124)
org.apache.commons.math.ode.SwitchingFunctionsHandler.evaluateStep(SwitchingFunctionsHandler.java:98)
org.apache.commons.math.ode.GraggBulirschStoerIntegrator.integrate(GraggBulirschStoerIntegrator.java:848)
```

## math-100-org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator-org.apache.commons.math.ode.AbstractStepInterpolator-17
### ST22-F6
test5
```
java.lang.ArrayIndexOutOfBoundsException: 2
org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.computeInterpolatedState(GraggBulirschStoerStepInterpolator.java:326)
org.apache.commons.math.ode.AbstractStepInterpolator.setInterpolatedTime(AbstractStepInterpolator.java:260)
org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.readExternal(GraggBulirschStoerStepInterpolator.java:388)
```

## math-100-org.apache.commons.math.ode.SwitchingFunctionsHandler-org.apache.commons.math.ode.SwitchState-2
### ST21-NF16
test17
```
java.lang.NullPointerException
org.apache.commons.math.ode.DormandPrince54StepInterpolator.computeInterpolatedState(DormandPrince54StepInterpolator.java:129)
org.apache.commons.math.ode.AbstractStepInterpolator.setInterpolatedTime(AbstractStepInterpolator.java:260)
org.apache.commons.math.ode.SwitchState.evaluateStep(SwitchState.java:155)
org.apache.commons.math.ode.SwitchingFunctionsHandler.evaluateStep(SwitchingFunctionsHandler.java:109)
```

## math-100-org.apache.commons.math.ode.SwitchingFunctionsHandler-org.apache.commons.math.ode.SwitchState-5
### ST20-NF15
test12
```
java.lang.NullPointerException
org.apache.commons.math.ode.MidpointStepInterpolator.computeInterpolatedState(MidpointStepInterpolator.java:90)
org.apache.commons.math.ode.AbstractStepInterpolator.setInterpolatedTime(AbstractStepInterpolator.java:260)
org.apache.commons.math.ode.SwitchState.evaluateStep(SwitchState.java:155)
org.apache.commons.math.ode.SwitchingFunctionsHandler.evaluateStep(SwitchingFunctionsHandler.java:109)
```
### ST19-NF14
test14
```
java.lang.NullPointerException
org.apache.commons.math.ode.ThreeEighthesStepInterpolator.computeInterpolatedState(ThreeEighthesStepInterpolator.java:99)
org.apache.commons.math.ode.AbstractStepInterpolator.setInterpolatedTime(AbstractStepInterpolator.java:260)
org.apache.commons.math.ode.SwitchState.evaluateStep(SwitchState.java:155)
org.apache.commons.math.ode.SwitchingFunctionsHandler.evaluateStep(SwitchingFunctionsHandler.java:109)
```

# Mockito

## mockito-31-org.mockito.asm.MethodWriter-org.mockito.asm.ClassWriter-1
### ST18-F5
test18
```
java.lang.NullPointerException
org.mockito.asm.Item.set(Item.java:203)
org.mockito.asm.ClassWriter.addType(ClassWriter.java:1172)
org.mockito.asm.Frame.initInputFrame(Frame.java:797)
org.mockito.asm.MethodWriter.visitMaxs(MethodWriter.java:1238)
```

## mockito-31-org.mockito.asm.tree.analysis.BasicVerifier-org.mockito.asm.tree.analysis.SimpleVerifier-3
### ST17-F4
test12
```
java.lang.NullPointerException
org.mockito.asm.tree.analysis.SimpleVerifier.isSubTypeOf(SimpleVerifier.java:166)
org.mockito.asm.tree.analysis.BasicVerifier.unaryOperation(BasicVerifier.java:179)
```

## mockito-31-org.mockito.cglib.proxy.Mixin$Generator-org.mockito.cglib.core.ReflectUtils-20
### ST16-F3
test2
```
org.mockito.cglib.core.CodeGenerationException: java.beans.IntrospectionException-->java.lang.Object not superclass of java.lang.Object
org.mockito.cglib.core.ReflectUtils.getPropertiesHelper(ReflectUtils.java:324)
org.mockito.cglib.core.ReflectUtils.getBeanProperties(ReflectUtils.java:296)
org.mockito.cglib.proxy.MixinBeanEmitter.getMethods(MixinBeanEmitter.java:37)
org.mockito.cglib.proxy.MixinEmitter.<init>(MixinEmitter.java:63)
org.mockito.cglib.proxy.MixinBeanEmitter.<init>(MixinBeanEmitter.java:29)
org.mockito.cglib.proxy.Mixin$Generator.generateClass(Mixin.java:174)
org.mockito.cglib.core.DefaultGeneratorStrategy.generate(DefaultGeneratorStrategy.java:25)
org.mockito.cglib.core.AbstractClassGenerator.create(AbstractClassGenerator.java:217)
org.mockito.cglib.proxy.Mixin$Generator.create(Mixin.java:165)
```

# Time

## time-14-org.joda.time.base.AbstractPartial-org.joda.time.MonthDay-3
### ST15-NF13
test2
```
java.lang.NullPointerException
org.joda.time.MonthDay.getField(MonthDay.java:412)
org.joda.time.base.AbstractPartial.getField(AbstractPartial.java:105)
org.joda.time.MonthDay.withField(MonthDay.java:491)
```

## time-14-org.joda.time.base.AbstractPartial-org.joda.time.MonthDay-6
### ST14-NF12
test0
```
java.lang.NullPointerException
org.joda.time.MonthDay.getField(MonthDay.java:410)
org.joda.time.base.AbstractPartial.getField(AbstractPartial.java:105)
org.joda.time.MonthDay.withPeriodAdded(MonthDay.java:548)
```

## time-14-org.joda.time.base.AbstractPartial-org.joda.time.MonthDay-7
### ST13-NF11
test0
```
java.lang.NullPointerException
org.joda.time.base.BasePartial.getValue(BasePartial.java:225)
org.joda.time.base.AbstractPartial.get(AbstractPartial.java:150)
org.joda.time.convert.ReadablePartialConverter.getPartialValues(ReadablePartialConverter.java:91)
org.joda.time.convert.AbstractConverter.getPartialValues(AbstractConverter.java:123)
org.joda.time.base.BasePartial.<init>(BasePartial.java:163)
org.joda.time.MonthDay.<init>(MonthDay.java:297)
```

## time-14-org.joda.time.chrono.GJChronology-org.joda.time.chrono.GJChronology$CutoverField-2
### ST12-NF10
test6
```
org.joda.time.IllegalFieldValueException: Value 60 for monthOfYear must be in the range [1,12]
org.joda.time.field.FieldUtils.verifyValueBounds(FieldUtils.java:218)
org.joda.time.chrono.BasicMonthOfYearDateTimeField.set(BasicMonthOfYearDateTimeField.java:298)
org.joda.time.chrono.GJChronology$CutoverField.set(GJChronology.java:724)
org.joda.time.DateTime.withDate(DateTime.java:712)
```


## time-14-org.joda.time.chrono.GJChronology-org.joda.time.chrono.GJChronology$CutoverField-14
### ST11-F2
test6
```
org.joda.time.IllegalFieldValueException: Value 14 for dayOfMonth is not supported
org.joda.time.chrono.GJChronology$CutoverField.set(GJChronology.java:719)
org.joda.time.chrono.ZonedChronology$ZonedDateTimeField.set(ZonedChronology.java:466)
org.joda.time.chrono.BaseChronology.set(BaseChronology.java:240)
```

## time-14-org.joda.time.chrono.GJChronology-org.joda.time.chrono.JulianChronology-2
### ST10-F1
test2
```
java.lang.IllegalArgumentException: Invalid min days in first week: 175
org.joda.time.chrono.JulianChronology.getInstance(JulianChronology.java:138)
org.joda.time.chrono.GJChronology.getInstance(GJChronology.java:215)
org.joda.time.chrono.GJChronology.getInstance(GJChronology.java:220)
org.joda.time.chrono.GJChronology.getInstance(GJChronology.java:252)
```

## time-14-org.joda.time.format.DateTimeFormat-org.joda.time.format.DateTimeFormat$StyleFormatter-14
### ST9-NF9
test2
```
java.lang.NullPointerException
org.joda.time.format.DateTimeFormatterBuilder$TextField.parseInto(DateTimeFormatterBuilder.java:1836)
org.joda.time.format.DateTimeFormatterBuilder$Composite.parseInto(DateTimeFormatterBuilder.java:2695)
org.joda.time.format.DateTimeFormat$StyleFormatter.parseInto(DateTimeFormat.java:814)
org.joda.time.format.DateTimeFormatter.parseLocalDateTime(DateTimeFormatter.java:809)
org.joda.time.format.DateTimeFormatter.parseLocalDate(DateTimeFormatter.java:769)
org.joda.time.YearMonth.parse(YearMonth.java:152)
```

## time-14-org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber-org.joda.time.format.DateTimeFormatterBuilder-1
### ST8-NF8

test0
```
java.lang.NullPointerException
org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(DateTimeFormatterBuilder.java:1152)
org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber.printTo(DateTimeFormatterBuilder.java:1460)
```


## time-14-org.joda.time.format.DateTimeFormatterBuilder$TextField-org.joda.time.MutableDateTime-11
### ST7-NF7
test0
```
java.lang.NullPointerException
org.joda.time.MutableDateTime.property(MutableDateTime.java:1020)
org.joda.time.format.DateTimeFormatterBuilder$TextField.parseInto(DateTimeFormatterBuilder.java:1804)
```

## time-14-org.joda.time.LocalDateTime-org.joda.time.format.DateTimeFormatter-15
### ST6-NF6
test15
```
java.lang.NullPointerException
org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter.parseInto(DateTimeFormatterBuilder.java:1292)
org.joda.time.format.DateTimeFormatterBuilder$Composite.parseInto(DateTimeFormatterBuilder.java:2695)
org.joda.time.format.DateTimeFormatterBuilder$MatchingParser.parseInto(DateTimeFormatterBuilder.java:2793)
org.joda.time.format.DateTimeFormatterBuilder$Composite.parseInto(DateTimeFormatterBuilder.java:2695)
org.joda.time.format.DateTimeFormatter.parseLocalDateTime(DateTimeFormatter.java:809)
org.joda.time.LocalDateTime.parse(LocalDateTime.java:167)
org.joda.time.LocalDateTime.parse(LocalDateTime.java:156)
```

## time-14-org.joda.time.LocalDateTime-org.joda.time.format.DateTimeFormatter-17
### ST5-NF5
test02
```
java.lang.NullPointerException
org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral.parseInto(DateTimeFormatterBuilder.java:1202)
org.joda.time.format.DateTimeFormatterBuilder$Composite.parseInto(DateTimeFormatterBuilder.java:2695)
org.joda.time.format.DateTimeFormatter.parseLocalDateTime(DateTimeFormatter.java:809)
org.joda.time.LocalDateTime.parse(LocalDateTime.java:167)
```

## time-14-org.joda.time.Minutes-org.joda.time.base.BaseSingleFieldPeriod-7
### ST4-NF4
test16
```
java.lang.IllegalArgumentException: ReadableInstant objects must not be null
org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:67)
org.joda.time.Minutes.minutesIn(Minutes.java:140)
```

## time-14-org.joda.time.Period-org.joda.time.base.BasePeriod-2
### ST3-NF3
test21
```
java.lang.NullPointerException
org.joda.time.MonthDay.getField(MonthDay.java:410)
org.joda.time.base.AbstractPartial.getField(AbstractPartial.java:105)
org.joda.time.DateTimeUtils.isContiguous(DateTimeUtils.java:339)
org.joda.time.base.BasePeriod.<init>(BasePeriod.java:177)
org.joda.time.Period.<init>(Period.java:537)
```

## time-14-org.joda.time.Seconds-org.joda.time.base.BaseSingleFieldPeriod-2
### ST2-NF2
test09
```
java.lang.IllegalArgumentException: ReadableInstant objects must not be null
org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:67)
org.joda.time.Seconds.secondsIn(Seconds.java:140)
```

## time-14-org.joda.time.YearMonthDay-org.joda.time.base.BasePartial-5
### ST1-NF1
test2
```
org.joda.time.IllegalFieldValueException: Value 0 for monthOfYear must not be smaller than 1
org.joda.time.chrono.BaseChronology.validate(BaseChronology.java:188)
org.joda.time.base.BasePartial.<init>(BasePartial.java:183)
org.joda.time.YearMonthDay.<init>(YearMonthDay.java:288)
org.joda.time.YearMonthDay.<init>(YearMonthDay.java:272)
```




