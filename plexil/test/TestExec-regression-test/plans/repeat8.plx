<?xml version="1.0" encoding="UTF-8"?><PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" FileName="plans/repeat8.ple"><GlobalDeclarations LineNo="1" ColNo="8"><StateDeclaration LineNo="1" ColNo="8"><Name>continue</Name><Return><Name>_return_0</Name><Type>Boolean</Type></Return></StateDeclaration></GlobalDeclarations><Node NodeType="NodeList" epx="Concurrence" LineNo="3" ColNo="0"><NodeId>repeat8</NodeId><VariableDeclarations><DeclareVariable LineNo="6" ColNo="4"><Name>repeat_count</Name><Type>Integer</Type><InitialValue><IntegerValue>0</IntegerValue></InitialValue></DeclareVariable></VariableDeclarations><PostCondition><EQNumeric><IntegerValue>4</IntegerValue><IntegerVariable>repeat_count</IntegerVariable></EQNumeric></PostCondition><NodeBody><NodeList><Node NodeType="Assignment" LineNo="10" ColNo="2"><NodeId>repeater</NodeId><RepeatCondition><LookupOnChange><Name><StringValue>continue</StringValue></Name></LookupOnChange></RepeatCondition><NodeBody><Assignment LineNo="13" ColNo="6"><IntegerVariable>repeat_count</IntegerVariable><NumericRHS><ADD LineNo="13" ColNo="34"><IntegerVariable>repeat_count</IntegerVariable><IntegerValue>1</IntegerValue></ADD></NumericRHS></Assignment></NodeBody></Node></NodeList></NodeBody></Node></PlexilPlan>