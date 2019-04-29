package circus.robocalc.robochart.impl;

import circus.robocalc.robochart.Variable;
import circus.robocalc.robochart.VariableList;
import circus.robocalc.robochart.VariableModifier;

public class ParameterImplCustom extends ParameterImpl {
	@Override
	public boolean equals(Object o) {
		if (o == null) return false;
		else if (!(o instanceof Variable)) return false;
		else if (this.getName() == null) return false;
		else {
			if (!this.getName().equals(((Variable)o).getName())) return false;
		}
		// still need to compare types
		return true;
		//return super.equals(o);
	}
	
	@Override
	public VariableModifier getModifier() {
		if (this.eContainer instanceof VariableList)
			return ((VariableList)this.eContainer).getModifier();
		else return VariableModifier.VAR;
	}
}
