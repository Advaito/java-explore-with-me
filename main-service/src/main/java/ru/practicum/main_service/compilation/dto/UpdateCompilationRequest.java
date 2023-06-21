package ru.practicum.main_service.compilation.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.main_service.MainCommonUtils;

import javax.validation.constraints.Size;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UpdateCompilationRequest {

    @Size(min = MainCommonUtils.MIN_LENGTH_TITLE, max = 50)
    String title;

    Boolean pinned;
    List<Long> events;
}