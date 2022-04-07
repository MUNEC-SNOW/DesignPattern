package Iterator;

import java.util.Iterator;

public class DInnerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DInnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
}
