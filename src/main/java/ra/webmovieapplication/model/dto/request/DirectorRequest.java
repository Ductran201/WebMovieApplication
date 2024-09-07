package ra.webmovieapplication.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DirectorRequest {
    private Long id;
    @NotBlank(message = "Must not be blank")
    private String name;
    private MultipartFile file;
    @NotBlank(message = "Must not be blank")
    private String description;
    private Boolean gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Must not be blank")
    private Date dob;
    private Integer countryId;
}
