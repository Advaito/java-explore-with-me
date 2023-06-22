package ru.practicum.main_service.comment.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import static ru.practicum.main_service.utils.MainCommonUtils.MAX_LENGTH_COMMENT;
import static ru.practicum.main_service.utils.MainCommonUtils.MIN_LENGTH_COMMENT;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class NewCommentDto {

    @NotBlank
    @Size(min = MIN_LENGTH_COMMENT, max = MAX_LENGTH_COMMENT)
    String text;
}
