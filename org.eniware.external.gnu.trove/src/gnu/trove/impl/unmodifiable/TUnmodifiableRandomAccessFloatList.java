///////////////////////////////////////////////////////////////////////////////
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
///////////////////////////////////////////////////////////////////////////////

/*
 * ==================================================================
 *  Eniware Open Source:Nikolai Manchev
 *  Apache License 2.0
 * ==================================================================
 */

package gnu.trove.impl.unmodifiable;


//////////////////////////////////////////////////
// THIS IS A GENERATED CLASS. DO NOT HAND EDIT! //
//////////////////////////////////////////////////

////////////////////////////////////////////////////////////
// THIS IS AN IMPLEMENTATION CLASS. DO NOT USE DIRECTLY!  //
// Access to these methods should be through TCollections //
////////////////////////////////////////////////////////////


import gnu.trove.iterator.*;
import gnu.trove.procedure.*;
import gnu.trove.set.*;
import gnu.trove.list.*;
import gnu.trove.function.*;
import gnu.trove.map.*;
import gnu.trove.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Random;
import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.IOException;


public class TUnmodifiableRandomAccessFloatList extends TUnmodifiableFloatList
	implements RandomAccess {

	private static final long serialVersionUID = -2542308836966382001L;

	public TUnmodifiableRandomAccessFloatList( TFloatList list ) {
		super( list );
	}

	public TFloatList subList( int fromIndex, int toIndex ) {
		return new TUnmodifiableRandomAccessFloatList( list.subList( fromIndex, toIndex ) );
	}

	/**
	 * Allows instances to be deserialized in pre-1.4 JREs (which do
	 * not have UnmodifiableRandomAccessList).  UnmodifiableList has
	 * a readResolve method that inverts this transformation upon
	 * deserialization.
	 */
	private Object writeReplace() {
		return new TUnmodifiableFloatList( list );
	}
}