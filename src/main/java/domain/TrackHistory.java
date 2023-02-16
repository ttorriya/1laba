package domain;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class TrackHistory {
    private Track track;
    private List<LocalDateTime> playDates;
}
