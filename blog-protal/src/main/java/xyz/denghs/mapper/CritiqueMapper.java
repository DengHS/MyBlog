package xyz.denghs.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.denghs.pojo.Critique;
import xyz.denghs.pojo.CritiqueExample;

public interface CritiqueMapper {
    int countByExample(CritiqueExample example);

    int deleteByExample(CritiqueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Critique record);

    int insertSelective(Critique record);

    List<Critique> selectByExample(CritiqueExample example);

    Critique selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Critique record, @Param("example") CritiqueExample example);

    int updateByExample(@Param("record") Critique record, @Param("example") CritiqueExample example);

    int updateByPrimaryKeySelective(Critique record);

    int updateByPrimaryKey(Critique record);
}