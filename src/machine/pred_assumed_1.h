#ifndef PRED_ASSUMED_1
#define PRED_ASSUMED_1

#include "Prolog.h"
#include <string>
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
class Code;
class PrologMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

class pred_assumed_1 : public Code {
public:
	static Code* entry_code;
static Code* cl1;
static Code* allassumed2cont;
static std::string string0;
static std::string string1;
static std::string string2;
static std::string string3;

void init(PrologMachine* mach) override;
int Arity() override;
Code* Exec(PrologMachine* mach) override;
};

class pred_assumed_1_1 : public pred_assumed_1 {
public:
Code* Exec(PrologMachine* mach) override;
};



#endif	//#ifndef PRED_ASSUMED_1