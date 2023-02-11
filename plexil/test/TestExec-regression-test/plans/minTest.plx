<?xml version="1.0" encoding="UTF-8"?><PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" FileName="plans/minTest.ple"><Node NodeType="NodeList" epx="Concurrence" LineNo="1" ColNo="0"><NodeId>minTest</NodeId><VariableDeclarations><DeclareVariable LineNo="4" ColNo="4"><Name>l</Name><Type>Integer</Type></DeclareVariable><DeclareVariable LineNo="4" ColNo="4"><Name>m</Name><Type>Integer</Type></DeclareVariable><DeclareVariable LineNo="4" ColNo="4"><Name>n</Name><Type>Integer</Type></DeclareVariable><DeclareVariable LineNo="5" ColNo="4"><Name>x</Name><Type>Real</Type></DeclareVariable><DeclareVariable LineNo="5" ColNo="4"><Name>y</Name><Type>Real</Type></DeclareVariable></VariableDeclarations><PostCondition><AND><NOT><IsKnown><IntegerVariable>l</IntegerVariable></IsKnown></NOT><EQNumeric><IntegerVariable>m</IntegerVariable><IntegerValue>1</IntegerValue></EQNumeric><EQNumeric><IntegerVariable>n</IntegerVariable><IntegerValue>1</IntegerValue></EQNumeric><EQNumeric><RealVariable>x</RealVariable><RealValue>2.0</RealValue></EQNumeric><EQNumeric><RealVariable>y</RealVariable><RealValue>7.0</RealValue></EQNumeric></AND></PostCondition><NodeBody><NodeList><Node NodeType="Assignment" LineNo="10" ColNo="2"><NodeId>unknownInts</NodeId><NodeBody><Assignment LineNo="11" ColNo="4"><IntegerVariable>l</IntegerVariable><NumericRHS><MIN LineNo="11" ColNo="8"><IntegerVariable>l</IntegerVariable><IntegerValue>0</IntegerValue></MIN></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="13" ColNo="2"><NodeId>equalInts</NodeId><NodeBody><Assignment LineNo="14" ColNo="4"><IntegerVariable>m</IntegerVariable><NumericRHS><MIN LineNo="14" ColNo="8"><IntegerValue>1</IntegerValue><IntegerValue>1</IntegerValue></MIN></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="16" ColNo="2"><NodeId>unequalInts</NodeId><NodeBody><Assignment LineNo="17" ColNo="4"><IntegerVariable>n</IntegerVariable><NumericRHS><MIN LineNo="17" ColNo="8"><IntegerValue>1</IntegerValue><IntegerValue>2</IntegerValue></MIN></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="19" ColNo="2"><NodeId>equalReals</NodeId><NodeBody><Assignment LineNo="20" ColNo="4"><RealVariable>x</RealVariable><NumericRHS><MIN LineNo="20" ColNo="8"><RealValue>2.0</RealValue><RealValue>2.0</RealValue></MIN></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="22" ColNo="2"><NodeId>unequal</NodeId><NodeBody><Assignment LineNo="23" ColNo="4"><RealVariable>y</RealVariable><NumericRHS><MIN LineNo="23" ColNo="8"><RealValue>7.0</RealValue><RealValue>7.1</RealValue></MIN></NumericRHS></Assignment></NodeBody></Node></NodeList></NodeBody></Node></PlexilPlan>