<?xml version="1.0" encoding="UTF-8"?><!-- Generated by PlexiLisp --><PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:tr="extended-plexil-translator"><Node NodeType="NodeList" epx="Sequence"><NodeId>ep2cp_Sequence_d1e4</NodeId><InvariantCondition><NoChildFailed><NodeRef dir="self"/></NoChildFailed></InvariantCondition><NodeBody><NodeList><Node NodeType="Empty"><NodeId>foo</NodeId></Node><Node NodeType="Empty"><NodeId>bar</NodeId><StartCondition><AND><Finished><NodeRef dir="sibling">foo</NodeRef></Finished><EQNumeric><IntegerValue>2</IntegerValue><IntegerValue>2</IntegerValue></EQNumeric></AND></StartCondition></Node></NodeList></NodeBody></Node></PlexilPlan>