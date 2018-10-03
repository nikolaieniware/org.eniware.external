///////////////////////////////////////////////////////////////////////////////
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

package gnu.trove.iterator;

//////////////////////////////////////////////////
// THIS IS A GENERATED CLASS. DO NOT HAND EDIT! //
//////////////////////////////////////////////////


/**
 * Iterator for byte collections.
 */
public interface TByteIterator extends TIterator {
    /**
     * Advances the iterator to the next element in the underlying collection
     * and returns it.
     *
     * @return the next byte in the collection
     * @exception NoSuchElementException if the iterator is already exhausted
     */
    public byte next();
}
