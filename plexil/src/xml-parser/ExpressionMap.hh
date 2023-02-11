/* C++ code produced by gperf version 3.1 */
/* Command-line: /usr/bin/gperf -m 8 --output-file=ExpressionMap.hh ExpressionMap.gperf  */
/* Computed positions: -k'1-2,6' */

#if !((' ' == 32) && ('!' == 33) && ('"' == 34) && ('#' == 35) \
      && ('%' == 37) && ('&' == 38) && ('\'' == 39) && ('(' == 40) \
      && (')' == 41) && ('*' == 42) && ('+' == 43) && (',' == 44) \
      && ('-' == 45) && ('.' == 46) && ('/' == 47) && ('0' == 48) \
      && ('1' == 49) && ('2' == 50) && ('3' == 51) && ('4' == 52) \
      && ('5' == 53) && ('6' == 54) && ('7' == 55) && ('8' == 56) \
      && ('9' == 57) && (':' == 58) && (';' == 59) && ('<' == 60) \
      && ('=' == 61) && ('>' == 62) && ('?' == 63) && ('A' == 65) \
      && ('B' == 66) && ('C' == 67) && ('D' == 68) && ('E' == 69) \
      && ('F' == 70) && ('G' == 71) && ('H' == 72) && ('I' == 73) \
      && ('J' == 74) && ('K' == 75) && ('L' == 76) && ('M' == 77) \
      && ('N' == 78) && ('O' == 79) && ('P' == 80) && ('Q' == 81) \
      && ('R' == 82) && ('S' == 83) && ('T' == 84) && ('U' == 85) \
      && ('V' == 86) && ('W' == 87) && ('X' == 88) && ('Y' == 89) \
      && ('Z' == 90) && ('[' == 91) && ('\\' == 92) && (']' == 93) \
      && ('^' == 94) && ('_' == 95) && ('a' == 97) && ('b' == 98) \
      && ('c' == 99) && ('d' == 100) && ('e' == 101) && ('f' == 102) \
      && ('g' == 103) && ('h' == 104) && ('i' == 105) && ('j' == 106) \
      && ('k' == 107) && ('l' == 108) && ('m' == 109) && ('n' == 110) \
      && ('o' == 111) && ('p' == 112) && ('q' == 113) && ('r' == 114) \
      && ('s' == 115) && ('t' == 116) && ('u' == 117) && ('v' == 118) \
      && ('w' == 119) && ('x' == 120) && ('y' == 121) && ('z' == 122) \
      && ('{' == 123) && ('|' == 124) && ('}' == 125) && ('~' == 126))
/* The character set is not based on ISO-646.  */
#error "gperf generated tables don't work with this execution character set. Please report a bug to <bug-gperf@gnu.org>."
#endif

#line 7 "ExpressionMap.gperf"

/* Copyright (c) 2006-2019, Universities Space Research Association (USRA).
*  All rights reserved.
*
* Redistribution and use in source and binary forms, with or without
* modification, are permitted provided that the following conditions are met:
*     * Redistributions of source code must retain the above copyright
*       notice, this list of conditions and the following disclaimer.
*     * Redistributions in binary form must reproduce the above copyright
*       notice, this list of conditions and the following disclaimer in the
*       documentation and/or other materials provided with the distribution.
*     * Neither the name of the Universities Space Research Association nor the
*       names of its contributors may be used to endorse or promote products
*       derived from this software without specific prior written permission.
*
* THIS SOFTWARE IS PROVIDED BY USRA ``AS IS'' AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
* MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
* DISCLAIMED. IN NO EVENT SHALL USRA BE LIABLE FOR ANY DIRECT, INDIRECT,
* INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
* BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS
* OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
* ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
* TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE
* USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
#line 34 "ExpressionMap.gperf"
struct ExpressionEntry {int name; ExpressionFactory const *factory; };
/* maximum key range = 80, duplicates = 0 */

class ExpressionMap
{
private:
  static inline unsigned int hash (const char *str, size_t len);
public:
  static struct ExpressionEntry *getFactory (const char *str, size_t len);
};

inline unsigned int
ExpressionMap::hash (const char *str, size_t len)
{
  static unsigned char asso_values[] =
    {
      85, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85,  7, 43, 56, 24,  1,
      29, 66, 85, 12, 85, 85, 39, 28,  1,  1,
      57,  3,  3, 20,  8, 34, 35, 46,  3, 85,
      85, 85, 85, 85, 85, 85, 85,  8, 85, 85,
      32,  1, 85,  7, 27, 10, 85, 44, 39, 85,
      16,  1,  6, 85, 11, 26, 21, 15, 85, 26,
      39, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85, 85, 85, 85, 85, 85,
      85, 85, 85, 85, 85, 85
    };
  unsigned int hval = len;

  switch (hval)
    {
      default:
        hval += asso_values[static_cast<unsigned char>(str[5])];
      /*FALLTHROUGH*/
      case 5:
      case 4:
      case 3:
      case 2:
        hval += asso_values[static_cast<unsigned char>(str[1])];
      /*FALLTHROUGH*/
      case 1:
        hval += asso_values[static_cast<unsigned char>(str[0])];
        break;
    }
  return hval;
}

struct stringpool_t
  {
    char stringpool_str5[sizeof("NOT")];
    char stringpool_str6[sizeof("OR")];
    char stringpool_str7[sizeof("XOR")];
    char stringpool_str9[sizeof("ROUND")];
    char stringpool_str11[sizeof("AND")];
    char stringpool_str12[sizeof("NENumeric")];
    char stringpool_str13[sizeof("NEInternal")];
    char stringpool_str14[sizeof("EQNumeric")];
    char stringpool_str15[sizeof("EQInternal")];
    char stringpool_str16[sizeof("TRUNC")];
    char stringpool_str17[sizeof("NEArray")];
    char stringpool_str18[sizeof("ANY_KNOWN")];
    char stringpool_str19[sizeof("EQArray")];
    char stringpool_str20[sizeof("NEString")];
    char stringpool_str21[sizeof("RealValue")];
    char stringpool_str22[sizeof("EQString")];
    char stringpool_str23[sizeof("REAL_TO_INT")];
    char stringpool_str24[sizeof("RealVariable")];
    char stringpool_str25[sizeof("NodeCommandHandleValue")];
    char stringpool_str26[sizeof("NodeFailureValue")];
    char stringpool_str27[sizeof("SQRT")];
    char stringpool_str28[sizeof("NodeCommandHandleVariable")];
    char stringpool_str29[sizeof("NodeFailureVariable")];
    char stringpool_str30[sizeof("NodeTimepointValue")];
    char stringpool_str31[sizeof("ArrayElement")];
    char stringpool_str32[sizeof("MOD")];
    char stringpool_str33[sizeof("NodeOutcomeValue")];
    char stringpool_str34[sizeof("ADD")];
    char stringpool_str35[sizeof("STRLEN")];
    char stringpool_str36[sizeof("NodeOutcomeVariable")];
    char stringpool_str37[sizeof("NodeStateValue")];
    char stringpool_str38[sizeof("MAX")];
    char stringpool_str39[sizeof("DIV")];
    char stringpool_str40[sizeof("NodeStateVariable")];
    char stringpool_str41[sizeof("IntegerValue")];
    char stringpool_str42[sizeof("LE")];
    char stringpool_str43[sizeof("MIN")];
    char stringpool_str44[sizeof("IntegerVariable")];
    char stringpool_str45[sizeof("Succeeded")];
    char stringpool_str46[sizeof("Inactive")];
    char stringpool_str47[sizeof("ArraySize")];
    char stringpool_str48[sizeof("DeclareArray")];
    char stringpool_str49[sizeof("LT")];
    char stringpool_str50[sizeof("NEBoolean")];
    char stringpool_str51[sizeof("DeclareVariable")];
    char stringpool_str52[sizeof("EQBoolean")];
    char stringpool_str53[sizeof("ABS")];
    char stringpool_str54[sizeof("NoChildFailed")];
    char stringpool_str55[sizeof("LookupNow")];
    char stringpool_str56[sizeof("ALL_KNOWN")];
    char stringpool_str57[sizeof("SUB")];
    char stringpool_str58[sizeof("ArrayMaxSize")];
    char stringpool_str59[sizeof("StringValue")];
    char stringpool_str60[sizeof("LookupOnChange")];
    char stringpool_str61[sizeof("CEIL")];
    char stringpool_str62[sizeof("StringVariable")];
    char stringpool_str63[sizeof("ArrayValue")];
    char stringpool_str64[sizeof("BooleanValue")];
    char stringpool_str65[sizeof("MUL")];
    char stringpool_str66[sizeof("ArrayVariable")];
    char stringpool_str67[sizeof("BooleanVariable")];
    char stringpool_str68[sizeof("IterationEnded")];
    char stringpool_str69[sizeof("GE")];
    char stringpool_str70[sizeof("Executing")];
    char stringpool_str71[sizeof("IsKnown")];
    char stringpool_str72[sizeof("Skipped")];
    char stringpool_str73[sizeof("FLOOR")];
    char stringpool_str74[sizeof("Finished")];
    char stringpool_str75[sizeof("Failed")];
    char stringpool_str76[sizeof("GT")];
    char stringpool_str77[sizeof("Waiting")];
    char stringpool_str78[sizeof("PostconditionFailed")];
    char stringpool_str84[sizeof("Concat")];
  };
static struct stringpool_t stringpool_contents =
  {
    "NOT",
    "OR",
    "XOR",
    "ROUND",
    "AND",
    "NENumeric",
    "NEInternal",
    "EQNumeric",
    "EQInternal",
    "TRUNC",
    "NEArray",
    "ANY_KNOWN",
    "EQArray",
    "NEString",
    "RealValue",
    "EQString",
    "REAL_TO_INT",
    "RealVariable",
    "NodeCommandHandleValue",
    "NodeFailureValue",
    "SQRT",
    "NodeCommandHandleVariable",
    "NodeFailureVariable",
    "NodeTimepointValue",
    "ArrayElement",
    "MOD",
    "NodeOutcomeValue",
    "ADD",
    "STRLEN",
    "NodeOutcomeVariable",
    "NodeStateValue",
    "MAX",
    "DIV",
    "NodeStateVariable",
    "IntegerValue",
    "LE",
    "MIN",
    "IntegerVariable",
    "Succeeded",
    "Inactive",
    "ArraySize",
    "DeclareArray",
    "LT",
    "NEBoolean",
    "DeclareVariable",
    "EQBoolean",
    "ABS",
    "NoChildFailed",
    "LookupNow",
    "ALL_KNOWN",
    "SUB",
    "ArrayMaxSize",
    "StringValue",
    "LookupOnChange",
    "CEIL",
    "StringVariable",
    "ArrayValue",
    "BooleanValue",
    "MUL",
    "ArrayVariable",
    "BooleanVariable",
    "IterationEnded",
    "GE",
    "Executing",
    "IsKnown",
    "Skipped",
    "FLOOR",
    "Finished",
    "Failed",
    "GT",
    "Waiting",
    "PostconditionFailed",
    "Concat"
  };
#define stringpool ((const char *) &stringpool_contents)
struct ExpressionEntry *
ExpressionMap::getFactory (const char *str, size_t len)
{
  enum
    {
      TOTAL_KEYWORDS = 73,
      MIN_WORD_LENGTH = 2,
      MAX_WORD_LENGTH = 25,
      MIN_HASH_VALUE = 5,
      MAX_HASH_VALUE = 84
    };

  static struct ExpressionEntry wordlist[] =
    {
      {-1}, {-1}, {-1}, {-1}, {-1},
#line 82 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str5, REGISTER_FUNCTION(BooleanNot, NOT)},
#line 93 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str6, REGISTER_FUNCTION(BooleanOr, OR)},
#line 108 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str7, REGISTER_FUNCTION(BooleanXor, XOR)},
      {-1},
#line 96 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str9, REGISTER_CONVERSION_FUNCTION(Round, ROUND)},
      {-1},
#line 39 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str11, REGISTER_FUNCTION(BooleanAnd, AND)},
#line 80 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str12, REGISTER_FUNCTION(NotEqual, NENumeric)},
#line 79 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str13, REGISTER_FUNCTION(NotEqual, NEInternal)},
#line 56 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str14, REGISTER_FUNCTION(Equal, EQNumeric)},
#line 55 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str15, REGISTER_FUNCTION(Equal, EQInternal)},
#line 106 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str16, REGISTER_CONVERSION_FUNCTION(Truncate, TRUNC)},
#line 77 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str17, REGISTER_FUNCTION(NotEqual, NEArray)},
#line 40 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str18, REGISTER_FUNCTION(AnyElementsKnown, ANY_KNOWN)},
#line 53 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str19, REGISTER_FUNCTION(Equal, EQArray)},
#line 81 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str20, REGISTER_FUNCTION(NotEqual, NEString)},
#line 97 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str21, REGISTER_EXPRESSION(RealConstant, RealValue)},
#line 57 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str22, REGISTER_FUNCTION(Equal, EQString)},
#line 95 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str23, REGISTER_FUNCTION(RealToInteger, REAL_TO_INT)},
#line 98 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str24, new VariableReferenceFactory("RealVariable", REAL_TYPE)},
#line 83 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str25, REGISTER_NAMED_CONSTANT_FACTORY(CommandHandleConstant, NodeCommandHandleValue)},
#line 85 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str26, REGISTER_NAMED_CONSTANT_FACTORY(FailureTypeConstant, NodeFailureValue)},
#line 99 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str27, REGISTER_FUNCTION(SquareRoot<Real>, SQRT)},
#line 84 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str28, REGISTER_EXPRESSION(CommandHandleVariable, NodeCommandHandleVariable)},
#line 86 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str29, REGISTER_EXPRESSION(FailureVariable, NodeFailureVariable)},
#line 91 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str30, REGISTER_EXPRESSION(NodeTimepointValue, NodeTimepointValue)},
#line 43 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str31, REGISTER_EXPRESSION(ArrayReference, ArrayElement)},
#line 75 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str32, REGISTER_ARITHMETIC_FUNCTION(Modulo, MOD)},
#line 87 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str33, REGISTER_NAMED_CONSTANT_FACTORY(NodeOutcomeConstant, NodeOutcomeValue)},
#line 37 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str34, REGISTER_ARITHMETIC_FUNCTION(Addition, ADD)},
#line 100 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str35, REGISTER_FUNCTION(StringLength, STRLEN)},
#line 88 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str36, REGISTER_EXPRESSION(OutcomeVariable, NodeOutcomeVariable)},
#line 89 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str37, REGISTER_NAMED_CONSTANT_FACTORY(NodeStateConstant, NodeStateValue)},
#line 73 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str38, REGISTER_ARITHMETIC_FUNCTION(Maximum, MAX)},
#line 50 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str39, REGISTER_ARITHMETIC_FUNCTION(Division, DIV)},
#line 90 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str40, REGISTER_EXPRESSION(StateVariable, NodeStateVariable)},
#line 65 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str41, REGISTER_EXPRESSION(IntegerConstant, IntegerValue)},
#line 69 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str42, REGISTER_COMPARISON(LessEqual, LE)},
#line 74 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str43, REGISTER_ARITHMETIC_FUNCTION(Minimum, MIN)},
#line 66 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str44, new VariableReferenceFactory("IntegerVariable", INTEGER_TYPE)},
#line 105 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str45, REGISTER_NODE_FUNCTION(NodeSucceeded, Succeeded)},
#line 64 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str46, REGISTER_NODE_FUNCTION(NodeInactive, Inactive)},
#line 41 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str47, REGISTER_FUNCTION(ArraySize, ArraySize)},
#line 51 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str48, new ArrayVariableFactory("DeclareArray")},
#line 70 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str49, REGISTER_COMPARISON(LessThan, LT)},
#line 78 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str50, REGISTER_FUNCTION(NotEqual, NEBoolean)},
#line 52 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str51, new UserVariableFactory("DeclareVariable")},
#line 54 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str52, REGISTER_FUNCTION(Equal, EQBoolean)},
#line 36 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str53, REGISTER_ARITHMETIC_FUNCTION(AbsoluteValue, ABS)},
#line 92 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str54, REGISTER_NODE_FUNCTION(NodeNoChildFailed, NoChildFailed)},
#line 71 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str55, new LookupFactory("LookupNow")},
#line 38 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str56, REGISTER_FUNCTION(AllElementsKnown, ALL_KNOWN)},
#line 101 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str57, REGISTER_ARITHMETIC_FUNCTION(Subtraction, SUB)},
#line 42 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str58, REGISTER_FUNCTION(ArrayMaxSize, ArrayMaxSize)},
#line 103 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str59, REGISTER_EXPRESSION(StringConstant, StringValue)},
#line 72 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str60, new LookupFactory("LookupOnChange")},
#line 48 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str61, REGISTER_CONVERSION_FUNCTION(Ceiling, CEIL)},
#line 104 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str62, new VariableReferenceFactory("StringVariable", STRING_TYPE)},
#line 44 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str63, new ArrayLiteralFactory("ArrayValue")},
#line 46 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str64, REGISTER_EXPRESSION(BooleanConstant, BooleanValue)},
#line 76 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str65, REGISTER_ARITHMETIC_FUNCTION(Multiplication, MUL)},
#line 45 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str66, new ArrayVariableReferenceFactory("ArrayVariable")},
#line 47 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str67, new VariableReferenceFactory("BooleanVariable", BOOLEAN_TYPE)},
#line 67 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str68, REGISTER_NODE_FUNCTION(NodeIterationEnded, IterationEnded)},
#line 62 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str69, REGISTER_COMPARISON(GreaterEqual, GE)},
#line 58 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str70, REGISTER_NODE_FUNCTION(NodeExecuting, Executing)},
#line 68 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str71, REGISTER_FUNCTION(IsKnown, IsKnown)},
#line 102 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str72, REGISTER_NODE_FUNCTION(NodeSkipped, Skipped)},
#line 61 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str73, REGISTER_CONVERSION_FUNCTION(Floor, FLOOR)},
#line 60 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str74, REGISTER_NODE_FUNCTION(NodeFinished, Finished)},
#line 59 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str75, REGISTER_NODE_FUNCTION(NodeFailed, Failed)},
#line 63 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str76, REGISTER_COMPARISON(GreaterThan, GT)},
#line 107 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str77, REGISTER_NODE_FUNCTION(NodeWaiting, Waiting)},
#line 94 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str78, REGISTER_NODE_FUNCTION(NodePostconditionFailed, PostconditionFailed)},
      {-1}, {-1}, {-1}, {-1}, {-1},
#line 49 "ExpressionMap.gperf"
      {(int)(size_t)&((struct stringpool_t *)0)->stringpool_str84, REGISTER_CACHED_FUNCTION(StringConcat, Concat)}
    };

  if (len <= MAX_WORD_LENGTH && len >= MIN_WORD_LENGTH)
    {
      unsigned int key = hash (str, len);

      if (key <= MAX_HASH_VALUE)
        {
          int o = wordlist[key].name;
          if (o >= 0)
            {
              const char *s = o + stringpool;

              if (*str == *s && !strcmp (str + 1, s + 1))
                return &wordlist[key];
            }
        }
    }
  return 0;
}
