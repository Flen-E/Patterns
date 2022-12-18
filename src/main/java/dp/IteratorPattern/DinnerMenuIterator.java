package dp.IteratorPattern;

public class DinnerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;
    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }


    public boolean hasNext() {
        if(position >= items.length
                || items[position] == null)
            return false;
        else
            return true;
    }
}
