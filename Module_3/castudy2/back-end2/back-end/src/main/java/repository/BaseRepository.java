package repository;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<T> {
    void save(T t);
    void delete(int id);
    List<T> findAll();
    Optional<T> get(int id);
    List<T> sort();
    List<T> find(String text);
}
