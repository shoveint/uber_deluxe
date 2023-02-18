package africa.semicolon.uberdeluxe.data.dto.request;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Recipient {
    private String name;
    private String email;
}