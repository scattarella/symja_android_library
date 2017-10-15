package org.matheclipse.core.patternmatching;

import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IInteger;
import org.matheclipse.core.interfaces.ISignedNumber;
import org.matheclipse.core.visit.HashValueVisitor;

/**
 * Match two arguments of an <code>Orderless</code> <code>Plus(... )</code> AST
 * into a new resulting expression.
 * 
 */
public class HashedOrderlessMatcherPlus extends HashedOrderlessMatcher {

	public HashedOrderlessMatcherPlus() {
		super();
	}

	@Override
	protected void createHashValues(final IAST orderlessAST, int[] hashValues) {
		for (int i = 0; i < hashValues.length; i++) {
			IExpr temp = orderlessAST.get(i + 1);
			if (temp.isTimes() && ((IAST) temp).arg1().isInteger() && ((IAST) temp).size() == 3) {
				hashValues[i] = ((IAST) temp).arg2().head().hashCode();
			} else {
				hashValues[i] = temp.head().hashCode();
			}
		}
	}

	@Override
	protected void createSpecialHashValues(final IAST orderlessAST, int[] hashValues) {
		for (int i = 0; i < hashValues.length; i++) {
			IExpr temp = orderlessAST.get(i + 1);
			if (temp.isTimes() && ((IAST) temp).arg1().isInteger() && ((IAST) temp).size() == 3) {
				hashValues[i] = ((IAST) temp).arg2().accept(HashValueVisitor.HASH_VALUE_VISITOR);
			} else {
				hashValues[i] = temp.accept(HashValueVisitor.HASH_VALUE_VISITOR);
			}
		}
	}

	@Override
	protected boolean updateHashValues(IAST result, final IAST orderlessAST, AbstractHashedPatternRules hashRule,
			int[] hashValues, int i, int j, EvalEngine engine) {
		IExpr temp;
		IExpr arg1 = orderlessAST.get(i + 1);
		ISignedNumber num1 = F.C1;
		if (arg1.isTimes() && ((IAST) arg1).arg1().isInteger() && ((IAST) arg1).size() == 3) {
			num1 = (ISignedNumber) ((IAST) arg1).arg1();
			arg1 = ((IAST) arg1).arg2();
		}
		IExpr arg2 = orderlessAST.get(j + 1);
		ISignedNumber num2 = F.C1;
		if (arg2.isTimes() && ((IAST) arg2).arg1().isInteger() && ((IAST) arg2).size() == 3) {
			num2 = (ISignedNumber) ((IAST) arg2).arg1();
			arg2 = ((IAST) arg2).arg2();
		}
		if ((temp = hashRule.evalDownRule(arg1, arg2, engine)).isPresent()) {
			hashValues[i] = 0;
			hashValues[j] = 0;
			if (num1.equals(num2)) {
				result.append(F.Times(num2, temp));
				return true;
			}
			IInteger plusMinusOne = F.C1;
			if (num1.isNegative() && num2.isNegative()) {
				num1 = num1.negate();
				num2 = num2.negate();
				plusMinusOne = F.CN1;
			}
			if (num1.isPositive() && num2.isPositive()) {
				ISignedNumber diff = num1.subtractFrom(num2);
				if (diff.isPositive()) {
					// num1 > num2
					result.append(F.Times(plusMinusOne, F.Plus(F.Times(diff, arg1), F.Times(num2, temp))));
					return true;
				} else {
					// num1 < num2
					diff = diff.negate();
					result.append(F.Times(plusMinusOne, F.Plus(F.Times(diff, arg2), F.Times(num1, temp))));
					return true;
				}
			}
			// result.append(temp);
			// return true;
		}
		return false;
	}
}