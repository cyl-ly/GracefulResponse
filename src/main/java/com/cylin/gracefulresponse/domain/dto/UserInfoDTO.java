package com.cylin.gracefulresponse.domain.dto;

import com.feiniaojin.gracefulresponse.api.ValidationStatusCode;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Valid
public class UserInfoDTO {

    @NotNull(message = "userName is null !")
    @Length(min = 6, max = 12, message = "userName length is not between 6 and 12 !")
    @ValidationStatusCode(code = "6001")
    private String name;
}
