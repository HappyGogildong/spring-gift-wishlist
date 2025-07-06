package gift.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public record ProductUpdateRequestDto(

    @NotBlank
    String name,

    @Min(value = 0, message = "가격은 0 이상이어야 합니다.")
    int price,

    @URL(message = "URL형식의 입력만 허용됩니다.")
    String imageURL) {

}
