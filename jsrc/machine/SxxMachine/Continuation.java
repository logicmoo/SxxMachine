package SxxMachine;

import java.io.IOException;

final class Continuation extends PrologObject {
	Operation code;
	Term Args[];

	Continuation(Term args[], Code c) {
		int i = c.Arity() + 1;
		this.Args = new Term[i];
		while (i-- > 0)
			this.Args[i] = args[i];
		this.code = c;
	}

	public Continuation(Term[] args, int getArity, Operation c) {
		int i = getArity + 1;
		this.Args = new Term[i];
		while (i-- > 0)
			this.Args[i] = args[i];
		this.code = c;
	}

	public Term Deref() {
		return this;
	}

	public boolean Unify(Term that, Prolog mach) {
		return that.Bind(this, mach);
	}

	public void formattedOutput(int formatFlags, Appendable buffer) throws IOException {
		System.out.println("general output of continuations not available");
		buffer.append(this.GetName());
		int i = this.Args.length;
		int current = 0;
		while (i-- > 0) {
			this.formattedArgOutput(this.Args[current++], formatFlags, buffer);
		}

	}

	private void formattedArgOutput(Term term, int formatFlags, Appendable buffer) throws IOException {
		if (term != null)
			term.formattedOutput(formatFlags, buffer);

	}

	@Override
	public int Arity() {
		return Data.OBJ;
	}

}