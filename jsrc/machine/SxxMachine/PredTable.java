package SxxMachine;

import java.util.Hashtable;

//there is a choice between 3 predicate table implementations
//we leave them all here, until we decide which is best

//class PredTable extends java.util.Hashtable {
//PredTable() {
//new Hashtable();
//}
//void InsertNameArity(String N, int A, Code Adr) {
//put(A+N,Adr);
//}
//Code IsInPredTable(String N, int A) {
//return (Code)get(A+N);
//}
//}

//class PredTable extends Vector
//{
//PredTable() { new Vector(); }
//
//void InsertNameArity(String N, int A, Code Adr)
//{ //System.err.println("!!!SIZE="+size()+"ADD"+N+"/"+A);
//if (size() <= A) setSize(A+1);
//Hashtable T = (Hashtable)elementAt(A);
//if (T == null)
//{ T = new Hashtable();
//setElementAt(T,A);
//}
//T.put(N,Adr);
//}
//
//Code IsInPredTable(String N, int A)
//{ //System.err.println("!!!FIND"+N+"/"+A);
//if(A>=size()) return null;
//return (Code)((Hashtable)elementAt(A)).get(N);
//}
//}
public class PredTable {
	Hashtable<String, Code> tables[];

	@SuppressWarnings("unchecked")
	PredTable() {
		tables = new Hashtable[33];
	}

	void InsertNameArity(String N, int A, Code Adr) {
		Hashtable<String, Code> T = tables[A];
		if (T == null) {
			tables[A] = T = new Hashtable<String, Code>();
		}
		T.put(N, Adr);
	}

	Code IsInPredTable(String N, int A) {
		if (tables[A] == null)
			return null;
		return (Code) (tables[A].get(N));
	}

	// Java ONLY
	Code LoadPred(Prolog thiz, String Name, int arity) // arity is
														// source
														// arity before
														// bin
														// in predtable + 1 !
	{
		Code code;
		
		code = Prolog.Predicates.IsInPredTable(Name, arity + 1);
		if (code != null)
			return code;
		code = Instanciate(Name, arity);
		Prolog.Predicates.InsertNameArity(Name, arity + 1, code);
		code.Init(thiz);
		return code;
	}

	private Code Instanciate(String Name, int arity) {
		Class<?> loaded_class;
		int reason = 0;
		Code code = null;
		try {
			Package p = PredTable.class.getPackage();
			String pp = "";
			if (p != null) {
				pp = p.getName() + ".";
			}
			String s1 = pp + "pred_" + Name + "_" + arity;
			// String s2 = s1 + ".class" ;
			// System.out.println("Trying to load " + s2) ;
			loaded_class = forName(s1);
			// System.out.println("Loaded " + s2) ;
			code = (Code) (loaded_class.newInstance());
			// System.out.println("and created "+s2) ;
		} catch (ClassNotFoundException e) {
			reason = 1;
		} catch (IllegalAccessException e) {
			reason = 2;
		} catch (InstantiationException e) {
			reason = 3;
		}

		if (reason > 0) {
			System.out.println("Predicate " + Name + "/" + arity + " not found; does its .class file exist ?");
			return Prolog.Fail0;
		}
		return code;
	}

	private Class<?> forName(String s1) throws ClassNotFoundException {

		if(s1.contains("animal")) {
			return pred_animal_1.class;
		}

		try {
			return java.lang.Class.forName(s1);
		} catch (ClassNotFoundException e) {

			try {
				String s0 = "SxxMachine." + s1;
				return java.lang.Class.forName(s0);
			} catch (ClassNotFoundException _e1) {
				try {
					String s0 = "$" + s1;
					return java.lang.Class.forName(s0);
				} catch (ClassNotFoundException _e2) {
					try {
						String s0 = "$" + s1;
						return java.lang.Class.forName(s0);
					} catch (ClassNotFoundException _e3) {
						try {
							String s0 = "$" + s1;
							return java.lang.Class.forName(s0);
						} catch (ClassNotFoundException _e4) {
							throw e;
						}
					}
				}
			}
		}
	}

	/**
	 * Returns a string representation of class for
	 * the predicate with the given arguments.
	 * @param pkg package name
	 * @param functor predicate name
	 * @param arity predicate arity
	 * @return a string representation of class for
	 * the predicate that corresponds to <code>pkg:functor/arity</code>.
	 */
	public static String encode(String pkg, String functor, int arity) {
		char[] x = functor.toCharArray();
		StringBuilder sb = new StringBuilder(pkg.length() + x.length * 5 + 10);
		sb.append(pkg);
		sb.append(".PRED_");
		int i = 0;
		int s = i;
		while (i < x.length) {
			if (!((x[i] >= 'a' && x[i] <= 'z') || (x[i] >= 'A' && x[i] <= 'Z') || (x[i] >= '0' && x[i] <= '9')
					|| x[i] == '_' || x[i] == '$')) {

				sb.append(x, s, i - s);
				sb.append('$').append(Integer.toHexString(x[i]).substring(4, 8));
				s = i + 1;
			}
			i++;
		}
		if (s < x.length) {
			sb.append(x, s, x.length - s);
		}
		sb.append('_').append(arity);
		return sb.toString();
	}

	public static String decodeFunctor(String className) {
		int length = className.length();
		// Remove the Java package name, if present.
		int start = className.lastIndexOf('.');
		start++;
		// Trim the common PRED_ prefix.
		if (className.regionMatches(start, "pred_", 0, 5)) {
			start += 5;
		}
		// Drop the arity from the end.
		int finish = className.lastIndexOf('_');
		if (finish < 0) {
			finish = length;
		}

		// replace $XXXX with character with code XXXX
		StringBuilder sb = new StringBuilder(length);
		int index = start;
		int middle = index;
		while (index < finish) {
			index = className.indexOf('$', index);

			if (index < 0) {
				index = finish;
			} else if (index + 4 < finish) {
				try {
					int c = Integer.parseInt(className.substring(index + 1, index + 5), 16);
					sb.append(className.substring(middle, index));
					switch (c) {
					case '\\':
						sb.append("\\\\");
						break;
					case '$':
						sb.append("\\$");
					default:
						sb.append((char) c);
						break;
					}
					index = middle = index + 5;
				} catch (NumberFormatException e) {
					index++;
				}
			} else {
				index++;
			}
		}
		if (middle < finish) {
			sb.append(className.substring(middle, finish));
		}
		return sb.toString();
	}

}