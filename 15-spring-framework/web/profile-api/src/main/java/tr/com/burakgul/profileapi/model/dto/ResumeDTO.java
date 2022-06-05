package tr.com.burakgul.profileapi.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tr.com.burakgul.profileapi.model.entity.Resume;

@Getter
@Setter
@NoArgsConstructor
public class ResumeDTO {
    private String company;
    private int totalExperinece;
    private String type;

    public ResumeDTO(Resume resume){
        this.company = resume.getCompany();
        this.totalExperinece = resume.getTotalExperience();
        this.type = resume.getType();
    }
}
