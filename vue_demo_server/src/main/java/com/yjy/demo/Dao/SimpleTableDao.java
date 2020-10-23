package com.yjy.demo.Dao;

/**
 * 单表操作使用的接口
 * @param <K> 主键类型
 * @param <E>  Entity类型
 */
public interface SimpleTableDao <K,E>{
    /**
     * 插入一条数据
     * @param entity
     * @return 返回插入的数据
     */
    E insert(E entity);

    /**
     * 根据主键删除一条数据
     * @param key
     * @return 返回影响的行数
     */
    int delete(K key);

    /**
     * 根据主键查询一条数据
     * @param key
     * @return 返回查询的数据
     */
    E queryByPrimeKey(K key);

    /**
     * 更新一条数据
     * @param entity
     * @return 更新后的数据
     */
    E updateByPrimeKey(E entity);
}
