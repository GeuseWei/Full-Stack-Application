package com.todayilearned.backend;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactRepository extends JpaRepository<Fact, Integer>{
    List<Fact> findByCategory(String category, Sort sort);
    @SuppressWarnings("null")
    List<Fact> findAll(Sort sort);
}
