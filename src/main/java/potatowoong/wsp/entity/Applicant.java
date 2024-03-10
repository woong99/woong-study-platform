package potatowoong.wsp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Comment;
import potatowoong.wsp.enums.Status;

@Table(name = "APPLICANT")
@Entity
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "APPLICANT_ID", nullable = false)
    @Comment("신청자 정보 IDX")
    private Long applicantId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LECTURE_ID", referencedColumnName = "LECTURE_ID", nullable = false)
    @Comment("강좌 정보 IDX")
    private Lecture lecture;

    @Column(name = "APPLICANT_NAME", nullable = false)
    @Comment("신청자명")
    private String applicantName;

    @Column(name = "STATUS", nullable = false)
    @Enumerated(value = EnumType.STRING)
    @Comment("신청 상태")
    private Status status;
}
