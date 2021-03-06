package com.ecommerce.games.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutEntityDTO {

    private Long id;

    @NotEmpty
    private String code;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    private String email;

    @Valid
    @NotEmpty
    private List<GamesEntityDTO> games;

    @NotEmpty
    private String value;
}
