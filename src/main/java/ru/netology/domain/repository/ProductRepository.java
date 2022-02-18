package ru.netology.domain.repository;

import ru.netology.domain.Product;

public class ProductRepository {
    private Product[] items = new Product[0];

    public void add (Product item){
        int length= items.length+1;
        Product[] tmp=new Product[length];
        System.arraycopy(items, 0,tmp,0, items.length);
        int lastIndex=tmp.length-1;
        tmp[lastIndex]=item;
        items=tmp;
    }
    public Product[] findAll()
    {
        return items;

    }
    public Product findByld (int id) {
        for (Product item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
    public void  removeByld(int id){
        int length = items.length -1;
        Product[] tmp = new Product[length];
        int indax = 0;
        for (Product item : items){
            if (item.getId() != id){
                tmp [indax] = item;
                indax++;
            }
        }
        items = tmp;
    }

}
