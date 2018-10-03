///////////////////////////////////////////////////////////////////////////////
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
///////////////////////////////////////////////////////////////////////////////

package gnu.trove.decorator;

import gnu.trove.list.TShortList;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.AbstractList;
import java.util.List;


//////////////////////////////////////////////////
// THIS IS A GENERATED CLASS. DO NOT HAND EDIT! //
//////////////////////////////////////////////////



/* ==================================================================
 *  Eniware Open Source:Nikolai Manchev
 *  Apache License 2.0
 * ==================================================================
 */


public class TShortListDecorator extends AbstractList<Short>
	implements List<Short>, Externalizable, Cloneable {

	static final long serialVersionUID = 1L;

    /** the wrapped primitive list */
    protected TShortList list;


    /**
     * FOR EXTERNALIZATION ONLY!!
     */
    public TShortListDecorator() {}


    /**
     * Creates a wrapper that decorates the specified primitive map.
     *
     * @param list the <tt>TShortList</tt> to wrap.
     */
    public TShortListDecorator( TShortList list ) {
        super();
        this.list = list;
    }


    /**
     * Returns a reference to the list wrapped by this decorator.
     *
     * @return the wrapped <tt>TShortList</tt> instance.
     */
    public TShortList getList() {
        return list;
    }


	@Override
	public int size() {
		return list.size();
	}


	@Override
	public Short get( int index ) {
		short value = list.get( index );
		if ( value == list.getNoEntryValue() ) return null;
		else return Short.valueOf( value );
	}


	@Override
	public Short set( int index, Short value ) {
		short previous_value = list.set( index, value );
		if ( previous_value == list.getNoEntryValue() ) return null;
		else return Short.valueOf( previous_value );
	}


	@Override
	public void add( int index, Short value ) {
		list.insert( index, value.shortValue() );
	}


	@Override
	public Short remove( int index ) {
		short previous_value = list.removeAt( index );
		if ( previous_value == list.getNoEntryValue() ) return null;
		else return Short.valueOf( previous_value );
	}


	// Implements Externalizable
	public void readExternal( ObjectInput in )
        throws IOException, ClassNotFoundException {

        // VERSION
        in.readByte();

        // LIST
        list = ( TShortList ) in.readObject();
    }


    // Implements Externalizable
    public void writeExternal( ObjectOutput out ) throws IOException {
        // VERSION
        out.writeByte(0);

        // LIST
        out.writeObject( list );
    }

}
