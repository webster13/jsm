package com.webster.jsm.core.service;

import com.webster.jsm.core.util.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * service基础接口,包含了所有MyMapper的Dao方法,涵盖了所有单表需要的操作
 * Created by chenkaihua on 15-12-23.
 */
public interface BaseService<SpecificMapper extends MyMapper<M>, M> {

    int delete(M record);

    int deleteByExample(Object example);

    int deleteByPrimaryKey(Object key);


    int insert(M record);

    int insertList(List<M> recordList);

    /**
     * Selective表示不会插入值为null的列
     */
    int insertSelective(M record);


    /**
     * 插入数据，限制为实体包含`id`属性并且必须为自增列，实体配置的主键策略无效
     */
    int insertUseGeneratedKeys(M record);


    int updateByExample(@Param("record") M record, @Param("example") Object example);

    int updateByExampleSelective(@Param("record") M record, @Param("example") Object example);

    int updateByPrimaryKey(M record);

    /**
     * Selective表示不会插入值为null的列
     */
    int updateByPrimaryKeySelective(M record);


    M selectByPrimaryKey(Object key);

    List<M> select(M record);

    List<M> selectByExample(Object example);

    List<M> selectAll();

    List<M> selectByExampleAndRowBounds(Object example, RowBounds rowBounds);

    List<M> selectByRowBounds(M record, RowBounds rowBounds);

    int selectCount(M record);

    int selectCountByExample(Object example);

    M selectOne(M record);
























}