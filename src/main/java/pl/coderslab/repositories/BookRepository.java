package pl.coderslab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
