<?xml version="1.0" encoding="UTF-8"?><PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:tr="extended-plexil-translator" FileName="plans/AtomicAssignment.ple"><GlobalDeclarations LineNo="1" ColNo="0"><CommandDeclaration LineNo="1" ColNo="0"><Name>check</Name><Parameter><Type>Integer</Type></Parameter><Parameter><Type>Integer</Type></Parameter></CommandDeclaration></GlobalDeclarations><Node NodeType="NodeList" epx="Concurrence" LineNo="3" ColNo="0"><NodeId>AtomicAssignment</NodeId><VariableDeclarations><DeclareVariable LineNo="6" ColNo="3"><Name>x</Name><Type>Integer</Type><InitialValue><IntegerValue>0</IntegerValue></InitialValue></DeclareVariable><DeclareVariable LineNo="7" ColNo="3"><Name>y</Name><Type>Integer</Type><InitialValue><IntegerValue>1</IntegerValue></InitialValue></DeclareVariable></VariableDeclarations><NodeBody><NodeList><Node NodeType="Assignment" LineNo="9" ColNo="2"><NodeId>xy</NodeId><NodeBody><Assignment LineNo="10" ColNo="3"><IntegerVariable>x</IntegerVariable><NumericRHS><IntegerVariable>y</IntegerVariable></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="12" ColNo="2"><NodeId>yx</NodeId><NodeBody><Assignment LineNo="13" ColNo="3"><IntegerVariable>y</IntegerVariable><NumericRHS><IntegerVariable>x</IntegerVariable></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Command" LineNo="15" ColNo="2"><NodeId>check</NodeId><StartCondition><AND><Finished LineNo="17" ColNo="21"><NodeId>xy</NodeId></Finished><Finished LineNo="17" ColNo="41"><NodeId>yx</NodeId></Finished></AND></StartCondition><NodeBody><Command LineNo="18" ColNo="6"><Name><StringValue>check</StringValue></Name><Arguments><IntegerVariable>x</IntegerVariable><IntegerVariable>y</IntegerVariable></Arguments></Command></NodeBody></Node></NodeList></NodeBody></Node></PlexilPlan>