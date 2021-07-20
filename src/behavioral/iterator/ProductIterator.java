package behavioral.iterator;

import java.util.List;

public class ProductIterator implements AbstractIterator{
    private List<Object> products;

    // 定义一个游标，用于标记正向遍历的位置
    private int cursor1;
    // 定义一个游标，用于标记逆向遍历的位置
    private int cursor2;

    public ProductIterator(ProductList list) {
        this.products = list.getObjects();
        cursor1 = 0;
        cursor2 = products.size() - 1;
    }

    @Override
    public void next() {
        if (cursor1 < products.size()) {
            cursor1 ++;
        }
    }

    @Override
    public boolean isLast() {
        return (cursor1 == products.size());
    }

    @Override
    public void previous() {
        if (cursor2 > -1) {
            cursor2 --;
        }
    }

    @Override
    public boolean isFirst() {
        return (cursor2 == -1);
    }

    @Override
    public Object getNextItem() {
        return products.get(cursor1);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}
