<?xml version="1.0" encoding="UTF-8"?><PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" FileName="plans/command4.ple"><GlobalDeclarations LineNo="1" ColNo="7"><StateDeclaration LineNo="1" ColNo="7"><Name>CommandName</Name><Return><Name>_return_0</Name><Type>String</Type></Return></StateDeclaration></GlobalDeclarations><Node NodeType="NodeList" epx="Concurrence" LineNo="3" ColNo="0"><NodeId>command4</NodeId><Comment>Tests command with return value</Comment><VariableDeclarations><DeclareVariable LineNo="8" ColNo="2"><Name>result_string</Name><Type>String</Type></DeclareVariable></VariableDeclarations><NodeBody><NodeList><Node NodeType="Command" LineNo="10" ColNo="1"><NodeId>StringCommand</NodeId><NodeBody><Command LineNo="11" ColNo="2"><StringVariable>result_string</StringVariable><Name><LookupNow><Name><StringValue>CommandName</StringValue></Name></LookupNow></Name></Command></NodeBody></Node></NodeList></NodeBody></Node></PlexilPlan>