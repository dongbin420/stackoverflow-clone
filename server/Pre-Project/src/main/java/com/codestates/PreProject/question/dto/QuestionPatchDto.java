package com.codestates.PreProject.question.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Getter
@Setter
public class QuestionPatchDto {
    @NotBlank(message = "제목을 입력하세요")
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "내용을 입력하세요")
    @Column(nullable = false)
    private String content;

    @Positive
    private Long userId;

    @Range(min = -1, max = 1, message = "유효한 값은 -1 또는 1이어야 합니다.")
    private long voteCnt;
}
