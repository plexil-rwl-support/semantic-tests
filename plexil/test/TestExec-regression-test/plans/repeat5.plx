<?xml version="1.0" encoding="UTF-8"?><PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" FileName="plans/repeat5.ple"><GlobalDeclarations LineNo="1" ColNo="8"><StateDeclaration LineNo="1" ColNo="8"><Name>continue</Name><Return><Name>_return_0</Name><Type>Boolean</Type></Return></StateDeclaration><CommandDeclaration LineNo="2" ColNo="0"><Name>foo</Name></CommandDeclaration></GlobalDeclarations><Node NodeType="NodeList" epx="Concurrence" LineNo="4" ColNo="0"><NodeId>repeat5</NodeId><RepeatCondition><LookupOnChange><Name><StringValue>continue</StringValue></Name></LookupOnChange></RepeatCondition><NodeBody><NodeList><Node NodeType="Command" LineNo="9" ColNo="4"><NodeId>command</NodeId><NodeBody><Command LineNo="10" ColNo="6"><Name><StringValue>foo</StringValue></Name></Command></NodeBody></Node></NodeList></NodeBody></Node></PlexilPlan>