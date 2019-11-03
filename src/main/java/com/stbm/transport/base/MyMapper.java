package com.stbm.transport.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @InterfaceName: MyMapper
 * @Description: Mapper接口都会继承该接口
 * @Author: dufei
 * @Date: Created in 2019/11/4 1:43
 * @Version: 1.0
 **/

public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}
