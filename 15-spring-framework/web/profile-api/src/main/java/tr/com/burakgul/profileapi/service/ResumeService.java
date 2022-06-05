package tr.com.burakgul.profileapi.service;

import com.sun.org.apache.regexp.internal.RE;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tr.com.burakgul.profileapi.model.dto.ResumeDTO;
import tr.com.burakgul.profileapi.model.entity.Resume;
import tr.com.burakgul.profileapi.repository.ResumeRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ResumeService {

    private final ResumeRepository resumeRepository;

    // Neden tek bir Resume dönüyoruz?
    public ResumeDTO findResume() {
        Optional<Resume> resume = this.resumeRepository.findFirstByOrderById();
        if (resume.isPresent()) {
            return new ResumeDTO(resume.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Resume bulunamadı.");
        }
    }

    public void deleteResume(ResumeDTO resume) {
        Resume resumeEntity = new Resume(resume);
        this.resumeRepository.deleteById(resumeEntity.getId());
    }

    public ResumeDTO saveResume(ResumeDTO resume) {
        Resume resumeEntity = new Resume(resume);
        Resume savedResume = this.resumeRepository.save(resumeEntity);
        ResumeDTO resumeDTO = new ResumeDTO(savedResume);
        return resumeDTO;
    }

    public long countResume() {
        long countedResume = this.resumeRepository.count();
        return countedResume;
    }

}
