<?xml version="1.0" encoding="UTF-8"?><PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" FileName="plans/lookup2.ple"><Node NodeType="Assignment" LineNo="1" ColNo="0"><NodeId>lookup2</NodeId><VariableDeclarations><DeclareVariable LineNo="3" ColNo="2"><Name>x</Name><Type>Integer</Type></DeclareVariable><DeclareVariable LineNo="4" ColNo="2"><Name>state_name</Name><Type>String</Type><InitialValue><StringValue>foo</StringValue></InitialValue></DeclareVariable></VariableDeclarations><NodeBody><Assignment LineNo="6" ColNo="2"><IntegerVariable>x</IntegerVariable><NumericRHS><LookupNow><Name><StringVariable>state_name</StringVariable></Name></LookupNow></NumericRHS></Assignment></NodeBody></Node></PlexilPlan>