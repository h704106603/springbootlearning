package springbootlearning.springbootlearning.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import springbootlearning.springbootlearning.model.TbrandHubSapCodeRelation;

import java.util.List;

@Service
@Mapper
public interface TbrandhubSapCodeRelationMapper {

    @Select("select id, hub_code as hubCode, sap_code as sapCode, contact_code as contactCode,create_time as createTime from t_brand_hub_sap_code_relation")
    List<TbrandHubSapCodeRelation> findAccountList();
}
