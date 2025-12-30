package com.boot4.demo.repository;

import com.boot4.demo.service.dto.TgsupCompareResponseDto;
import com.boot4.demo.service.dto.TgsupCompareResultDto;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class TgsupCompareRepository {

//    private final JdbcTemplate jdbcTemplate;

//    public TgsupCompareRepository(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @SuppressWarnings("unchecked")
    public String executeStoredProcedure(Long eventId,
                                                          LocalDateTime startDateTime,
                                                          LocalDateTime endDateTime,
                                                          Boolean isInPlay) {

//        SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate)
//                .withProcedureName("sp_compare_tgsup_jc_algoc")
//                .withoutProcedureColumnMetaDataAccess()                    // ← Critical fix #1
//                .declareParameters(                                        // ← Critical fix #2
//                        new SqlParameter("EventID", Types.BIGINT),
//                        new SqlParameter("StartDateTime", Types.TIMESTAMP),
//                        new SqlParameter("EndDateTime", Types.TIMESTAMP),
//                        new SqlParameter("IsInPlay", Types.BIT)
//                );

//        MapSqlParameterSource params = new MapSqlParameterSource()
//                .addValue("EventID", eventId)
//                .addValue("StartDateTime", startDateTime)
//                .addValue("EndDateTime", endDateTime)
//                .addValue("IsInPlay", isInPlay ? 1 : 0);
        // Do NOT add RetErrText here — it's OUTPUT only

//        Map<String, Object> resultMap = call.execute(params);

        // The SELECT result set comes back as "#result-set-1"
//        List<TgsupCompareResultDto> results = new ArrayList<>();
//
//        if (results == null) results = List.of();


        return "1";
    }
}