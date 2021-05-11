package dev.keter.repository;
import dev.keter.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReposity extends JpaRepository<Product, Long>{
    Product findById(long id);
}
