package by.it.milosh.service.service;

public interface BaseService<T> {

    void save(T t);

    T getEntityById(Long id);

    void update(T t);

    void delete(Long id);



}
