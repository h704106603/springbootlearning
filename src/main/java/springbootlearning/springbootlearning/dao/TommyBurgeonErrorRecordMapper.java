package springbootlearning.springbootlearning.dao;

import org.springframework.stereotype.Service;
import springbootlearning.springbootlearning.model.TommyBurgeonErrorRecord;

import java.util.List;

@Service
public interface TommyBurgeonErrorRecordMapper {

    List<TommyBurgeonErrorRecord> findList();
}
