package help.jpa;

import javax.persistence.metamodel.Type;
@SuppressWarnings("rawtypes")
public class QuickIdType implements Type{

	@Override
	public PersistenceType getPersistenceType() {
		return PersistenceType.BASIC;
	}

	@Override
	public Class getJavaType() {
		return String.class;
	}

}
