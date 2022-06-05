package tr.com.burakgul.profileapi.controller;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.burakgul.profileapi.model.dto.ResumeDTO;
import tr.com.burakgul.profileapi.service.ResumeService;

@RestController
@RequestMapping("/resume")
public class ResumeController {

    private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService){
        this.resumeService = resumeService;
    }

    @GetMapping
    public ResponseEntity<ResumeDTO> findResume(){
        return ResponseEntity.ok(this.resumeService.findResume());
    }

    @PostMapping
    public ResponseEntity<ResumeDTO> saveResume(@RequestBody ResumeDTO resume){
        return ResponseEntity.ok(this.resumeService.saveResume(resume));
    }
    @PostMapping
    public ResponseEntity<Void> deleteResume(@RequestBody ResumeDTO resume){
        this.resumeService.deleteResume(resume);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<ResumeDTO> updateResume(@RequestBody ResumeDTO resume){
        return ResponseEntity.ok(this.resumeService.saveResume(resume));
    }



}
