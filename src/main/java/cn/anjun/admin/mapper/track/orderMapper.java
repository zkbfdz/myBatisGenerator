package cn.anjun.admin.mapper.track;

import cn.anjun.admin.model.track.order;
import cn.anjun.admin.model.track.orderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface orderMapper {
    long countByExample(orderExample example);

    int deleteByExample(orderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(order record);

    int insertSelective(order record);

    List<order> selectByExample(orderExample example);

    order selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") order record, @Param("example") orderExample example);

    int updateByExample(@Param("record") order record, @Param("example") orderExample example);

    int updateByPrimaryKeySelective(order record);

    int updateByPrimaryKey(order record);
}