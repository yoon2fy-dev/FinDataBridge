package me.yoon2fy.findatabridge.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "disclosures")
public class Disclosure {

    @Id
    private String id;

    private String corpName;   // 회사명
    private String reportName; // 보고서명
    private String receiptDate; // 접수일자
    private String url;        // 공시 원문 링크

}
