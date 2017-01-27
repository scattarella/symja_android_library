package org.matheclipse.core.reflection.system;

import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IFraction;
import org.matheclipse.core.interfaces.IInteger;
import org.matheclipse.core.interfaces.INum;
import org.matheclipse.core.interfaces.IRational;
import org.matheclipse.core.interfaces.ISymbol;

/**
 * ContinuedFraction of a double or fraction number
 * 
 * See: <a href="http://en.wikipedia.org/wiki/Continued_fraction">Continued
 * fraction</a>
 * 
 * @see org.matheclipse.core.reflection.system.FromContinuedFraction
 */
public class ContinuedFraction extends AbstractEvaluator {

	public ContinuedFraction() {
	}

	@Override
	public IExpr evaluate(final IAST ast, EvalEngine engine) {
		Validate.checkRange(ast, 2, 3);

		IExpr arg1 = ast.arg1();

		int maxIterations = Integer.MAX_VALUE;
		if (ast.isAST2() && ast.arg2().isInteger()) {
			maxIterations = Validate.checkIntType(ast, 2);
		}

		if (arg1 instanceof INum) {
			arg1 = F.fraction(((INum) arg1).getRealPart());
		} else if (arg1.isAST() || arg1.isSymbol() && arg1.isNumericFunction()) {
			IExpr num = engine.evalN(arg1);
			if (num instanceof INum) {
				arg1 = F.fraction(((INum) num).getRealPart());
			}
		}

		if (arg1.isRational()) {
			IRational rat = (IRational) arg1;

			IAST continuedFractionList;
			if (rat.getDenominator().isOne()) {
				continuedFractionList = F.List(rat.getNumerator());
			} else if (rat.getNumerator().isOne()) {
				continuedFractionList = F.ListAlloc(2);
				continuedFractionList.append(F.C0);
				continuedFractionList.append(rat.getDenominator());
			} else {
				IFraction temp = F.fraction(rat.getNumerator(), rat.getDenominator());
				IInteger quotient;
				IInteger remainder;
				continuedFractionList = F.ListAlloc(10);
				while (temp.getDenominator().compareInt(1) > 0 && (0 < maxIterations--)) {
					quotient = temp.getNumerator().div(temp.getDenominator());
					remainder = temp.getNumerator().mod(temp.getDenominator());
					continuedFractionList.append(quotient);
					temp = F.fraction(temp.getDenominator(), remainder);
					if (temp.getDenominator().isOne()) {
						continuedFractionList.append(temp.getNumerator());
					}
				}
			}
			return continuedFractionList;

		}

		return F.NIL;
	}

	@Override
	public void setUp(ISymbol newSymbol) {
		newSymbol.setAttributes(ISymbol.NHOLDREST);
	}

}
