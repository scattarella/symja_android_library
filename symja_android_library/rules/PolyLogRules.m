{
PolyLog(2,-1)=(-1/12)*Pi^2,
PolyLog(2,1)=(1/6)*Pi^2,
PolyLog(2,1/2)=(1/12)*Pi^2-(1/2)*Log(2)^2,
PolyLog(2,2)=Pi^2/4-Pi*I*Log(2),
PolyLog(2,I)=I*Catalan-Pi^2/48,
PolyLog(2,-I)=(-I)*Catalan-Pi^2/48,
PolyLog(2,1-I)=Pi^2/16-I*Catalan-I*Pi*(Log(2)/4),
PolyLog(2,1+I)=Pi^2/16+I*Catalan+I*Pi*(Log(2)/4),

PolyLog(Undefined, y_):=Undefined,
PolyLog(x_, Undefined):=Undefined
}