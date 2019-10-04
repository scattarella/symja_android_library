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
public class IntRules251 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(6276,Int(Times(Plus(a_DEFAULT,Times(ArcCoth(u_),b_DEFAULT)),v_),x_Symbol),
    Condition(With(List(Set(w,IntHide(v,x))),Condition(Subtract(Dist(Plus(a,Times(b,ArcCoth(u))),w,x),Dist(b,Int(SimplifyIntegrand(Times(w,D(u,x),Power(Subtract(C1,Sqr(u)),CN1)),x),x),x)),InverseFunctionFreeQ(w,x))),And(FreeQ(List(a,b),x),InverseFunctionFreeQ(u,x),Not(MatchQ(v,Condition(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x)),m_DEFAULT),FreeQ(List(c,d,m),x)))),FalseQ(FunctionOfLinear(Times(v,Plus(a,Times(b,ArcCoth(u)))),x)))));
IIntegrate(6277,Int(ArcSech(Times(c_DEFAULT,x_)),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcSech(Times(c,x))),x),Dist(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Power(Plus(C1,Times(c,x)),CN1))),Int(Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1D2),x),x)),FreeQ(c,x)));
IIntegrate(6278,Int(ArcCsch(Times(c_DEFAULT,x_)),x_Symbol),
    Condition(Plus(Simp(Times(x,ArcCsch(Times(c,x))),x),Dist(Power(c,CN1),Int(Power(Times(x,Sqrt(Plus(C1,Power(Times(Sqr(c),Sqr(x)),CN1)))),CN1),x),x)),FreeQ(c,x)));
IIntegrate(6279,Int(Power(Plus(a_DEFAULT,Times(ArcSech(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),x_Symbol),
    Condition(Negate(Dist(Power(c,CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Sech(x),Tanh(x)),x),x,ArcSech(Times(c,x))),x)),And(FreeQ(List(a,b,c,n),x),IGtQ(n,C0))));
IIntegrate(6280,Int(Power(Plus(a_DEFAULT,Times(ArcCsch(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),x_Symbol),
    Condition(Negate(Dist(Power(c,CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Csch(x),Coth(x)),x),x,ArcCsch(Times(c,x))),x)),And(FreeQ(List(a,b,c,n),x),IGtQ(n,C0))));
IIntegrate(6281,Int(Times(Plus(a_DEFAULT,Times(ArcSech(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(x_,CN1)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Plus(a,Times(b,ArcCosh(Times(x,Power(c,CN1))))),Power(x,CN1)),x),x,Power(x,CN1))),FreeQ(List(a,b,c),x)));
IIntegrate(6282,Int(Times(Plus(a_DEFAULT,Times(ArcCsch(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(x_,CN1)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Plus(a,Times(b,ArcSinh(Times(x,Power(c,CN1))))),Power(x,CN1)),x),x,Power(x,CN1))),FreeQ(List(a,b,c),x)));
IIntegrate(6283,Int(Times(Plus(a_DEFAULT,Times(ArcSech(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(d_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Plus(a,Times(b,ArcSech(Times(c,x)))),Power(Times(d,Plus(m,C1)),CN1)),x),Dist(Times(b,Sqrt(Plus(C1,Times(c,x))),Sqrt(Power(Plus(C1,Times(c,x)),CN1)),Power(Plus(m,C1),CN1)),Int(Times(Power(Times(d,x),m),Power(Times(Sqrt(Subtract(C1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1))));
IIntegrate(6284,Int(Times(Plus(a_DEFAULT,Times(ArcCsch(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(d_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Plus(a,Times(b,ArcCsch(Times(c,x)))),Power(Times(d,Plus(m,C1)),CN1)),x),Dist(Times(b,d,Power(Times(c,Plus(m,C1)),CN1)),Int(Times(Power(Times(d,x),Subtract(m,C1)),Power(Plus(C1,Power(Times(Sqr(c),Sqr(x)),CN1)),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,m),x),NeQ(m,CN1))));
IIntegrate(6285,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSech(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Power(Power(c,Plus(m,C1)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Sech(x),Plus(m,C1)),Tanh(x)),x),x,ArcSech(Times(c,x))),x)),And(FreeQ(List(a,b,c),x),IntegerQ(n),IntegerQ(m),Or(GtQ(n,C0),LtQ(m,CN1)))));
IIntegrate(6286,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCsch(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Power(Power(c,Plus(m,C1)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Csch(x),Plus(m,C1)),Coth(x)),x),x,ArcCsch(Times(c,x))),x)),And(FreeQ(List(a,b,c),x),IntegerQ(n),IntegerQ(m),Or(GtQ(n,C0),LtQ(m,CN1)))));
IIntegrate(6287,Int(Times(Plus(a_DEFAULT,Times(ArcSech(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,ArcSech(Times(c,x)))),Log(Plus(C1,Times(Subtract(e,Sqrt(Plus(Times(CN1,Sqr(c),Sqr(d)),Sqr(e)))),Power(Times(c,d,Exp(ArcSech(Times(c,x)))),CN1)))),Power(e,CN1)),x),Dist(Times(b,Power(e,CN1)),Int(Times(Sqrt(Times(Subtract(C1,Times(c,x)),Power(Plus(C1,Times(c,x)),CN1))),Log(Plus(C1,Times(Subtract(e,Sqrt(Plus(Times(CN1,Sqr(c),Sqr(d)),Sqr(e)))),Power(Times(c,d,Exp(ArcSech(Times(c,x)))),CN1)))),Power(Times(x,Subtract(C1,Times(c,x))),CN1)),x),x),Dist(Times(b,Power(e,CN1)),Int(Times(Sqrt(Times(Subtract(C1,Times(c,x)),Power(Plus(C1,Times(c,x)),CN1))),Log(Plus(C1,Times(Plus(e,Sqrt(Plus(Times(CN1,Sqr(c),Sqr(d)),Sqr(e)))),Power(Times(c,d,Exp(ArcSech(Times(c,x)))),CN1)))),Power(Times(x,Subtract(C1,Times(c,x))),CN1)),x),x),Negate(Dist(Times(b,Power(e,CN1)),Int(Times(Sqrt(Times(Subtract(C1,Times(c,x)),Power(Plus(C1,Times(c,x)),CN1))),Log(Plus(C1,Power(Exp(Times(C2,ArcSech(Times(c,x)))),CN1))),Power(Times(x,Subtract(C1,Times(c,x))),CN1)),x),x)),Simp(Times(Plus(a,Times(b,ArcSech(Times(c,x)))),Log(Plus(C1,Times(Plus(e,Sqrt(Plus(Times(CN1,Sqr(c),Sqr(d)),Sqr(e)))),Power(Times(c,d,Exp(ArcSech(Times(c,x)))),CN1)))),Power(e,CN1)),x),Negate(Simp(Times(Plus(a,Times(b,ArcSech(Times(c,x)))),Log(Plus(C1,Power(Exp(Times(C2,ArcSech(Times(c,x)))),CN1))),Power(e,CN1)),x))),FreeQ(List(a,b,c,d,e),x)));
IIntegrate(6288,Int(Times(Plus(a_DEFAULT,Times(ArcSech(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Plus(a,Times(b,ArcSech(Times(c,x)))),Power(Times(e,Plus(m,C1)),CN1)),x),Dist(Times(b,Sqrt(Plus(C1,Times(c,x))),Sqrt(Power(Plus(C1,Times(c,x)),CN1)),Power(Times(e,Plus(m,C1)),CN1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Times(x,Sqrt(Subtract(C1,Times(Sqr(c),Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(m,CN1))));
IIntegrate(6289,Int(Times(Plus(a_DEFAULT,Times(ArcCsch(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,ArcCsch(Times(c,x)))),Log(Subtract(C1,Times(Subtract(e,Sqrt(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)))),Exp(ArcCsch(Times(c,x))),Power(Times(c,d),CN1)))),Power(e,CN1)),x),Dist(Times(b,Power(Times(c,e),CN1)),Int(Times(Log(Subtract(C1,Times(Subtract(e,Sqrt(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)))),Exp(ArcCsch(Times(c,x))),Power(Times(c,d),CN1)))),Power(Times(Sqr(x),Sqrt(Plus(C1,Power(Times(Sqr(c),Sqr(x)),CN1)))),CN1)),x),x),Dist(Times(b,Power(Times(c,e),CN1)),Int(Times(Log(Subtract(C1,Times(Plus(e,Sqrt(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)))),Exp(ArcCsch(Times(c,x))),Power(Times(c,d),CN1)))),Power(Times(Sqr(x),Sqrt(Plus(C1,Power(Times(Sqr(c),Sqr(x)),CN1)))),CN1)),x),x),Negate(Dist(Times(b,Power(Times(c,e),CN1)),Int(Times(Log(Subtract(C1,Exp(Times(C2,ArcCsch(Times(c,x)))))),Power(Times(Sqr(x),Sqrt(Plus(C1,Power(Times(Sqr(c),Sqr(x)),CN1)))),CN1)),x),x)),Simp(Times(Plus(a,Times(b,ArcCsch(Times(c,x)))),Log(Subtract(C1,Times(Plus(e,Sqrt(Plus(Times(Sqr(c),Sqr(d)),Sqr(e)))),Exp(ArcCsch(Times(c,x))),Power(Times(c,d),CN1)))),Power(e,CN1)),x),Negate(Simp(Times(Plus(a,Times(b,ArcCsch(Times(c,x)))),Log(Subtract(C1,Exp(Times(C2,ArcCsch(Times(c,x)))))),Power(e,CN1)),x))),FreeQ(List(a,b,c,d,e),x)));
IIntegrate(6290,Int(Times(Plus(a_DEFAULT,Times(ArcCsch(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Plus(a,Times(b,ArcCsch(Times(c,x)))),Power(Times(e,Plus(m,C1)),CN1)),x),Dist(Times(b,Power(Times(c,e,Plus(m,C1)),CN1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Times(Sqr(x),Sqrt(Plus(C1,Power(Times(Sqr(c),Sqr(x)),CN1)))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(m,CN1))));
IIntegrate(6291,Int(Times(Plus(a_DEFAULT,Times(ArcSech(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(d,Times(e,Sqr(x))),p),x))),Plus(Dist(Plus(a,Times(b,ArcSech(Times(c,x)))),u,x),Dist(Times(b,Sqrt(Plus(C1,Times(c,x))),Sqrt(Power(Plus(C1,Times(c,x)),CN1))),Int(SimplifyIntegrand(Times(u,Power(Times(x,Sqrt(Subtract(C1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),CN1)),x),x),x))),And(FreeQ(List(a,b,c,d,e),x),Or(IGtQ(p,C0),ILtQ(Plus(p,C1D2),C0)))));
IIntegrate(6292,Int(Times(Plus(a_DEFAULT,Times(ArcCsch(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(d,Times(e,Sqr(x))),p),x))),Subtract(Dist(Plus(a,Times(b,ArcCsch(Times(c,x)))),u,x),Dist(Times(b,c,x,Power(Times(CN1,Sqr(c),Sqr(x)),CN1D2)),Int(SimplifyIntegrand(Times(u,Power(Times(x,Sqrt(Subtract(CN1,Times(Sqr(c),Sqr(x))))),CN1)),x),x),x))),And(FreeQ(List(a,b,c,d,e),x),Or(IGtQ(p,C0),ILtQ(Plus(p,C1D2),C0)))));
IIntegrate(6293,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSech(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcCosh(Times(x,Power(c,CN1))))),n),Power(Power(x,Times(C2,Plus(p,C1))),CN1)),x),x,Power(x,CN1))),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(n,C0),IntegerQ(p))));
IIntegrate(6294,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCsch(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(x,Power(c,CN1))))),n),Power(Power(x,Times(C2,Plus(p,C1))),CN1)),x),x,Power(x,CN1))),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(n,C0),IntegerQ(p))));
IIntegrate(6295,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSech(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Negate(Dist(Times(Sqrt(Sqr(x)),Power(x,CN1)),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcCosh(Times(x,Power(c,CN1))))),n),Power(Power(x,Times(C2,Plus(p,C1))),CN1)),x),x,Power(x,CN1)),x)),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(n,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Plus(p,C1D2)),GtQ(e,C0),LtQ(d,C0))));
IIntegrate(6296,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCsch(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Negate(Dist(Times(Sqrt(Sqr(x)),Power(x,CN1)),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(x,Power(c,CN1))))),n),Power(Power(x,Times(C2,Plus(p,C1))),CN1)),x),x,Power(x,CN1)),x)),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(n,C0),EqQ(Subtract(e,Times(Sqr(c),d)),C0),IntegerQ(Plus(p,C1D2)),GtQ(e,C0),LtQ(d,C0))));
IIntegrate(6297,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSech(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Negate(Dist(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Times(x,Sqrt(Plus(e,Times(d,Power(x,CN2))))),CN1)),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcCosh(Times(x,Power(c,CN1))))),n),Power(Power(x,Times(C2,Plus(p,C1))),CN1)),x),x,Power(x,CN1)),x)),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(n,C0),EqQ(Plus(Times(Sqr(c),d),e),C0),IntegerQ(Plus(p,C1D2)),Not(And(GtQ(e,C0),LtQ(d,C0))))));
IIntegrate(6298,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCsch(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Negate(Dist(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Times(x,Sqrt(Plus(e,Times(d,Power(x,CN2))))),CN1)),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(x,Power(c,CN1))))),n),Power(Power(x,Times(C2,Plus(p,C1))),CN1)),x),x,Power(x,CN1)),x)),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(n,C0),EqQ(Subtract(e,Times(Sqr(c),d)),C0),IntegerQ(Plus(p,C1D2)),Not(And(GtQ(e,C0),LtQ(d,C0))))));
IIntegrate(6299,Int(Times(Plus(a_DEFAULT,Times(ArcSech(Times(c_DEFAULT,x_)),b_DEFAULT)),x_,Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcSech(Times(c,x)))),Power(Times(C2,e,Plus(p,C1)),CN1)),x),Dist(Times(b,Sqrt(Plus(C1,Times(c,x))),Sqrt(Power(Plus(C1,Times(c,x)),CN1)),Power(Times(C2,e,Plus(p,C1)),CN1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Times(x,Sqrt(Subtract(C1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,p),x),NeQ(p,CN1))));
IIntegrate(6300,Int(Times(Plus(a_DEFAULT,Times(ArcCsch(Times(c_DEFAULT,x_)),b_DEFAULT)),x_,Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcCsch(Times(c,x)))),Power(Times(C2,e,Plus(p,C1)),CN1)),x),Dist(Times(b,c,x,Power(Times(C2,e,Plus(p,C1),Sqrt(Times(CN1,Sqr(c),Sqr(x)))),CN1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Times(x,Sqrt(Subtract(CN1,Times(Sqr(c),Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,p),x),NeQ(p,CN1))));
  }
}
}