package vn.scrip.buoi26.model.response;
import lombok.*;
import org.springframework.http.HttpStatus;
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter
public class ErrorResponse {
    private HttpStatus status;
    private Object message;
}






