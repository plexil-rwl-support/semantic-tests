/* Copyright (c) 2006-2015, Universities Space Research Association (USRA).
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

package model.expr;

import java.util.Vector;

import main.Log;
import model.GlobalDeclList;
import model.Node;

public class ArrayElement
    extends Expr {

    private Expr array;
    private Expr index;

    public ArrayElement(Expr ary, Expr idx) {
        super();
        array = ary;
        index = idx;
    }

    public ExprType getType() {
        ExprType aryType = array.getType();
        if (aryType == null
            || !aryType.isArrayType())
            return null;
        if (aryType == ExprType.GenericArray)
            return ExprType.A; // not enough info
        return aryType.arrayElementType();
    }

    @Override
    public boolean isAssignable() {
        return array.isAssignable();
    }

    public String toString() {
        StringBuilder s = new StringBuilder("(ArrayElement ");
        s.append(array.toString());
        s.append(" ");
        s.append(index.toString());
        s.append(")");
        return s.toString();
    }

    /**
     * @brief Check the expression for type and other errors.
     * @param n The node providing the variable binding context.
     * @param decls The plan's global declarations.
     * @param contextMsg String to append to any error messages generated.
     * @param errors (in/out parameter) Collection of errors recorded.
     */
    public ExprType check(Node n,
                          GlobalDeclList decls,
                          String contextMsg,
                          Vector<Log> errors) {
        ExprType resultType = null;
        ExprType aryType = array.check(n, decls, contextMsg, errors);
        ExprType idxType = index.check(n, decls, contextMsg, errors);
        checkArrayType(array, aryType, "ArrayElement", contextMsg, errors);
        checkType(index, idxType, ExprType.Int, "ArrayElement", contextMsg, errors);
        if (aryType == null
            || !aryType.isArrayType())
            return null;
        if (aryType == ExprType.GenericArray)
            return ExprType.A; // not enough info
        return aryType.arrayElementType();
    }

}