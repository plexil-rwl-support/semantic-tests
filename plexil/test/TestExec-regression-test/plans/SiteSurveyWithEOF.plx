<?xml version="1.0" encoding="UTF-8"?><PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" FileName="SiteSurveyWithEOF.ple"><GlobalDeclarations LineNo="26" ColNo="8"><CommandDeclaration LineNo="26" ColNo="8"><Name>get_next_inspection_point</Name><Return><Name>_return_0</Name><Type>Integer</Type></Return></CommandDeclaration><CommandDeclaration LineNo="27" ColNo="8"><Name>move_to_waypoint</Name><Return><Name>_return_0</Name><Type>Integer</Type></Return><Parameter><Type>String</Type></Parameter><Parameter><Type>String</Type></Parameter><Parameter><Type>Real</Type></Parameter><Parameter><Type>Real</Type></Parameter><Parameter><Type>Real</Type></Parameter><Parameter><Type>Real</Type></Parameter><Parameter><Type>Real</Type></Parameter><Parameter><Type>Real</Type></Parameter><Parameter><Type>Real</Type></Parameter><Parameter><Type>Real</Type></Parameter></CommandDeclaration><CommandDeclaration LineNo="32" ColNo="8"><Name>acquire</Name><Return><Name>_return_0</Name><Type>Integer</Type></Return></CommandDeclaration><StateDeclaration LineNo="34" ColNo="7"><Name>name</Name><Return><Name>_return_0</Name><Type>String</Type></Return></StateDeclaration><StateDeclaration LineNo="35" ColNo="7"><Name>frame</Name><Return><Name>_return_0</Name><Type>String</Type></Return></StateDeclaration><StateDeclaration LineNo="36" ColNo="5"><Name>waypoint_x</Name><Return><Name>_return_0</Name><Type>Real</Type></Return></StateDeclaration><StateDeclaration LineNo="37" ColNo="5"><Name>waypoint_y</Name><Return><Name>_return_0</Name><Type>Real</Type></Return></StateDeclaration><StateDeclaration LineNo="38" ColNo="5"><Name>waypoint_z</Name><Return><Name>_return_0</Name><Type>Real</Type></Return></StateDeclaration><StateDeclaration LineNo="39" ColNo="5"><Name>waypoint_a</Name><Return><Name>_return_0</Name><Type>Real</Type></Return></StateDeclaration><StateDeclaration LineNo="40" ColNo="5"><Name>isDirectional</Name><Return><Name>_return_0</Name><Type>Real</Type></Return></StateDeclaration><StateDeclaration LineNo="41" ColNo="5"><Name>tolerance</Name><Return><Name>_return_0</Name><Type>Real</Type></Return></StateDeclaration><StateDeclaration LineNo="42" ColNo="5"><Name>headingTolerance</Name><Return><Name>_return_0</Name><Type>Real</Type></Return></StateDeclaration><StateDeclaration LineNo="43" ColNo="5"><Name>hintedSpeed</Name><Return><Name>_return_0</Name><Type>Real</Type></Return></StateDeclaration><StateDeclaration LineNo="44" ColNo="8"><Name>inspect_waypoint</Name><Return><Name>_return_0</Name><Type>Integer</Type></Return></StateDeclaration><StateDeclaration LineNo="45" ColNo="8"><Name>task_id</Name><Return><Name>_return_0</Name><Type>Integer</Type></Return></StateDeclaration><StateDeclaration LineNo="46" ColNo="5"><Name>timeout</Name><Return><Name>_return_0</Name><Type>Real</Type></Return></StateDeclaration><StateDeclaration LineNo="47" ColNo="8"><Name>plan_paused</Name><Return><Name>_return_0</Name><Type>Boolean</Type></Return></StateDeclaration><StateDeclaration LineNo="48" ColNo="8"><Name>abort_plan</Name><Return><Name>_return_0</Name><Type>Boolean</Type></Return></StateDeclaration></GlobalDeclarations><Node NodeType="NodeList" epx="Concurrence" LineNo="50" ColNo="0"><NodeId>SiteSurveyWithEOF</NodeId><VariableDeclarations><DeclareVariable LineNo="53" ColNo="4"><Name>task_type</Name><Type>Integer</Type></DeclareVariable><DeclareVariable LineNo="54" ColNo="4"><Name>is_aborted</Name><Type>Boolean</Type><InitialValue><BooleanValue>false</BooleanValue></InitialValue></DeclareVariable><DeclareVariable LineNo="55" ColNo="4"><Name>abort_due_to_exception</Name><Type>Boolean</Type><InitialValue><BooleanValue>false</BooleanValue></InitialValue></DeclareVariable><DeclareVariable LineNo="56" ColNo="4"><Name>waypt_id</Name><Type>Integer</Type></DeclareVariable></VariableDeclarations><EndCondition><OR><Finished LineNo="59" ColNo="6"><NodeId>SignalEndOfPlan</NodeId></Finished><Finished LineNo="60" ColNo="6"><NodeId>SendAbortUpdate</NodeId></Finished><BooleanVariable>abort_due_to_exception</BooleanVariable></OR></EndCondition><NodeBody><NodeList><Node NodeType="NodeList" epx="Concurrence" LineNo="63" ColNo="2"><NodeId>SiteSurveyWrapper</NodeId><VariableDeclarations><DeclareVariable LineNo="66" ColNo="8"><Name>task_type</Name><Type>Integer</Type></DeclareVariable><DeclareVariable LineNo="67" ColNo="8"><Name>is_paused</Name><Type>Boolean</Type><InitialValue><BooleanValue>false</BooleanValue></InitialValue></DeclareVariable></VariableDeclarations><EndCondition><OR><EQNumeric><IntegerValue>0</IntegerValue><IntegerVariable>task_type</IntegerVariable></EQNumeric><BooleanVariable>is_aborted</BooleanVariable><BooleanVariable>abort_due_to_exception</BooleanVariable></OR></EndCondition><NodeBody><NodeList><Node NodeType="NodeList" epx="Concurrence" LineNo="72" ColNo="6"><NodeId>SiteSurvey</NodeId><VariableDeclarations><DeclareVariable LineNo="75" ColNo="12"><Name>task_result_str</Name><Type>String</Type></DeclareVariable><DeclareVariable LineNo="76" ColNo="12"><Name>cmd_return_val</Name><Type>Integer</Type></DeclareVariable><DeclareVariable LineNo="77" ColNo="12"><Name>cmd_name</Name><Type>String</Type><InitialValue><StringValue>nil</StringValue></InitialValue></DeclareVariable></VariableDeclarations><RepeatCondition><NENumeric><IntegerValue>0</IntegerValue><IntegerVariable>task_type</IntegerVariable></NENumeric></RepeatCondition><NodeBody><NodeList><Node NodeType="NodeList" epx="Concurrence" LineNo="81" ColNo="10"><NodeId>Loop</NodeId><StartCondition><NOT><BooleanVariable>is_paused</BooleanVariable></NOT></StartCondition><EndCondition><Finished LineNo="85" ColNo="29"><NodeId>CheckIfAbortPlan</NodeId></Finished></EndCondition><NodeBody><NodeList><Node NodeType="Command" LineNo="87" ColNo="14"><NodeId>RequestNextWaypt</NodeId><VariableDeclarations><DeclareVariable LineNo="89" ColNo="18"><Name>ret_val</Name><Type>Integer</Type></DeclareVariable></VariableDeclarations><StartCondition><NOT><BooleanVariable>is_paused</BooleanVariable></NOT></StartCondition><EndCondition><IsKnown><IntegerVariable>ret_val</IntegerVariable></IsKnown></EndCondition><PostCondition><EQNumeric><IntegerValue>0</IntegerValue><IntegerVariable>ret_val</IntegerVariable></EQNumeric></PostCondition><NodeBody><Command LineNo="93" ColNo="18"><IntegerVariable>ret_val</IntegerVariable><Name><StringValue>get_next_inspection_point</StringValue></Name></Command></NodeBody></Node><Node NodeType="Assignment" LineNo="96" ColNo="14"><NodeId>SetWaypointRequestFailed</NodeId><StartCondition><Failed LineNo="98" ColNo="33"><NodeId>RequestNextWaypt</NodeId></Failed></StartCondition><NodeBody><Assignment LineNo="99" ColNo="18"><StringVariable>cmd_name</StringVariable><StringRHS><StringValue>get_next_inspection_point</StringValue></StringRHS></Assignment></NodeBody></Node><Node NodeType="NodeList" epx="Concurrence" LineNo="102" ColNo="14"><NodeId>GetAndProcessWaypoint</NodeId><VariableDeclarations><DeclareVariable LineNo="105" ColNo="20"><Name>waypt_name</Name><Type>String</Type></DeclareVariable><DeclareVariable LineNo="105" ColNo="20"><Name>waypt_frame</Name><Type>String</Type></DeclareVariable><DeclareVariable LineNo="106" ColNo="20"><Name>waypt_x</Name><Type>Real</Type></DeclareVariable><DeclareVariable LineNo="106" ColNo="20"><Name>waypt_y</Name><Type>Real</Type></DeclareVariable><DeclareVariable LineNo="106" ColNo="20"><Name>waypt_z</Name><Type>Real</Type></DeclareVariable><DeclareVariable LineNo="106" ColNo="20"><Name>waypt_a</Name><Type>Real</Type></DeclareVariable><DeclareVariable LineNo="107" ColNo="20"><Name>waypt_is_directional</Name><Type>Real</Type></DeclareVariable><DeclareVariable LineNo="108" ColNo="20"><Name>waypt_tolerance</Name><Type>Real</Type></DeclareVariable><DeclareVariable LineNo="109" ColNo="20"><Name>waypt_heading_tolerance</Name><Type>Real</Type></DeclareVariable><DeclareVariable LineNo="110" ColNo="20"><Name>waypt_hinted_speed</Name><Type>Real</Type></DeclareVariable><DeclareVariable LineNo="111" ColNo="20"><Name>waypt_timeout</Name><Type>Real</Type></DeclareVariable></VariableDeclarations><StartCondition><AND><NOT><BooleanVariable>is_paused</BooleanVariable></NOT><Finished LineNo="113" ColNo="57"><NodeId>RequestNextWaypt</NodeId></Finished></AND></StartCondition><PreCondition><Succeeded LineNo="114" ColNo="33"><NodeId>RequestNextWaypt</NodeId></Succeeded></PreCondition><InvariantCondition><NOT><BooleanVariable>is_paused</BooleanVariable></NOT></InvariantCondition><EndCondition><OR><Failed LineNo="116" ColNo="33"><NodeId>GetNewWaypt</NodeId></Failed><Finished LineNo="116" ColNo="60"><NodeId>DriveAndAcquire</NodeId></Finished></OR></EndCondition><NodeBody><NodeList><Node NodeType="NodeList" epx="Concurrence" LineNo="118" ColNo="18"><NodeId>GetNewWaypt</NodeId><PostCondition><AND><Succeeded LineNo="122" ColNo="26"><NodeId>Get_x</NodeId></Succeeded><Succeeded LineNo="123" ColNo="26"><NodeId>Get_y</NodeId></Succeeded><Succeeded LineNo="124" ColNo="26"><NodeId>Get_task_type</NodeId></Succeeded><Succeeded LineNo="125" ColNo="26"><NodeId>Get_task_id</NodeId></Succeeded></AND></PostCondition><NodeBody><NodeList><Node NodeType="Assignment" LineNo="127" ColNo="22"><NodeId>Get_name</NodeId><NodeBody><Assignment LineNo="128" ColNo="24"><StringVariable>waypt_name</StringVariable><StringRHS><LookupNow><Name><StringValue>name</StringValue></Name></LookupNow></StringRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="130" ColNo="22"><NodeId>Get_frame</NodeId><NodeBody><Assignment LineNo="131" ColNo="24"><StringVariable>waypt_frame</StringVariable><StringRHS><LookupNow><Name><StringValue>frame</StringValue></Name></LookupNow></StringRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="133" ColNo="22"><NodeId>Get_x</NodeId><NodeBody><Assignment LineNo="134" ColNo="24"><RealVariable>waypt_x</RealVariable><NumericRHS><LookupNow><Name><StringValue>waypoint_x</StringValue></Name></LookupNow></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="136" ColNo="22"><NodeId>Get_y</NodeId><NodeBody><Assignment LineNo="137" ColNo="24"><RealVariable>waypt_y</RealVariable><NumericRHS><LookupNow><Name><StringValue>waypoint_y</StringValue></Name></LookupNow></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="139" ColNo="22"><NodeId>Get_z</NodeId><NodeBody><Assignment LineNo="140" ColNo="24"><RealVariable>waypt_z</RealVariable><NumericRHS><LookupNow><Name><StringValue>waypoint_z</StringValue></Name></LookupNow></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="142" ColNo="22"><NodeId>Get_a</NodeId><NodeBody><Assignment LineNo="143" ColNo="24"><RealVariable>waypt_a</RealVariable><NumericRHS><LookupNow><Name><StringValue>waypoint_a</StringValue></Name></LookupNow></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="145" ColNo="22"><NodeId>Get_dir</NodeId><NodeBody><Assignment LineNo="146" ColNo="24"><RealVariable>waypt_is_directional</RealVariable><NumericRHS><LookupNow><Name><StringValue>isDirectional</StringValue></Name></LookupNow></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="148" ColNo="22"><NodeId>Get_tolerance</NodeId><NodeBody><Assignment LineNo="149" ColNo="24"><RealVariable>waypt_tolerance</RealVariable><NumericRHS><LookupNow><Name><StringValue>tolerance</StringValue></Name></LookupNow></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="151" ColNo="22"><NodeId>Get_heading_tolerance</NodeId><NodeBody><Assignment LineNo="152" ColNo="24"><RealVariable>waypt_heading_tolerance</RealVariable><NumericRHS><LookupNow><Name><StringValue>headingTolerance</StringValue></Name></LookupNow></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="154" ColNo="22"><NodeId>Get_hinted_speed</NodeId><NodeBody><Assignment LineNo="155" ColNo="24"><RealVariable>waypt_hinted_speed</RealVariable><NumericRHS><LookupNow><Name><StringValue>hintedSpeed</StringValue></Name></LookupNow></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="157" ColNo="22"><NodeId>Get_task_type</NodeId><NodeBody><Assignment LineNo="158" ColNo="24"><IntegerVariable>task_type</IntegerVariable><NumericRHS><LookupNow><Name><StringValue>inspect_waypoint</StringValue></Name></LookupNow></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="160" ColNo="22"><NodeId>Get_task_id</NodeId><NodeBody><Assignment LineNo="161" ColNo="24"><IntegerVariable>waypt_id</IntegerVariable><NumericRHS><LookupNow><Name><StringValue>task_id</StringValue></Name></LookupNow></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="163" ColNo="22"><NodeId>Get_timeout</NodeId><NodeBody><Assignment LineNo="164" ColNo="24"><RealVariable>waypt_timeout</RealVariable><NumericRHS><LookupNow><Name><StringValue>timeout</StringValue></Name></LookupNow></NumericRHS></Assignment></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="Assignment" LineNo="167" ColNo="18"><NodeId>Cmd_Resest1</NodeId><NodeBody><Assignment LineNo="168" ColNo="20"><IntegerVariable>cmd_return_val</IntegerVariable><NumericRHS><IntegerValue>-1000</IntegerValue></NumericRHS></Assignment></NodeBody></Node><Node NodeType="NodeList" epx="Concurrence" LineNo="170" ColNo="18"><NodeId>DriveAndAcquire</NodeId><StartCondition><Finished LineNo="173" ColNo="39"><NodeId>GetNewWaypt</NodeId></Finished></StartCondition><PreCondition><Succeeded LineNo="174" ColNo="37"><NodeId>GetNewWaypt</NodeId></Succeeded></PreCondition><NodeBody><NodeList><Node NodeType="NodeList" epx="If" LineNo="176" ColNo="24"><NodeId>if__2</NodeId><NodeBody><NodeList><Node NodeType="NodeList" epx="Then" LineNo="177" ColNo="24"><StartCondition><NOT><EQNumeric><IntegerValue>0</IntegerValue><IntegerVariable>task_type</IntegerVariable></EQNumeric></NOT></StartCondition><SkipCondition><NOT><NOT><EQNumeric><IntegerValue>0</IntegerValue><IntegerVariable>task_type</IntegerVariable></EQNumeric></NOT></NOT></SkipCondition><NodeId>ProcessWaypoint</NodeId><NodeBody><NodeList><Node NodeType="NodeList" epx="Sequence" LineNo="180" ColNo="30"><NodeId>Sequence__3</NodeId><InvariantCondition><NoChildFailed><NodeRef dir="self"/></NoChildFailed></InvariantCondition><NodeBody><NodeList><Node NodeType="Command" LineNo="182" ColNo="32"><NodeId>DriveToWaypoint</NodeId><PostCondition><EQNumeric><IntegerValue>0</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric></PostCondition><InvariantCondition><OR><EQNumeric><IntegerValue>-1000</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric><EQNumeric><IntegerValue>0</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric><EQNumeric><IntegerValue>2</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric><EQNumeric><IntegerValue>3</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric></OR></InvariantCondition><NodeBody><Command LineNo="191" ColNo="36"><IntegerVariable>cmd_return_val</IntegerVariable><Name><StringValue>move_to_waypoint</StringValue></Name><Arguments><StringVariable>waypt_name</StringVariable><StringVariable>waypt_frame</StringVariable><RealVariable>waypt_x</RealVariable><RealVariable>waypt_y</RealVariable><RealVariable>waypt_z</RealVariable><RealVariable>waypt_a</RealVariable><RealVariable>waypt_is_directional</RealVariable><RealVariable>waypt_tolerance</RealVariable><RealVariable>waypt_heading_tolerance</RealVariable><RealVariable>waypt_hinted_speed</RealVariable></Arguments></Command></NodeBody></Node><Node NodeType="Assignment" LineNo="199" ColNo="32"><NodeId>SetNameToDrive</NodeId><StartCondition><Finished><NodeRef dir="sibling">DriveToWaypoint</NodeRef></Finished></StartCondition><NodeBody><Assignment LineNo="200" ColNo="34"><StringVariable>cmd_name</StringVariable><StringRHS><StringValue>drive</StringValue></StringRHS></Assignment></NodeBody></Node><Node NodeType="NodeList" epx="Concurrence" LineNo="201" ColNo="32"><NodeId>WrapperNode</NodeId><StartCondition><Finished><NodeRef dir="sibling">SetNameToDrive</NodeRef></Finished></StartCondition><PreCondition><Succeeded LineNo="204" ColNo="51"><NodeId>DriveToWaypoint</NodeId></Succeeded></PreCondition><NodeBody><NodeList><Node NodeType="NodeList" epx="If" LineNo="205" ColNo="38"><NodeId>if__5</NodeId><NodeBody><NodeList><Node NodeType="NodeList" epx="Then" LineNo="206" ColNo="40"><StartCondition><NOT><EQNumeric><IntegerValue>1</IntegerValue><IntegerVariable>task_type</IntegerVariable></EQNumeric></NOT></StartCondition><SkipCondition><NOT><NOT><EQNumeric><IntegerValue>1</IntegerValue><IntegerVariable>task_type</IntegerVariable></EQNumeric></NOT></NOT></SkipCondition><NodeId>Sequence__6</NodeId><InvariantCondition><NoChildFailed><NodeRef dir="self"/></NoChildFailed></InvariantCondition><NodeBody><NodeList><Node NodeType="Assignment" LineNo="208" ColNo="42"><NodeId>Cmd_Resest2</NodeId><NodeBody><Assignment LineNo="209" ColNo="44"><IntegerVariable>cmd_return_val</IntegerVariable><NumericRHS><IntegerValue>-1000</IntegerValue></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Command" LineNo="211" ColNo="42"><NodeId>TakeSample</NodeId><StartCondition><Finished><NodeRef dir="sibling">Cmd_Resest2</NodeRef></Finished></StartCondition><PostCondition><EQNumeric><IntegerValue>0</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric></PostCondition><InvariantCondition><OR><EQNumeric><IntegerValue>-1000</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric><EQNumeric><IntegerValue>0</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric><EQNumeric><IntegerValue>3</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric><EQNumeric><IntegerValue>2</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric></OR></InvariantCondition><EndCondition><OR><NOT><EQNumeric><IntegerValue>-1000</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric></NOT><BooleanVariable>is_aborted</BooleanVariable></OR></EndCondition><NodeBody><Command LineNo="222" ColNo="46"><IntegerVariable>cmd_return_val</IntegerVariable><Name><StringValue>acquire</StringValue></Name></Command></NodeBody></Node><Node NodeType="Assignment" LineNo="225" ColNo="42"><NodeId>SetNameToAcquire</NodeId><StartCondition><Finished><NodeRef dir="sibling">TakeSample</NodeRef></Finished></StartCondition><NodeBody><Assignment LineNo="226" ColNo="44"><StringVariable>cmd_name</StringVariable><StringRHS><StringValue>acquire</StringValue></StringRHS></Assignment></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="Assignment" LineNo="235" ColNo="14"><NodeId>SetPauseResult</NodeId><StartCondition><AND><Finished LineNo="237" ColNo="33"><NodeId>GetAndProcessWaypoint</NodeId></Finished><BooleanVariable>is_paused</BooleanVariable></AND></StartCondition><NodeBody><Assignment LineNo="238" ColNo="18"><IntegerVariable>cmd_return_val</IntegerVariable><NumericRHS><IntegerValue>-3</IntegerValue></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Update" LineNo="241" ColNo="14"><NodeId>SendUpdate</NodeId><StartCondition><OR><AND><Finished LineNo="244" ColNo="21"><NodeId>GetAndProcessWaypoint</NodeId></Finished><NOT><BooleanVariable>is_paused</BooleanVariable></NOT></AND><Finished LineNo="245" ColNo="20"><NodeId>SetWaypointRequestFailed</NodeId></Finished><Finished LineNo="246" ColNo="20"><NodeId>SetPauseResult</NodeId></Finished></OR></StartCondition><NodeBody><Update><Pair><Name>taskId</Name><IntegerVariable>waypt_id</IntegerVariable></Pair><Pair><Name>result</Name><IntegerVariable>cmd_return_val</IntegerVariable></Pair><Pair><Name>commandName</Name><StringVariable>cmd_name</StringVariable></Pair></Update></NodeBody></Node><Node NodeType="NodeList" epx="Concurrence" LineNo="250" ColNo="14"><NodeId>CheckIfAbortPlan</NodeId><StartCondition><Finished LineNo="253" ColNo="35"><NodeId>SendUpdate</NodeId></Finished></StartCondition><NodeBody><NodeList><Node NodeType="NodeList" epx="If" LineNo="256" ColNo="20"><NodeId>if__10</NodeId><NodeBody><NodeList><Node NodeType="Assignment" epx="Then" LineNo="261" ColNo="20"><StartCondition><OR><EQNumeric><IntegerValue>-1</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric><EQNumeric><IntegerValue>1</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric><EQNumeric><IntegerValue>4</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric><EQNumeric><IntegerValue>5</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric><EQNumeric><IntegerValue>6</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric></OR></StartCondition><SkipCondition><NOT><OR><EQNumeric><IntegerValue>-1</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric><EQNumeric><IntegerValue>1</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric><EQNumeric><IntegerValue>4</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric><EQNumeric><IntegerValue>5</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric><EQNumeric><IntegerValue>6</IntegerValue><IntegerVariable>cmd_return_val</IntegerVariable></EQNumeric></OR></NOT></SkipCondition><NodeId>SetAbort</NodeId><NodeBody><Assignment LineNo="262" ColNo="22"><BooleanVariable>abort_due_to_exception</BooleanVariable><BooleanRHS><BooleanValue>true</BooleanValue></BooleanRHS></Assignment></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="Assignment" LineNo="267" ColNo="6"><NodeId>MonitorPauseSignal</NodeId><StartCondition><NEBoolean><BooleanVariable>is_paused</BooleanVariable><LookupOnChange><Name><StringValue>plan_paused</StringValue></Name></LookupOnChange></NEBoolean></StartCondition><RepeatCondition><BooleanValue>true</BooleanValue></RepeatCondition><NodeBody><Assignment LineNo="271" ColNo="10"><BooleanVariable>is_paused</BooleanVariable><BooleanRHS><LookupNow><Name><StringValue>plan_paused</StringValue></Name></LookupNow></BooleanRHS></Assignment></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="Update" LineNo="275" ColNo="2"><NodeId>SignalEndOfPlan</NodeId><StartCondition><AND><Finished LineNo="277" ColNo="21"><NodeId>SiteSurveyWrapper</NodeId></Finished><Waiting LineNo="277" ColNo="56"><NodeId>MonitorAbortSignal</NodeId></Waiting></AND></StartCondition><NodeBody><Update><Pair><Name>endOfPlan</Name><BooleanValue>true</BooleanValue></Pair></Update></NodeBody></Node><Node NodeType="Assignment" LineNo="281" ColNo="2"><NodeId>MonitorAbortSignal</NodeId><StartCondition><LookupOnChange><Name><StringValue>abort_plan</StringValue></Name></LookupOnChange></StartCondition><NodeBody><Assignment LineNo="284" ColNo="6"><BooleanVariable>is_aborted</BooleanVariable><BooleanRHS><BooleanValue>true</BooleanValue></BooleanRHS></Assignment></NodeBody></Node><Node NodeType="Update" LineNo="287" ColNo="2"><NodeId>SendAbortUpdate</NodeId><StartCondition><Finished LineNo="289" ColNo="21"><NodeId>MonitorAbortSignal</NodeId></Finished></StartCondition><NodeBody><Update><Pair><Name>taskId</Name><IntegerVariable>waypt_id</IntegerVariable></Pair><Pair><Name>result</Name><IntegerValue>-2</IntegerValue></Pair></Update></NodeBody></Node></NodeList></NodeBody></Node></PlexilPlan>