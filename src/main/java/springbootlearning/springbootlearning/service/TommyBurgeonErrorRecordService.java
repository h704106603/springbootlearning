package springbootlearning.springbootlearning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springbootlearning.springbootlearning.dao.TommyBurgeonErrorRecordMapper;
import springbootlearning.springbootlearning.model.TommyBurgeonErrorRecord;

import java.util.List;

@Service
public class TommyBurgeonErrorRecordService {

    @Autowired
    TommyBurgeonErrorRecordMapper tommyBurgeonErrorRecordMapper;

    @Transactional
    public List<TommyBurgeonErrorRecord> findList(){
        return tommyBurgeonErrorRecordMapper.findList();
    }

}
