package tr.com.burakgul.profileapi.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tr.com.burakgul.profileapi.model.dto.ProjectDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Meriç Akgül
 */
@Entity
@Table(name = "projects")
@Getter
@Setter
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "projectName")
    private String projectName;

    @Column(name = "description")
    private String description;

    @Column(name = "project_url")
    private String projectUrl;

    public Project(ProjectDTO projectDTO){
        this.projectUrl = projectDTO.getProjectUrl();
        this.projectName = projectDTO.getProjectName();
        this.description = projectDTO.getDescription();
    }

}
