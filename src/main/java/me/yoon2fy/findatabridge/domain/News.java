package me.yoon2fy.findatabridge.domain;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "news")
public class News {
    @Id
    private String id;

    private String title;    // 기사 제목
    private String content;  // 기사 본문
    private String source;   // 언론사
    private String link;     // 기사 원문 링크
    private String pubDate;  // 발행일자
}
