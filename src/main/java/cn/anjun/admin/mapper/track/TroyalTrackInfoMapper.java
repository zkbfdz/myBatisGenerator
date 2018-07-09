package cn.anjun.admin.mapper.track;

import cn.anjun.admin.model.track.TroyalTrackInfo;
import cn.anjun.admin.model.track.TroyalTrackInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TroyalTrackInfoMapper {
    long countByExample(TroyalTrackInfoExample example);

    int deleteByExample(TroyalTrackInfoExample example);

    int deleteByPrimaryKey(byte[] event);

    int insert(TroyalTrackInfo record);

    int insertSelective(TroyalTrackInfo record);

    List<TroyalTrackInfo> selectByExampleWithBLOBs(TroyalTrackInfoExample example);

    List<TroyalTrackInfo> selectByExample(TroyalTrackInfoExample example);

    TroyalTrackInfo selectByPrimaryKey(byte[] event);

    int updateByExampleSelective(@Param("record") TroyalTrackInfo record, @Param("example") TroyalTrackInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TroyalTrackInfo record, @Param("example") TroyalTrackInfoExample example);

    int updateByExample(@Param("record") TroyalTrackInfo record, @Param("example") TroyalTrackInfoExample example);

    int updateByPrimaryKeySelective(TroyalTrackInfo record);

    int updateByPrimaryKeyWithBLOBs(TroyalTrackInfo record);
}