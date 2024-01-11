package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomList<T> implements Iterable<T> {
	private final T[] customList;
	private final int maxSize;
	
	public CustomList(final int size, final T[] data) {
		this.maxSize = size;
		this.customList = data;
	}
	
	@Override
	public Iterator<T> iterator() {
		return this.new CustomListIterator<T>();
	}
	
	public class CustomListIterator<T> implements Iterator<T> {
		private int internalIndex;
		
		@Override
		public boolean hasNext() {
			if (maxSize > this.internalIndex)
				return true;
			else
				return false;
		}

		@Override
		public T next() {
			if (this.hasNext()) {
				final T data = (T) customList[this.internalIndex];
				this.internalIndex += 1;
				return data;
			} else {
				throw new NoSuchElementException();
			}
		}
		
	}

}
