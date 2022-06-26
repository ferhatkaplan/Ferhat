package com.ecodation.project.mvcdata;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class _1_CustomerDto {

    private Long customerId;

    @NotEmpty(message = "Adı boş geçilemez")
    private String name;

    @NotEmpty(message = "Soyadı boş geçilemez")
    private String surname;

    @NotEmpty(message = "email boş geçilemez")
    private String email;

    @NotEmpty(message = "password boş geçilemez")
    private String password;

    private Date createdDate;
}
