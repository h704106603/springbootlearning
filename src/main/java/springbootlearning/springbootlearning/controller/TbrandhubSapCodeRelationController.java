package springbootlearning.springbootlearning.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springbootlearning.springbootlearning.dao.TbrandhubSapCodeRelationMapper;
import springbootlearning.springbootlearning.dao.TommyBurgeonErrorRecordMapper;
import springbootlearning.springbootlearning.model.TbrandHubSapCodeRelation;
import springbootlearning.springbootlearning.model.TommyBurgeonErrorRecord;
import springbootlearning.springbootlearning.service.TbrandhubSapCodeRelationManager;
import springbootlearning.springbootlearning.service.TommyBurgeonErrorRecordService;

import java.util.List;

@RestController
@RequestMapping("/tbrandhubSapCodeRelation")
@MapperScan("springbootlearning.springbootlearning.dao")
public class TbrandhubSapCodeRelationController {

    @Autowired
    TbrandhubSapCodeRelationManager tbrandhubSapCodeRelationManager;

    @Autowired
    TbrandhubSapCodeRelationMapper tbrandhubSapCodeRelationMapper;

    @Autowired
    TommyBurgeonErrorRecordService tommyBurgeonErrorRecordService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<TbrandHubSapCodeRelation> findTbrandhubSapCodeRelationList(){
        return tbrandhubSapCodeRelationManager.findTbrandhubSapCodeRelationList();
    }

    @RequestMapping(value = "/listByJpa",method = RequestMethod.GET)
    public List<TbrandHubSapCodeRelation> findTbrandhubSapCodeRelationListByMyBatis(){

        System.out.println("进入了myBatisController");
        return tbrandhubSapCodeRelationMapper.findAccountList();
    }


    @RequestMapping(value = "/listByMybatis",method = RequestMethod.GET)
    public List<TommyBurgeonErrorRecord> findTbrandhubSapCodeRelationListByMyBatisXml(){

        System.out.println("进入了myBatisController");
        return tommyBurgeonErrorRecordService.findList();
    }



}
