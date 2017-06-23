package by.it.milosh.service.service;

public interface BaseService<T> {

    void add(T t);

    T addT(T T);

    T findOne(Long id);

    void update(T t);

    void delete(Long id);

    void deleteT(T t);

    String deleteStringT(Long id);



}
