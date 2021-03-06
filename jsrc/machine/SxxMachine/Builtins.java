package SxxMachine;
// some builtins written in Java for Prolog

import java.io.IOException;
import java.io.InputStream;

// Bart Demoen, Paul Tarau Aug 1996 Moncton
// there is a mapping from special names (like <) to tokens
// with only letters - the compiler must be aware of that mapping

// smallerthan implements </2
public class Builtins {

	abstract static public class Borked extends Code {

		public Operation Exec(Prolog mach) {
			return Borked.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			return null;
		}

	}

	public static class pred_unify_3 extends Borked {
	}

	public static class pred_$003D$002E$002E_2 extends Borked {
	}

	public static class pred_length_2 extends Borked {
	}

	public static class pred_unify_6 extends Borked {
	}

	public static class pred_$002D$002D$003E_2 extends Borked {
	}

	public static class pred_isglobal_2 extends Borked {
	}

	public static class pred_$003C$003D_2 extends Borked {
	}

	public static class pred_$003D$003C_2 extends Borked {
	}

	public static class pred_get_performance_stats_2 extends Borked {
	}

	public static class pred_between_3 extends Borked {
	}

	public static class pred_$003D$005C$003D_2 extends Borked {
	}

	public static class pred_style_check_1 extends Borked {
	}

	public static class pred_module_colon_2 extends Borked {
	}

	public static class pred_nb_setval_2 extends Borked {
	}

	public static class pred_name_2 extends Borked {
	}

	public static class pred_number_1 extends Borked {
	}

	public static class pred_recorded_3 extends Borked {
	}

	public static class pred_filter_vars_4 extends Borked {
	}

	public static class pred_intersectv_list_3 extends Borked {
	}

	public static class pred_nonvar_1 extends Borked {

	}

	public static class pred_varbag_3 extends Borked {

	}

	public static class pred_filter_dups_3 extends Borked {

	}

	public static class pred_setup_call_cleanup_3 extends Borked {
	}

	public static class pred_fail_0 extends Code {
		public Operation Exec(Prolog mach) {
			return pred_fail_0.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			return Prolog.Fail0;
		}
	}

	public static class pred_true_0 extends Code {
		public Operation Exec(Prolog mach) {
			return pred_true_0.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			return Prolog.True0;
		}
	}

	static class pred_smallerthan_2 extends Code {
		protected int Arity() {
			return 2;
		}

		public Operation Exec(Prolog mach) {
			return pred_smallerthan_2.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			double i1, i2;
			Term dereffed;

			dereffed = (mach.Areg[0]).Deref();
			i1 = dereffed.DoubleValue();
			dereffed = (mach.Areg[1]).Deref();
			i2 = dereffed.DoubleValue();
			if (i1 < i2) {
				mach.Areg[0] = mach.Areg[2];
				mach.Areg[1] = mach.Areg[2] = null;
				return Prolog.Call1;
			}
			return Prolog.Fail0;
		}
	}

	// smallerorequal implements =</2

	static class pred_smallerorequal_2 extends Code {
		protected int Arity() {
			return 2;
		}

		public Operation Exec(Prolog mach) {
			return pred_smallerorequal_2.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			double i1, i2;
			Term dereffed;

			dereffed = (mach.Areg[0]).Deref();
			i1 = dereffed.DoubleValue();
			dereffed = (mach.Areg[1]).Deref();
			i2 = dereffed.DoubleValue();
			if (i1 <= i2) {
				mach.Areg[0] = mach.Areg[2];
				mach.Areg[1] = mach.Areg[2] = null;
				return Prolog.Call1;
			}
			return Prolog.Fail0;
		}
	}

	// arithequal implements =:=/2

	static class pred_arithequal_2 extends Code {
		protected int Arity() {
			return 2;
		}

		public Operation Exec(Prolog mach) {
			return pred_arithequal_2.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			double i1, i2;
			Term dereffed;

			dereffed = (mach.Areg[0]).Deref();
			i1 = dereffed.DoubleValue();
			dereffed = (mach.Areg[1]).Deref();
			i2 = dereffed.DoubleValue();
			if (i1 == i2) {
				mach.Areg[0] = mach.Areg[2];
				mach.Areg[1] = mach.Areg[2] = null;
				return Prolog.Call1;
			}
			return Prolog.Fail0;
		}
	}

	// arithdifferent implements =\= /2

	static class pred_arithdifferent_2 extends Code {
		protected int Arity() {
			return 2;
		}

		public Operation Exec(Prolog mach) {
			return pred_arithdifferent_2.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			double i1, i2;
			Term dereffed;

			dereffed = (mach.Areg[0]).Deref();
			i1 = dereffed.DoubleValue();
			dereffed = (mach.Areg[1]).Deref();
			i2 = dereffed.DoubleValue();
			if (i1 != i2) {
				mach.Areg[0] = mach.Areg[2];
				mach.Areg[1] = mach.Areg[2] = null;
				return Prolog.Call1;
			}
			return Prolog.Fail0;
		}
	}

	// is implements is/2

	static class pred_is_2 extends Code {
		protected int Arity() {
			return 2;
		}

		public Operation Exec(Prolog mach) {
			return pred_is_2.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			double i1;
			Term dereffed;

			dereffed = (mach.Areg[1]).Deref();
			i1 = dereffed.DoubleValue();
			dereffed = (mach.Areg[0]).Deref();
			if (!(dereffed.Unify(Data.Number(i1), mach)))
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[2];
			mach.Areg[1] = mach.Areg[2] = null;
			return Prolog.Call1;
		}
	}

	// unify implements =/2

	static class pred_unify_2 extends Code {
		protected int Arity() {
			return 2;
		}

		public Operation Exec(Prolog mach) {
			return pred_unify_2.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			Term arg1 = mach.Areg[0].Deref();
			Term arg2 = mach.Areg[1].Deref();

			if (!(arg1.Unify(arg2, mach)))
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[2];
			mach.Areg[1] = mach.Areg[2] = null;
			return Prolog.Call1;
		}
	}

	// univ implements the left direction of =../2

	static class pred_univ_3 extends Code {
		protected int Arity() {
			return 3;
		}

		// Areg[0] is a free variable
		// Areg[1] is a Const
		// Areg[2] is a list of PrologObjects

		public Operation Exec(Prolog mach) {
			return pred_univ_3.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			Term arg1 = mach.Areg[0].Deref();
			Term arg2 = mach.Areg[1].Deref();
			Term arg3 = mach.Areg[2].Deref();
			Term tail = arg3;

			int l = 0;
			while (tail.IsList()) {
				tail = tail.Arg(1).Deref();
				l++;
			}
			if (l == 0)
				return Prolog.Fail0;
			if (!(tail.IsNil()))
				return Prolog.Fail0;
			if (!(arg2.isConst()))
				return Prolog.Fail0;
			Term args[] = new Term[l];
			tail = arg3;
			int i;
			for (i = 0; i < l; i++) {
				args[i] = (tail).Arg(0);
				tail = tail.Arg(1).Deref();
			}

			if (!(arg1.Unify(new Fun(((Const) arg2).GetName(), args), mach)))
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[3];
			mach.Areg[1] = mach.Areg[2] = mach.Areg[3] = null;
			return Prolog.Call1;
		}
	}

	static class pred_write_1 extends Code {
		public static final Code entry_code = new pred_write_1();

		protected int Arity() {
			return 1;
		}

		public Operation Exec(Prolog mach) {
			return pred_write_1.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			try {
				mach.Areg[0].Deref().formattedOutput(0, System.out);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.flush();
			mach.Areg[0] = mach.Areg[1];
			mach.Areg[1] = null;
			return Prolog.Call1;
		}
	}

	static class pred_nl_0 extends Code {
		protected int Arity() {
			return 0;
		}

		public Operation Exec(Prolog mach) {
			return pred_nl_0.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			System.out.println("");
			return Prolog.Call1;
		}
	}

	static class pred_functor_3 extends Code {
		protected int Arity() {
			return 3;
		}

		static boolean DoFunctor3(Prolog mach, Term arg1, Term arg2, Term arg3) {
			arg1 = arg1.Deref();
			arg2 = arg2.Deref();
			arg3 = arg3.Deref();

			if (arg1.isVar()) {
				if ((!(arg2.isConst())) || (!(arg3.isInt())))
					return false;
				int i = (int) (((Real) arg3).Num);
				String Name = arg2.GetName();
				Term args[] = new Term[i];
				while (i-- > 0) {
					args[i] = new Var(mach);
				}
				if (!(arg1.Unify(new Fun(Name, args), mach)))
					return false;
			} else {
				String Name = arg1.GetName();
				int arity = arg1.Arity();
				if (!(arg2.Unify(Data.Intern(Name), mach)))
					return false;
				if (!(arg3.Unify(Data.Number(arity), mach)))
					return false;
			}
			return true;
		}

		public Operation Exec(Prolog mach) {
			return pred_functor_3.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			if (!pred_functor_3.DoFunctor3(mach, mach.Areg[0], mach.Areg[1], mach.Areg[2]))
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[3]; // install the continuation
			mach.Areg[1] = mach.Areg[2] = mach.Areg[3] = null;
			return Prolog.Call1;
		}
	}

	static class pred_arg_3 extends Code {
		protected int Arity() {
			return 3;
		}

		static boolean DoArg3(Prolog mach, Term arg1, Term arg2, Term arg3) {
			arg1 = arg1.Deref();
			arg2 = arg2.Deref();
			arg3 = arg3.Deref();

			if (!(arg1.isInt()))
				return false;
			if (!(arg2.isStruct()))
				return false;
			int i = (int) (((Real) arg1).Num);
			if (i < 1)
				return false;
			int l = ( arg2).Arity();
			if (i > l)
				return false;
			Term x = ( arg2).Arg(i - 1);
			x = x.Deref();
			return (arg3.Unify(x, mach));
		}

		public Operation Exec(Prolog mach) {
			return pred_arg_3.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			if (!pred_arg_3.DoArg3(mach, mach.Areg[0], mach.Areg[1], mach.Areg[2]))
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[3]; // install the continuation
			mach.Areg[1] = mach.Areg[2] = mach.Areg[3] = null;
			return Prolog.Call1;
		}
	}

	static class pred_nexttoken_1 extends Code {
		protected int Arity() {
			return 1;
		}

		public Operation Exec(Prolog mach) {
			return pred_nexttoken_1.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			Term arg1 = mach.Areg[0].Deref();
			if (!(arg1.isVar()))
				return Prolog.Fail0;
			Term t = mach.nexttoken();
			if (!(arg1.Unify(t.Deref(), mach)))
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[1]; // install the continuation
			mach.Areg[1] = null;
			return Prolog.Call1;
		}
	}

	static class pred_cputime_1 extends Code {
		protected int Arity() {
			return 1;
		}

		public Operation Exec(Prolog mach) {
			return pred_cputime_1.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			Term arg1 = mach.Areg[0].Deref();
			double t = java.lang.System.currentTimeMillis();
			Term o = Data.Number(t);
			if (!(arg1.Unify(o, mach)))
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[1]; // install the continuation
			mach.Areg[1] = null;
			return Prolog.Call1;
		}
	}

	static class findall_list extends PrologObject {
		Var uptonowbegin, uptonowend;
		long time;

		findall_list(Prolog mach) {
			this.uptonowbegin = this.uptonowend = new Var(mach);
			this.time = mach.TimeStamp;
		}

		public Term Deref() {
			return this;
		}

		public boolean Unify(Term that, Prolog mach) {
			return that.Bind(this, mach);
		}

		public String toString() {
			return ("findall = " + (this.uptonowbegin.Deref()).toString() + " - " + (this.uptonowend.Deref()).toString());
		}

	}

	static class pred_initfindall_1 extends Code {
		public static Code entry_code = new pred_initfindall_1();

		protected int Arity() {
			return 1;
		}

		public Operation Exec(Prolog mach) {
			return pred_initfindall_1.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			Term arg1 = mach.Areg[0].Deref();
			if (!(arg1.Unify(new findall_list(mach), mach)))
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[1]; // install the continuation
			mach.Areg[1] = null;
			return Prolog.Call1;
		}
	}

	static class pred_addfindall_2 extends Code {
		protected int Arity() {
			return 2;
		}

		public Operation Exec(Prolog mach) {
			return pred_addfindall_2.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			Term arg1 = mach.Areg[0].Deref();
			findall_list arg2 = (findall_list) (mach.Areg[1].Deref());
			int oldtrail = mach.TrailTop;
			Term copy = arg1.Copy(mach, arg2.time);
			int newtrail = mach.TrailTop;
			while (newtrail-- > oldtrail) {
				mach.TrailStack[newtrail].UnTrailSelf();
				mach.TrailStack[newtrail] = null;
			}
			mach.TrailTop = oldtrail;
			Var NewTail = new Var(mach);
			(arg2.uptonowend).Refers = new Fun(".", copy, NewTail);
			arg2.uptonowend = NewTail;
			// mach.Areg[0] = mach.Areg[2] ; // install the continuation
			// mach.Areg[1] = mach.Areg[2] = null ;
			return Prolog.Fail0;
		}
	}

	static class pred_retrievefindall_2 extends Code {
		public static Code entry_code = new pred_retrievefindall_2();

		protected int Arity() {
			return 2;
		}

		public Operation Exec(Prolog mach) {
			return pred_retrievefindall_2.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			Term arg1 = mach.Areg[0].Deref();
			findall_list arg2 = (findall_list) (mach.Areg[1].Deref());
			(arg2.uptonowend).Refers = Const.Nil;
			if (!(arg1.Unify((arg2.uptonowbegin).Deref(), mach)))
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[2]; // install the continuation
			mach.Areg[1] = mach.Areg[2] = null;
			return Prolog.Call1;
		}
	}

	static class pred_var_equal_2 extends Code {
		protected int Arity() {
			return 2;
		}

		public Operation Exec(Prolog mach) {
			return pred_var_equal_2.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			Term arg1 = mach.Areg[0].Deref();
			Term arg2 = mach.Areg[1].Deref();
			if (arg1 != arg2)
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[2]; // install the continuation
			mach.Areg[1] = mach.Areg[2] = null;
			return Prolog.Call1;
		}
	}

	static class pred_trail_1 extends Code {
		protected int Arity() {
			return 1;
		}

		public Operation Exec(Prolog mach) {
			return pred_trail_1.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			Term arg1 = mach.Areg[0].Deref();
			if (!(arg1.Unify(Data.Number((mach.TrailTop)), mach)))
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[1]; // install the continuation
			mach.Areg[1] = null;
			return Prolog.Call1;
		}
	}

	static class pred_choice_1 extends Code {
		protected int Arity() {
			return 1;
		}

		public Operation Exec(Prolog mach) {
			return pred_choice_1.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			Term arg1 = mach.Areg[0].Deref();
			if (!(arg1.Unify(Data.Number((mach.CurrentChoice)), mach)))
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[1]; // install the continuation
			mach.Areg[1] = null;
			return Prolog.Call1;
		}
	}

	static class pred_type_of_2 extends Code {
		protected int Arity() {
			return 2;
		}

		public Operation Exec(Prolog mach) {
			return pred_type_of_2.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			Term arg1 = mach.Areg[0].Deref();
			Term arg2 = mach.Areg[1].Deref();
			String s;
			if (arg1.isVar())
				s = "var";
			else if (arg1.isFVar())
				s = "var";
			else if (arg1.isInt())
				s = "integer";
			else if (arg1.isConst())
				s = "atom";
			else if (arg1.isStruct())
				s = "struct";
			else
				s = "unknown";

			if (!(arg2.Unify(Data.Intern(s), mach)))
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[2]; // install the continuation
			mach.Areg[1] = mach.Areg[2] = null;
			return Prolog.Call1;
		}
	}

	static class pred_assume_1 extends Code {
		protected int Arity() {
			return 1;
		}

		public Operation Exec(Prolog mach) {
			return pred_assume_1.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			Term arg1 = mach.Areg[0].Deref();
			Term ass = (mach.assumptions).Deref();
			mach.TrailEntry(new PopAssumptions(mach, ass));
			mach.assumptions = new Fun(".", arg1, ass);
			mach.Areg[0] = mach.Areg[1]; // install the continuation
			mach.Areg[1] = null;
			return Prolog.Call1;
		}
	}

	static class pred_allassumed_1 extends Code {
		protected int Arity() {
			return 1;
		}

		public Operation Exec(Prolog mach) {
			return pred_allassumed_1.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			Term arg1 = mach.Areg[0].Deref();
			Term ass = (mach.assumptions).Deref();
			if (!(arg1.Unify(ass, mach)))
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[1]; // install the continuation
			mach.Areg[1] = null;
			return Prolog.Call1;
		}
	}

	static class pred_get0_1 extends Code {
		public static final Code entry_code = new pred_get0_1();

		protected int Arity() {
			return 1;
		}

		public Operation Exec(Prolog mach) {
			return pred_get0_1.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			Term arg1 = mach.Areg[0].Deref();
			int i;
			try {
				i = pred_get0_1.readOneChar(mach.currentinput);
			} catch (Exception e) {
				return Prolog.Fail0;
			}
			if (!(arg1.Unify(Data.Number(i), mach)))
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[1]; // install the continuation
			mach.Areg[1] = null;
			return Prolog.Call1;
		}

		private static int readOneChar(InputStream currentinput) throws IOException {
			int i;
			if (currentinput.available() == 1) {
				i = currentinput.read();
				if (i != 10) {
					return i;
				}
			}
			i = currentinput.read();
			return i;
		}
	}

	static class pred_halt_0 extends Code {
		protected int Arity() {
			return 0;
		}

		public Operation Exec(Prolog mach) {
			return pred_halt_0.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			mach.ExceptionRaised = 2;
			return null;
		}
	}

	static class pred_setarg_3 extends Code {
		protected int Arity() {
			return 3;
		}

		static boolean DoSetArg3(Prolog mach, Term arg1, Term arg2, Term arg3) {
			arg1 = arg1.Deref();
			arg2 = arg2.Deref();
			arg3 = arg3.Deref();

			if (!(arg1.isInt()))
				return false;
			if (!(arg2.isStruct()))
				return false;
			int i = (int) (((Real) arg1).Num);
			if (i < 1)
				return false;
			int l = ( arg2).Arity();
			if (i > l)
				return false;
			Term x = arg2.Arg(i - 1);
			Var v = new Var(mach);
			v.Refers = arg3;
			arg2.SetArg(null, i - 1, v);
			mach.TrailEntry(new SetArgTrail(x, v, mach));
			return true;
		}

		public Operation Exec(Prolog mach) {
			return pred_setarg_3.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			if (!pred_setarg_3.DoSetArg3(mach, mach.Areg[0], mach.Areg[1], mach.Areg[2]))
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[3]; // install the continuation
			mach.Areg[1] = mach.Areg[2] = mach.Areg[3] = null;
			return Prolog.Call1;
		}
	}

	static class pred_compare_3 extends Code {
		static pred_compare_3 entry_code = new pred_compare_3();

		protected int Arity() {
			return 3;
		}

		// Real < Const < Fun < Var

		static int Compare(Term t, Term s) {
			if (t == s)
				return 0;
			int ta = t.Arity();
			int sa = s.Arity();
			if (ta < sa)
				return -1;
			if (ta > sa)
				return 1;
			if (ta == Data.REAL) {
				double i1 = t.DoubleValue();
				double i2 = s.DoubleValue();
				if (i1 < i2)
					return -1;
				if (i1 == i2)
					return 0;
				return 1;
			}
			if (ta == Data.CONST) {
				String s1 = t.GetName();
				String s2 = s.GetName();
				return s1.compareTo(s2);
			}
			if (ta == Data.VAR) {
				return Integer.compare(t.hashCode(), s.hashCode());
			}

			String s1 = t.GetName();
			String s2 = s.GetName();
			int v = s1.compareTo(s2);
			if (v != 0)
				return v;
			;
			for (int i = 0; i < ta; i++) {
				v = pred_compare_3.Compare(t.Arg(i).Deref(), s.Arg(i).Deref());
				if (v != 0)
					return v;
			}
			return 0;
		}

		public Operation Exec(Prolog mach) {
			return pred_compare_3.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			Term arg1 = mach.Areg[0].Deref();
			Term arg2 = mach.Areg[1].Deref();
			Term arg3 = mach.Areg[2].Deref();
			int val = pred_compare_3.Compare(arg2, arg3);
			String s;
			if (val < 0)
				s = "<";
			else if (val == 0)
				s = "=";
			else
				s = ">";

			if (!(arg1.Unify(Data.Intern(s), mach)))
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[3]; // install the continuation
			mach.Areg[1] = mach.Areg[2] = mach.Areg[3] = null;
			return Prolog.Call1;
		}
	}

	static class pred_freeze_internal_2 extends Code {
		protected int Arity() {
			return 2;
		}

		public Operation Exec(Prolog mach) {
			return pred_freeze_internal_2.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			Term arg1 = mach.Areg[0].Deref();
			Term arg2 = mach.Areg[1].Deref();

			Var frv = new Var(mach);
			frv.setGoals(mach, arg2);
			if (!(arg1.Unify(frv, mach)))
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[2]; // install the continuation
			mach.Areg[1] = mach.Areg[2] = null;
			return Prolog.Call1;
		}
	}

	static class pred_execcontinuation_0 extends Code {
		public static Code entry_code = new pred_execcontinuation_0();

		protected int Arity() {
			return 0;
		}

		public Operation Exec(Prolog mach) {
			return pred_execcontinuation_0.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			Term arg1 = mach.Areg[0].Deref();

			if (!(arg1 instanceof Continuation))
				return Prolog.Fail0;
			Continuation c = (Continuation) arg1;
			Operation code = c.code;
			int i = Prolog.GetArity(code) + 1;
			while (i-- > 0) {
				mach.Areg[i] = c.Args[i];
			}
			return code;
		}
	}

	static class pred_frozen_2 extends Code {
		protected int Arity() {
			return 2;
		}

		public Operation Exec(Prolog mach) {
			return pred_frozen_2.exec_static(mach);
		}

		public static Operation exec_static(Prolog mach) {
			Term arg1 = mach.Areg[0].Deref();
			Term arg2 = mach.Areg[1].Deref();
			Term goal;

			if (!arg1.isFrozen()) {
				if (arg1.isVar()) {
					goal = Data.Intern("true");
				}
				return Prolog.Fail0;
			} else {
				goal = arg1.frozenGoals().Deref();
			}

			if (!(arg2.Unify(goal, mach)))
				return Prolog.Fail0;
			mach.Areg[0] = mach.Areg[2]; // install the continuation
			mach.Areg[1] = mach.Areg[2] = null;
			return Prolog.Call1;
		}
	}

}
