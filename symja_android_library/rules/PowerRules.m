{
 E^(3/2*I*Pi)=-I, 
 E^(Pi*c_Complex):=Module({r=Re(c),j=Im(c)},If(EvenQ(j),1,-1) /; r==0 && IntegerQ(j)),
 E^(x_+Pi*c_Complex):=Module({r=Re(c),j=Im(c)},If(EvenQ(j),E^x,-E^x) /; r==0 && IntegerQ(j)),
 E^(I*Infinity)=Indeterminate,
 E^(-I*Infinity)=Indeterminate,
 E^(ComplexInfinity)=Indeterminate,
 E^Log(x_):=x,
 E^(a_*Log(x_)):=x^a /; FreeQ(a,x),
 Tan(x_)^m_?(IntegerQ(#)&&#<0 &):=Cot(x)^(-m),
 Cot(x_)^m_?(IntegerQ(#)&&#<0 &):=Tan(x)^(-m),
 Sec(x_)^m_?(IntegerQ(#)&&#<0 &):=Cos(x)^(-m),
 Cos(x_)^m_?(IntegerQ(#)&&#<0 &):=Sec(x)^(-m),
 Csc(x_)^m_?(IntegerQ(#)&&#<0 &):=Sin(x)^(-m),
 Sin(x_)^m_?(IntegerQ(#)&&#<0 &):=Csc(x)^(-m)
}