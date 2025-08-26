package com.tnsif.certificateservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/certificateservice")
public class CertificateController {

    @Autowired
    private CertificateService certificateService;

    @GetMapping
    public List<Certificate> getAllCertificates() {
        return certificateService.getAllCertificates();
    }

    @GetMapping("/{id}")
    public Certificate getCertificateById(@PathVariable Long id) {
        return certificateService.getCertificateById(id);
    }

    @PostMapping
    public Certificate createCertificate(@RequestBody Certificate certificate) {
        return certificateService.createCertificate(certificate);
    }

    @PutMapping("/{id}")
    public Certificate updateCertificate(@PathVariable Long id, @RequestBody Certificate certificate) {
        return certificateService.updateCertificate(id, certificate);
    }

    @DeleteMapping("/{id}")
    public void deleteCertificate(@PathVariable Long id) {
        certificateService.deleteCertificate(id);
    }
}
