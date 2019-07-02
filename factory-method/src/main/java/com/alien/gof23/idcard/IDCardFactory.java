package com.alien.gof23.idcard;

import com.alien.gof23.framework.Factory;
import com.alien.gof23.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * ID Card 工厂，继承 {@link Factory}
 *
 * @author Alien
 * @since 2019/7/2 23:14
 */
public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
