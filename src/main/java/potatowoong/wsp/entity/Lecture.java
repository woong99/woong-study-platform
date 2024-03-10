package potatowoong.wsp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Comment;

@Table(name = "LECTURE")
@Entity
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LECTURE_ID", nullable = false)
    @Comment("강좌 정보 IDX")
    private Long lectureId;

    @Column(name = "LECTURE_NAME", nullable = false)
    @Comment("강좌명")
    private String lectureName;

    @Column(name = "MAX_COUNT", nullable = false)
    @Comment("정원")
    private Integer maxCount;
}
