package org.upcresento.shopper.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.upcresento.shopper.backend.entity.Item;

public interface ItemReopsitory extends JpaRepository<Item, Integer> {

}
