package com.zl.dao;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.zl.pojo.CompanyPojo;
import com.zl.pojo.ProductPojo;
import com.zl.pojo.SelPartPojo;
import com.zl.pojo.SelSourcesInfo;
import com.zl.pojo.SourceInfo;
import com.zl.pojo.SourcePojo;

public interface SourcePojoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SourcePojo record);

    int insertSelective(SourcePojo record);

    SourcePojo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SourcePojo record);

    int updateByPrimaryKeyWithBLOBs(SourcePojo record);

    int updateByPrimaryKey(SourcePojo record);
    //查询所有的资源单
    List<SourceInfo> selSources(SelSourcesInfo ssInfo);
    int selTotal(SelSourcesInfo ssInfo);
    //查询公司名字
    String selComName(int id);
    //查询大类分类集合
    Set<String> selBCName(int id);
    //查询主营集合
    Set<String> selProName(int id);
    //查询公司
    CompanyPojo selCom(int id);
    //查询资源单包含的所有产品
    List<ProductPojo> selProBySID(@Param("id")int id,@Param("curPage")int curPage,@Param("pageSize")int pageSize);
    //查询资源单说明
    String selExplains(int id);
    //详情页条件查询
    List<ProductPojo> selPart(SelPartPojo pojo);
    int selPartTotal(SelPartPojo pojo);
    
}









