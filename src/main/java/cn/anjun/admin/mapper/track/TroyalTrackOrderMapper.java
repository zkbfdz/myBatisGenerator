package cn.anjun.admin.mapper.track;

import cn.anjun.admin.model.track.TroyalTrackOrder;
import cn.anjun.admin.model.track.TroyalTrackOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TroyalTrackOrderMapper {
    long countByExample(TroyalTrackOrderExample example);

    int deleteByExample(TroyalTrackOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TroyalTrackOrder record);

    int insertSelective(TroyalTrackOrder record);

    List<TroyalTrackOrder> selectByExampleWithBLOBs(TroyalTrackOrderExample example);

    List<TroyalTrackOrder> selectByExample(TroyalTrackOrderExample example);

    TroyalTrackOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TroyalTrackOrder record, @Param("example") TroyalTrackOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") TroyalTrackOrder record, @Param("example") TroyalTrackOrderExample example);

    int updateByExample(@Param("record") TroyalTrackOrder record, @Param("example") TroyalTrackOrderExample example);

    int updateByPrimaryKeySelective(TroyalTrackOrder record);

    int updateByPrimaryKeyWithBLOBs(TroyalTrackOrder record);
}