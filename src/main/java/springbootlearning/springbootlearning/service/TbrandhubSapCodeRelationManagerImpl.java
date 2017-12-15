package springbootlearning.springbootlearning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootlearning.springbootlearning.dao.TbrandhubSapCodeRelationDao;
import springbootlearning.springbootlearning.model.TbrandHubSapCodeRelation;

import java.util.List;

@Service
public class TbrandhubSapCodeRelationManagerImpl implements  TbrandhubSapCodeRelationManager {

    @Autowired
    TbrandhubSapCodeRelationDao tbrandhubSapCodeRelationDao;

    @Override
    public List<TbrandHubSapCodeRelation> findTbrandhubSapCodeRelationList() {
        return tbrandhubSapCodeRelationDao.findTbrandhubSapCodeRelationList();
    }
}
