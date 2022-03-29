package com.zzameshop.repository;

import com.zzameshop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long>, QuerydslPredicateExecutor<Item> {
    List<Item> findByItemNm(String itemNm);

    @Query(value = "select i from Item i where i.itemDetail like %:itemDetail% order by i.price desc")
        //@Query 어노테이션 안에 JPQL(Java Persistence Query Language)로 작성한 쿼리문을 넣어줌. from 뒤에는 엔티티 클래스로 작성한 Item을 지정해 주고, Item으로부터 데이터를 select하겠다는 걸 의미
    List<Item> findByItemDetail(@Param("itemDetail") String itemDetail);
    //파라미터에 @Param 어노테이션을 이용해 파라미터로 넘어온 값을 JPQL에 들어갈 변수로 지정해줄 수 있음. 현재는 itemDetail 변수를 "like % %" 사이에 ":itemDetail"로 값이 들어가도록 작성 했음.

    @Query(value = "select * from item i where i.item_Detail like %:itemDetail% order by i.price desc", nativeQuery = true)
    List<Item> findByItemDetailByNative(@Param("itemDetail") String itemDetail);

}
