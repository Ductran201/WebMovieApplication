package ra.webmovieapplication.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;


import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class FilmRequest {
    private Integer id;
    @NotBlank(message = "Must not be blank")
    private String name;
    @NotBlank(message = "Must not be blank")
    private String description;
    private MultipartFile file;
    private Boolean isFree;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Must not be blank")
    private Date releasedDate;
    @NotNull(message = "Must not be blank")
    private Long time;
    private Boolean status;
    private Boolean seriesSingle;
    private Integer totalEpisode;
    private Integer countryId;
//    @NotNull(message = "Must not be blank")
    private Set<Long> actorsId;
//    @NotNull(message = "Must not be blank")
    private Set<Long> directorsId;
//    @NotNull(message = "Must not be blank")
    private Set<Integer> categoryId;

}
