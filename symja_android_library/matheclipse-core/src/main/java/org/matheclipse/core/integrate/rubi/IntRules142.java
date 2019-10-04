package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules142 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(3551,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Subtract(Dist(Times(b,Power(Subtract(Times(b,c),Times(a,d)),CN1)),Int(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1),x),x),Dist(Times(d,Power(Subtract(Times(b,c),Times(a,d)),CN1)),Int(Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),CN1),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0))));
IIntegrate(3552,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(a,Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(C2,f,Subtract(Times(b,c),Times(a,d)),Plus(a,Times(b,Tan(Plus(e,Times(f,x)))))),CN1)),x)),Dist(Power(Times(C2,a,Subtract(Times(b,c),Times(a,d))),CN1),Int(Times(Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Simp(Subtract(Plus(Times(b,c),Times(a,d,Subtract(n,C1))),Times(b,d,n,Tan(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),Not(GtQ(n,C0)))));
IIntegrate(3553,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(a),Subtract(Times(b,c),Times(a,d)),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Subtract(m,C2)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(d,f,Plus(Times(b,c),Times(a,d)),Plus(n,C1)),CN1)),x)),Dist(Times(a,Power(Times(d,Plus(Times(b,c),Times(a,d)),Plus(n,C1)),CN1)),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Subtract(m,C2)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Simp(Plus(Times(b,Subtract(Times(b,c,Subtract(m,C2)),Times(a,d,Subtract(Subtract(m,Times(C2,n)),C4)))),Times(Subtract(Plus(Times(a,b,c,Subtract(m,C2)),Times(Sqr(b),d,Plus(n,C1))),Times(Sqr(a),d,Subtract(Plus(m,n),C1))),Tan(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),GtQ(m,C1),LtQ(n,CN1),Or(IntegerQ(m),IntegersQ(Times(C2,m),Times(C2,n))))));
IIntegrate(3554,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),QQ(3L,2L)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Subtract(Dist(Times(C2,Sqr(a),Power(Subtract(Times(a,c),Times(b,d)),CN1)),Int(Sqrt(Plus(a,Times(b,Tan(Plus(e,Times(f,x)))))),x),x),Dist(Times(Plus(Times(C2,b,c,d),Times(a,Subtract(Sqr(c),Sqr(d)))),Power(Times(a,Plus(Sqr(c),Sqr(d))),CN1)),Int(Times(Subtract(a,Times(b,Tan(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Tan(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0))));
IIntegrate(3555,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),QQ(3L,2L)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Plus(Dist(Times(C2,a),Int(Times(Sqrt(Plus(a,Times(b,Tan(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),CN1D2)),x),x),Dist(Times(b,Power(a,CN1)),Int(Times(Plus(b,Times(a,Tan(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Tan(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0))));
IIntegrate(3556,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Sqr(b),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Subtract(m,C2)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(d,f,Subtract(Plus(m,n),C1)),CN1)),x),Dist(Times(a,Power(Times(d,Subtract(Plus(m,n),C1)),CN1)),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Subtract(m,C2)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Simp(Plus(Times(b,c,Subtract(m,C2)),Times(a,d,Plus(m,Times(C2,n))),Times(Plus(Times(a,c,Subtract(m,C2)),Times(b,d,Subtract(Plus(Times(C3,m),Times(C2,n)),C4))),Tan(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),IntegerQ(Times(C2,m)),GtQ(m,C1),NeQ(Subtract(Plus(m,n),C1),C0),Or(IntegerQ(m),IntegersQ(Times(C2,m),Times(C2,n))))));
IIntegrate(3557,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Sqrt(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Sqrt(Plus(c,Times(d,Tan(Plus(e,Times(f,x)))))),Power(Times(C2,a,f,m),CN1)),x)),Dist(Power(Times(C4,Sqr(a),m),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(C2,a,c,m),Times(b,d),Times(a,d,Plus(Times(C2,m),C1),Tan(Plus(e,Times(f,x))))),x),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),LtQ(m,C0),IntegersQ(Times(C2,m)))));
IIntegrate(3558,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Subtract(Times(b,c),Times(a,d)),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Subtract(n,C1)),Power(Times(C2,a,f,m),CN1)),x)),Dist(Power(Times(C2,Sqr(a),m),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Subtract(n,C2)),Simp(Subtract(Subtract(Times(c,Plus(Times(a,c,m),Times(b,d,Subtract(n,C1)))),Times(d,Plus(Times(b,c,m),Times(a,d,Subtract(n,C1))))),Times(d,Subtract(Times(b,d,Plus(m,Negate(n),C1)),Times(a,c,Subtract(Plus(m,n),C1))),Tan(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),LtQ(m,C0),GtQ(n,C1),Or(IntegerQ(m),IntegersQ(Times(C2,m),Times(C2,n))))));
IIntegrate(3559,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(a,Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(C2,f,m,Subtract(Times(b,c),Times(a,d))),CN1)),x),Dist(Power(Times(C2,a,m,Subtract(Times(b,c),Times(a,d))),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Simp(Plus(Times(b,c,m),Times(CN1,a,d,Plus(Times(C2,m),n,C1)),Times(b,d,Plus(m,n,C1),Tan(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),LtQ(m,C0),Or(IntegerQ(m),IntegersQ(Times(C2,m),Times(C2,n))))));
IIntegrate(3560,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Subtract(Simp(Times(d,Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Subtract(n,C1)),Power(Times(f,Subtract(Plus(m,n),C1)),CN1)),x),Dist(Power(Times(a,Subtract(Plus(m,n),C1)),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Subtract(n,C2)),Simp(Plus(Times(d,Plus(Times(b,c,m),Times(a,d,Plus(CN1,n)))),Times(CN1,a,Sqr(c),Subtract(Plus(m,n),C1)),Times(d,Subtract(Times(b,d,m),Times(a,c,Subtract(Plus(m,Times(C2,n)),C2))),Tan(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),GtQ(n,C1),NeQ(Subtract(Plus(m,n),C1),C0),Or(IntegerQ(n),IntegersQ(Times(C2,m),Times(C2,n))))));
IIntegrate(3561,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Subtract(Simp(Times(d,Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(f,Plus(n,C1),Plus(Sqr(c),Sqr(d))),CN1)),x),Dist(Power(Times(a,Plus(Sqr(c),Sqr(d)),Plus(n,C1)),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Simp(Plus(Times(b,d,m),Times(CN1,a,c,Plus(n,C1)),Times(a,d,Plus(m,n,C1),Tan(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),LtQ(n,CN1),Or(IntegerQ(n),IntegersQ(Times(C2,m),Times(C2,n))))));
IIntegrate(3562,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Subtract(Dist(Times(a,Power(Subtract(Times(a,c),Times(b,d)),CN1)),Int(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),x),x),Dist(Times(d,Power(Subtract(Times(a,c),Times(b,d)),CN1)),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Plus(b,Times(a,Tan(Plus(e,Times(f,x))))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0))));
IIntegrate(3563,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Sqrt(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Dist(Times(Subtract(Times(a,c),Times(b,d)),Power(a,CN1)),Int(Times(Sqrt(Plus(a,Times(b,Tan(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),CN1D2)),x),x),Dist(Times(d,Power(a,CN1)),Int(Times(Sqrt(Plus(a,Times(b,Tan(Plus(e,Times(f,x)))))),Plus(b,Times(a,Tan(Plus(e,Times(f,x))))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0))));
IIntegrate(3564,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Dist(Times(a,b,Power(f,CN1)),Subst(Int(Times(Power(Plus(a,x),Subtract(m,C1)),Power(Plus(c,Times(d,x,Power(b,CN1))),n),Power(Plus(Sqr(b),Times(a,x)),CN1)),x),x,Times(b,Tan(Plus(e,Times(f,x))))),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0))));
IIntegrate(3565,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Subtract(Simp(Times(Sqr(Subtract(Times(b,c),Times(a,d))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Subtract(m,C2)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(d,f,Plus(n,C1),Plus(Sqr(c),Sqr(d))),CN1)),x),Dist(Power(Times(d,Plus(n,C1),Plus(Sqr(c),Sqr(d))),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Subtract(m,C3)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Simp(Subtract(Subtract(Plus(Times(Sqr(a),d,Subtract(Times(b,d,Subtract(m,C2)),Times(a,c,Plus(n,C1)))),Times(b,Subtract(Times(b,c),Times(C2,a,d)),Plus(Times(b,c,Subtract(m,C2)),Times(a,d,Plus(n,C1))))),Times(d,Plus(n,C1),Plus(Times(C3,Sqr(a),b,c),Times(CN1,Power(b,C3),c),Times(CN1,Power(a,C3),d),Times(C3,a,Sqr(b),d)),Tan(Plus(e,Times(f,x))))),Times(b,Subtract(Times(a,d,Subtract(Times(C2,b,c),Times(a,d)),Subtract(Plus(m,n),C1)),Times(Sqr(b),Subtract(Times(Sqr(c),Subtract(m,C2)),Times(Sqr(d),Plus(n,C1))))),Sqr(Tan(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),GtQ(m,C2),LtQ(n,CN1),IntegerQ(Times(C2,m)))));
IIntegrate(3566,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Sqr(b),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Subtract(m,C2)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(d,f,Subtract(Plus(m,n),C1)),CN1)),x),Dist(Power(Times(d,Subtract(Plus(m,n),C1)),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Subtract(m,C3)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Simp(Subtract(Plus(Times(Power(a,C3),d,Subtract(Plus(m,n),C1)),Times(CN1,Sqr(b),Plus(Times(b,c,Subtract(m,C2)),Times(a,d,Plus(C1,n)))),Times(b,d,Subtract(Plus(m,n),C1),Subtract(Times(C3,Sqr(a)),Sqr(b)),Tan(Plus(e,Times(f,x))))),Times(Sqr(b),Subtract(Times(b,c,Subtract(m,C2)),Times(a,d,Subtract(Plus(Times(C3,m),Times(C2,n)),C4))),Sqr(Tan(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),IntegerQ(Times(C2,m)),GtQ(m,C2),Or(GeQ(n,CN1),IntegerQ(m)),Not(And(IGtQ(n,C2),Or(Not(IntegerQ(m)),And(EqQ(c,C0),NeQ(a,C0))))))));
IIntegrate(3567,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Subtract(Times(b,c),Times(a,d)),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Subtract(n,C1)),Power(Times(f,Plus(m,C1),Plus(Sqr(a),Sqr(b))),CN1)),x),Dist(Power(Times(Plus(m,C1),Plus(Sqr(a),Sqr(b))),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Subtract(n,C2)),Simp(Subtract(Subtract(Plus(Times(a,Sqr(c),Plus(m,C1)),Times(a,Sqr(d),Subtract(n,C1)),Times(b,c,d,Plus(m,Negate(n),C2))),Times(Subtract(Subtract(Times(b,Sqr(c)),Times(C2,a,c,d)),Times(b,Sqr(d))),Plus(m,C1),Tan(Plus(e,Times(f,x))))),Times(d,Subtract(Times(b,c),Times(a,d)),Plus(m,n),Sqr(Tan(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),LtQ(m,CN1),LtQ(C1,n,C2),IntegerQ(Times(C2,m)))));
IIntegrate(3568,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Power(Times(f,Plus(m,C1),Plus(Sqr(a),Sqr(b))),CN1)),x),Dist(Power(Times(Plus(m,C1),Plus(Sqr(a),Sqr(b))),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Subtract(n,C1)),Simp(Subtract(Subtract(Subtract(Times(a,c,Plus(m,C1)),Times(b,d,n)),Times(Subtract(Times(b,c),Times(a,d)),Plus(m,C1),Tan(Plus(e,Times(f,x))))),Times(b,d,Plus(m,n,C1),Sqr(Tan(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),LtQ(m,CN1),GtQ(n,C0),IntegerQ(Times(C2,m)))));
IIntegrate(3569,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Sqr(b),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(f,Plus(m,C1),Plus(Sqr(a),Sqr(b)),Subtract(Times(b,c),Times(a,d))),CN1)),x),Dist(Power(Times(Plus(m,C1),Plus(Sqr(a),Sqr(b)),Subtract(Times(b,c),Times(a,d))),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Simp(Subtract(Subtract(Subtract(Times(a,Subtract(Times(b,c),Times(a,d)),Plus(m,C1)),Times(Sqr(b),d,Plus(m,n,C2))),Times(b,Subtract(Times(b,c),Times(a,d)),Plus(m,C1),Tan(Plus(e,Times(f,x))))),Times(Sqr(b),d,Plus(m,n,C2),Sqr(Tan(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),IntegerQ(Times(C2,m)),LtQ(m,CN1),Or(LtQ(n,C0),IntegerQ(m)),Not(And(ILtQ(n,CN1),Or(Not(IntegerQ(m)),And(EqQ(c,C0),NeQ(a,C0))))))));
IIntegrate(3570,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(b,Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Subtract(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Power(Times(f,Subtract(Plus(m,n),C1)),CN1)),x),Dist(Power(Subtract(Plus(m,n),C1),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Subtract(m,C2)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Subtract(n,C1)),Simp(Plus(Times(Sqr(a),c,Subtract(Plus(m,n),C1)),Times(CN1,b,Plus(Times(b,c,Subtract(m,C1)),Times(a,d,n))),Times(Subtract(Plus(Times(C2,a,b,c),Times(Sqr(a),d)),Times(Sqr(b),d)),Subtract(Plus(m,n),C1),Tan(Plus(e,Times(f,x)))),Times(b,Plus(Times(b,c,n),Times(a,d,Subtract(Plus(Times(C2,m),n),C2))),Sqr(Tan(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),GtQ(m,C1),GtQ(n,C0),IntegerQ(Times(C2,n)))));
IIntegrate(3571,Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Simp(Times(Subtract(Times(a,c),Times(b,d)),x,Power(Times(Plus(Sqr(a),Sqr(b)),Plus(Sqr(c),Sqr(d))),CN1)),x),Dist(Times(Sqr(b),Power(Times(Subtract(Times(b,c),Times(a,d)),Plus(Sqr(a),Sqr(b))),CN1)),Int(Times(Subtract(b,Times(a,Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1)),x),x),Negate(Dist(Times(Sqr(d),Power(Times(Subtract(Times(b,c),Times(a,d)),Plus(Sqr(c),Sqr(d))),CN1)),Int(Times(Subtract(d,Times(c,Tan(Plus(e,Times(f,x))))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),CN1)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0))));
IIntegrate(3572,Int(Times(Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Subtract(Dist(Power(Plus(Sqr(c),Sqr(d)),CN1),Int(Times(Simp(Plus(Times(a,c),Times(b,d),Times(Subtract(Times(b,c),Times(a,d)),Tan(Plus(e,Times(f,x))))),x),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1D2)),x),x),Dist(Times(d,Subtract(Times(b,c),Times(a,d)),Power(Plus(Sqr(c),Sqr(d)),CN1)),Int(Times(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Times(Sqrt(Plus(a,Times(b,Tan(Plus(e,Times(f,x)))))),Plus(c,Times(d,Tan(Plus(e,Times(f,x)))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0))));
IIntegrate(3573,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),QQ(3L,2L)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Dist(Power(Plus(Sqr(c),Sqr(d)),CN1),Int(Times(Simp(Plus(Times(Sqr(a),c),Times(CN1,Sqr(b),c),Times(C2,a,b,d),Times(Plus(Times(C2,a,b,c),Times(CN1,Sqr(a),d),Times(Sqr(b),d)),Tan(Plus(e,Times(f,x))))),x),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1D2)),x),x),Dist(Times(Sqr(Subtract(Times(b,c),Times(a,d))),Power(Plus(Sqr(c),Sqr(d)),CN1)),Int(Times(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Times(Sqrt(Plus(a,Times(b,Tan(Plus(e,Times(f,x)))))),Plus(c,Times(d,Tan(Plus(e,Times(f,x)))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0))));
IIntegrate(3574,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Dist(Power(Plus(Sqr(c),Sqr(d)),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Subtract(c,Times(d,Tan(Plus(e,Times(f,x)))))),x),x),Dist(Times(Sqr(d),Power(Plus(Sqr(c),Sqr(d)),CN1)),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),Not(IntegerQ(m)))));
IIntegrate(3575,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,CN1)),Subst(Int(Times(Power(Plus(a,Times(b,$s("ff"),x)),m),Power(Plus(c,Times(d,$s("ff"),x)),n),Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),CN1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,c,d,e,f,m,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0))));
  }
}
}