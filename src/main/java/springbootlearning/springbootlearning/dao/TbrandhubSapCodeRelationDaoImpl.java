package springbootlearning.springbootlearning.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import springbootlearning.springbootlearning.model.TbrandHubSapCodeRelation;

import java.util.List;

@Repository
public class TbrandhubSapCodeRelationDaoImpl implements TbrandhubSapCodeRelationDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<TbrandHubSapCodeRelation> findTbrandhubSapCodeRelationList() {

        int a = 0;
        int b = a ;
        System.out.println("下一步查库了");
        List<TbrandHubSapCodeRelation> list = jdbcTemplate.query("select * from t_brand_hub_sap_code_relation", new Object[]{}, new BeanPropertyRowMapper(TbrandHubSapCodeRelation.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
    }
}
