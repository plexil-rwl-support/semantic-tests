<?xml version="1.0" encoding="UTF-8"?><PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:tr="extended-plexil-translator" FileName="plans/FailureType2.ple"><Node NodeType="NodeList" epx="Concurrence" LineNo="1" ColNo="0"><NodeId>FailureType2</NodeId><NodeBody><NodeList><Node NodeType="Empty" LineNo="4" ColNo="1"><NodeId>One</NodeId><PostCondition><EQNumeric><IntegerValue>1</IntegerValue><IntegerValue>0</IntegerValue></EQNumeric></PostCondition></Node><Node NodeType="Empty" LineNo="9" ColNo="1"><NodeId>Two</NodeId><StartCondition><PostconditionFailed LineNo="11" ColNo="19"><NodeId>One</NodeId></PostconditionFailed></StartCondition></Node></NodeList></NodeBody></Node></PlexilPlan>