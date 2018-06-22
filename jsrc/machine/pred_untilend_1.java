// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_untilend_1 extends Code
{ static Code entry_code ;
static Code cl1 = new pred_untilend_1_1() ;
static Code cl2 = new pred_untilend_1_2() ;
static Code cut2cont ;
static Code get02cont ;
static String string0 = "cut".intern() ;
static String string1 = "cut".intern() ;
static String string2 = "get0".intern() ;
static String string3 = "untilend".intern() ;
static Int posint1 = new Int(1) ;
static Int posint10 = new Int(10) ;

void init(PrologMachine mach)
{ entry_code = this ;
get02cont = mach.LoadPred("get0",1) ;
}
int Arity() { return 1 ; }
Code Exec(PrologMachine mach)
{ PrologObject aregs[] = {mach.Areg[0],mach.Areg[1]} ;
mach.CreateChoicePoint(aregs) ;
return cl1.Exec(mach) ;
}
}

class pred_untilend_1_1 extends pred_untilend_1
{
Code Exec(PrologMachine mach)
{ mach.FillAlternative(cl2) ;
PrologObject local_aregs[] = mach.Areg ;
PrologObject continuation = local_aregs[1] ;
PrologObject areg0 = local_aregs[0].Deref() ;
if (!( (areg0).Unify(posint10))) return UpperPrologMachine.Fail0 ;
mach.DoCut(mach.CUTB)  ;
local_aregs[0] = continuation ;
mach.CUTB = mach.CurrentChoice ;
return UpperPrologMachine.Call1 ;
}
}

class pred_untilend_1_2 extends pred_untilend_1
{
Code Exec(PrologMachine mach)
{ mach.RemoveChoice() ;
PrologObject local_aregs[] = mach.Areg ;
PrologObject continuation = local_aregs[1] ;
PrologObject areg0 = local_aregs[0].Deref() ;
PrologObject var2 = new Var(mach) ;
PrologObject var1 = new Var(mach) ;
if (!( (areg0).Unify(var1))) return UpperPrologMachine.Fail0 ;
local_aregs[0] = var2 ;
local_aregs[1] = new Funct(string3,var2.Deref(),continuation) ;
mach.CUTB = mach.CurrentChoice ;
return get02cont ;
}
}

