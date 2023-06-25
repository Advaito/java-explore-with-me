package ru.practicum.main_service.event.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.main_service.category.dto.CategoryDto;
import ru.practicum.main_service.event.enums.EventState;
import ru.practicum.main_service.user.dto.UserShortDto;

import java.time.LocalDateTime;

import static ru.practicum.main_service.utils.MainCommonUtils.DT_FORMAT;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EventFullDto {

    String annotation;
    CategoryDto category;
    Long confirmedRequests;

    @JsonFormat(pattern = DT_FORMAT, shape = JsonFormat.Shape.STRING)
    LocalDateTime createdOn;

    String description;

    @JsonFormat(pattern = DT_FORMAT, shape = JsonFormat.Shape.STRING)
    LocalDateTime eventDate;

    Long id;
    UserShortDto initiator;
    LocationDto location;
    Boolean paid;
    Integer participantLimit;

    @JsonFormat(pattern = DT_FORMAT, shape = JsonFormat.Shape.STRING)
    LocalDateTime publishedOn;

    Boolean requestModeration;
    EventState state;
    String title;
    Long views;
}