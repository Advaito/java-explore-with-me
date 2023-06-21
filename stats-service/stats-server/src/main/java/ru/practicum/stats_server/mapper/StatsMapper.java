package ru.practicum.stats_server.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import ru.practicum.stats_common.model.EndpointHit;
import ru.practicum.stats_server.model.Stats;

import java.time.LocalDateTime;

@Component
@Mapper(componentModel = "spring")
public interface StatsMapper {

    @Mapping(target = "timestamp", expression = "java(timestamp)")
    Stats toStats(EndpointHit endpointHit, LocalDateTime timestamp);

}