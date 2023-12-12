package sport.centre.management.interfaces;

import detecteer.NullGeneralityException;

public interface Generality {
	String getName() throws NullGeneralityException;
	String getSurname() throws NullGeneralityException;
	int getId() throws NullGeneralityException;
}
