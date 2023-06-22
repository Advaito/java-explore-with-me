package ru.practicum.main_service.compilation.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

import static ru.practicum.main_service.utils.MainCommonUtils.MIN_LENGTH_TITLE;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class NewCompilationDto {

    @NotBlank
    @Size(min = MIN_LENGTH_TITLE, max = 50)
    String title;

    Boolean pinned = false;
    List<Long> events = new ArrayList<>();
}